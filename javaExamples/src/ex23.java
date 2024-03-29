import java.util.Arrays;
import java.util.Collections;

public class ex23 {
    public static void main(String[] args) {
        //배열 Array
        //1. 같은 타입의 데이터를 연속적 공간에 나열해 놓은 데이터구조
        //2. 생성시 크기가 지정되고 이후에는 변경 불가
        //3. 인덱스는 0부터 부여됨.

        //정수형 1차 배열
        //1.
        int[] arrNum1 = new int[3];
        //값이 0으로 초기화 된다.
        System.out.println(Arrays.toString( arrNum1 ));
        arrNum1[0] = 10;
        arrNum1[0] = 20;
        arrNum1[0] = 30;
        //2.
        int[] arrNum2 = new int[]{10,20,30};
        //3.
        int[] arrNum3 = {10,20,30};
        //4.
        int arrNum4[] = {10,20,30};

        //안되는 경우
        //int[] a;
        //a = {3, 4, 5};

        //반복문을 이용한 데이터 읽기
        //1. 일반반복문 - for while
        for(int i=0; i<arrNum1.length; i++){
            System.out.println( arrNum1[i] );
        }
        //2. for-each(향상된 for문)
        for( int num : arrNum1 ){
            System.out.println( num );
        }

        //연습문제
        int[]  nums = { 10, 30, 20, 50, 40 };
        //1. 배열의 모든 요소값를 출력하시오.
        //2. 배열의 값 갯수를 출력하시오.
        //3. 배열의 모든 값의 합계를 출력하시오.
        //4. 배열에서 20은 몇번째에 위치하는지 출력하시오.
        //   출력값: 3번째
        for( int item : nums ) {
            System.out.println( item );
        }
        int sum = 0;
        for( int i=0; i<nums.length; i++ ){
            System.out.println( nums[i] );
            sum += nums[i];
        }
        System.out.println( nums.length );
        System.out.println( sum );
        for( int i=0; i<nums.length; i++ ){
            if( nums[i] == 20 ){
                System.out.println( (i+1)+"번째입니다.");
            }
        }
        //배열의 정렬 - 오름차순
        Arrays.sort( nums );
        System.out.println( Arrays.toString( nums ) );

        Integer[] nums2 = { 10, 30, 20, 50, 40 };
        Arrays.sort( nums2, Collections.reverseOrder() );
        System.out.println( Arrays.toString( nums2 ) );

    }
}
