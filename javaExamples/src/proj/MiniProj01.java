package proj;

import java.util.Scanner;
public class MiniProj01 {

    private static int[][] map = {
            {1,1,1,1,1,1,1}, //row 0
            {1,2,1,0,0,3,1}, //1
            {1,0,1,0,1,1,1}, //2
            {1,0,1,0,0,0,1},
            {1,0,1,1,1,0,1},
            {1,0,0,0,0,0,1},
            {1,1,1,1,1,1,1},
    };
    static int goalRow;
    static int goalCol;
    static int posRow;
    static int posCol;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        goalRow = (int)(Math.random()*6);
        goalCol = (int)(Math.random()*6);
        while(map[goalRow][goalCol] == 1){
            goalRow = (int)(Math.random()*6);
            goalCol = (int)(Math.random()*6);
        }
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[0].length; j++){
                if(map[i][j] == 2){
                    posRow = i;
                    posCol = j;
                }
            }
        }
        printMap();
        boolean quit = false;
        while (!quit){
            String key = sc.next();
            switch (key){
                case  "a" :
                    if(posCol > 0) posCol -= 1;
                    break;
                case "d" :
                    if(posCol < 6){
                        posCol += 1;
                    }
                    break;
                case "w" :
                    if(posRow > 0) posRow -= 1;
                    break;
                case "s" :
                    if(posRow < 6) posRow += 1;
                    break;
                case "q" :
                    quit = true;
                    break;
            }
            printMap();
            if(posCol == goalCol && posRow == goalRow){
                System.out.println("goal in");
                break;
            }
        }
    }
    static void printMap(){
        System.out.println();
        for(int r = 0; r < map.length; r++){
            for(int c = 0; c < map[0].length; c++){
                if(map[r][c] == 1) System.out.printf("%2s", "■ ");
                if(r == posRow && c == posCol) System.out.printf("%2s", "● ");
                else{
                    if(c == goalCol && r == goalRow){
                        System.out.printf("%2s","★ ");
                    }
                    else{
                        System.out.printf("%2s"," ");
                    }
                }
            }
            System.out.println();
        }
    }
}
