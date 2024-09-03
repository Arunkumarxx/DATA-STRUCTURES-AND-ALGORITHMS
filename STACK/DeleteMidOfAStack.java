package STACK;

public class DeleteMidOfAStack {

    public void deleteMid(Stack<Integer> s, int n) {

        delete(s,n/2);
    }
    public void delete(Stack<Integer>s,int mid)
    {
        if(mid==0)
        {
            s.pop();
            return;
        }
        int x= s.pop();
        delete(s,mid-1);
        s.push(x);
    }
    public static void main(String[] args) {

    }

}
