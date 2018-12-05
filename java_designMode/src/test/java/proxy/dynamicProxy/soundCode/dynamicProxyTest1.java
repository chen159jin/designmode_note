package proxy.dynamicProxy.soundCode;

import org.junit.Test;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;


public class dynamicProxyTest1 {
    @Test
    public void dynamicProxyTest() throws Exception {
        //代理类的字符串代码
        String src =
                "package test;\n\t" +
                        "import proxy.dynamicProxy.soundCode.RealSubject;\n\t" +
                        "import proxy.dynamicProxy.soundCode.Subject;\n\t" +
                        "public class ProxySubject implements Subject {\n" +
                        "\tprivate RealSubject realSubject;\n" +
                        "\n" +
                        "\tpublic void sailBook() {\n" +
                        "\t\tdazhe();\n" +
                        "\t\tif (realSubject == null) {\n" +
                        "\t\t\trealSubject = new RealSubject();\n" +
                        "\t\t}\n" +
                        "\t\trealSubject.sailBook();\n" +
                        "\t\tgive();\n" +
                        "\t}\n" +
                        "\n" +
                        "\tpublic void dazhe() {\n" +
                        "\t\tSystem.out.println(\"打折\");\n" +
                        "\t}\n" +
                        "\n" +
                        "\tpublic void give() {\n" +
                        "\t\tSystem.out.println(\"赠送代金券\");\n" +
                        "\t}\n" +
                        "}\n";

        //将字符串写入java文件********************************************************************************
        String fileName = System.getProperty("user.dir") + "/src/main/java/test/ProxySubject.java";//放置在（根目录+文件名）下
        File f = new File(fileName);
        FileWriter fw = new FileWriter(f);
        //写入内容
        fw.write(src);
        fw.flush();
        fw.close();

        //进行编译********************************************************************************************
        //首先获得编译器
        //compiler 为java编译器  即javac
        //获得编译器对象
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

        //参数含义 （编译诊断，locale,charset）
        //管理动态生成的文件的StandardJavaFileManager对象
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);//默认值

        //根据参数获取多个java文件   返回java文件对象集
        Iterable units = fileManager.getJavaFileObjects(fileName);

        //“编译任务”对象
        JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, null, null, null, units);
        task.call();//调用
        fileManager.close();

        //************以上过程获得了java文件源码，编译java文件生成了相对应的class文件****************

        //***************以下过程为将class文件加载至内存，生成新对象*****************************
        //Class.load() 是加载path路径的class文件
        //URLClassLoader是将硬盘中的class文件加载进入

        //通过Url引入本地文件
        URL[] urls = new URL[]{new URL("file:/" + System.getProperty("user.dir") + "target/classes/test")};
        //访问本地class文件，这里我用的是IntellijIDEA,默认　　　生成的class文件的目录在  /out/production/  下

        //去指定路径寻找class文件
        URLClassLoader urlClassLoader = new URLClassLoader(urls);

        Class c = urlClassLoader.loadClass("test.ProxySubject");

        System.out.println(c);

        //执行
        //c.newInstance(); 是调用空的构造方法

        //获得构造方法
        //根据java虚拟机，每一个构造方法也相当于一个对象
        Constructor constructor = c.getConstructor(Subject.class);

        //产生新对象
        Subject m = (Subject) constructor.newInstance(new RealSubject());  //new Tank()为构造方法的参数   即被代理对象

        m.sailBook();

    }


}
