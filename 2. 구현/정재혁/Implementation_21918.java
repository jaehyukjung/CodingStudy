import java.util.ArrayList;
import java.util.Scanner;

public class Implementation_21918 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ea = sc.nextInt();
        int arr[] = new int[ea];
        int com = sc.nextInt();
        for(int i=0;i<ea;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<com;i++) {
            for (int j = 0; j < 3; j++) {
                int co = sc.nextInt();
                if (arr[co-1] == 0) arr[co-1] = 1;
                else arr[co-1] = 0;
            }
        }
        for(int i=0;i<ea;i++){
            System.out.print(arr[i]+" ");
        }


        sc.close();

    }
}