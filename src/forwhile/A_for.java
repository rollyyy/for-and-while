package forwhile;

import java.util.Scanner;

public class A_for {

	/* [for문 표현식]
	 * for(초기식; 조건식; 증감식) {
	 * 		조건을 만족하는 경우 수행할 구문(반복할 구문);
	 * }A
	 * */
	
	public void testSimpleForStatement() {
		
		/* 1부터 10까지 1씩 증가시키면서 (10번) i 값을 출력하는 기본 반복문 */
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
	}
	
	public void testForExample1() {
		
		/* 10명의 학생 이름을 입력 받아 이름을 출력해보자 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1번째 학생의 이름을 입력해주세요 : ");
		String student1 = sc.nextLine();
		System.out.println("1번째 학생의 이름은 " + student1 + "입니다.");
		
		System.out.print("2번째 학생의 이름을 입력해주세요 : ");
		String student2 = sc.nextLine();
		System.out.println("2번째 학생의 이름은 " + student2 + "입니다.");
		
		System.out.print("3번째 학생의 이름을 입력해주세요 : ");
		String student3 = sc.nextLine();
		System.out.println("3번째 학생의 이름은 " + student3 + "입니다.");
		
		System.out.print("4번째 학생의 이름을 입력해주세요 : ");
		String student4 = sc.nextLine();
		System.out.println("4번째 학생의 이름은 " + student4 + "입니다.");
		
		System.out.print("5번째 학생의 이름을 입력해주세요 : ");
		String student5 = sc.nextLine();
		System.out.println("5번째 학생의 이름은 " + student5 + "입니다.");
		
		System.out.print("6번째 학생의 이름을 입력해주세요 : ");
		String student6 = sc.nextLine();
		System.out.println("6번째 학생의 이름은 " + student6 + "입니다.");
		
		System.out.print("7번째 학생의 이름을 입력해주세요 : ");
		String student7 = sc.nextLine();
		System.out.println("7번째 학생의 이름은 " + student7 + "입니다.");
		
		System.out.print("8번째 학생의 이름을 입력해주세요 : ");
		String student8 = sc.nextLine();
		System.out.println("8번째 학생의 이름은 " + student8 + "입니다.");
		
		System.out.print("9번째 학생의 이름을 입력해주세요 : ");
		String student9 = sc.nextLine();
		System.out.println("9번째 학생의 이름은 " + student9 + "입니다.");
		
		System.out.print("10번째 학생의 이름을 입력해주세요 : ");
		String student10 = sc.nextLine();
		System.out.println("10번째 학생의 이름은 " + student10 + "입니다.");
		
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + "번째 학생의 이름을 입력해주세요 : ");
			String student = sc.nextLine();
			System.out.println(i +"번째 학생의 이름은 " + student + "입니다.");
		}
		
		/* 1. 보다 간결하게 작성되었다. (가독성)
		 * 2. 학생의 이름 뿐 아니라 성적도 입력하는 기능이 추가된다면? 학생의 인원이 늘어난다면? (유지보수성)
		 * */
		
	}
	
	public void testForExample2() {
		
		/* 1 ~ 10까지의 합계를 구하시오 */
		
		/* 1부터 10까지를 변수에 저장 */
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		int num5 = 5;
		int num6 = 6;
		int num7 = 7;
		int num8 = 8;
		int num9 = 9;
		int num10 = 10;
		
		/* 결과를 누적시켜 담아줄 변수 선언 */
		int sum = 0;
		
		/* sum에 변수의 값 하나씩 담기 */
		sum += num1;
		sum += num2;
		sum += num3;
		sum += num4;
		sum += num5;
		sum += num6;
		sum += num7;
		sum += num8;
		sum += num9;
		sum += num10;
		
		/* sum에 저장된 값 출력 */
		System.out.println("sum : " + sum);
		
		/* 개선해보자 */
		int sum2 = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum2 += i;
		}
		
		System.out.println("sum2 : " + sum2);
	}
	
	public void testForExample3() {
		
		/* 5 ~ 10 사이의 난수를 발생 시켜서
		 * 1에서부터 발생한 난수까지의 합계를 구해보자 
		 * */
		
		int random = (int) (Math.random() * 6) + 5;
		System.out.println("random : " + random);
		
		int sum = 0;
		
		for(int i = 1; i <= random; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + random + "까지의 합계는 " + sum + "입니다.");
		
	}
	
	public void testForExample4() {
		
		/* 숫자 두 개를 입력 받아 작은 수에서 큰 수까지의 합계를 구하세요
		 * 단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결해본다.
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int first = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int second = sc.nextInt();
		
		int sum = 0;
		
		/* first와 second 중 어느 것이 더 큰 수인지 확인하면 
		 * 작은 수에서 시작해서 큰 수까지의 합계를 구하는 반복문을 작성할 수 있다.
		 * */
		int min = 0;
		int max = 0;
		
		if(first > second) {
			/* 처음 입력한 숫자가 더 크면 first가 max, 자동으로 second는 min */
			max = first;
			min = second;
		} else {
			/* 처음 입력한 숫자가 더 작으면 first는 min, 자동으로 second는 max */
			max = second;
			min = first;
		}
		
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		
		System.out.println(min + "부터 " + max + "까지의 합은 " + sum + "입니다.");
		
	}
	
	public void printSimpleGugudan() {
		
		/* 키보드로 정수 값을 입력 받아
		 * 2 ~ 9 사이의 값인 경우 해당 단의 구구단을 출력하고
		 * 그렇지 않은 경우 "반드시 2 ~ 9 사이의 양수를 입력해야 합니다." 출력 
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 구구단의 단 수를 입력하세요 : ");
		int dan = sc.nextInt();
		
		/* 입력한 숫자가 2 ~ 9 사이인지 조건 확인 */
		if(dan >= 2 && dan <= 9) {
			
			//2 * 1 = 2
			//2 * 2 = 4
			//2 * 3 = 6
			// ...
			//2 * 9 = 18
			
			for(int su = 1; su <= 9; su++) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
			
		} else {
			System.out.println("반드시 2 ~ 9 사이의 양수를 입력해야 합니다.");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

