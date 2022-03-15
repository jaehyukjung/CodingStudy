import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1138 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] tall = new int[N+1];
        int[] answer = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            tall[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 1; i <= N; i++){ // 각 숫자에 대해서
            int cnt = 0; // 나도 큰 사람 체크
            for(int j = 1; j <= N; j++){
                if(i == 1){ // 1인 경우
                    answer[tall[i]+1] = i;
                }
                else{
                    if(answer[j] == 0){
                        if(tall[i] <= cnt){
                            answer[j] = i;
                            break;
                        }
                        else{
                            cnt++;
                        }
                    }
                }
            }
        }
        for(int i = 1; i <= N; i++){
            System.out.print(answer[i]+" ");
        }

    }
}