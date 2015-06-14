
public class TennisGame2 implements TennisGame
{
    public int P1point = 0;
    public int P2point = 0;
    
    public String P1res = "";
    public String P2res = "";
    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore(){
        if (P1point == P2point)
        {
        	return ScoreTranslator.translateEvenScore(P1point);
        }
        
        if (P1point != P2point && P1point < 4 && P2point < 4)
        {
            return ScoreTranslator.translateOddScore(P1point)+"-"+ScoreTranslator.translateOddScore(P2point);
        }
        
        return ScoreTranslator.translateAdvantageOrWinningScore(P1point-P2point).getMessage();
    }

    public void wonPoint(String player) {
        if (player == "player1")
        	P1point++;
        else
        	P2point++;
    }
}