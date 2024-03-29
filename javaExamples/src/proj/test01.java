package proj;

import java.util.Arrays;

public class test01 {
    public static void main(String[] args) {
        int[] arrayIndex1 = { 2, 0, 1, 3, 4 };
        int[] arrayIndex2 = { 1, 2, 0, 4, 3 };
        int[][] arrayNum = {
                { 22, 92, 32, 42, 52 },
                { 23, 93, 33, 43, 53 },
                { 24, 94, 34, 44, 54 },
                { 25, 95, 35, 45, 55 },
                { 26, 96, 36, 46, 56 } };

        int[] arrayMyNum = new int[5];
        arrayMyNum[0] = arrayNum[arrayIndex1[0]][arrayIndex2[0]];
        arrayMyNum[1] = arrayNum[arrayIndex1[1]][arrayIndex2[1]];
        arrayMyNum[2] = arrayNum[arrayIndex1[2]][arrayIndex2[2]];
        arrayMyNum[3] = arrayNum[arrayIndex1[3]][arrayIndex2[3]];
        arrayMyNum[4] = arrayNum[arrayIndex1[4]][arrayIndex2[4]];
        System.out.println(Arrays.toString(arrayMyNum));
        Arrays.sort(arrayMyNum);
        System.out.println(Arrays.toString(arrayMyNum));

        System.out.println("최소값:"+arrayMyNum[0]);
        System.out.println("최대값:"+arrayMyNum[4]);



    }
}
