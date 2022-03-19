import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_1138 {
    public static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[]= new int[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(N));
        for(int i=N-2;i>=0;i--){
            list.add(arr[i],i+1);
        }
        for(int i=0;i<N;i++){
            System.out.print(list.get(i)+" ");
        }
    }
}