package study;

public class Main7_06 {
    static int n;
    static int[] ch;
    public void DFS(int L){
        if(L==n+1){
            for(int i=1; i<n+1; i++){
                if(ch[i]==1) System.out.print(i);
            }
            System.out.println();
        }
        else{
            ch[L] = 1; //왼쪽 트리 가기 전 동작
            DFS(L+1); //왼쪽 트리
            ch[L] = 0; //오른쪽 트리 가기 전 동작
            DFS(L+1); //오른쪽 트리

        }
    }

    public static void main(String[] args) {
        Main7_06 T = new Main7_06();
        n=3;
        ch=new int[n+1];
        T.DFS(1);
    }

}
