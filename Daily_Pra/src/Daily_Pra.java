//public class Daily_Pra {
//    public static void main(String[] args) {
//        int count = 0;
//        for(int i = 1;i <= 100;i++) {
//            if(i % 10 == 9){
//                count++;
//            }
//            if(i / 10 == 9) {
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}

//public class Daily_Pra {
//    public static void main(String[] args) {
//        int i;
//        int count=0;
//        for(i = 1000;i < 2000;i++){
//            if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0){
//                count++;
//                System.out.println("leap_year:"+i);
//            }
//        }
//        System.out.println("闰年总数："+count);
//    }
//}

//import java.util.Scanner;
//import java.lang.Math;
//public class Daily_Pra {
//    public static void main(String[] args) {
//        int i,j,n;
//        int flag =0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入末尾区间数字：");
//        n = sc.nextInt();
//        for(j=2;j<=n;j++){
//            flag =0;
//            for(i=2;i<=(int)Math.sqrt(j);i++){
//                if( j  % i == 0){
//                    flag=1;
//                    break;
//                }
//            }if(flag == 0){
//                System.out.println(j+"是素数！");
//            }
//        }
//    }
//}

//import java.util.Scanner;
//import java.lang.Math;
//public class Daily_Pra {
//    public static void main(String[] args) {
//        int i,n;
//        int flag =0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入所需判断数字：");
//        n = sc.nextInt();
//            for(i=2;i<=(int)Math.sqrt(n);i++){
//                if( n  % i == 0){
//                    flag=1;
//                    System.out.println(n+"不是素数！");
//                    break;
//                }
//            }if(flag == 0){
//                System.out.println(n+"是素数！");
//            }
//        }
//    }

//import java.util.Scanner;
//public class Daily_Pra {
//    public static void main(String[] args) {
//        int n;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入年龄：");
//        n = sc.nextInt();
//        if(n<=18){
//            System.out.println("少年！");
//        }else if(n<=28){
//            System.out.println("青年！");
//        }else if(n<=55){
//            System.out.println("中年！");
//        }else{
//            System.out.println("老年！");
//        }
//    }
//}


//题目描述
//        KiKi学习了循环，BoBo老师给他出了一系列打印图案的练习，该任务是打印用“*”组成的X形图案。
//        输入描述:
//        多组输入，一个整数（2~20），表示输出的行数，也表示组成“X”的反斜线和正斜线的长度。
//        输出描述:
//        针对每行输入，输出用“*”组成的X形图案。
//public  class Daily_Pra {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入所需打印X型的整型数字：");
//        while(sc.hasNext()) {
//            int n = sc.nextInt();
//            for (int i=0;i<n;i++){
//                for(int j=0;j<n;j++){
//                    if(i == j){
//                        System.out.print("*");
//                    }else if(i == n-1-j){
//                        System.out.print("*");
//                    }else{
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println();
//            }
//        }
//    }
//}

//完成猜数字游戏 ，用户输入数字，判断该数字是大于，小于，还是等于随机生成的数字，等于的时候退出程序。
//import java.util.Random;
//import java.util.Scanner;
//
//public class Daily_Pra {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Random random = new Random(1);
//        int rand = random.nextInt(100)+1;
//        while(true) {
//            System.out.println("请输入你所猜的数字：");
//            int num = sc.nextInt();
//            if(num >rand){
//                System.out.println("你猜大了！");
//            }else if(num ==rand){
//                System.out.println("你猜对了！");
//                break;
//            }else{
//                System.out.println("你猜小了！");
//            }
//        }
//    }
//}

//求出0～999之间的所有“水仙花数”并输出。“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身,如；153＝1＋5＋3?，则153是一个“水仙花数“。
// public class Daily_Pra {
//    public static void main(String[] args) {
//        for(int i=100;i<1000;i++) {
//            int count = 0;
//            int ret = i;
//            while (ret != 0) {
//                count++;
//                ret /= 10;
//            }
//            ret = i;
//            int sum = 0;
//            while (ret != 0) {
//                sum += Math.pow(ret % 10, count);
//                ret /= 10;
//            } if (sum == i) {
//                System.out.println("水仙花数为：" + i);
//                }
//        }
//    }
//}

//计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 。
//public class Daily_Pra {
//    public static void main(String[] args) {
//        int flag = 1;
//        double sum = 0;
//        for(int i=1;i<=100;i++){
//            sum += flag * (1.0/i);
//            flag = -flag;
//        }
//        System.out.println(sum);
//    }
//}

//求两个正整数的最大公约数
//import java.util.Scanner;
//public class Daily_Pra {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入所需求最大公约数的两个数字；");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if(a % b != 0){
//            int c = a % b;
//            a = b;
//            b = c;
//        }
//        System.out.println(b);
//    }
//}

//二进制1的个数。求一个整数，在内存当中存储时，二进制1的个数。
//import java.util.Scanner;
//public class Daily_Pra {
//    public static void main(String[] args) {
//        int count = 0;
//        System.out.println("请输入一个待测整数：");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        while(num !=0 ){
//            if((num&1) != 0){
//                count++;
//            }
//            num = num >>> 1;
//        }
//        System.out.println(count);
//    }
//}
//解法二
//import java.util.Scanner;
//public class Daily_Pra {
//    public static void main(String[] args) {
//        int count = 0;
//        System.out.println("请输入一个待测整数：");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        while(num !=0 ){
//                  count++;
//                  num = num&(num-1);
//        }
//        System.out.println(count);
//    }
//}

//获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
//import java.util.Scanner;
//public class Daily_Pra {
//    public static void main(String[] args) {
//        System.out.println("请输入一个待测整数：");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        for (int i = 30; i >= 0; i -= 2) {
//            System.out.print(((num >>> i) & 1) + " ");
//        }
//        System.out.println();
//        for (int i = 31; i >= 1; i -= 2) {
//            System.out.print(((num >>> i) & 1) + " ");
//        }
//    }
//}

//编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序
//import java.util.Scanner;
//public class Daily_Pra {
//    public static void main(String[] args) {
//        int count = 3;
//        while(count != 0){
//            System.out.print("请输入密码:");
//            Scanner sc = new Scanner(System.in);
//            String num = sc.nextLine();
//            if(password.equals("123456")){
//                System.out.println("密码正确，登录成功！");
//                break;
//            }else {
//                count--;
//                System.out.println("密码错误，剩余登录次数为"+count);
//            }
//        }
//    }
//}

//输出一个整数的每一位，输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3。
//import java.util.Scanner;
//public class Daily_Pra {
//    public static void func(int num) {
//        if(num / 10 == 0){
//            System.out.print(num);
//        } else {
//            func(num / 10);
//            System.out.print(num % 10);
//        }
//        System.out.print(" ");
//    }
//    public static void main (String[]args){
//            System.out.print("请输入一个整数：");
//            Scanner sc = new Scanner(System.in);
//            int num = sc.nextInt();
//            func(num);
//        }
//}

//输出乘法口诀表,输出n*n的乘法口诀表,n由用户输入.
//import java.util.Scanner;
//public class Daily_Pra {
//    public static void main(String[] args) {
//        System.out.print("请输入整数:");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int i,j;
//        for(i=1;i<=n;i++){
//            for(j=1;j<=i;j++){
//                System.out.print(i+"*"+j+"="+i*j+'\t');
//            }
//            System.out.println();
//        }
//    }
//}

//找出出现一次的数字,有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
//public class Daily_Pra {
//    public static void main(String[] args) {
//        int[] arr = {1,1,2,2,6,8,8,9,9};
//        int ret = 0;
//        for(int i =0;i<arr.length;i++){
//            ret ^=arr[i];
//        }
//        System.out.println(ret);
//    }
//}

//求斐波那契数列的第n项。(迭代实现)
//import java.util.Scanner;
//public class Daily_Pra {
//    public static int fib(int n){
//        int n1=0;
//        int n2=1;
//        int n3=1;
//        for(int i = 3;i <= n;i++){
//            n3 = n1 + n2;
//            n1 = n2;
//            n2 = n3;
//        }
//        return n3;
//    }
//    public static void main(String[] args) {
//        System.out.print("请输入所求斐波拉契数第n项：");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int ret = fib(n);
//        System.out.println(ret);
//    }
//}

//求阶乘和，求1！+2！+3！+4！+........+n!的和。
//import java.util.Scanner;
//public class Daily_Pra {
//    public static int func(int n){
//        if(n<1){
//            return 1;
//        }
//        return n*func(n-1);
//    }
//    public static void main(String[] args) {
//        int sum = 0;
//        System.out.print("请输入所求阶乘的第n项：");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            int ret = 1;
//            ret = func(i);
//            sum +=ret;
//        }
//        System.out.println("所求阶乘和为："+sum);
//    }
//}

//求 N 的阶乘 。
//import java.util.Scanner;
//public class Daily_Pra {
//    public static int func(int n){
//        if(n<=1){
//            return 1;
//        }else{
//            return n*func(n-1);
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.print("请输入你所求阶乘的第n项：");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int ret = func(n);
//        System.out.println("第"+n+"项的阶乘为："+ret);
//    }
//}

//求最大值创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算。
//import java.util.Scanner;
//public class Daily_Pra {
//    public static int max2(int a,int b){
//        return a>b?a:b;
//    }
//    public static int max3(int a,int b,int c){
//        int max = max2(a,b);
//        return max > c ? max : c;
//    }
//    public static void main(String[] args) {
//        System.out.print("请输入三个所需比较的数值:");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        max3(a,b,c);
//        System.out.println("最大值为："+max3(a,b,c));
//    }
//}

//青蛙跳台阶问题
//import java.util.Scanner;
//public class Daily_Pra {
//    public static int JumpFloor(int n) {
//        if (n <= 2)
//            return n;
//        int f1 = 2, f2 = 1;
//        int result = 0;
//        for (int i = 2; i < n; i++) {
//            result = f1 + f2;
//            f2 = f1;
//            f1 = result;
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        System.out.print("请输入台阶阶数：");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int ret = JumpFloor(n);
//        System.out.println(n+"阶台阶共有"+ret+"种跳法！");
//        }
//}

//递归求解汉诺塔问题
//import java.util.Scanner;
//public class Daily_Pra {
//    public static void move(char pos1,char pos2){
//        System.out.print(pos1+"->"+pos2+" ");
//    }
//
//    public static void hanoi(int n,char pos1,char pos2,char pos3){
//        if(n == 1){
//            move(pos1,pos3);
//        }else{
//            hanoi(n-1,pos1,pos3,pos2);
//            move(pos1,pos3);
//            hanoi(n-1,pos2,pos1,pos3);
//        }
//    }
//    public static void main(String[] args) {
//        System.out.print("请输入圆盘个数：");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        hanoi(n,'A','B','C');
//    }
//}

//递归求斐波那契数列的第 N 项
//import java.util.Scanner;
//public class Daily_Pra {
//    public static int fib(int n) {
//      if(n==1 || n==2){
//          return 1;
//      }
//      return fib(n - 1) + fib(n - 2);
//    }
//
//    public static void main(String[] args) {
//        System.out.print("请输入所求斐波那契数第n项数值：");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int ret = fib(n);
//        System.out.println("第"+n+"项数值为："+ret);
//    }
//}

//返回的数字之和，写一个递归方法，输入一个非负整数，返回组成它的数字之和
//import java.util.Scanner;
//public class Daily_Pra {
//    public static int add(int n){
//        if(n < 10){
//           return n;
//        }
//        return n%10+add(n/10);
//    }
//
//    public static void main(String[] args) {
//        System.out.print("请输入所求的非负整数：");
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        int ret = add(n);
//        System.out.println("所求整数的拆分和为："+ret);
//    }
//}

//递归打印数字的每一位 ，按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
//import java.util.Scanner;
//public class Daily_Pra {
//    public static void func(int num) {
//        if(num / 10 == 0){
//            System.out.print(num);
//        } else {
//            func(num / 10);
//            System.out.print(num % 10);
//        }
//        System.out.print(" ");
//    }
//    public static void main (String[]args){
//            System.out.print("请输入一个整数：");
//            Scanner sc = new Scanner(System.in);
//            int num = sc.nextInt();
//            func(num);
//        }
//}

//递归求和 递归求 1 + 2 + 3 + ... + 10
//import java.util.Scanner;
//public class Daily_Pra {
//    public static int func(int n){
//        if(n == 1){
//            return 1;
//        }else {
//            return n+func(n-1);
//        }
//    }
//
//    public static void main(String[] args) {
//        int sum = 0;
//        System.out.print("请输入求和数列的最后一位数值：");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int ret = func(n);
//        sum += ret;
//        System.out.println("求和的值为："+sum);
//    }
//}

//递归求 N 的阶乘
import java.util.Scanner;
public class Daily_Pra {
    public static int func(int n){
        if(n == 1){
            return 1;
        }else {
            return n*func(n-1);
        }
    }

    public static void main(String[] args) {
        int sum = 0;
        System.out.print("请输入所求阶乘的数值：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ret = func(n);
        System.out.println(n+"！的值为："+ret);
    }
}