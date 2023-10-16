import java.io.*;
import java.util.*;

public class Main {
    static int[] coin;
    static int money;
    static int[] dp;

    public static void solution(){
        for(int i=0; i< coin.length; i++){
            for(int j=coin[i]; j<=money; j++){
                dp[j]=Math.min(dp[j],dp[j-coin[i]])+1;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int n=Integer.parseInt(br.readLine());

        coin=new int[n];

        st=new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            coin[i]=Integer.parseInt(st.nextToken());
        }

        money=Integer.parseInt(br.readLine());
        dp=new int[money+1];

        solution();

        bw.write(String.valueOf(dp[money]));

        br.close();
        bw.close();
    }
}
