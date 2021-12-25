package forwhile;

import java.util.Scanner;

public class B_nestedFor {
	
	public void printGugudanFromTwoToNine() {
		
		/* for문 안에서 for문을 이용할 수 있다. */
		
		//2 * 1 = 2
		//2 * 2 = 4
		//...
		//2 * 9 = 18
		//3 * 1 = 3
		//3 * 2 = 9
		//...
		//3 * 9 = 27
		//...
		//9 * 1 = 9
		//...
		//9 * 9 = 81
		
		/* 2단부터 단을 1씩 증가시키는 반복문 */
		for(int dan = 2; dan < 10; dan++) {
			
			System.out.println("=========== " + dan + "단 ============");
			
			/* 단이 1개씩 증가하는 동안 수행할 내용은 해당 단의 구구단을 출력하는 것 */
			for(int su = 1; su < 10; su++) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
			
			System.out.println();
			
		}
		
	}
	
	public void printUpgradeGugudanFromTwoToNine() {
		
		/* 단을 2단부터 9단까지 하나씩 증가시킨다. */
		for(int dan = 2; dan < 10; dan++) {
			/* 한 단씩 구구단을 출력하는 메소드를 호출하며 인자로 단을 전달한다. */
			printGugudanOf(dan);
		}
		
	}
	
	public void printGugudanOf(int dan) {
		
		/* 매개변수로 전달 받은 단을 1 ~ 9까지 곱한 내용을 출력해준다. */
		for(int su = 1; su < 10; su++) {
			System.out.println(dan + " * " + su + " = " + (dan * su));
		}
	
	}
	
	public void printStarInputRowTimes() {
		
		/* 키보드로 입력받은 정수만큼 행으로 별을 출력하는 메소드 */
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 행 수를 입력하세요 : ");
		int row = sc.nextInt();
		
		/* 입력한 행만큼 반복 */
		for(int i = 1; i <= row; i++) {
			
			/* 별을 5개 출력하는 것을 반복 */
//			for(int j = 1; j < 6; j++) {
//				System.out.print("*");
//			}
			
			/* 위 기능을 수행하는 메소드 추가해서 호출로 변경 */
			printStar(5);
			
			/* 한 행에 대해서 별을 출력하고 난 뒤 줄바꿈 */
			System.out.println();
		}
	}
	
	public void printStar(int times) {
		/* 매개변수로 전달 받은 횟수만큼 줄을 바꾸지 않고 별을 출력하는 기능 */
		for(int i = 1; i <= times; i++) {
			System.out.print("*");
		}
	}
	
	public void printTriangleStars() {
		
		/* 키보드로 입력 받은 정수 행만큼 별을 삼각형 모양으로 출력한다. */
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 줄 수를 입력하세요 : ");
		int row = sc.nextInt();
		
		for(int i = 1; i <= row; i++) {
			
			/* 행의 수만큼만 별을 출력하는 반복문 */
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
			
			/* 위에서 정의한 메소드 재사용 */
			printStar(i);
			
			System.out.println();
		}
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
