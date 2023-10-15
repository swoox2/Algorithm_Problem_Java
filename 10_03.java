import java.io.*;
import java.util.*;
public class Main {
    static int[] dp;
    static int[] arr;
    static int n;
    public static void solution(){
        dp[0]=1;

        for(int i=1; i<n; i++){
            int max=0;
            for(int j=i-1; j>=0; j--){
                if(arr[i]>arr[j]){
                    max=Math.max(max,dp[j]);
                }
            }
            dp[i]=max+1;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        n=Integer.parseInt(br.readLine());
        arr=new int[n];
        dp=new int[n];

        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) arr[i]=Integer.parseInt(st.nextToken());

        solution();

        int max=0;
        for(int i=0; i<n; i++){
            max=Math.max(max,dp[i]);
        }

        bw.write(String.valueOf(max));

        br.close();
        bw.close();
    }
}
