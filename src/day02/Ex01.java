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
		System.out.print("당신의 이름은 무엇입니까? ");
		name = sc.nextLine();
		System.out.printf("%s 님의 국어 점수 : ", name);
		kor = sc.nextInt();
		System.out.printf("%s 님의 영어 점수 : ", name);
		eng = sc.nextInt();
		System.out.printf("%s 님의 수학 점수 : ", name);
		math = sc.nextInt();
		
		System.out.println("============================");
		System.out.printf("이 름 : %s\n", name);
		System.out.println("============================");
		System.out.printf("국 어 : %d\n", kor);
		System.out.printf("영 어 : %d\n", eng);
		System.out.printf("수 학 : %d\n", math);
		System.out.println("============================");
		System.out.printf("합 계 : %d\n", kor+eng+math);
		System.out.println("============================");
		
	}

}
