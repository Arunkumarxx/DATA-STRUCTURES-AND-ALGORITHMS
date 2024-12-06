package TREE;

public class TrieRepresentationSearchAndInsert
{
    private final int alphabetSize=52;
    private class TrieNode
    {
        TrieNode [] children;
        boolean isEndOfWord;
        TrieNode()
        {
            this.children =new TrieNode[alphabetSize];
            this.isEndOfWord =isEnd;
        }
    }
    TrieNode root;
    private void Insert(String words)
    {
        if(root==null)
        {
            root = new TrieNode();
        }
        int n=words.length();
        TrieNode temp =root;
        for(int i=0;i<n;++i)
        {
            char curr=words.charAt(i);
            int ind = Character.isLowerCase(curr) ? curr-97 : curr-39;

            if(temp.children[ind]==null)
            {
                temp.children[ind]=new TrieNode();
                temp.children[ind].isEndOfWord=(i==n-1)?true:false;
                System.out.println("Value Added :"+curr);
                temp=temp.children[ind];
            }
            else
            {
                System.out.println("Value found :"+curr);
                temp = temp.children[ind];
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
            if(!(temp.children[ind]==null))
            {
                if(i==n-1)
                {
                    lastInd=ind;
                    continue;
                }
                temp = temp.children[ind];
            }
            else return false;
        }
        if(temp.children[lastInd]!=null && temp.children[lastInd].isEndOfWord ==true)
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
