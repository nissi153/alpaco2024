import java.util.Random;

public class ex24 {
    public static void main(String[] args) {
        //2차배열
        //1.
        int[][] arrNum1 = new int[3][3]; //3행3열 정수형 2차배열
        //2.
        int[][] arrNum2 =
                new int[][]{ {10,20,30},
                             {40,50,60} }; //2행3열
        //3.
        int[][] arrNum3 = { {10,20,30},
                            {40,50,60} }; //2행3열
        //4.
        int[][] arrNum4 = new int[2][];
        arrNum4[0] = new int[3];
        arrNum4[1] = new int[3];

        //행의 길이
        System.out.println( arrNum2.length );
        //열의 길이
        System.out.println( arrNum2[0].length );
        System.out.println( arrNum2[1].length );

        //연습문제
        //1. 2차원 정수배열 nums를 행 3개, 열 3개로 만들고,
        // 모든 행열에 값을 넣되,
        // 랜덤값 정수 1~100 사이의 값을 넣고,
        // 전체를 순환하여 출력하시오.
        //2. 최소값과 최대값을 출력하시오.
        int[][] nums = new int[3][3];
        Random rand = new Random();
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                nums[i][j] = rand.nextInt(100)+1;
            }
        }
        for( int[] arrNum : nums ) {
            for( int num : arrNum ){
                System.out.println( num );
            }
        }
        //최소값/최대값 찾기
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for( int[] arrNum : nums ) {
            for( int num : arrNum ){
                if( min > num ){
                    min = num;
                }
                if( max < num ){
                    max = num;
                }
            }
        }
        System.out.println( min );
        System.out.println( max );
        //3.
        // 순돌이네 인쇄소
        // 3x3 2차원 정수배열에 아래와 같은 숫자가 들어있다면,
        // 0 1 0       #  *  #
        // 1 2 0   =>  *  +  #
        // 1 0 0       *  #  #
        // 이렇게 출력이 된다.
        // 0 1 2
        // 1 2 0
        // 2 1 0 이렇게 들어가 있을때 출력결과를 표시하시오.
        int[][] data = { {0, 1, 2},
                        {1, 2, 0},
                        {2, 1, 0} };
        for( int[] arrData : data ) {
            for( int d : arrData ){
                if( d == 0 ){
                    System.out.print("#");
                }
                else if( d == 1 ){
                    System.out.print("*");
                }else{
                    System.out.print("+");
                }
            }
            System.out.println();
        }
    }
}
