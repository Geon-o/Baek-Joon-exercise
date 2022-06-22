package KH.study.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int minute = sc.nextInt();

        H = H + minute / 60;
        M = M + minute % 60;

        if (M > 59) {
            H++;
            M = M - 60;
        }

        if (H > 23) {
            H = H - 24;
        }

        System.out.println(H+" "+M);
    }
}