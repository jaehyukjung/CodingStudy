import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1325 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] check = new int[N+1];
        ArrayList<ArrayList<Integer>> map = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i <= N; i++){
            map.add(new ArrayList<>());
        }
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            map.get(e).add(s);
        }
        int max = 0;
        for(int i = 1; i <= N; i++){
            int hack = 1;
            boolean[] hacked = new boolean[N+1];
            Queue<Integer> q = new LinkedList<>();
            q.offer(i);
            hacked[i] = true;
            while(!q.isEmpty()){
                int y = q.poll();
                for(int next: map.get(y)){
                    if(!hacked[next]){
                        hacked[next] = true;
                        hack++;
                        q.offer(next);
                    }
                }
            }
            check[i] = hack;
            max = Math.max(hack,max);
        }
        for(int i = 1; i <= N; i++){
            if(check[i] == max){
                System.out.print(i+" ");
            }
        }
    }
}
