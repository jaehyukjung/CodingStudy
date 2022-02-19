
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11726 {
    public static void main(String[] argv) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println((fibo(N))%1007);

    }
    public static int fibo(int n) {
        if (n <= 1) return 1;
        else return fibo(n-2) + fibo(n-1);
    }
}
