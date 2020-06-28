package DivideConquer;

public class L647_countSubstrings {
	public static void main(String[] args) {
		String s = "aaa";
		int ret = new L647_countSubstrings().countSubstrings(s);
		System.out.println(ret);
	}

	int num = 0;

	public int countSubstrings(String s) {
		for (int i = 0; i < s.length(); i++) {
			count(s, i, i);// ���Ĵ�����Ϊ����
			count(s, i, i + 1);// ���Ĵ�����Ϊż��
		}
		return num;
	}

	public void count(String s, int start, int end) {
		while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
			num++;
			start--;
			end++;
		}
	}
}
