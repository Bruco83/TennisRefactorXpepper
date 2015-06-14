
public class ScoreTranslator {
	public static String translateEvenScore(int evenScore) {
		String translatedScore = translateScore(evenScore);
		if(evenScore<3)
			translatedScore = translatedScore +"-All";
		return translatedScore;
	}
	
	public static String translateOddScore(int scoreToTranslate){
		if(scoreToTranslate==3)
			return Score.FORTY.getMessage();
		else
			return translateScore(scoreToTranslate);
	}
	
	public static String translateScore(int scoreToTranslate) {
		String score;
		switch (scoreToTranslate)
		{
		    case 0:
		            score = Score.LOVE.getMessage();
		        break;
		    case 1:
		            score = Score.FIFTEEN.getMessage();
		        break;
		    case 2:
		            score = Score.THIRTY.getMessage();
		        break;
		    default:
		            score = Score.DEUCE.getMessage();
		        break;
		    
		}
		return score;
	}
	
	public static Score translateAdvantageOrWinningScore(int minusResult) {
		Score score;
		if (minusResult==1) score = Score.ADVANTAGE_P1;
		else if (minusResult ==-1) score = Score.ADVANTAGE_P2;
		else if (minusResult>=2) score = Score.WIN_P1;
		else score =Score.WIN_P2;
		return score;
	}
}