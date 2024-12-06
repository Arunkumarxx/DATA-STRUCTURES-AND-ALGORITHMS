package TREE;

import java.util.Stack;

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

        if(root!=null)
            delete(root,word,0);

    }
    private void  delete(TrieNode root,String word,int index)
    {
        if(root==null)
            return ;
        if(index==word.length())
            if(!root.isEnd)
                return;
        int curr=word.charAt(index);
        int ind=Character.isLowerCase(curr)?curr-97:curr-39;

        delete(root.children[ind],word,ind+1);

        if(isValidToDel(root.children[ind]))
        {

        }

    }
    private boolean isValidToDel(TrieNode root)
    {
        for(int i=0;i<alphabetSize;++i)
        {
            if(root.children[i]!=null)
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        DeleteWordInTrie Trie =new DeleteWordInTrie();
        Trie.insert("arun");
        Trie.insert("arunkumar");
        Trie.insert("arunkumarT");

    }
}
