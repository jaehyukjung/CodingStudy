import java.util.Arrays;
import java.util.Scanner;

public class greedy_2217  {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int ea = sc.nextInt();
        int arr[] =new int[ea];
        int totalwei;

        for(int i =0;i<ea;i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        totalwei = arr[0]*ea;

        for(int i=1;i<ea;i++) {
            if(totalwei<(arr[i]*(ea-i))) totalwei = (arr[i]*(ea-i));
        }
        System.out.println(totalwei);
        sc.close();
    }
}
