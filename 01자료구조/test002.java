import java.util.Scanner;

//002. 평균 구하기
/*
모든 점수/받은 점수 중 최대점수 * 100
위와 같이 점수를 조작하고
조작한 점수로 받은 새로운 평균을 구하는 프로그램 작성
*/

public class test002 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  //(1)시험 본 과목의 개수 N 선언
        int A[] = new int[N];  //(2)각 과목의 시험 성적을 담을 배열 선언

        for(int i=0; i<N; i++){ //(3)A[] 길이만큼 반복 및 A[i]에 각 점수 저장하기
            A[i] = sc.nextInt();
        }
        long sum = 0; //(4)점수(총점,최대점수) 초기화
        long max = 0;
        for (int i=0; i<N; i++){
            if (A[i] > max) 
            max = A[i];
            sum = sum + A[i];
        }

        System.out.println(sum * 100.0 / max / N);
        //(5)변환 점수의 평균을 구하는 식을 간단히 표현 가능
        // (A/M*100 + B/M*100 + C/M*100) / 3
        //위의 식은 아래의 식과 같음
        // (A+B+C) * 100 / M / 3
        


        sc.close();
    }
}
