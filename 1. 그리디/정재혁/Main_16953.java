import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_16953 {
    public static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int cnt = 1;
        while(M!=N){
            if(M<N){
                cnt = -1;
                break;
            }
            if(M %10!=1 && M%2!=0 ) {
                cnt = -1;
                break;
            }

            if(M%2==0){
                M = M/2;
            }
            else if(M%10==1){
                M = (M-1)/10;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}