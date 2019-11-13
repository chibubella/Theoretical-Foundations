
public class Transition {
	State input;
	Integer symbol;
	State output;

	public Transition(State input, Integer symbol, State output){
	this.input = input;
	this.symbol = symbol;
	this.output = output;
	}
	public State getInputState() {
	return input;
	}

	public Integer getSymbol() {
	return symbol;
	}

	public State getOutputState() {
	return output;
	}
}
