import java.util.Scanner;

public class Exercise_2 {
    /**
     * for loop
     * <p>
     * while loop
     * <p>
     * switch
     */
    private void call() {
        //for loop
        for(int i = -1; i < 5; i= i + 3){
            System.out.println("test");
        }

        //while loop
        boolean isAlive = true;
        while (isAlive) {
            System.out.println("123");
            // code here
            System.out.println("alive");
            //change value
            Scanner scanner = new Scanner(System.in);
            // 如果用户输入Die则改变isAlive的值
            if (scanner.nextLine().equals("Die")){
                isAlive = false;
            }
        }
        System.out.println("Die");

        //switch
        int d = 1;
        switch (d) {
            case 0:
                System.out.println("0");
                break;
            case 1:
                // code here
                System.out.println("1");
                break;
            default:
                System.out.println("Whatever");
                break;
        }
    }

    public static void main(String[] args) {
        Exercise_2 teaching = new Exercise_2();
        teaching.call2();
        //家庭作业 取消下面的注释
        //teaching.printPyramid();
    }

    private void maxNumber(int[] firstArray) {
        int a = firstArray[0];
        int b = firstArray[1];
        int c = firstArray[2];
        if ( a >= b & a >= c) {
            System.out.println(a);
        } else if ( b >= a & b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }

    private void call2 () {
            //数组
            /**
             * 123, 456, 123
             * 456, 123, 341
             * 890, 287, 589
             * */
            // 6 lines
            // 1st
            int[] firstArray = {123, 456, 123, 9801, 82739, 8271823};
            for (int m = 2 ; m < firstArray.length; m ++ ){
                System.out.println(firstArray[m]);
            }
            int m = 0;
            while ( m < firstArray.length){
                System.out.println(firstArray[m]);
                m++;
            }
    }

    /**
     * 家庭作业
     * 构造一个方法可以根据输入高度打印一个金字塔
     * 示例：
     * 高度5
     * #
     * ##
     * ###
     * ####
     * #####
     * */
    public void printPyramid(){
        //TODO code here

    }
}
