package interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * Interpreter模式也叫解释器模式，是行为模式之一，它 是一种特殊的设计模式，它建立一个解释器，对于特定
 * 的计算机程序设计语言，用来解释预先定义的文法。简 单地说，Interpreter模式是一种简单的语法解释器构架。
 * 
 * 
 * @author Jin
 *自动递增和自动递减
 */
public class MainClass {
	public static void main(String[] args) {
		String number = "20";
		Context context = new Context(number);

		// Expression expression1 = new MinusExpression();
		// expression1.interpret(context);
		// System.out.println(context.getOutput());
		//
		// Expression expression2 = new PlusExpression();
		// expression2.interpret(context);
		// System.out.println(context.getOutput());
		//
		// Expression expression3 = new PlusExpression();
		// expression3.interpret(context);
		// System.out.println(context.getOutput());
		//
		// Expression expression4 = new PlusExpression();
		// expression4.interpret(context);
		// System.out.println(context.getOutput());

		List<Expression> list = new ArrayList<Expression>();
		list.add(new PlusExpression());
		list.add(new PlusExpression());
		list.add(new MinusExpression());
		list.add(new MinusExpression());
		list.add(new MinusExpression());
		list.add(new MinusExpression());

		for (Expression ex : list) {
			ex.interpret(context);
			System.out.println(context.getOutput());
		}
	}
}
