package net.acmicpc.step2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * Step2 - 05<br/>
 * 두 자연수 A와 B가 주어진다. 이 때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. <br/>
 * 입력: 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)<br/>
 * 출력: 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.<br/>
 */
public class No5_ArithmeticOperation {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String      input   = br.readLine();
            String[]    numList = input.split(" ");
            int[]       num     = new int[2];
            
            for (int i = 0; i < 2; i++) {
                num[i] = Integer.parseInt(numList[i]);
            }
            
            if (num[1] == 0)
                System.out.println("0 is impossible");
            else {
                System.out.println(num[0] + num[1]);
                System.out.println(num[0] - num[1]);
                System.out.println(num[0] * num[1]);
                System.out.println(num[0] / num[1]);
                System.out.println(num[0] % num[1]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
