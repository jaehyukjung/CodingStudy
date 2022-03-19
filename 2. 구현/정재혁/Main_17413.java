
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_17413 {
    public static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<Character> st = new Stack<>();
        boolean tf =false;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='<'){
                tf=true;
                while(!st.isEmpty()){
                    System.out.print(st.pop());
                }

                System.out.print(str.charAt(i));
            }
            else if(str.charAt(i)=='>'){
                tf = false;
                System.out.print(str.charAt(i));
            }
            else if(tf ==true){
                System.out.print(str.charAt(i));
            }
            else{
                if(str.charAt(i)==' '){
                    while(!st.isEmpty()){
                        System.out.print(st.pop());
                    }
                    System.out.print(str.charAt(i));
                }
                else{
                    st.push(str.charAt(i));
                }
            }
        }
        while(!st.isEmpty()){
            System.out.print(st.pop());
        }
    }
}
