import java.util.Scanner;

//001. 숫자의 합 구하기
//N개의 숫자가 공백없이 써 있다.
//이 숫자를 모두 합해 출력하는 프로그램을 작성하시오.

public class test001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  //1 <= N <= 100
        //(1)N값 입력받기
        //먼저 문자열 형태로 입력값을 입력받은 후, 이를 문자 배열로 변환
        //문자 배열값을 순서대로 읽으면서 숫자형으로 변환하여 더하기
        //"1234" -> '1', '2', '3', '4' -> 1, 2, 3, 4 

        String sNum = sc.next(); //(2)길이 N의 숫자를 입력받아 String형 변수 sNum에 저장하기
        char[] cNum = sNum.toCharArray(); //(3)sNum을 다시 char[]형 변수 cNum에 변환하여 저장하기
        int sum = 0; //(4)int형 변수 sum 선언하기
        for (int i=0; i< cNum.length; i++ ){  //(5)cNum 길이만큼 반복하기
            sum += cNum[i] - '0';  //(6)배열의 각 자릿값을 정수형으로 변환하며 sum에 더하여 누적하기
            // ★ '0'을 빼주는 이유 = "아스키코드"
            //아스키코드에서 같은 의미의 문자와 숫자의 코드 값 차이는 48이다.
            //문자 '1'은 아스키코드 값이 49이므로
            //문자 '1'을 숫자 '1'로변환하려면 '1'-48 or '1'-'0'과 같이 연산해야 한다.
        }

        System.out.print(sum);


        sc.close(); //sc is never closed java 

    }



}