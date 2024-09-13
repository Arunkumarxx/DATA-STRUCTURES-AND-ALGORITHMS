package STACK;

public class LargestRectangleWithAllOnes {
    private StackNode head;

    private class StackNode {
        int data;
        StackNode next;
        StackNode(int value) {
            this.data=value;
            this.next=null;
        }
    }

    private void push(int value) {
        StackNode newNode=new StackNode(value);
        newNode.next=head;
        head=newNode;
    }

    private int pop() {

        int value=head.data;
        head=head.next;
        return value;
    }

    private int top() {

        return head.data;
    }

    private boolean isEmpty() {
        return head==null;
    }

    private void clear() {
        head=null;
    }

    private static int maxArea(int[][] matrix,int m,int n) {
        LargestRectangleWithAllOnes stack=new LargestRectangleWithAllOnes();
        int[][] matrixHeight=new int[m][n];

        for(int j=0;j<n;++j) {
            matrixHeight[0][j]=matrix[0][j];
        }

        for(int i=1;i<m;++i) {
            for(int j=0;j<n;++j) {
                if(matrix[i][j]!=0)matrixHeight[i][j]=matrixHeight[i-1][j]+1;
                else matrixHeight[i][j]=0;
            }
        }

        int maxRectangle=0;

        for(int i=0;i<m;++i) {
            int[] pse=stack.previousSmallerIndex(matrixHeight[i],stack);
            stack.clear();
            int[] nse=stack.nextSmallerIndex(matrixHeight[i],stack);

            for(int j=0;j<n;++j) {
                int width=nse[j]-pse[j]-1;
                int area=width*matrixHeight[i][j];
                maxRectangle=Math.max(maxRectangle,area);
            }
        }

        return maxRectangle;
    }

    private int[] previousSmallerIndex(int[] arr,LargestRectangleWithAllOnes stack) {
        int n=arr.length;
        int[] res=new int[n];

        for(int j=0;j<n;++j) {
            while(!stack.isEmpty()&&arr[stack.top()]>=arr[j])stack.pop();
            res[j]=stack.isEmpty()?-1:stack.top();
            stack.push(j);
        }

        return res;
    }

    private int[] nextSmallerIndex(int[] arr,LargestRectangleWithAllOnes stack) {
        int n=arr.length;
        int[] res=new int[n];

        for(int j=n-1;j>=0;--j) {
            while(!stack.isEmpty()&&arr[stack.top()]>=arr[j])stack.pop();
            res[j]=stack.isEmpty()?n:stack.top();
            stack.push(j);
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] matrix={
                {1,0,1,0,0},
                {1,0,1,1,1},
                {1,1,1,1,1},
                {1,0,0,1,0}
        };

        int res=maxArea(matrix,matrix.length,matrix[0].length);
        System.out.println(res);
    }
}
