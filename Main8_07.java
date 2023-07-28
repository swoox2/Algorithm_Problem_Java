package study;

import java.util.Scanner;

public class Main8_07 {

    int[][] memory=new int[35][35];
    public int DFS(int n, int r){
        if(memory[n][r]>0) return memory[n][r];
        if(r==0 || n==r) return 1;
        else return memory[n][r]=DFS(n-1, r-1)+DFS(n-1, r);
    }

    public static void main(String[] args) {
        Main8_07 T=new Main8_07();
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int r= scan.nextInt();
        System.out.println(T.DFS(n,r));

    }
}
