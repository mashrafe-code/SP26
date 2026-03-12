import java.util.*;

public class p16 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] numbers = {5 ,6, 16, 9, 11};
        for (int i = 0 ; i < 4 ; i++)
        {
            if (numbers[i] > numbers[i+1]) {
                numbers[i] = numbers[i] + numbers[i+1] -(numbers[i+ 1] = numbers[i] );
            }
        }

        for(int i = 0; i< 5; i++)
        {
            System.out.print(numbers[i]+ " ");
        }
        input.close();
    }
}
