package ARRAYS;
public class MajorityElement {
    static int MajorityElement(int[] a, int n) {

        int maj=a[0];
        int c=1;
        for(int i=1; i<n; i++)
        {
            if(maj==a[i])
                c++;
            else{
                c--;
                if(c<0)
                {
                    maj=a[i];
                    c=1;
                }
            }
        }
        int result=0;
        for(int i=0; i<n;i++)
        {
            if(a[i]==maj)
                result++;
        }
        if(result>n/2)
            return maj;
        return -1;
    }
        public static void main (String[]args){
            int[] arr = {15};
            int res = MajorityElement(arr, arr.length);
            System.out.println(res);
        }
    }
