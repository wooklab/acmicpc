package net.acmicpc.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Step3 - 07<br/>
 * 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제<br/>
 * 하지만, 오른쪽을 기준으로 정렬한 별 (예제 참고)을 출력하시오.<br/>
 * 입력: 첫째 줄에 N (1<=N<=100)이 주어진다.<br/>
 * 출력: 첫째 줄부터 N번째 줄 까지 차례대로 별을 출력한다.<br/>
 */
public class No7_StarUsageLoopEx4 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int input = Integer.parseInt(br.readLine());
            loop(input);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (NumberFormatException numberFormatException) {
            numberFormatException.printStackTrace();
        }
    }
    
    private static void loop(int input) {
        StringBuilder sbStar        = new StringBuilder();
        StringBuilder sbWhiteSpace  = new StringBuilder();
        StringBuilder sbRes         = new StringBuilder();
        
        for (int k = 0; k < input; k++) {
            sbStar.append("*");
        }
        for (int i = input; i > 0; i--) {
            if (i != input) sbWhiteSpace.append(" ");
            
            sbStar.setLength(i);
            sbRes.append(sbWhiteSpace.toString() + sbStar.toString());
            
            if (i > 1) sbRes.append("\n");
        }
        System.out.print(sbRes.toString());
    }
    
}
