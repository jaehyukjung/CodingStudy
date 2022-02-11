import java.util.Arrays;
import java.util.Scanner;

public class Main_1755 {
    public static void main(String[] argv) {
        String str[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        char num[]={'0','1','2','3','4','5','6','7','8','9'};

        Scanner sc=new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        String arr[][] =new String[N-M+1][2];
        String str2[] =new String[N-M+1];


        for(int i=0;i<=(N-M);i++){
            String s = String.valueOf(M+i);
            for(int j=0;j<10;j++) {
                if (s.charAt(0) == num[j]) {
                    arr[i][0] = str[j];
                    if(i+M>=10){
                        for (int k = 0; k < 10; k++) {
                            if (s.charAt(1) == num[k]) {
                                arr[i][1] = str[k];
                                str2[i]=arr[i][0]+" "+arr[i][1];
                            }
                        }
                    }
                    else {
                        arr[i][1]="a";
                        str2[i]=arr[i][0]+" "+arr[i][1];
                    }
                }
            }
        }
        Arrays.sort(str2);


        int arr1[]=new int[N-M+1];
        int num2[]=new int[10];
        for(int i=0;i<10;i++){
            num2[i]= Integer.valueOf(num[i])-48;
        }
        for(int i=0;i<arr1.length;i++){
            arr[i] = str2[i].split(" ");
            for(int j=0;j<10;j++) {
                if (arr[i][0].equals(str[j]) && arr[i][1].equals("a")) {
                    arr1[i] = num2[j];
                }
                else if(arr[i][0].equals(str[j])) {
                    for (int k = 0; k < 10; k++) {
                        if (arr[i][1].equals(str[k])) {
                            arr1[i] = num2[j]*10+num2[k];
                        }
                    }
                }
            }
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
            if(i%10==9) System.out.println();
        }


    }
}
