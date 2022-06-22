package KH.study.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
/*연도를 입력 받고 답은 입력값이 4의 배수이면서 100의 배수가 아닐때 "또는" 400의 배수일 때 라는 조건으로 true를 반환하면
1을 출력하고 그렇지 않으면 0을 출력하는 문제이다.
*/
