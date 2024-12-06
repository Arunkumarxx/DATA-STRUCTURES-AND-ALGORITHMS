package TREE;

public class DeleteWordInTrie
{
    private final int alphabetSize=52;
    private class TrieNode
    {
        TrieNode[] children = new TrieNode[alphabetSize];
        boolean isEnd=false;
    }
    private TrieNode root;
    private void insert(String word)
    {
        if(root==null)
            root=new TrieNode();
        int n=word.length();
        TrieNode temp=root;
        for(int i=0;i<n;++i)
        {
            char curr=word.charAt(i);
            int ind = Character.isLowerCase(curr) ? curr-97 : curr-39;
            if(temp.children[ind]==null)
                temp.children[ind]=new TrieNode();
            temp=temp.children[ind];
        }
        temp.isEnd=true;
    }
    private boolean search(String key)
    {
        if(root==null)
            return false;

        TrieNode temp=root;
        int n=key.length();
        for(int i=0;i<n;++i)
        {
            char curr = key.charAt(i);
            int ind = Character.isLowerCase(curr) ? curr - 97 : curr - 39;
            if(temp.children[ind]==null)
                return false;
            temp=temp.children[ind];
        }
        return temp.isEnd;
    }
    private void delete(String word)
    {
        if(root==null)
            return;
        int n=word.length();
        TrieNode temp=root;
        for(int i=0;i<n;++i)
        {
            char curr=word.charAt(i);
            int ind=Character.isLowerCase(curr)?curr-97:curr-39;
            if(!(temp.children[ind]==null))
            {
                temp=temp.children[ind];
            }
            else return;
        }
        char curr=word.charAt(n-1);
        int ind=Character.isLowerCase(curr)?curr-97:curr-39;
        
    }

    public static void main(String[] args)
    {
        DeleteWordInTrie Trie =new DeleteWordInTrie();
        Trie.insert("arun");
        Trie.insert("arunkumar");
        Trie.insert("arunkumarT");

    }
}
