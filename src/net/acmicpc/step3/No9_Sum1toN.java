package net.acmicpc.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Step3 - 09<br/>
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.<br/>
 * 입력: 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.<br/>
 * 출력: 1부터 n까지 합을 출력한다.<br/>
 */
public class No9_Sum1toN {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int input = Integer.parseInt(br.readLine());
            int total = 0;
//            int total = (int) ((1+input)*(input/2)); 
            for (int i = 1; i <= input; i++) total += i;
            System.out.println(total);
            
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (NumberFormatException numberFormatException) {
            numberFormatException.printStackTrace();
        }
    }
}
