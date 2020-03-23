package jay.learning;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if(gameOver){
            int finalScore = score +(levelCompleted*bonus);
            System.out.println("Your final score was "+finalScore);
        }
    }
}
