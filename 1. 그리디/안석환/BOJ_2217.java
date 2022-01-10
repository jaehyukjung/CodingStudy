import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_2217 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> loop = new ArrayList<>();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            loop.add(sc.nextInt());
        }
        Collections.sort(loop,Collections.reverseOrder());
        int max = -1;
        for(int i = 0; i < N; i++) {
            arr[i] = loop.get(i) * (i+1);
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
