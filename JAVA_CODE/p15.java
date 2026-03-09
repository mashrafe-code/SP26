import java.util.*;

public class p15 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] numbers = {5 ,6, 8, 9, 11};

        int x = input.nextInt();
        int f = 1;
        for (int i = 0 ; i < 5 ; i++)
        {
            if (numbers[i] == x) {
                System.out.print("number has been found in index : "+ i);
                f = 1;
                break;
            }
        }
        if (f == 0) {
            System.out.print("Number is not available.")
        }
        input.close();
    }
}
