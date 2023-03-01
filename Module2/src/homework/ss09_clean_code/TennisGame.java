package homework.ss09_clean_code;

public class TennisGame {
    public static String getScore(String playerOneName, String playerTwoName, int firstSecore, int twoSecore) {
        String score = "";
        int tempScore = 0;
        if (firstSecore == twoSecore) {
            switch (firstSecore) {
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
        } else if (firstSecore >= 4 || twoSecore >= 4) {
            int minusResult = firstSecore - twoSecore;
            if (minusResult == 1) {
                score = "Advantage playerOne";
            } else if (minusResult == -1) {
                score = "Advantage playerTwo";
            } else if (minusResult >= 2) {
                score = "Win for playerTwo";
            } else {
                score = "Win for playerTwo";
            }
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = firstSecore;
                } else {
                    score += "-";
                    tempScore = twoSecore;
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
