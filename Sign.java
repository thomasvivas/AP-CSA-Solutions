public class Sign {
	private final String message;
	private final int width;

	public Sign(String message, int width) {
		this.message = message;		
		this.width = width;
	}

	public int numberOfLines() {
		int totalLines = this.message.length() / width;
		if (this.message.length() % width != 0) {
			return totalLines + 1;
		}
		return totalLines;
	}

	public String getLines() {
		String sign = "";
		String remaining = this.message;
		while (remaining.length() > this.width) {
			sign += remaining.substring(0, this.width) + ";";
			remaining = remaining.substring(this.width);
		}
		return sign + remaining;
	}
}
