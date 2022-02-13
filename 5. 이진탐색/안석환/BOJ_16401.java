import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_16401 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        long[] arr = new long[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        long answer = 0;
        Arrays.sort(arr);
        long s = 0, e = arr[N-1];
        while(s <= e){
            long mid = (s+e)/2; //나누어줄 사탕 길이
            int cnt = 0; // 가능한 사탕의 수
            if(mid == 0) break;
            for(long candy : arr){ // 길이 mid로 나누어 줄 수 있는 사탕의 수 파악
                if(candy >= mid) {
                    cnt += candy/mid;
                }
            }
            if(cnt >= M){ // 사탕의 수와 조카의 수 비교 : 사탕의 수가 조카의 수보다 더 많은 경우 사탕의 길이를 늘릴 수 있다.
                s = mid + 1;
                answer = Math.max(answer,mid);
            }
            if(cnt < M){ // 사탕의 수와 조카의 수 비교 : 사탕의 수가 조카의 수보다 더 적은 경우 사탕의 길이를 줄여야한다.
                e = mid - 1;
            }
        }
        System.out.println(answer);
    }
}
