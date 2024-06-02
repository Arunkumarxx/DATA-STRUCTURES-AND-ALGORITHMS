package ARRAYS;
public class StockBuyAndSellProblem {
    static int  StockBuyAndSellProblem(int [] arr){
        int n= arr.length,profit=0;
        for (int i=1; i<n; i++)
        {
            if(arr[i]>arr[i-1])
            {
                profit+=arr[i]-arr[i-1];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int [] arr ={30,20,10};
       int result=  StockBuyAndSellProblem(arr);
        System.out.println(result);
    }
}