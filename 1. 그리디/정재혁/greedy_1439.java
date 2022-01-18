import java.util.Scanner;

public class Greedy_1439 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        int cnt1 =0;
        int cnt2 =0;
        if(line.charAt(0)=='0') cnt1=1;
        if(line.charAt(0)=='1') cnt2=1;

        for(int i =1;i<line.length();i++) {
            if(line.charAt(i-1)!=line.charAt(i)) {
                if(line.charAt(i)=='0') cnt1++;
                else cnt2++;
            }
        }
        if(cnt1<cnt2) System.out.println(cnt1);
        else System.out.println(cnt2);

        sc.close();
    }
}