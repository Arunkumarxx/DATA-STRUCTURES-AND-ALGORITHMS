package TREE;

public class SearchQueryForStrings
{
    private final int alphabetSize=52;
    private class TrieNode
    {
        TrieNode[] children;
        boolean isEndOfWord;
        TrieNode()
        {
            this.children=new TrieNode[alphabetSize];
        }
    }
    TrieNode root;
    private void insert(String key)
    {
        if(root==null)
            root=new TrieNode();
        int n=key.length();
        TrieNode temp=root;
        for(int i=0;i<n;++i)
        {
            int ind=key.charAt(i)-97;
            if(temp.children[ind]==null)
                temp.children[ind]=new TrieNode();
            temp=temp.children[ind];
        }
        temp.isEndOfWord=true;
    }

    private boolean search(String key)
    {
        if(root==null)
            return false;

        TrieNode temp=root;
        int n=key.length();
        for(int i=0;i<n;++i)
        {
            int ind=key.charAt(i)-97;
            if(temp.children[ind]==null)
                return false;
            temp=temp.children[ind];
        }
        return temp.isEndOfWord;
    }

    public static void main(String[] args)
    {
        SearchQueryForStrings obj=new SearchQueryForStrings();
        String[] words={"the","a","there","answer","any","by","bye","their"};
        String[] queries={"the","an","any"};
        for(String word:words)
            obj.insert(word);
        for(String query:queries)
            System.out.println("Is \""+query+"\" present? "+obj.search(query));
    }
}
