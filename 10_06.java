import java.io.*;
import java.util.*;
class Node{
    int score;
    int time;

    Node(int score, int time){
        this.score=score;
        this.time=time;
    }
}

public class Main {
    static ArrayList<Node> arr=new ArrayList<>();
    static int n,m;
    static int[] dp;

    public static void maxScore(){
        for(int i=0; i<n; i++){
            for(int j=m; j>=arr.get(i).time; j--){
                dp[j]=Math.max(dp[j],dp[j-arr.get(i).time]+arr.get(i).score);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken()); //점수
        m=Integer.parseInt(st.nextToken()); //시간

        for(int i=0; i<n; i++){
            st=new StringTokenizer(br.readLine());
            int score=Integer.parseInt(st.nextToken());
            int time=Integer.parseInt(st.nextToken());
            arr.add(new Node(score,time));
        }

        dp=new int[m+1];

        maxScore();

        int max=0;
        for(int i=0; i<m+1; i++){
            max=Math.max(max,dp[i]);
        }

        bw.write(String.valueOf(max));

        br.close();
        bw.close();
    }
}
