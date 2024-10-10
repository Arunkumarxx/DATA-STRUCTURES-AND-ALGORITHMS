package RECURSION;
public class TowerOfHanoiUsingRecursionGkg {
    static void TowerOfHanoi(int n,int src,int aux,int des) {
        if (n==1) {
            System.out.println("move disk "+n+" from rod "+src+" to rod "+des);
            return;
        }
        TowerOfHanoi(n-1,src,des,aux);
        System.out.println("Move disk "+n+" from rod "+src+" to rod "+ des);
        TowerOfHanoi(n-1,aux,src,des);
    }
    public static void main(String[] args) {
        int n=2;
        TowerOfHanoi(n,1,2,3);

    }
}