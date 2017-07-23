package interpreter;
/**
 * ConcreteExpression    解释器具体实现类。
 * @author Jin
 *
 */
public class MinusExpression extends Expression {

	public void interpret(Context context) {
		System.out.println("自动递减");
		String input = context.getInput();
		int inInput = Integer.parseInt(input);
		// inInput--;
		--inInput;
		context.setInput(String.valueOf(inInput));
		context.setOutput(inInput);
	}

}
