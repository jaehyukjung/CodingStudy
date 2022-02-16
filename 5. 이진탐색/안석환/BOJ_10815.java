import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10815 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] N_arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N ; i++){
            N_arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(N_arr);
        int M = Integer.parseInt(br.readLine());
        int[] M_arr = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            M_arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] answer = new int[M];
        for(int i = 0; i < M; i++){
            int s = 0, l = N-1;
            while(s < l){
                int mid = (s+l)/2;
                if(N_arr[mid] == M_arr[i]){
                    s = l = mid;
                    break;
                }
                if(N_arr[mid] > M_arr[i]){
                    l = mid;
                }
                if(N_arr[mid] < M_arr[i]){
                    s = mid + 1;
                }
            }
            if(N_arr[s] == M_arr[i]){
                answer[i] = 1;
            }
            else{
                answer[i] = 0;
            }
        }
        for(int i = 0; i < M; i++){
            System.out.print(answer[i]+" ");
        }
    }
}
