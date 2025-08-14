import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder out = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++) {
            if (c > 'a') out.append(' ');
            out.append(s.indexOf(c));   
        }
        System.out.println(out);
    }
}

//많은 문자열을 연결하면 많은 중간 문자열 객체가 생성되어 비효율적인 코드가 생성된다
//자바에서 string 객체는 변경이 불가능하지만 StringBuilder을 사용하면 변경 가능한 문자열을 생성해준다.