
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class BOJ_2217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] weight = new int[N];
        for(int i=0;i<weight.length;i++){
            weight[i]=sc.nextInt();
        }
        Arrays.sort(weight);
        int w = weight[weight.length -1];
        int count = 1;
        int answer = w;


        for(int i=weight.length-2; i>=0;i--){
            w = weight[i];
            count ++;
            if(answer <= w*count) { answer = w*count;}
        }
        System.out.println(answer);
    }
}
