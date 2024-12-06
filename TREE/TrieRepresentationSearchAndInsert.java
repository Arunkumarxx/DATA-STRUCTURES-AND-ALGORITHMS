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
        }
    }
    TrieNode root;
    private void Insert(String key)
    {
        if(root==null)
        {
            root = new TrieNode();
        }
        int n=key.length();
        TrieNode temp =root;
        for(int i=0;i<n;++i)
        {
            char curr=key.charAt(i);
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
    private boolean search(String key)
    {
        if (root == null)
            return false;
        TrieNode temp = root;
        int n = key.length();
        for (int i =0; i<n; ++i)
        {
            char curr = key.charAt(i);
            int ind = Character.isLowerCase(curr) ? curr - 97 : curr - 39;
            if (temp.children[ind] == null)
                return false;
            temp = temp.children[ind];
        }
        return temp.isEndOfWord;
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
