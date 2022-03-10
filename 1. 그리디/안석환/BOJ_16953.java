import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_16953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[] check = new int[1000000001];
        Queue<Integer> q = new LinkedList<>();
        q.offer(B);
        while(!q.isEmpty()){
            int y = q.poll();
            if(y % 2 == 0){
                if(check[y/2] == 0){
                    check[y/2] = check[y] + 1;
                    q.offer(y/2);
                }
            }
            else{
                String b = String.valueOf(y);
                if(b.charAt(b.length()-1) == '1'){
                    if(b.equals("1")){
                        check[1] = check[y] + 1;
                        continue;
                    }
                    b = b.substring(0,b.length()-2);
                    if(check[Integer.parseInt(b)] == 0){
                        check[Integer.parseInt(b)] = check[y] + 1;
                        q.offer(Integer.parseInt(b));
                    }
                }
            }
        }
        System.out.println(check[A]+1);
    }
}
