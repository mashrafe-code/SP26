import java.util.*;

public class p13 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        int ans = 0;
        for (int i = 0 ; i < 5 ; i++)
        {
            numbers[i] = input.nextInt();
            ans+=numbers[i];
        }
        System.out.print(ans);
        input.close();
    }
}
