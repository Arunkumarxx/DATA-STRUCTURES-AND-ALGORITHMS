package ARRAYS;

public class RerrangeArrayAlternatively {
        public static void rearrange(long arr[], int n){
            long  Max=(arr[n-1])+1;
            int   RightMax=(int)n-1;
            int  LeftMin=0;

            for(int i=0; i<n;i++){
                if(i%2==0){
                    arr[i]+=(arr[RightMax]%Max*Max);
                    RightMax--;
                }
                if(i%2==1){
                    arr[i]+=(arr[LeftMin]%Max*Max);
                    LeftMin++;
                }
            }
            for (int i=0; i<n; i++){
                arr[i]=arr[i]/Max;
            }
        }

        public static void main(String[] args) {
            long arr[]= {1,2,3,4,5,6};
            int n= arr.length;
            rearrange(arr,n);
            for (long temp:arr)
                System.out.print(temp+" ");
        }
}
