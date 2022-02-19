import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11726{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int d[] = new int[n+1];

        for(int i=1;i<=n;i++){
            if(i==1) d[i] =1;
            else if(i==2) d[i] = 2;
                // 숫자가 매우 커질 수 이쓰므로 10000보다 큰 최ㅗ의 소수인
                // 10007로 나눠준다.
            else d[i] = (d[i-2] + d[i-1) % 10007;
        }
        System.out.println(d[n]);
    }}