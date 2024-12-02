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
        {
            root=new TrieNode(' ',words.length(),false);
        }
        addNodes(words,root);
    }
    private void print()
    {

    }
    private void addNodes(String words,TrieNode node)
    {
        TrieNode root=node;
        int n=words.length();
        for(int i=0; i<n;++i)
        {
            char curr=words.charAt(i);
            if(curr==' ')
                break;
            for(int j=0;j<52;++j)
            {
                int ind;
                if(Character.isLowerCase(curr))
                {
                     ind=curr-97;
                    root.trieNodes[ind].val=curr;
                    root
                    if(i==n-1)
                        root.trieNodes[ind].isEnd=true;
                }
                else
                {
                     ind=curr-39;
                     root.trieNodes[ind].val=curr;
                     if(i==n-1)
                         root.trieNodes[ind].isEnd=true;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        String [] words ={"Arun","Kumar"};
        TrieRepresentationSearchAndInsert Trie =new TrieRepresentationSearchAndInsert();
        Trie.searchAndInsert(words[0]);
    }
}
