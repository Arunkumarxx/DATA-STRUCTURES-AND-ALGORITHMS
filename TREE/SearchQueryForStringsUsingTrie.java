package TREE;

public class SearchQueryForStringsUsingTrie
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
            char curr=key.charAt(i);
            int ind = Character.isLowerCase(curr) ? curr-97 : curr-39;
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
            char curr = key.charAt(i);
            int ind = Character.isLowerCase(curr) ? curr - 97 : curr - 39;
            if(temp.children[ind]==null)
                return false;
            temp=temp.children[ind];
        }
        return temp.isEndOfWord;
    }

    public static void main(String[] args)
    {
        SearchQueryForStringsUsingTrie obj=new SearchQueryForStringsUsingTrie();
        String[] words={"the","a","there","answer","any","anY","by","bye","their"};
        String[] queries={"the","an","any","anY"};
        for(String word:words)
            obj.insert(word);
        for(String query:queries)
            System.out.println("Is \""+query+"\" present? "+obj.search(query));
    }
}
