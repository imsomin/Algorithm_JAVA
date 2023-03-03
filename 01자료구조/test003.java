import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//003. 구간 합 구하기
//수 N개가 주어졌을 때 i 번째 수에서 j 번째 수까지의 합을 구하는 프로그램 작성

public class test003 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        //StringTokenizer 클래스
        //하나의 문자열을 여러 개의 문자열로 분리하기 위해 사용된다
        
        int suNo = Integer.parseInt(stringTokenizer.nextToken());  //숫자 개수 ex.5
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());  //질의 개수 ex.3

        long[] S = new long[suNo + 1];  //합 배열 S ex.5 4 3 2 1
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 1; i <= suNo; i++) {  //숫자 개수만큼 반복하기  
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());  //합 배열 생성
        }

        for (int q = 0; q < quizNo; q++){  //질의 개수만큼 반복하기
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());  //질의 범위 받기(i~j)
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i-1]);  //구간 합 출력하기
        }
    }
    
}
