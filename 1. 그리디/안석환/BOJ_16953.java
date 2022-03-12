import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_16953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int cnt = 0;
        while(B > A){
            if(B % 2 == 0){
                cnt++;
                B /= 2;
            }
            else{
                String b = String.valueOf(B);
                if(b.charAt(b.length()-1) == '1'){
                    b = b.substring(0,b.length()-1);
                    cnt++;
                    B = Integer.parseInt(b);
                }
                else{
                    break;
                }
            }
        }
        if(A == B){
            System.out.println(cnt+1);
        }
        else{
            System.out.println(-1);
        }
    }
}