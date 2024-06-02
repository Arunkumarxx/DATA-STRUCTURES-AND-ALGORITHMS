package BIT_WISE;

public class countBit {
    static int setBits(int N) {
        // code here
        int count=0;//2

        while(N>0)
        {
            if((N&1)==1){
                count++;
            }
            N=N>>>1;
        }
        return count;
    }
    public static void main(String[] args) {
      int ans=  setBits(6);
        System.out.println(ans);
    }
}
//00000000000000000000000000000001   = 3
//00000000000000000000000000000001   = 1
