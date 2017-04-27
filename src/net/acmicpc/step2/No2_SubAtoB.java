package net.acmicpc.step2;

import java.util.Scanner;
/**
 * Step2 - 02<br/>
 * A-B를 계산하시오.<br/>
 * 입력: 첫째 줄에 A와 B가 주어진다. (0 < A,B < 10)<br/>
 * 출력: 첫째 줄에 A-B를 출력한다.<br/>
 */
public class No2_SubAtoB {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        if (a > 0 && b < 10) {
            System.out.println(a - b);
        }
    }
}
