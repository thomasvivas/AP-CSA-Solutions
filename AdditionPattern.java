public class AdditionPattern {
	private int base;
	private int current;
	private int increment;

	public AdditionPattern(int base, int increment) {
		this.base = base;
		this.current = base;
		this.increment = increment;
	}

	public void next() {
		this.current += this.increment;
	}

	public void prev() {
		this.current = Math.max(this.current - this.increment, this.base);
	}

	public int currentNumber() {
		return this.current;
	}
}
