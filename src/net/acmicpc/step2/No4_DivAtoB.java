package net.acmicpc.step2;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Step2 - 04<br/>
 * A/B를 계산하시오.<br/>
 * 입력: 첫째 줄에 A와 B가 주어진다. (0 < A,B < 10)<br/>
 * 출력: 첫째 줄에 A/B를 출력한다. 절대/상대 오차는 10^-9 까지 허용한다.<br/>
 */
public class No4_DivAtoB {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        double a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        if(a > 0 && b < 10) {
            System.out.println(new DecimalFormat("#.#########").format(a/b));
        }
    }
}
