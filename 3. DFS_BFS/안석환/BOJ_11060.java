import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_11060 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] map = new int[N];
        int[] check = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            map[i] = Integer.parseInt(st.nextToken());
        }
        int chk = 0;
        Queue<Integer> q = new LinkedList<>();
        q.offer(map[chk]);
        while(!q.isEmpty()){
            if(chk >= N-1){
                break;
            }
            int y = q.poll();
            int visit = check[chk];
            for(int i = 0; i < y; i++){
                chk++;
                if(chk == N){
                    break;
                }
                if(check[chk] == 0){
                    check[chk] = visit + 1;
                }
                q.offer(map[chk]);
            }
        }
        if(check[N-1] == 0){
            System.out.println(-1);
        }
        else{
            System.out.println(check[N-1]);
        }
    }
}