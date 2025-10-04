package trie;

public class TrieImpl {

	TrieNode root;

	boolean search(String key) {
		TrieNode curr = root;
		for (int i = 0; i < key.length(); i++) {
			int index = key.charAt(i) - 'a';
			if (curr.child[index] == null)
				return false;
			else
				curr = curr.child[index];
		}
		return curr.isEnd;
	}
	
	void insert(String key) {
		TrieNode curr = root;
		for(int i =0 ; i< key.length() ;i++) {
			int index = key.charAt(i) - 'a';
			if(curr.child[index] == null) {
				TrieNode temp = new TrieNode();
				curr.child[index] = temp;
			}
			curr = curr.child[index];
		}
		curr.isEnd=true;
	}

}
