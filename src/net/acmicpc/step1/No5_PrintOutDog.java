package net.acmicpc.step1;
/**
 * Step1 - 05<br/>
 * 아래 예제와 같이 개를 출력하시오.<br/>
 * <pre>
 * |\_/|
 * |q p|   /}
 * ( 0 )"""\
 * |"^"`    |
 * ||_/=\\__|
 * </pre>
 * 입력: 없음.<br/>
 * 출력: 개를 출력한다.<br/>
 */
public class No5_PrintOutDog {
    private static final String NEW_LINE = "\n";

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("|\\_/|").append(NEW_LINE)
          .append("|q p|   /}").append(NEW_LINE)
          .append("( 0 )\"\"\"\\").append(NEW_LINE)
          .append("|\"^\"`    |").append(NEW_LINE)
          .append("||_/=\\\\__|");
        
        System.out.println(sb.toString());
    }
}

