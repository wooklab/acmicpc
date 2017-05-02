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
            int numbersCnt          = Integer.parseInt(br.readLine());
            String numbers          = br.readLine();
            String[] numbersArray   = numbers.split("");
            
            int sumNumbers = 0;
            for (int i = 0; i < numbersCnt; i++) {
                sumNumbers += Integer.parseInt(numbersArray[i]);
            }
            System.out.println(sumNumbers);
            
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (NumberFormatException numberFormatException) {
            numberFormatException.printStackTrace();
        }
    }
}
