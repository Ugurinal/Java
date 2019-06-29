public class Main {

    public static void main(String[] args) {

    int highScorePosition = calculateHighScorePosition(1500);
    displayHighScorePosition("UGUR0",highScorePosition);

    highScorePosition = calculateHighScorePosition(900);
    displayHighScorePosition("UGUR1",highScorePosition);

    highScorePosition = calculateHighScorePosition(400);
    displayHighScorePosition("UGUR2",highScorePosition);

    highScorePosition = calculateHighScorePosition(50);
    displayHighScorePosition("UGUR3",highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int position){

        System.out.println(playerName + " is managed to get into position "+position +" on the high score table.");


    }

    public static int calculateHighScorePosition(int playerScore){

        int position = 4;
        if(playerScore >=1000){
            position = 1;
        }else if((playerScore >= 500) && playerScore < 1000){
            position = 2;
        }else if((playerScore >=100) && (playerScore < 500)){
            position = 3;
        }
        return position;
//        Second way
//        if(playerScore >=1000){
//            return 1;
//        }else if((playerScore >= 500) && playerScore < 1000){
//            return 2;
//        }else if((playerScore >=100) && (playerScore < 500)){
//            return 3;
//        }else{
//            return 4;
//        }

    }
}
