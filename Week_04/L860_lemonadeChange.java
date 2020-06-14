package Week4;

public class L860_lemonadeChange {
	public static void main(String[] args) {
		int[] bills = { 5, 5, 5, 10, 20 };
		boolean ret = new L860_lemonadeChange().lemonadeChange(bills);
		System.out.println(ret);

	}

	public boolean lemonadeChange(int[] bills) {
		if (bills == null || bills.length == 0)
			return true;
		if (bills[0] > 5)
			return false;
		int five = 0, ten = 0;
		for (int i : bills) {
			if (i == 5)
				five++;
			else if (i == 10) {
				five--;
				ten++;
			} else if (ten > 0) {
				ten--;
				five--;
			} else if (ten < 0) {
				five -= 3;
			}
			if (five < 0)
				return false;
		}
		return true;

	}

}
