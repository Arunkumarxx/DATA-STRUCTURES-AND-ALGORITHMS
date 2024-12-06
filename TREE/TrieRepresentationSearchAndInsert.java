package TREE;

public class TrieRepresentationSearchAndInsert
{
    private final int alphabetSize=52;
    private class TrieNode
    {
        TrieNode [] trieNodes;
        boolean isEnd;
        TrieNode(boolean isEnd)
        {
            this.trieNodes=new TrieNode[alphabetSize];
            this.isEnd=isEnd;
        }
    }
    TrieNode root;
    private void Insert(String words)
    {
        if(root==null)
            root=new TrieNode(false);
        int n=words.length();
        TrieNode temp =root;
        for(int i=0;i<n;++i)
        {
            char curr=words.charAt(i);
            int ind = Character.isLowerCase(curr) ? curr-97 : curr-39;

            if(temp.trieNodes[ind]==null)
            {
                temp.trieNodes[ind]=new TrieNode(i==n-1?true:false);
                System.out.println("Value Added :"+curr);
                temp=temp.trieNodes[ind];
            }
            else
            {
                System.out.println("Value found :"+curr);
                temp = temp.trieNodes[ind];
            }
        }
    }
    private boolean search(String word)
    {
        if(root==null)
            return false;
        TrieNode temp =root;
        int n=word.length();
        int lastInd=0;
        for(int i=0;i<n;++i)
        {
            char curr=word.charAt(i);
            int ind=Character.isLowerCase(curr) ? curr-97 : curr-39;
            if(!(temp.trieNodes[ind]==null))
            {
                if(i==n-1)
                {
                    lastInd=ind;
                    continue;
                }
                temp = temp.trieNodes[ind];
            }
            else return false;
        }
        if(temp.trieNodes[lastInd]!=null && temp.trieNodes[lastInd].isEnd==true)
            return true;
        else return false;
    }
    public static void main(String[] args)
    {
        String [] words ={"arunkumar", "arunprasanth"};
        TrieRepresentationSearchAndInsert Trie =new TrieRepresentationSearchAndInsert();
        
        for(String val:words)
            Trie.Insert(val);

        System.out.println(Trie.search("arunkumar"));
        System.out.println(Trie.search("arunkumar"));
        System.out.println(Trie.search("ar"));
    }
}
