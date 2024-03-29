import com.sun.security.jgss.GSSUtil;

public class ex08 {
    public static void main(String[] args) {
        //단항 : ++ -- !(논리반전) (타입) ~(비트반전)
        int i = 10;
        i++; //i = i + 1;
        System.out.println( i );
        i--; //i = i - 1;
        System.out.println( i );

        boolean b = true;
        System.out.println( !b );
        System.out.println( !!b );

        int j = 20;
        short s = (short)j; //작은 타입 <= 큰 타입 : 강제형변환

        int k = 10;  //32bit 000000....1010
        int m = ~k;  //      111111....0101
        System.out.println( Integer.toBinaryString(k) );
        System.out.println( Integer.toBinaryString(m) );

        String binaryString = String.format("%32s", Integer.toBinaryString(k)).replace(" ","0");
        System.out.println(binaryString);


    }
}
