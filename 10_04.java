import java.io.*;
import java.util.*;

class Brick implements Comparable<Brick>{
    int s,h,w;
    Brick(int s, int h, int w){
        this.s=s;
        this.h=h;
        this.w=w;

    }
    @Override
    public int compareTo(Brick o){
        return o.s-this.s;
    }
}

public class Main {
    static int[] dp;
    static ArrayList<Brick> arr=new ArrayList<>();
    public static void solution(){
        dp[0]=arr.get(0).h;

        for(int i=1; i<arr.size(); i++){
            int max=0;
            for(int j=i-1; j>=0; j--){
                if(arr.get(i).w<arr.get(j).w){
                    max=Math.max(max,dp[j]);
                }
            }
            dp[i]=max+arr.get(i).h;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int n=Integer.parseInt(br.readLine());
        dp=new int[n];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());

            int s=Integer.parseInt(st.nextToken());
            int h=Integer.parseInt(st.nextToken());
            int w=Integer.parseInt(st.nextToken());

            arr.add(new Brick(s,h,w));
        }

        Collections.sort(arr);

        solution();

        int max=0;
        for(int i=0; i<n; i++) max=Math.max(max,dp[i]);

        bw.write(String.valueOf(max));

        br.close();
        bw.close();
    }
}
