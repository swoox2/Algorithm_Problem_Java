package study;

class Node3{
    int data;
    Node3 lt,rt;
    public Node3(int val){
        data=val;
        lt=rt=null;
    }
}

public class Main7_09 {
    Node3 root;
    public int DFS(int L, Node3 root){
        if(root.lt==null && root.rt==null) return L;
        else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
    }

    public static void main(String[] args) {
        Main7_09 tree=new Main7_09();
        tree.root=new Node3(1);
        tree.root.lt=new Node3(2);
        tree.root.rt=new Node3(3);
        tree.root.lt.lt=new Node3(4);
        tree.root.lt.rt=new Node3(5);
        System.out.println(tree.DFS(0, tree.root));
    }
}
