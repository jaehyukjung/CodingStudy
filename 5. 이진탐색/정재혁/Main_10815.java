import java.util.Arrays;
import java.util.Scanner;

public class Main_10815 {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        binsearch bs = new binsearch();
        int N = sc.nextInt();
        int arr1[] = new int[N];
        for(int i=0;i<N;i++){
            arr1[i] =sc.nextInt();
        }
        int M = sc.nextInt();
        int arr2[] =new int[M];
        for(int i=0;i<M;i++){
            arr2[i]=sc.nextInt();
        }
        Arrays.sort(arr1);
        for(int i=0;i<M;i++){
            System.out.print(bs.binsearch(arr1,arr2[i])+" ");

        }
    }
}
class binsearch{
    public static int binsearch(int arr[],int target){
        int start =0;
        int end = arr.length-1;
        int mid =(start+end)/2;
        while(end-start>= 0){
            if(arr[mid]== target){
                return 1;
            }
            else if(arr[mid]<= target){
                start= mid+1;
            }
            else{
                end= mid-1;
            }
            mid= (end+start)/2;
        }
        return 0;
    }
}