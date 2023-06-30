package study;

public class Main7_03 {
    public int DFS(int n){
        if(n==1){
            return 1;
        }else{
            return n*DFS(n-1);
        }

    }
    public static void main(String[] args){
        Main7_03 T = new Main7_03();
        System.out.println(T.DFS(5));
    }
}
