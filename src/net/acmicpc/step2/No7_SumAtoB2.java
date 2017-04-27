package net.acmicpc.step2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Step2 - 07<br/>
 * A+B를 계산하시오.<br/>
 * 입력: 첫째 줄에 A, 둘째 줄에 B가 주어진다. (0 < A, B < 10)<br/>
 * 출력: 첫째 줄에 A+B를 출력한다. (A+B < 10)<br/>
 */
public class No7_SumAtoB2 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int input1 = Integer.parseInt(br.readLine());
            int input2 = Integer.parseInt(br.readLine());
            if (input1 + input2 < 10)
                System.out.println(input1 + input2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
