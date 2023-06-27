package study;

public class Main7_1 {
    public void DFS(int n){
        // 재귀함수 탈출조건
        if(n==0){
            return;
        // 재귀함수 수행동작
        }else{
            DFS(n-1);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args){
        Main7_1 T = new Main7_1();
        T.DFS(3);
    }
}

