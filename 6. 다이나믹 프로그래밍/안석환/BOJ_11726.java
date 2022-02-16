import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11726 {
    static int[] dt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        dt = new int[1001];
        System.out.println(dp(N));
    }
    public static int dp(int N){
        if(dt[N] != 0) return dt[N];
        if(N == 1) return 1;
        if(N == 2) return 2;
        return dt[N] = (dp(N-1) + dp(N-2)) % 10007;
    }
}
