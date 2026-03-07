import java.util.*;

public class p11 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        int mx = -1;
        for (int i = 0 ; i < 5 ; i++)
        {
            numbers[i] = input.nextInt();
            if (numbers[i] > mx) {
                mx = numbers[i];
            }
        }
        System.out.print(mx);
        input.close();
    }
}
