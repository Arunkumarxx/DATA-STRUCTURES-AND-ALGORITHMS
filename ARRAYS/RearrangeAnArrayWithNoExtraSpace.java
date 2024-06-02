package ARRAYS;
public class RearrangeAnArrayWithNoExtraSpace {
    public static void main(String[] args) {
        long  arr[]= {4,0,2,1,3};
        int n= arr.length;
        for(int i=0; i<n; i++){
            arr[i]=(arr[i]+(arr[(int)arr[i]]%n)*n);
        }
        for(int j=0; j<n; j++){
            arr[j]=arr[j]/n;
        }
        for (long   temp:arr)
            System.out.print(temp+" ");
    }
}