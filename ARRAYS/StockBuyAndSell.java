package ARRAYS;

import java.util.ArrayList;

public  class StockBuyAndSell {
   static ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
       int min=Integer.MAX_VALUE;
       ArrayList<ArrayList<Integer>> arrayListOut = new ArrayList();

       int buy=0,sell=0;
       for(int i=1; i<n; i++)
       {
           ArrayList<Integer> arrayListIn= new ArrayList();
           if(A[i]>A[i-1])
           {
               sell++;
           }
           else
           {
               if (buy-sell!=0)
               {
                   arrayListIn.add(buy);
                   arrayListIn.add(sell);
                   arrayListOut.add(arrayListIn);
               }

               buy=i;
               sell=i;
           }
       }

       if(buy-sell!=0)
       {
           ArrayList<Integer> arrayListIn= new ArrayList();
           arrayListIn.add(buy);
           arrayListIn.add(sell);
           arrayListOut.add(arrayListIn);
       }
       return arrayListOut;
    }

    public static void main(String[] args) {
       int [] A = {100,180,260,310,40,535,695};
        System.out.println(stockBuySell(A,A.length));
    }
}
