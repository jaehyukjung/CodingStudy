import java.util.Scanner;

public class BOJ_1439 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split("");
        int one = 0, zero = 0;
        String num = arr[0];
        if (num.equals("0") ) {
            zero++;
        }
        else if(num.equals("1")) {
            one++;
        }
        for(int i = 1; i < arr.length; i++) {
            String next = arr[i];
            if(next.equals(num)) {
                continue;
            }
            else {
                if(arr[i].equals("0")) {
                    zero++;
                }
                else if(arr[i].equals("1")) {
                    one++;
                }
                num = arr[i];
            }
        }
        if (one >= zero) {
            System.out.println(zero);
        }
        else {
            System.out.println(one);
        }
    }
}
