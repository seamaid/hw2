import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class hw2n4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(81) - 30;
            System.out.print(arr[i] + " ");
        }


    }
}
