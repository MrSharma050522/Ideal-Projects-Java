package Trie;


class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEnd;
    TrieNode() {
        for(int i = 0; i < 26; ++i)
            children[i] = null;

        isEnd = false;
    }
}
class Trie {
    TrieNode root;
    Trie() {
        root = new TrieNode();
    }
    public void insert(String word) {
        TrieNode temp = root;

        for(int i = 0; i < word.length(); ++i) {
            int ind = word.charAt(i) - 'a';

            if(temp.children[ind] == null)
                temp.children[ind] = new TrieNode();

            temp = temp.children[ind];
        }
        temp.isEnd = true;
    }
    public boolean search(String word) {
        TrieNode temp = root;
        for(int i = 0; i < word.length(); ++i) {
            int ind = word.charAt(i) - 'a';
            if(temp.children[ind] == null)
                return false;
            temp = temp.children[ind];
        }
        if(temp.isEnd) return true;
        else return false;
    }
    private boolean noChild(TrieNode node) {
        for(int i = 0; i < node.children.length; ++i)
            if(node.children[i] != null)
                return false;
        return true;
    }
    private TrieNode remove(TrieNode node, String word, int ind) {
        if(ind == word.length()) {
            node.isEnd = false;
            if(noChild(node))
                return null;
            return node;
        }
        int i = word.charAt(ind) - 'a';
        node.children[i] = remove(node.children[i], word, ind+1);
        if(noChild(node) && node.isEnd == false)
            return null;
        return node;
    }
    public void delete(String word) {
        if(!search(word))
            return;
        root = remove(root, word, 0);
    }
}
public class TrieInClass {
    public static void main(String[] args) {
        String[] strings = {"the", "them", "these", "their", "and", "an", "apple", "ant"};

        Trie trie = new Trie();

        for(int i = 0; i < strings.length; ++i)
            trie.insert(strings[i]);

// 		System.out.println("the -> " + (trie.search("the") ? "Present!!" : "Not Present!!"));
// 		System.out.println("then -> " + (trie.search("then") ? "Present!!" : "Not Present!!"));
// 		System.out.println("apple -> " + (trie.search("apple") ? "Present!!" : "Not Present!!"));
// 		System.out.println("app -> " + (trie.search("app") ? "Present!!" : "Not Present!!"));

        trie.delete("their");
        trie.delete("apple");

        System.out.println("then -> " + (trie.search("then") ? "Present!!" : "Not Present!!"));
        System.out.println("apple -> " + (trie.search("apple") ? "Present!!" : "Not Present!!"));
        System.out.println("app -> " + (trie.search("app") ? "Present!!" : "Not Present!!"));
    }
}
