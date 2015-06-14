
public class TennisGame1 implements TennisGame {
    
    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;
    
    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    public String getScore() {
        String score = "";
        if (m_score1==m_score2)
            score = ScoreTranslator.translateEvenScore(m_score1);
        else if (m_score1>=4 || m_score2>=4)
            score = getAdvantageOrWinningScore();
        else
            score = getOddScore();
        return score;
    }

	private String getOddScore() {
		return ScoreTranslator.translateOddScore(m_score1)+"-"+ScoreTranslator.translateOddScore(m_score2);
	}

	private String getAdvantageOrWinningScore() {
		Score score;
		int minusResult = m_score1-m_score2;
		score = ScoreTranslator.translateAdvantageOrWinningScore(minusResult);
		return score.getMessage();
	}

}
