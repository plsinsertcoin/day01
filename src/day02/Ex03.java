package day02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("수 입력 : ");
		num = sc.nextInt();
		String s;
		s = (num%2 == 0)?"짝" : "홀";
		System.out.println(num+"="+s);
		s = (num%3 == 0)?"배수" : "아님";
		System.out.println(num+"="+s);
		int su1, su2;
		System.out.print("두 수 입력 : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();
		s = (su1 > su2)?"su1가 크다" : "su2가 크다";
		System.out.println("su1 : "+su1+" , "+"su2 : "+su2+" "+s);	
	}
}
