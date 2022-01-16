import java.io.*;
import java.util.*;

public class Main {

    static String S, T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        S = br.readLine();
        T = br.readLine();

        dfs(S);
        System.out.println(0);
    }

    static void dfs(String str) {
        if (str.length()==T.length()) {
            if (str.equals(T)) {
                System.out.println(1);
                System.exit(0);
            }
            return;
        }
        dfs(str+"A");
        dfs(reverse(str)+"B");

    }

    static String reverse(String s) {
        return (new StringBuilder(s).reverse().toString());
    }
}