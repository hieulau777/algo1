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
		cau15();
	}
	
	//In dãy số 1, 2, 3, 4, 5 … n (n là số được nhập vào từ bàn phím) bằng vòng lặp for.
	public static void cau1() {
		int n = InputHelper.checkInteger("Hãy nhập số nguyên: ");
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}
	// In dãy số 1, 3, 5, 7, 9 … n (n là số được nhập vào từ bàn phím) bằng vòng lặp for và bằng 2 cách khác nhau.
	public static void cau2() {
		int n = InputHelper.checkInteger("Hãy nhập số nguyên: ");
		// Cach 1
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		// Cach 2
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}
	// In dãy số 2, 4, 6, 8, 10 … 2n (n là số được nhập vào từ bàn phím) bằng vòng lặp for.
	public static void cau3() {
		int n = InputHelper.checkInteger("Hãy nhập số nguyên: ");
		for (int i = 1; i <= 2*n; i++) {
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
			rs += 1/i;
		}
		System.out.println(rs);
	}
	// In dãy số 2, -4, 6, -8, 10 … n (n là số được nhập vào từ bàn phím) bằng cách sử dụng vòng lặp for và bằng 2 cách khác nhau. 
	// Gợi ý: cách 1 dùng toán tử %, cách 2 dùng 1 biến để xác định dấu âm và dấu dương. (*)
	public static void cau6() {
		int n = InputHelper.checkInteger("Hãy nhập số nguyên: ");
		// Cach 1
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				if ((i/2) % 2 == 1) {
					System.out.println(i);
				} else System.out.println(-1*i);
			}
		}
		// Cach 2
	}
	// Tính giai thừa của số n (n là số được nhập vào từ bàn phím) bằng cách sử dụng vòng lặp for.
	public static void cau7() {
		int n = InputHelper.checkInteger("Hãy nhập số nguyên: ");
		int rs = 1;
		for (int i = 1; i <= n; i++) {
			rs *= i;
		}
		System.out.println(rs);
	}
	// In dãy số 1, 2, 3, 4, 5 … n (n là số được nhập vào từ bàn phím) bằng vòng lặp while.
	public static void cau8() {
		int n = InputHelper.checkInteger("Hãy nhập số nguyên: ");
		int i = 1;
		while(i <= n) {
			System.out.println(i);
			i++;
		}
	}
	// In dãy số 1, 3, 5, 7, 9 … n (n là số được nhập vào từ bàn phím) bằng vòng lặp while và bằng 2 cách khác nhau.
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
	}
	// In dãy số 1, 2, 3, 5, 8, 13, …n (n là số được nhập vào từ bàn phím) bằng vòng lặp while.
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
	// In dãy số 1, 3, 7, 15, 31, …n (n là số được nhập vào từ bàn phím) bằng vòng lặp while.
	public static void cau11() {
		int n = InputHelper.checkInteger("Hãy nhập số nguyên: ");
		int rs = 1;
		while (rs <= n) {
			System.out.println(rs);
			rs = 1 + (rs * 2);
		}
	}
	// In dãy số 1, -3, 7, -15, 31, … (n là số được nhập vào từ bàn phím) bằng vòng lặp while.
	public static void cau12() {
		int n = InputHelper.checkInteger("Hãy nhập số nguyên: ");
		int rs = 1;
		int i = 1;
		while (rs <= n) {
			if (i % 2 == 1) {
				System.out.println(rs);
			} else {
				System.out.println(rs*-1);
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
		int i = 1;
		while (i <= m) {
			rs += m / i % 10;
			i *= 10;
		}
		System.out.println(rs);
	}
	// Nhập 2 số nguyên dương a và b. Sau đó in ra ước số chung lớn nhất (USCLN) và bội số chung nhỏ nhất (BSCNN) của 2 số nguyên dương a và b đó.
	public static void cau14() {
		int a = InputHelper.checkInteger("Hãy nhập số nguyên a: ");
		int b = InputHelper.checkInteger("Hãy nhập số nguyên b: ");
		int max = a > b ? a : b;
		int min = a < b ? a: b;
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
	public static void cau15() {
		 for (int i = 1; i <= 10; i++)
	            for (int j = 2; j <= 20; j++)
	                     System.out.println("i="  + i + " j=" + j);

	}
}
