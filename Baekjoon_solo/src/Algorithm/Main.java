package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        int cnt =0;
        int cnt1=0;
        int cnt2=0;
        int N = sc.nextInt();
        String arr[]=new String[N];

        for(int i=0;i<N;i++){
            arr[i]= sc.next();
        }

        for(int i=0;i<N;i++) {
            String arr1[] = arr[i].split("X");
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i].length() >=2) cnt1++;
            }
        }

        String arr2[]=new String[N];

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                char arr1[][] = new char[N][N];
                arr1[i][j]= arr[j].charAt(i);
                arr2[i]= Arrays.toString(arr1[i]);
            }

        }
        for(int i=0;i<N;i++){
            String arr1[]=arr2[i].split("X");
            for(int j=0;j<arr1.length;j++) {
                if (arr1[i].length() >= 2) cnt2++;
            }
        }
        cnt=0;

        System.out.println(cnt1+" "+cnt2);
    }
}
