package DivideConquer;

public class L091_numDecodings {
	public static void main(String[] args) {
		String s = "12";
		int ret = new L091_numDecodings().numDecodings(s);
		System.out.println(ret);

	}

	public int numDecodings(String s) {
		final int length = s.length();
		if (length == 0)
			return 0;
		if (s.charAt(0) == '0')
			return 0;

		int[] dp = new int[length + 1];
		dp[0] = 1;

		for (int i = 0; i < length; i++) {
			dp[i + 1] = s.charAt(i) == '0' ? 0 : dp[i];
			if (i > 0 && (s.charAt(i - 1) == '1' || (s.charAt(i - 1) == '2' && s.charAt(i) <= '6'))) {
				dp[i + 1] += dp[i - 1];
			}
		}

		return dp[length];
	}

}
