package TREE;

public class TrieRepresentationSearchAndInsert
{
    private class TrieNode
    {
        TrieNode [] trieNodes;
        boolean isEnd;
        TrieNode(boolean isEnd)
        {
            this.trieNodes=new TrieNode[52];
            this.isEnd=isEnd;
        }
    }
    TrieNode root;
    private void searchAndInsert(String words)
    {
        if(root==null)
            root=new TrieNode(false);
        int n=words.length();
        TrieNode temp =root;
        for(int i=0;i<n;++i)
        {
            char curr=words.charAt(i);
            int ind;
            if(Character.isLowerCase(curr))
                ind=curr-97;
            else ind=curr-39;

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
    public static void main(String[] args)
    {
        String [] words ={"Arun","Aruk"};
        TrieRepresentationSearchAndInsert Trie =new TrieRepresentationSearchAndInsert();
        Trie.searchAndInsert(words[0]);
        System.out.println();
        Trie.searchAndInsert(words[1]);
    }
}
