import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String answer = "";
        if(str.contains("<") || str.contains(">")){
            boolean check = false;
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == '<'){
                    check = true;
                    if(!answer.equals("")){
                        for(int j = answer.length()-1; j >= 0; j--) {
                            System.out.print(answer.charAt(j));
                        }
                        answer = "";
                    }
                    System.out.print("<");
                }
                else if(str.charAt(i) == '>'){
                    System.out.print(">");
                    check = false;
                }
                else if(str.charAt(i) == ' '){
                    if(answer.equals("")) {
                        System.out.print(" ");
                    }
                    else{
                        for(int j = answer.length()-1; j >= 0; j--){
                            System.out.print(answer.charAt(j));
                        }
                        System.out.print(" ");
                        answer="";
                    }

                }
                else{
                    if(check){
                        System.out.print(str.charAt(i));
                    }
                    else{
                        answer = answer + str.charAt(i);
                    }
                }
            }
            if(!answer.equals("")){
                for(int j = answer.length()-1; j >= 0; j--) {
                    System.out.print(answer.charAt(j));
                }
                answer = "";
            }
        }
        else{
            String[] next1 = str.split(" ");
            for(int i = 0; i < next1.length; i++){
                for(int j = next1[i].length()-1; j >= 0; j--){
                    char answer2 = next1[i].charAt(j);
                    System.out.print(answer2);
                }
                System.out.print(" ");
            }
        }
    }
}