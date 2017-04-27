package net.acmicpc.step2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * Step2 - 06<br/>
 * (A+B)%C는 (A%C + B%C)%C 와 같을까?<br/>
 * (A×B)%C는 (A%C × B%C)%C 와 같을까?<br/>
 * 세 수 A, B, C가 주어졌을 때, 위의 네가지 값을 구하는 프로그램을 작성하시오.<br/>
 * 입력: 첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)<br/>
 * 출력: 첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.<br/>
 */
public class No6_Remainder {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input = br.readLine();
            String[] numList = input.split(" ");
            int[] num = new int[3];
            for (int i=0; i<3; i++) {
                num[i] = Integer.parseInt(numList[i]);
            }
            System.out.println((num[0] + num[1]) % num[2]);
            System.out.println((num[0] % num[2] + num[1] % num[2]) % num[2]);
            System.out.println((num[0] * num[1]) % num[2]);
            System.out.println((num[0] % num[2] * num[1] % num[2]) % num[2]);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
