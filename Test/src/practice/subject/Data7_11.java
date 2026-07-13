package practice.subject;

import java.util.Scanner;

public class Data7_11 {
    public static void main(String[] args) {
        xunhuan();
        ARR();
        SCANNER();
    }


    public static void ARR() {
        System.out.println("===================================");

        boolean[][] arr = new boolean[4][];
        for (int i = 0; i < 4; i++) {
            arr[i] = new boolean[i + 1];
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void xunhuan() {
        System.out.println("=====================================");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
    public static void SCANNER() {
        System.out.println("====================================");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        System.out.println(n);
        System.out.println(str);

    }
}
