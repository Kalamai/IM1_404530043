
public class Easter {
	static String calculateEaster(int year) {
		int a, b, c, k, p, q, M, N, d, e;
		int day = 0;
		int mouth = 0;

		a = year % 19;
		b = year % 4;
		c = year % 7;
		k = (year / 100);
		Math.floor(k);// 你成功使用了Math.floor(), 卻沒有告訴他要放在哪, -2
		p = ((13 + 8 * k) / 25);
		Math.floor(p);
		q = (k / 4);
		Math.floor(q);
		M = (15 - p + k - q) % 30;
		N = (4 + k - q) % 7;
		d = (19 * a + M) % 30;
		e = (2 * b + 4 * c + 6 * d + N) % 7;

		if (22 + d + e - 31 >= 0) {
			if (d == 29 && e == 6) {
				day = 19;
				mouth = 4;
			} else if (d == 28 && e == 6 && (11 * M + 11) % 30 < 19) {
				day = 18;
				mouth = 4;
			} else {
				day = 22 + d + e - 31;
				mouth = 4;
			}
		}
		if (22 + d + e - 31 < 0) {
			day = 22 + d + e;
			mouth = 3;
		}

		return "In " + year + " Easter Sunday is: month = " + mouth + " and day = " + day;
	}
}
