package Week4;

import java.util.Arrays;
import java.util.List;

public class L127_ladderLength {
	public static void main(String[] args) {
		String beginWord = "hit";
		String endWord = "cog";
		List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
		int ret = new L127_ladderLength().ladderLength(beginWord, endWord, wordList);
		System.out.println(ret);

	}

	public int ladderLength(String beginWord, String endWord, List<String> wordList) {

	}

}
