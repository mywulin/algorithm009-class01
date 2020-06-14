package Week4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L127_ladderLength {
	public static void main(String[] args) {
		String beginWord = "hit";
		String endWord = "cog";
		List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
		int ret = new L127_ladderLength().ladderLength(beginWord, endWord, wordList);
		System.out.println(ret);

	}

	public int ladderLength(String beginWord, String endWord, List<String> wordList) {

		int layer = 1;
		Queue<String> queue = new LinkedList<String>();
		queue.add(beginWord);
		boolean[] visited = new boolean[wordList.size() + 1];
		while (!queue.isEmpty()) {
			layer++;
			int size = queue.size();
			while (size-- > 0) {
				String cur = queue.poll();
				for (int i = 0; i < wordList.size(); i++) {
					if (visited[i])
						continue;
					String dic = wordList.get(i);
					if (canChange(dic, cur)) {
						if (dic.equals(endWord))
							return layer;
						queue.add(dic);
						visited[i] = true;
					}
				}
			}

		}

		return 0;
	}

	private boolean canChange(String dic, String cur) {
		int diff = 0;
		for (int i = 0; i < dic.length(); i++) {
			if (dic.charAt(i) != cur.charAt(i)) {
				diff++;
			}
		}
		return diff == 1;
	}

}
