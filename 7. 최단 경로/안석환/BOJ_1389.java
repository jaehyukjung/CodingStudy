import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1389 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<Integer>> friends = new ArrayList<ArrayList<Integer>>();
        for(int i = 1; i <= N+1; i++){ //관계도 초기화
            friends.add(new ArrayList<Integer>());
        }
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            friends.get(s).add(e);
            friends.get(e).add(s);
        }
        int[] answer = new int[N+1];
        for(int i = 1; i <= N; i++){
            int[] kavin = new int[N+1];
            boolean[] check = new boolean[N+1];
            check[i] = true;
            Queue<Integer> q = new LinkedList<>();
            q.offer(i);
            while(!q.isEmpty()){
                int y = q.poll();
                for(int friend : friends.get(y)){
                    if(check[friend] == false){
                        check[friend] = true;
                        if(kavin[friend] == 0){
                            kavin[friend] = kavin[y]+1;
                        }
                        q.offer(friend);
                    }
                }
            }
            int sum = 0;
            for(int j = 1; j <= N; j++){
                sum += kavin[j];
            }
            answer[i] = sum;
        }
        int min = 1;
        for(int i = 1; i <= N; i++){
            if(answer[min] > answer[i]){
                min = i;
            }
        }
        System.out.println(min);
    }
}
