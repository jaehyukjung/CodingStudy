package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.ArrayList;


public class Implementation_1292 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N1 = Integer.parseInt(st.nextToken());
        int N2 = Integer.parseInt(st.nextToken());

        int sum =0;

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =1;i<46;i++){
            for(int j=0;j<i;j++){
                arr.add(i);
            }
        }

        for(int i = N1-1;i<N2;i++){
            sum = sum + arr.get(i);
        }

        System.out.println(sum);
    }
}
