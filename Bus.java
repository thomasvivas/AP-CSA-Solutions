public class Bus {
	// quantityStops > 1
	private int quantityStops;
	private int currentStop;
	private boolean reversed;

	public Bus(int quantityStops) {
		this.quantityStops = quantityStops;
		this.currentStop = 1;
		this.reversed = false;
	}

	public int getCurrentStop() {
		return this.currentStop;
	}

	public void move() {
		if (!reversed) {
			this.currentStop++;
		} else {
			this.currentStop--;
		}

		boolean atBeginning = this.currentStop == 1;
		boolean atEnd = this.currentStop == this.quantityStops;
		if (atBeginning || atEnd) {
			this.reversed = !this.reversed;
		}
	}
}
