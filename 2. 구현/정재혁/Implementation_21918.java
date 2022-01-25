package Algorithm;

import java.util.ArrayList;
import java.util.Scanner;

class Command{
    int n1,n2;

    void cmd1(int n1,int n2, int arr[]){
        arr[n1-1]=n2;
    }
    void cmd2(int n1,int n2, int arr[]){
        for(int i=n1-1;i<n2;i++){
            if(arr[i]==0) arr[i]=1;
            else arr[i]=0;
        }
    }
    void cmd3(int n1,int n2, int arr[]){
        for(int i=n1-1;i<n2;i++){
            arr[i]=0;
        }
    }
    void cmd4(int n1,int n2, int arr[]){
        for(int i=n1-1;i<n2;i++){
            arr[i]=1;
        }
    }

}

public class Main_21918 {
    public static void main(String[] argv){
        Scanner sc= new Scanner(System.in);
        Command cmd = new Command();
        int N = sc.nextInt();
        int M = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<M;i++){
            int a =sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a==1) cmd.cmd1(b,c,arr);
            else if(a==2) cmd.cmd2(b,c,arr);
            else if(a==3) cmd.cmd3(b,c,arr);
            else cmd.cmd4(b,c,arr);
        }
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
    }
}