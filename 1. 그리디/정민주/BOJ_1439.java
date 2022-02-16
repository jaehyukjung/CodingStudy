import java.util.Scanner;

public class BOJ_1439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int zero = 0;
        int one = 0;
        char prev = input.charAt(0);
        if(prev == '0') zero++;
        else if(prev == '1') one++;
        for(int i=1;i<input.length();i++){
            char now = input.charAt(i);
            if(prev != now){
                if(now == '0') zero ++;
                else if(now == '1') one++;
                prev = now;
            }
        }
        System.out.println(Math.min(zero, one));
    }
}