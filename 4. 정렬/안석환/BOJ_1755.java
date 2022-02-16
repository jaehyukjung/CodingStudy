import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_1755 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        HashMap<Character, String> dic = new HashMap<Character, String>();
        dic.put('0', "zero");
        dic.put('1', "one");
        dic.put('2', "two");
        dic.put('3', "three");
        dic.put('4', "four");
        dic.put('5', "five");
        dic.put('6', "six");
        dic.put('7', "seven");
        dic.put('8', "eight");
        dic.put('9', "nine");
        st = new StringTokenizer(br.readLine());
        String start = st.nextToken();
        String end = st.nextToken();
        int[] num = new int[Integer.parseInt(end)-Integer.parseInt(start)+1];
        int idx = 0;
        for(int i = Integer.parseInt(start); i <= Integer.parseInt(end); i++){
            num[idx++] = i;
        }
        for(int i = 0; i < idx-1; i++){ // 기준
            int small = i;
            for(int j = i+1; j < idx; j++){ // 비교대상
                String num1 = String.valueOf(num[small]);
                String num2 = String.valueOf(num[j]);
                for(int k = 0; k < num1.length(); k++){ //비교과정
                    if(dic.get(num1.charAt(k)).compareTo(dic.get(num2.charAt(k)))>0){
                        small = j;
                        break;
                    }
                    else if(dic.get(num1.charAt(k)).compareTo(dic.get(num2.charAt(k))) == 0){
                        if(num1.length() > num2.length()){
                            small = j;
                            break;
                        }
                    }
                    else if(dic.get(num1.charAt(k)).compareTo(dic.get(num2.charAt(k)))<0) break;
                }
            }
            int temp = num[small];
            num[small] = num[i];
            num[i] = temp;
        }
        for(int i = 0; i < idx; i++){
            System.out.print(num[i]+" ");
            if(i % 10 == 9) System.out.println();
        }
    }
}
