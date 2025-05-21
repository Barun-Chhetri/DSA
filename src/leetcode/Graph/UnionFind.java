package leetcode.Graph;

import java.util.Arrays;

public class UnionFind {
    public static void main(String[] args) {
        UnionFind u=new UnionFind(10);
        System.out.println(u.toString());
        u.union(4,3);
        System.out.println(u.toString());
        u.union(3,8);
        System.out.println(u.toString());
        u.union(6,5);
        System.out.println(u.toString());
        u.union(9,4);
        System.out.println(u.toString());
    }
    int[] root;
    public UnionFind(int n){
        root= new int[n];
        for(int i=0;i<n;i++){
            root[i]=i;
        }
    }
//    public int find(int x){
//        return root[x];
//    }
public int find(int x) {
    if (root[x] != x) {
        root[x] = find(root[x]); // path compression
    }
    return root[x];
}
    public void union(int x,int y){
        int rootx=find(x);
        int rooty=find(y);
        if(rootx!=rooty){
            root[rootx]=rooty;
//            for(int i=0;i<root.length;i++){
//               if (root[i]==rootx){
//               root[i]=rooty;
//            }

        }
    }
    public String toString(){
        return Arrays.toString(root);
    }
}
