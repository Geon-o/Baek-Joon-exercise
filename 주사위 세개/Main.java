package KH.study.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();

        if (n == m && n == x && m == x) {
            System.out.println(10000 + (n * 1000));
        } else if (n == m || n == x) {
            System.out.println(1000 + (n * 100));
        } else if (m == x) {
            System.out.println(1000 + (m * 100));
        } else {
            System.out.println(Math.max(n, Math.max(m, x)) * 100);
        }
    }
}
