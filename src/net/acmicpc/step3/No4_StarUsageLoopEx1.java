package net.acmicpc.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Step3 - 04<br/>
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제<br/>
 * 입력: 첫째 줄에 N (1<=N<=100)이 주어진다.<br/>
 * 출력: 첫째 줄부터 N번째 줄 까지 차례대로 별을 출력한다.<br/>
 */
public class No4_StarUsageLoopEx1 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int input = Integer.parseInt(br.readLine());
            for (int i = 1; i <= input; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                if (i != input) System.out.println();
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (NumberFormatException numberFormatException) {
            numberFormatException.printStackTrace();
        }
    }
}
