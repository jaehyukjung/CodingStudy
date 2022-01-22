import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1652 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine()); // 입력받는 거
        char[][] map = new char[N][N]; // 문제에서 주어지는 맵
        for(int i = 0; i < N; i++){
            String str = br.readLine();
            for(int j = 0; j < str.length(); j++){
                map[i][j] = str.charAt(j);
            }
        } // 맵에 문자 넣는 거
        int check = 0;
        boolean room = false;
        // 가로
        for(int i = 0; i < N; i++){
            char pre_width = map[i][0];
            for(int j = 1; j < N; j++){
                if(map[i][j] == '.'){
                    if(pre_width == '.') {
                        room = true;
                    }
                }
                if(map[i][j] == 'X'){
                    if(room){
                        check++;
                    }
                    room = false;
                }
                pre_width = map[i][j];
            }
            if(room) {
                check++;
            }
            room = false;
        }
        int cnt_width = check;
        check = 0;
        //세로
        for(int i = 0; i < N; i++){
            char pre_height = map[0][i];
            for(int j = 1; j < N; j++){
                if(map[j][i] == '.'){
                    if(pre_height == '.') {
                        room = true;
                    }
                }
                if(map[j][i] == 'X'){
                    if(room){
                        check++;
                    }
                    room = false;
                }
                pre_height = map[j][i];
            }
            if(room) {
                check++;
            }
            room = false;
        }
        int cnt_height = check;
        System.out.println(cnt_width+" "+cnt_height);
    }
}
