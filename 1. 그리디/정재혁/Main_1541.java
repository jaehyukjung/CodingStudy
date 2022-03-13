import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1541 {
    public static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        String[] arr= st.split("-");

        int[] num1 = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i].contains("+")==true){
                String[] arr2 = arr[i].split("\\+");
                for(int j=0;j<arr2.length;j++){
                    num1[i] = num1[i]+Integer.parseInt(arr2[j]);
                }
            }
            else{
                num1[i]= Integer.parseInt(arr[i]);
            }
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(i==0){
                ans = ans+num1[0];
            }
            else ans = ans-num1[i];
        }
        System.out.println(ans);
    }
}