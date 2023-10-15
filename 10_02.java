import java.io.*;
import java.util.*;
public class Main {
    static int[] dp;
    public static int solution(int n){
        dp[1]=1;
        dp[2]=2;

        for(int i=3; i<=n+1; i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n+1];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int n=Integer.parseInt(br.readLine());
        dp=new int[n+2];

        bw.write(String.valueOf(solution(n)));


        br.close();
        bw.close();
    }
}
