package net.acmicpc.step2;

import java.util.Scanner;
/**
 * Step2 - 03<br/>
 * 두 수 A와 B를 입력받은 다음, A*B를 출력하는 프로그램을 작성하시오.<br/>
 * 입력: 첫째 줄에 A와 B가 주어진다. (0 < A,B < 10)<br/>
 * 출력: 첫째 줄에 A*B를 출력한다.<br/>
 */
public class No3_MulAtoB {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        if(a > 0 && b < 10) {
            System.out.println(a * b);
        }
    }
}
