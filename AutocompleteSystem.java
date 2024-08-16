import java.util.*;

class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    boolean isEndOfWord = false;
}

class Trie {
    private final TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            current = current.children.computeIfAbsent(c, k -> new TrieNode());
        }
        current.isEndOfWord = true;
    }

    public List<String> autocomplete(String prefix) {
        List<String> results = new ArrayList<>();
        TrieNode node = root;
        for (char c : prefix.toCharArray()) {
            node = node.children.get(c);
            if (node == null) {
                return results;
            }
        }
        dfs(prefix, node, results);
        return results;
    }

    private void dfs(String prefix, TrieNode node, List<String> results) {
        if (node.isEndOfWord) {
            results.add(prefix);
        }
        for (Map.Entry<Character, TrieNode> entry : node.children.entrySet()) {
            dfs(prefix + entry.getKey(), entry.getValue(), results);
        }
    }
}

public class AutocompleteSystem {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("hello");
        trie.insert("hell");
        trie.insert("helicopter");
        trie.insert("help");
        trie.insert("hero");
        trie.insert("her");

        String prefix = "he";
        List<String> words = trie.autocomplete(prefix);

        System.out.println("Words with prefix '" + prefix + "': " + words);
    }
}
