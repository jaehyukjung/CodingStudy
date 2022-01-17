import java.util.*;

public class BOJ_12904 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        // 초기값 입력받기
        String str1 = sc.next();
        String str2 = sc.next();
        int answer = 0;
        while(true) {
            if(str1.length() == str2.length()) {
                break;
            }
            char check = str2.charAt(str2.length()-1);
            if (check == 'A') {
                str2 = str2.substring(0, str2.length()-1);
            }
            else if(check == 'B') {
                str2 = str2.substring(0, str2.length()-1);
                String str3 = "";
                for(int i = str2.length()-1; i >= 0; i--) {
                    str3 += str2.charAt(i);
                }
                str2 = str3;
            }
            else {
                break;
            }
        }

        if(str1.equals(str2)) {
            answer = 1;
            System.out.println(answer);
        }
        else {
            System.out.println(answer);
        }
    }
}