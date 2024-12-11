package TREE;

public class SegmentTreeBuildAndSearch
{
    private class SegmentTree
    {
        int start;
        int end;
        int value;
        SegmentTree(int start,int end)
        {
            this.start=start;
            this.end=end;
        }
    }
    SegmentTree [] segmentTrees;
    private void buildSegmentTree(int [] arr,int n)
    {
        segmentTrees=new SegmentTree[4*n+1];
        build(0,0,n-1);
        fillTree(arr,0);
    }
    private void  fillTree(int [] arr,int index)
    {
        if(segmentTrees[index].start==segmentTrees[index].end)
        {
            segmentTrees[index].value=arr[segmentTrees[index].start];
            return ;
        }
        int leftIndex=2*index+1;
        int rightIndex=leftIndex+1;
         fillTree(arr,leftIndex);
        fillTree(arr,rightIndex);

         segmentTrees[index].value=Math.max(segmentTrees[leftIndex].value,segmentTrees[rightIndex].value);
    }
    private void build(int index,int start,int end)
    {
        segmentTrees[index]=new SegmentTree(start,end);
        if(start==end)
            return;
        int mid=start+(end-start)/2;
        int nextInd=2*index;
        build(nextInd+1,start,mid);
        build(nextInd+2,mid+1,end);
    }
    private int  searchQuery(int [] arr,int index,int start,int end)
    {
        if(segmentTrees[index].start==segmentTrees[index].end)
        {
            return segmentTrees[index].value;
        }
        int mid=(segmentTrees[index].start+segmentTrees[index].end)/2;

        if(end<=mid)
            return searchQuery(arr,2*index+1,start,end);
        else if(start>mid)
            return searchQuery(arr,2*index+2,start,end);
        else return Math.max(searchQuery(arr,2*index+1,start,mid),searchQuery(arr,2*index+2,mid+1,end));
    }
    public static void main(String[] args)
    {
        SegmentTreeBuildAndSearch segmentTree =new SegmentTreeBuildAndSearch();

        int [] arr ={8,2,5,1,4,5,3,9,6,10};
        int n=arr.length;
        segmentTree.buildSegmentTree(arr,n);
        System.out.println(segmentTree.searchQuery(arr,0,2,5));
    }
}

