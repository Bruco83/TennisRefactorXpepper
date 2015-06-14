public enum Score {
	LOVE("Love"), FIFTEEN("Fifteen"), THIRTY("Thirty"), FORTY("Forty"), DEUCE(
			"Deuce"), ADVANTAGE_P1("Advantage player1"), ADVANTAGE_P2(
			"Advantage player2"), WIN_P1("Win for player1"), WIN_P2(
			"Win for player2");

	private String message;

	public String getMessage() {
		return message;
	}

	Score(String message) {
		this.message = message;
	}
	
}
