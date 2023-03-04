import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


//004. 구간 합 구하기2
//N X N 개의 수가 N X N 크기의 표에 채워져 있다.
//표 안의 수 중 (x1, y1)에서 (x2, y2)까지의 합을 구하려 한다.
//표에 채워져 있는 수와 합을 구하는 연산이 주어졌을 때 이를 처리하는 프로그램을 작성


public class test004 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());  //배열 크기
        int M = Integer.parseInt(st.nextToken());  //질의 수

        int A[][] = new int[N+1][N+1];  //2차원 배열

        for (int i=1; i<=N; i++){  //배열 크기만큼 반복
            st = new StringTokenizer(br.readLine());
            for (int j=1; j<=N; j++){
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        int D[][] = new int[N+1][N+1];
        
        for (int i=1; i<=N; i++) {  //질의 수만큼 반복
            for (int j=1; j<=N; j++) {
                D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i][j];  //구간 합 구하기
            }

        }


        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int result = D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1];  //구간 합 배열로 질의에 답변하기
            System.out.println(result);
        }

    }

}
