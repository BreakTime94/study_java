package utills;

import java.util.Scanner;

public class BankUtils {
	 private static final Scanner scanner = new Scanner(System.in);
	
	public static String nextLine(String msg) {
		 System.out.print(msg);
		 return scanner.nextLine();
	 }
	 
	 public static int nextInt(String msg) {
		 return Integer.parseInt(nextLine(msg));
	 }
	 
	 public static long nextLong(String msg) {
		 return Long.parseLong(nextLine(msg));
	 }
	 
	 // 유틸은 클래스 객체, 클래스 매서드로 사용함.
	 public static boolean nextConfirm(String msg) {
		 
		 String s = nextLine(msg + "[y/n]");
		 return s.equalsIgnoreCase("y") || s.equalsIgnoreCase("yes");
	 }
}
