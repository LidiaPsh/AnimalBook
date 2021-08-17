import java.util.Arrays;
import java.util.Random;

public class Game2048 {

    private static Tail[][] tails = new Tail[4][4];

    public static void main(String[] args) {
        generateNewGame();
        System.out.println(Arrays.deepToString(tails));
        randomValueTail();
    }

    private static boolean generateNewGame() {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tails[i][j]=new Tail(0);
            }

        }

        return true;
    }


    private static boolean randomValueTail(){
        int i=0;
        while (true){
            Random random = new Random();
            int value = random.nextInt(10);
            if(value){

            }
            if(i==2){
                return true;
            }
        }
    }
}
