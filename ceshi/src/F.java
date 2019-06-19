import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入0-999整数");
        int num = input.nextInt();
//        int num = 999;
        int count = 0;
        if (num < 0 || num > 999)
            System.out.println("输入有误");
        else {
            while (num>0){
                num=num/10;
                count++;
            }
            System.out.println("位数是："+count);
        }

    }
}

