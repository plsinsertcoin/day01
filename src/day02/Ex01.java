package day02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int kor;
		int eng;
		int math;
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �̸��� �����Դϱ�? ");
		name = sc.nextLine();
		System.out.printf("%s ���� ���� ���� : ", name);
		kor = sc.nextInt();
		System.out.printf("%s ���� ���� ���� : ", name);
		eng = sc.nextInt();
		System.out.printf("%s ���� ���� ���� : ", name);
		math = sc.nextInt();
		
		System.out.println("============================");
		System.out.printf("�� �� : %s\n", name);
		System.out.println("============================");
		System.out.printf("�� �� : %d\n", kor);
		System.out.printf("�� �� : %d\n", eng);
		System.out.printf("�� �� : %d\n", math);
		System.out.println("============================");
		System.out.printf("�� �� : %d\n", kor+eng+math);
		System.out.println("============================");
		
	}

}
