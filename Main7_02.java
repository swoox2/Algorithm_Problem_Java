package study;

public class Main7_02 {
    public void DFS(int n){
        if(n==0){
            return;
        }else{
            DFS(n/2);
            System.out.print(n%2);
        }

    }
    public static void main(String[] args){
        Main7_02 T = new Main7_02();
        T.DFS(11);
    }
}
