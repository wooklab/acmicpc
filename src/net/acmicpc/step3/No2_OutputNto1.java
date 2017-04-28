package net.acmicpc.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Step3 - 02<br/>
 * 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.<br/>
 * 입력: 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.<br/>
 * 출력: 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.<br/>
 */
public class No2_OutputNto1 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int input = Integer.parseInt(br.readLine());
            for (int i = input; i > 0; i--) System.out.println(i);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (NumberFormatException numberFormatException) {
            numberFormatException.printStackTrace();
        }
    }
}
