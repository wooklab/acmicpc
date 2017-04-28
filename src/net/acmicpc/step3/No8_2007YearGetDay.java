package net.acmicpc.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Step3 - 08<br/>
 * 오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 
 * 이를 알아내는 프로그램을 작성하시오.<br/>
 * 입력: 첫째 줄에 빈 칸을 사이에 두고 x(1≤x≤12)와 y(1≤y≤31)이 주어진다. 
 *       참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.<br/>
 * 출력: 첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다.<br/>
 */
public class No8_2007YearGetDay {
    private static final int[][] DAY_SET = { { 1, 31 }, { 2, 28 }, { 3, 31 }, { 4, 30 }, { 5, 31 }, { 6, 30 }, 
                                            { 7, 31 }, { 8, 31 },{ 9, 30 }, { 10, 31 }, { 11, 30 }, { 12, 31 } };
    
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input[] = br.readLine().split(" ");
            if(input.length != 2) System.exit(1);
            
            int x_month = Integer.parseInt(input[0]);
            int y_day   = Integer.parseInt(input[1]);
            
            /*System.out.println("2007년 " + x_month + "월 " + y_day + "일은");
            System.out.println(getDay(x_month, y_day) + " 입니다.");*/
            System.out.println(getDay(x_month, y_day));
            
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (NumberFormatException numberFormatException) {
            numberFormatException.printStackTrace();
        }
    }
    
    private static String getDay(int month, int day) {
        int totalDay=0;
        if(checkDay(month, day)) {
            for (int i = 1; i <= month; i++) {
                if(i != month) {
                    totalDay += DAY_SET[i-1][1];
                } else {
                    totalDay += day;
                }
            }
            return calculateDayName(totalDay);
        } else {
            return "이 세상에 없는 날짜 입니다.";
        }
    }
    
    
    private static boolean checkMonth(int month) {
        if (1 <= month && month <= 12)
            return true;
        else 
            return false;
    }
    
    private static boolean checkDay(int month, int day) {
        
        if (checkMonth(month) == true && 0 < day && day <= DAY_SET[month-1][1])
            return true;
        else
            return false;
    }
    
    private static String calculateDayName(int totalDay) {
        String dayName = null;
        switch (totalDay % 7) {
        case 0:
            dayName = "SUN";
            break;
        case 1:
            dayName = "MON";
            break;
        case 2:
            dayName = "TUE";
            break;
        case 3:
            dayName = "WED";
            break;
        case 4:
            dayName = "THU";
            break;
        case 5:
            dayName = "FRI";
            break;
        case 6:
            dayName = "SAT";
        }
        return dayName;
    }

}
