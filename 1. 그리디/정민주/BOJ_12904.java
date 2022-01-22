
import java.util.Scanner;

public class BOJ_12904 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //S = B
        String t = sc.nextLine();
        //t =ABBA

        // 그냥 뒤에 추가할 수 있는 문자
        char x = 'A';
        // 전체를 뒤집어야 추가할 수 있는 문자 A->B B->A
        char y = 'B';
        //
        int index = t.length();
        //뒤집는 횟수 체크
        int turn = 0;

        while(index > s.length()){
            // 전체 문자열을 뒤집어야 붙일 수 있는 문자라면
            if (t.charAt(index-1) == y)  {turn ++; x=change(x); y=change(y);}
            index--;}

        String compare = "";

        for(int i = 0 ; i<s.length(); i++){
            if(turn%2==0) compare +=t.charAt(i);
            else{
                compare +=change(t.charAt(i));}}

        System.out.println(compare.equals(s)?1:0);}

    static char change(char s){
        if(s == 'A') return 'B';
        else return 'A';
    }
}
