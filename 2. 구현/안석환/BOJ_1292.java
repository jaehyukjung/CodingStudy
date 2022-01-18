import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[] num = new int[1001];
        int check = 1;
        int cnt = 1;
        for(int i = 1; i < num.length; i++){
            num[i] = check;
            cnt--;
            if(cnt == 0) {
                check++;
                cnt = check;
            }
        }
        int answer = 0;
        for(int i = A; i <= B; i++){
            answer += num[i];
        }
        System.out.println(answer);
    }
}
