//static 초기화 블럭
class StaticClass {
    int a;
    static int b = 0; //프로그램시작시 초기화됨.
    static  { // => 클래스 호출시 처음 한번만 호출됨
        b = 5;
        System.out.println("static block!");
    }
    //생성자함수
    StaticClass(){ //new 코드가 실행될때 호출됨.
        a = 3;
        b = 10;
        System.out.println("constructor block");
    }
}
public class ex35 {
    public static void main(String[] args) {
        System.out.println( StaticClass.b );
        //StaticClass s = new StaticClass();
        System.out.println( StaticClass.b );
    }
}
