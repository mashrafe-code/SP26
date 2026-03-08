import java.util.*;

public class p12 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        int small = numbers[0];
        for (int i = 0 ; i < 5 ; i++)
        {
            numbers[i] = input.nextInt();
            if (numbers[i] < small) {
                small = numbers[i];
            }
        }
        System.out.print(mx);
        input.close();
    }
}
