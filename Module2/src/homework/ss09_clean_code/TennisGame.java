package homework.ss09_clean_code;

public class TennisGame {
    public static String getScore(String playerOneName, String playerTwoName, int scoreFirst, int m_scoreTwo) {
        String score = "";
        int tempScore = 0;
        if (scoreFirst == m_scoreTwo) {
            switch (scoreFirst) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (scoreFirst >= 4 || m_scoreTwo >= 4) {
            int minusResult = scoreFirst - m_scoreTwo;
            if (minusResult == 1) score = "Advantage playerOne";
            else if (minusResult == -1) score = "Advantage playerTwo";
            else if (minusResult >= 2) score = "Win for playerTwo";
            else score = "Win for playerTwo";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = scoreFirst;
                else {
                    score += "-";
                    tempScore = m_scoreTwo;
                }
                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }
}
