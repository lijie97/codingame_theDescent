import java.util.*;
import java.io.*;
import java.math.*;

/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop -_-
        int max=-1;
        int maxi=-1;
        while (true) {
            max=-1;
            maxi=-1;
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain.
                if (mountainH>max){
                    max=mountainH;
                    maxi=i;
                    }
            }
            System.out.println(maxi); // The index of the mountain to fire on.
        }
    }
}