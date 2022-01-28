package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Main_1546 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        float arr1[] =new float[N];
        float arr2[] =new float[N];
        for(int i=0;i<N;i++){
            arr1[i]=sc.nextInt();
        }
        Arrays.sort(arr1);
        float max= arr1[N-1];
        for(int i=0;i<N;i++){
            arr2[i] = (arr1[i]/max*100);
        }
        float sum=0;
        for(int i=0;i<N;i++){
            sum = sum+arr2[i];
        }
        System.out.println(sum/N);
    }
}
