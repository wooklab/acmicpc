package net.acmicpc.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Step3 - 10<br/>
 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.<br/>
 * 입력: 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.<br/>
 * 출력: 입력으로 주어진 숫자 N개의 합을 출력한다.<br/>
 */
public class No10_SumAllNumbers {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int numbersCnt  = Integer.parseInt(br.readLine());
            int numbers     = Integer.parseInt(br.readLine());
            int sumAll = 0;
            
            for (int i = (numbersCnt - 1); i >= 0; i--) {
                if (i != 0) {
                    int tenPow = (int) Math.pow(10, i);
                    sumAll += numbers / tenPow;
                    numbers -= (numbers / tenPow) * tenPow;
                } else {
                    sumAll += numbers;
                }
            }
            System.out.println(sumAll);
            
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (NumberFormatException numberFormatException) {
            numberFormatException.printStackTrace();
        }
    }
}
