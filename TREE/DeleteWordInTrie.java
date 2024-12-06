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
    private TrieNode  delete(TrieNode root,String key,int index)
    {
        if (root == null)
            return null;
        if (index == key.length()) {
            if (root.isEnd)
                root.isEnd = false;

            if (isEmpty(root))
                root = null;
            return root;
        }


        int ind = key.charAt(index) - 'a';
        root.children[ind] = delete(root.children[index], key, index + 1);


        if (isEmpty(root) && root.isEnd == false) {
            root = null;
        }

        return root;
    }
    private boolean isEmpty(TrieNode root)
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
        System.out.println(Trie.search("arun"));
        Trie.delete("arun");
        System.out.println(Trie.search("arun"));
    }
}
