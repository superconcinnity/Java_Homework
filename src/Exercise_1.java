public class Exercise_1 {

    public static int age_rui = 1;

    public static void main(String[] args) {
//        int n = 10;
//        int b = 3;
//        System.out.println(n - b);
//        System.out.println(n * b);
//        System.out.println(n + b);
//
//        System.out.println(n / b);
//        /// 余数
//        System.out.println(n % b);
//          Homework_1(5, 6);
//          Homework_2("wahelioccc2061", "333");
        Homework_3(1, 2, 3);
    }


    private static void Homework_2(String old_psw, String nw_psw) {
        String initPsw = "wahelioccc2061";
        /**
         * 第一种
         * 旧密码错误
         *
         * 第二种
         * 旧密码正确 新密码与旧密码相同
         *
         * 第三种
         * 旧密码正确 新密码为新 修改成功
         * */
        // TODO 修改密码
        if(old_psw.equals(initPsw)) {
            // 旧密码与数据库密码相匹配
            // 进行密码修改
            System.out.println("修改密码");

            //TODO 判断新密码是否与旧密码相同
            if (nw_psw.equals(initPsw)){
                // 相同
                System.out.println("新密码不能与旧密码相同！");
            } else {
                initPsw = nw_psw;
                System.out.println("密码修改成功！已改为: " + initPsw);
            }

        } else {
            System.out.println("密码输入错误");
        }
    }

    private static void Homework_1(int m, int n) {
       /**
        * 1. n / 10 + n % 20
        * 2. n % 2 + m % 20
        * 3. (m + n) / 2
        * 4. (m + n) / 2.0
        * 5. (int) (0.5 * (m + n))
        * 6. m * m + n / 4 + 2 * n
       * */
       //TODO 输出上述五个运算结果
        System.out.println(n / 10 + n % 20);
        System.out.println(n % 2 + m % 20);
        System.out.println( (m + n) / 2);
        System.out.println( (m + n) / 2.0);
        System.out.println((int) (0.3 * (m + n)));
    }

    private static void Homework_3(int a, int b, int c){
        //TODO 输出三个数中最大的数字
        if( a >=b && a >= c){
            System.out.println(a);
        } else if(b >= a && b >= c){
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }

}
