//static 변수/함수에 대해서
//static 예약어 : 정적 변수(객체)/함수를 지정할 때 사용
//의미 : 프로그램 구동시에 고정된 메모리 번지에 들어감.(자동new)
//      프로그램 종료시까지 변경되지 않음.
//사용이유 : 1. 시작점(Entry Point)를 지정할 때 사용함.
//          2. 중요한 데이타를 안정적으로 저장할 때 주로 사용.
//          3. 자주 사용하는 유틸성 클래스에 지정한다.
//             new를 안해도 클래스 함수 사용가능
class BallFactory{
    int ballCount = 100;
    void make(){
        this.ballCount++;
        System.out.println("축구공 생산!");
    }
}
class FoodFactory{
    static int foodCount = 200;
    static void make(){
        foodCount++;
        System.out.println("도시락 생산!");
    }
}
public class ex27 {
    //전역변수 또는 중요한 데이타 저장용
    public static BallFactory myBallFactory;

    public static void main(String[] args) {
        BallFactory ballFactory = new BallFactory();
        System.out.println( ballFactory.ballCount );
        //static 변수/함수는 클래스이름 뒤에 점을 찍어서 접근.
        System.out.println(FoodFactory.foodCount);
        FoodFactory.make();
        //예)
        System.out.println( Math.random() );
    }
}
