package day02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("�� �Է� : ");
		num = sc.nextInt();
		String s;
		s = (num%2 == 0)?"¦" : "Ȧ";
		System.out.println(num+"="+s);
		s = (num%3 == 0)?"���" : "�ƴ�";
		System.out.println(num+"="+s);
		int su1, su2;
		System.out.print("�� �� �Է� : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();
		s = (su1 > su2)?"su1�� ũ��" : "su2�� ũ��";
		System.out.println("su1 : "+su1+" , "+"su2 : "+su2+" "+s);	
	}
}
