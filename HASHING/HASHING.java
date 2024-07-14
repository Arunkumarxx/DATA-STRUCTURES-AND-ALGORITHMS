package HASHING;

public class HASHING {
    public static void main(String[] args){
        int [] key= {50,21,58,17,15,48,56,22,23,25};
        int n= key.length;
        System.out.println(n);
        for (int i=0; i<n; i++)
        {
            System.out.print((key[i] % n)+" ");
        }
    }
}
