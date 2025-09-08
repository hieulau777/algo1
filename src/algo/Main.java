package algo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		while (true) {
//			int option = InputHelper.checkInteger("Nhập lựa chọn câu hỏi: ");
//			switch(option) {
//			  case 1:
//				  cau1();
//			    break;
//			  default:
//				  System.out.println("Không có lựa chọn. Hãy nhập lại.");
//			}
//		}
//		cau1();
//		cau2();
//		cau3();
//		cau4();
//		cau5();
//		cau6();
//		cau7();
//		cau8();
//		cau9();
//		cau10();
//		cau11();
//		cau12();
//		cau13();
//		cau14();
//		cau15_16();
//		cau17();
//		cau18();
//		cau19();
//		cau20();
//		cau21();
//		cau22();
//		cau23();
		cau24();

	}

	// In dãy số 1, 2, 3, 4, 5 … n (n là số được nhập vào từ bàn phím) bằng
	// vòng lặp for.
	public static void cau1() {
		int n = InputHelper.checkInteger("Hãy nhập số nguyên: ");
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}

	// In dãy số 1, 3, 5, 7, 9 … n (n là số được nhập vào từ bàn phím) bằng
	// vòng lặp for và bằng 2 cách khác nhau.
	public static void cau2() {
		int n = InputHelper.checkInteger("Hãy nhập số nguyên: ");
		// Cach 1
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
//		 Cach 2
		for (int t = 1; t <= n; t += 2) {
			System.out.println(t);
		}
	}

	// In dãy số 2, 4, 6, 8, 10 … 2n (n là số được nhập vào từ bàn phím)
	// bằng vòng lặp for.
	public static void cau3() {
		int n = InputHelper.checkInteger("Hãy nhập số nguyên: ");
		for (int i = 1; i <= 2 * n; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	// Viết chương trình tính tổng S sau đây bằng cách sử dụng vòng lặp for:
	// S=1 + 2 + 3 +....+ n (Số n được nhập vào từ bàn phím)
	public static void cau4() {
		int n = InputHelper.checkInteger("Hãy nhập số nguyên: ");
		int rs = 0;
		for (int i = 1; i <= n; i++) {
			rs += i;
		}
		System.out.println(rs);
	}

	// Viết chương trình tính tổng S sau đây bằng cách sử dụng vòng lặp for:
	// S=1 + 1/2 + 1/3 +....+ 1/n (Số n được nhập vào từ bàn phím)
	public static void cau5() {
		int n = InputHelper.checkInteger("Hãy nhập số nguyên: ");
		double rs = 0;
		for (double i = 1; i <= n; i++) {
			rs += 1 / i;
		}
		System.out.println(rs);
	}

	// In dãy số 2, -4, 6, -8, 10 … n (n là số được nhập vào từ bàn phím)
	// bằng cách sử dụng vòng lặp for và bằng 2 cách khác nhau.
	// Gợi ý: cách 1 dùng toán tử %, cách 2 dùng 1 biến để xác định dấu âm và dấu
	// dương. (*)
	public static void cau6() {
		int n = InputHelper.checkInteger("Hãy nhập số nguyên: ");
		// Cach 1
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				if ((i / 2) % 2 == 1) {
					System.out.println(i);
				} else
					System.out.println(-1 * i);
			}
		}
		// Cach 2
		int s = 1;
		for (int i = 2; i <= n; i += 2) {
			System.out.println(i * s);
			s = -s;
		}
	}

	// Tính giai thừa của số n (n là số được nhập vào từ bàn phím) bằng cách
	// sử dụng vòng lặp for.
	public static void cau7() {
		int n = InputHelper.checkInteger("Hãy nhập số nguyên: ");
		int rs = 1;
		for (int i = 1; i <= n; i++) {
			rs *= i;
		}
		System.out.println(rs);
	}

	// In dãy số 1, 2, 3, 4, 5 … n (n là số được nhập vào từ bàn phím) bằng
	// vòng lặp while.
	public static void cau8() {
		int n = InputHelper.checkInteger("Hãy nhập số nguyên: ");
		int i = 1;
		while (i <= n) {
			System.out.println(i);
			i++;
		}
	}

	// In dãy số 1, 3, 5, 7, 9 … n (n là số được nhập vào từ bàn phím) bằng
	// vòng lặp while và bằng 2 cách khác nhau.
	public static void cau9() {
		int n = InputHelper.checkInteger("Hãy nhập số nguyên: ");
		// Cach 1
		int i = 1;
		while (i <= n) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
			i++;
		}
		// Cach 2
		int t = 1;
		while (t <= n) {
			System.out.println(t);
			t += 2;
		}
	}

	// In dãy số 1, 2, 3, 5, 8, 13, …n (n là số được nhập vào từ bàn phím)
	// bằng vòng lặp while.
	public static void cau10() {
		int n = InputHelper.checkInteger("Hãy nhập số nguyên: ");
		int prev2 = 1;
		int prev1 = 2;
		int fibo = 1;
		while (fibo <= n) {
			System.out.println(fibo);
			fibo = prev1 + prev2;
			prev2 = prev1;
			prev1 = fibo;
		}
	}

	// In dãy số 1, 3, 7, 15, 31, …n (n là số được nhập vào từ bàn phím)
	// bằng vòng lặp while.
	public static void cau11() {
		int n = InputHelper.checkInteger("Hãy nhập số nguyên: ");
		int rs = 1;
		while (rs <= n) {
			System.out.println(rs);
			rs = 1 + (rs * 2);
		}
	}

	// In dãy số 1, -3, 7, -15, 31, … (n là số được nhập vào từ bàn phím)
	// bằng vòng lặp while.
	public static void cau12() {
		int n = InputHelper.checkInteger("Hãy nhập số nguyên: ");
		int rs = 1;
		int i = 1;
		while (rs <= n) {
			if (i % 2 == 1) {
				System.out.println(rs);
			} else {
				System.out.println(rs * -1);
			}
			rs = 1 + (rs * 2);
			i++;
		}
	}

	// Tính tổng và tích các chữ số của một số m, m được nhập từ bàn phím:
	// (Ví dụ : m = 234 => S = 2 + 3 + 4 = 9, P = 2 * 3 * 4 = 24)
	public static void cau13() {
		int m = InputHelper.checkInteger("Hãy nhập số nguyên: ");
		int rs = 0;
		int rs2 = 1;
		int i = 1;
		while (i <= m) {
			rs += m / i % 10;
			i *= 10;
		}
		int t = 1;
		while (t <= m) {
			rs2 *= m / t % 10;
			t *= 10;
		}
		System.out.println(rs);
		System.out.println(rs2);
	}

	// Nhập 2 số nguyên dương a và b. Sau đó in ra ước số chung lớn nhất (USCLN) và
	// bội số chung nhỏ nhất (BSCNN) của 2 số nguyên dương a và b đó.
	public static void cau14() {
		int a = InputHelper.checkInteger("Hãy nhập số nguyên a: ");
		int b = InputHelper.checkInteger("Hãy nhập số nguyên b: ");
		int max = a > b ? a : b;
		int min = a < b ? a : b;
		int ucln = 0;
		int bcnn = 0;

		int i = 1;
		while (i <= max) {
			if (a % i == 0 && b % i == 0) {
				ucln = i;
			}
			i++;
		}
		int t = min;
		while (t >= min) {
			if (t % a == 0 && t % b == 0) {
				System.out.println(t);
				bcnn = t;
				break;
			}
			t++;
		}
		System.out.println("Uoc chung lon nhat cua " + a + " va " + b + " = " + ucln);
		System.out.println("Boi chung nho nhat cua " + a + " va " + b + " = " + bcnn);
	}

	public static void cau15_16() {
		System.out.println("Kết luận: ");
		System.out.println("Thứ nhất: vòng lặp for ở ngoài sẽ chạy đầu tiên, và khi phát hiện vòng lặp for"
				+ "\nở trong, nó sẽ chạy hết vòng lặp ở trong, rồi chạy lại vòng lặp ngoài rồi chạy tiếp vòng lặp ở trong cho đến khi hết vòng lặp ngoài");
		System.out
				.println("Thứ hai: Việc sử dụng dấu { sau mỗi lệnh for sẽ giúp chạy được nhiều dòng lệnh ở bên trong");
	}

	// Viết chương trình tính:
	// S = 1+1/2!+1/3!+…..+1/n! (Số n được nhập từ bàn phím)
	public static void cau17() {
		int n = InputHelper.checkInteger("Hãy nhập số nguyên: ");
		double rs = 0;
		for (int i = 1; i <= n; i++) {
			double f = 1;
			for (int j = 1; j <= i; j++) {
				f *= j;
			}
			rs += 1 / f;
		}
		System.out.println(rs);
	}

	// Viết chương trình tính:
	// S = 1+1/3!+1/5!+…..+1/(2n-1)!
	public static void cau18() {
		int n = InputHelper.checkInteger("Hãy nhập số nguyên: ");
		double rs = 0;
		for (int i = 1; i <= n; i++) {
			int c = 2 * i - 1;
			double f = 1;
			for (int j = 1; j <= c; j++) {
				f *= j;
			}
			rs += 1 / f;
		}
		System.out.println(rs);
	}

	// In hình vuông A
	public static void cau19() {
		int n = InputHelper.checkInteger("Hãy nhập số nguyên: ");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("A");
			}
			System.out.println();
		}
	}

	// In hinh vuong AA BB
	public static void cau20() {
		int n = InputHelper.checkInteger("Hãy nhập số nguyên: ");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i % 2 == 1) {
					System.out.print("A");
				} else {
					System.out.print("B");
				}
			}
			System.out.println();
		}
	}

	// In hinh vuong ABAB
	public static void cau21() {
		int n = InputHelper.checkInteger("Hãy nhập số nguyên: ");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j % 2 == 1) {
					System.out.print("A");
				} else {
					System.out.print("B");
				}
			}
			System.out.println();
		}
	}

	public static void cau22() {
		int n = InputHelper.checkInteger("Hãy nhập số nguyên: ");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==========================");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("==========================");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("==========================");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("==========================");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == n || j == 1 || j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void cau23() {
		int n = InputHelper.checkInteger("Hãy nhập số nguyên: ");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==========================");
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==========================");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j <= n - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("==========================");
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n; j++) {
				if (j <= n - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");

				}
			}
			System.out.println();
		}
		System.out.println("==========================");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == 1 || j == n - i + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("==========================");
		for (int i = 1; i <= n; i += 2) {
			for (int j = 1; j <= n; j++) {
				if (j <= (n - i) / 2) {
					System.out.print(" ");
				}
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==========================");
		if (n % 2 == 0) {
			n = n - 1;
		}
		for (int i = n; i >= 1; i -= 2) {
			for (int j = 1; j <= n; j++) {
				if (j <= (n - i) / 2) {
					System.out.print(" ");
				}
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void cau24() {
		int n = InputHelper.checkInteger("Hãy nhập số nguyên: ");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == i) {
					System.out.print("*");
				} else if (j < i) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("==========================");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n) {
					System.out.print("*");
				} else if (j >= i + 1) {
					System.out.print(" ");
				}
			}
			if (i != 1 && i != n) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==========================");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n) {
					System.out.print("*");
				} else {
					if (i % 2 == 0) {
						if (j % 2 == 1) {
							System.out.print(" ");
						} else {
							System.out.print("*");
						}
					} else {
						if (j % 2 == 0) {
							System.out.print(" ");
						} else {
							System.out.print("*");
						}
					}
				}
			}
			System.out.println();
		}
		System.out.println("==========================");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n) {
					System.out.print("*");
				} else if (j == 1 || j == n || j == i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
