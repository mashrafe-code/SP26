import java.util.*;

public class p14 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        int odd = 0;
        int even = 0;
        for (int i = 0 ; i < 5 ; i++)
        {
            numbers[i] = input.nextInt();
            if (numbers[i] % 2 != 0) {
                odd++;
            }
            else{
                even++;
            }

        }

        System.out.print("odd : " + odd + "\neven : "+ even);
        input.close();
    }
}
