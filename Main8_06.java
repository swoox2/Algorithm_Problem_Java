package study;

import java.util.Scanner;

public class Main8_06 {
    static int n,m;
    static int[] arr1,arr2,ch; //check배열을 만들어서 중복된 값을 뽑지 못하게 한다.
    public void DFS(int L){
        if(L==m){
            for(int i=0; i<m; i++) System.out.print(arr2[i]+" ");
            System.out.println();
        }else{
            for(int i=0; i<n; i++){
                if(ch[i]!=1) {
                    arr2[L]=arr1[i];
                    ch[i]=1;
                    DFS(L+1);
                    ch[i]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Main8_06 T=new Main8_06();
        Scanner scan=new Scanner(System.in);
        n= scan.nextInt(); //자연수 개수
        m= scan.nextInt(); //뽑는 개수
        arr1=new int[n]; //자연수를 저장하는 배열
        arr2=new int[m]; //자연수 중에 뽑은 자연수를 저장하는 배열
        ch=new int[n];
        for(int i=0; i<n; i++) arr1[i]= scan.nextInt();
        T.DFS(0);

    }

}
