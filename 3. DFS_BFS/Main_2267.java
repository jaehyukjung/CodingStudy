import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main_2667 {
    static int N;
    static int[][] Room;
    static int count;
    static int[] dr = {-1,1,0,0}; //좌우 x축
    static int[] dc = {0,0,-1,1}; //상하 y춧

    static ArrayList<Integer> result;
    static boolean[][] check;


    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        N = sc.nextInt();
        Room = new int[N][N];
        check = new boolean[N][N];


        for(int i=0;i<N;i++){
            String floor = sc.next();
            for(int j=0;j<N;j++){
                Room[i][j] = floor.charAt(j)-'0'; //아스키 코드값을 고려한 코드
            }
        }


        count =0;
        result = new ArrayList<>();

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(Room[i][j]==1 && !check[i][j]){
                    count =1;
                    Search(i,j);
                    result.add(count);
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for(int i=0;i< result.size();i++) System.out.println(result.get(i));
    }
    static int Search(int x,int y){
        check[x][y] =true;

        for(int i=0;i<4;i++){
            int nx = x+dr[i];
            int ny = y+dc[i];
            if(nx>=0 && ny>=0 && nx<N && ny<N){
                if(Room[nx][ny]==1 && !check[nx][ny]){
                    Search(nx,ny);
                    count++;
                }
            }
        }
        return count;
    }
}
