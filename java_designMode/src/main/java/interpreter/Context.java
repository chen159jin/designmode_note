package interpreter;

/**
 * Context     解释器上下文环境类。用来存储解释器的上下文环境，比如需要解释的文法等。
 * 
 * @author Jin
 *
 */
public class Context {

	private String input;
	private int output;

	public Context(String input) {
		this.input = input;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public int getOutput() {
		return output;
	}

	public void setOutput(int output) {
		this.output = output;
	}
}