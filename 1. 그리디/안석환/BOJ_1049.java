import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1049 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 끊어진 줄의 수
        int M = Integer.parseInt(st.nextToken()); // 줄의 브랜드 수
        int[] six = new int[M]; // 브랜드 별 세트 비용(6개)
        int[] one = new int[M]; // 브랜드 별 낯개 비용(1개)
        int set = 6;
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            six[i] = Integer.parseInt(st.nextToken());
            one[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(six);
        Arrays.sort(one);
        int string = 0;
        int cost = 0;
        int answer = Integer.MAX_VALUE;
        for(int i = 0; i <= N/set + 1; i++){
            for(int j = 0; j <= N; j++){
                string = set * i + j;
                cost = six[0] * i + one[0] * j;
                if(string >= N){
                    answer = Math.min(answer, cost);
                }
                string = 0;
                cost = 0;
            }
        }
        System.out.println(answer);
    }
}