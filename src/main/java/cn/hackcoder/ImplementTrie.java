package cn.hackcoder;

import java.util.HashSet;
import java.util.Set;

/**
 * 208. Implement ImplementTrie (Prefix Tree)
 */
public class ImplementTrie {

	Set<String> sets = new HashSet<>();

	/**
	 * Initialize your data structure here.
	 */
	public ImplementTrie() {

	}

	/**
	 * Inserts a word into the trie.
	 */
	public void insert(String word) {
		sets.add(word);
	}

	/**
	 * Returns if the word is in the trie.
	 */
	public boolean search(String word) {
		return sets.contains(word);
	}

	/**
	 * Returns if there is any word in the trie that starts with the given prefix.
	 */
	public boolean startsWith(String prefix) {
		return sets.stream().anyMatch(s -> s.startsWith(prefix));
	}
}
