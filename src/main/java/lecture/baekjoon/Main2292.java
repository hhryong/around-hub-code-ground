package lecture.baekjoon;

import java.util.Scanner;

public class Main2292 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // 1 - 6 - 12 - 18

        int count = 1;
        int sum = 1;
        while (true) {
            if (N <= sum) {
                break;
            }
            sum += count * 6;
            count++;
        }

        System.out.println(count);

    }

}
