package TREE;

public class TrieRepresentationSearchAndInsert
{
    private class TrieNode
    {
        char val;
        TrieNode [] trieNodes;
        boolean isEnd;

        TrieNode(char val,int NodeSize,boolean isEnd)
        {
            this.val=val;
            this.trieNodes=new TrieNode[52];
            this.isEnd=isEnd;
        }
    }
    TrieNode root;
    private void searchAndInsert(String words)
    {
        if(root==null)
            root=new TrieNode(' ',52,false);
        int n=words.length();
        for(int i=0;i<n;++i)
        {
            char curr=words.charAt(i);
            
        }
    }


    public static void main(String[] args)
    {
        String [] words ={"arun","kumar"};
        TrieRepresentationSearchAndInsert Trie =new TrieRepresentationSearchAndInsert();
        Trie.searchAndInsert(words[0]);
    }
}
