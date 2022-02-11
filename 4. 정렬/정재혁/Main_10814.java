import java.util.*;

public class Main_10814 {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String name[][]= new String[N][2];
        for(int i=0;i<N;i++){
            name[i][0]=sc.next();
            name[i][1]=sc.next();
        }

        Arrays.sort(name, new Comparator<String[]>() {
            public int compare(String[] s1, String[] s2) {
                return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
            }
        });

        for(int i = 0; i < N; i++) {
            System.out.println(name[i][0] + " " + name[i][1]);
        }
    }
}