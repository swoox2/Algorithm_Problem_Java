package study;

import java.util.Scanner;

public class Main8_10 {
    static int[][] m;
    static int answer=0;
    // dx, dy는 순서대로 상,우,하,좌로 이동하기 위한 좌표
    static int[] dx={-1, 0, 1, 0};
    static int[] dy={0, 1, 0, -1};
    public void DFS(int x, int y){
        if(x==7 && y==7) answer++;
        else{
            for(int i=0; i<4; i++){
                int nx=x+dx[i];
                int ny=y+dy[i];
                if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && m[nx][ny]==0){
                    m[nx][ny]=1; //방문한 좌표 1로 변경
                    DFS(nx,ny);
                    m[nx][ny]=0; //경로를 돌아오면서 방문한 좌표를 다시 0으로 변경
                }
            }
        }
    }
    public static void main(String[] args) {
        Main8_10 T=new Main8_10();
        Scanner scan=new Scanner(System.in);
        m=new int[8][8];
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                m[i][j]= scan.nextInt();
            }
        }
        m[1][1]=1;
        T.DFS(1,1);
        System.out.println(answer);
    }
}
