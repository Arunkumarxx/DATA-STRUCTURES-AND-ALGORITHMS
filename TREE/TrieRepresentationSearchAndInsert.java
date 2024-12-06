package TREE;

public class TrieRepresentationSearchAndInsert
{
    private class TrieNode
    {
        char val;
        TrieNode [] trieNodes;
        boolean isEnd;

        TrieNode(char val,boolean isEnd)
        {
            this.val=val;
            this.trieNodes=new TrieNode[26];
            this.isEnd=isEnd;
        }
    }
    TrieNode root;
    private void searchAndInsert(String words)
    {
        if(root==null)
            root=new TrieNode(' ',false);
        int n=words.length();
        TrieNode temp =root;
        for(int i=0;i<n;++i)
        {
            char curr=words.charAt(i);
            int ind=(curr-97);
            if(temp.trieNodes[ind]==null)
            {
                temp.trieNodes[ind]=new TrieNode(curr,i==n-1?true:false);
                temp=temp.trieNodes[ind];
            }
            temp=temp.trieNodes[ind];
        }
    }


    public static void main(String[] args)
    {
        String [] words ={"arun","kumar"};
        TrieRepresentationSearchAndInsert Trie =new TrieRepresentationSearchAndInsert();
        Trie.searchAndInsert(words[0]);
    }
}
