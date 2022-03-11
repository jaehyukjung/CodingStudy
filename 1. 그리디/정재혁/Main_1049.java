import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1049 {
    public static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cost[][] =new int[M][2];
        int pay=0;

        for(int i = 0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            cost[i][0]= Integer.parseInt(st.nextToken());
            cost[i][1]= Integer.parseInt(st.nextToken());
        }
        int min1 =cost[0][0];
        int min2 =cost[0][1];
        for(int i=1;i<M;i++){
            if(min1>cost[i][0]) min1 = cost[i][0];
            if(min2>cost[i][1]) min2 = cost[i][1];
        }
        if(N/6>=1){
            if(min1<=min2*6 && min1>=(N%6)*min2) pay = min1*(N/6) + min2*(N%6);
            else if(min1<=min2*6 && min1<(N%6)*min2) pay = min1*((N/6) + 1);
            else pay = min2*N;
        }
        
        else{
            if(min1<=min2*N) pay = min1;
            else pay =min2*N;
        }
        System.out.println(pay);
    }
}
