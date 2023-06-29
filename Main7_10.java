package study;

import java.util.LinkedList;
import java.util.Queue;

class Node4{
    int data;
    Node4 lt,rt;
    public Node4(int val){
        data=val;
        lt=rt=null;
    }
}

public class Main7_10 {
    Node4 root;
    Queue<Node4> Q = new LinkedList<>();
    public int BFS(int L, Node4 root){
        Q.add(root);
        while (!Q.isEmpty()){
            int len = Q.size(); //level에서 노드의 개수
            for(int i=0; i<len; i++){
                Node4 cur = Q.poll();
                if(cur.lt==null && cur.rt==null) return L;
                Q.add(cur.lt);
                Q.add(cur.rt);
            }
            L++;
        }
        return 0;

    }

    public static void main(String[] args) {
        Main7_10 tree=new Main7_10();
        tree.root=new Node4(1);
        tree.root.lt=new Node4(2);
        tree.root.rt=new Node4(3);
        tree.root.lt.lt=new Node4(4);
        tree.root.lt.rt=new Node4(5);
        System.out.println(tree.BFS(0, tree.root));
    }
}
