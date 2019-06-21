package ZhouCe;
import java.util.Scanner;

import java.util.Scanner;
public class A {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char today='日';

        switch(today){
            case '一':
            case '三':
            case '五':
                System.out.println("早餐吃包子");
                break;
            case '二':
            case '四':
            case '六':
                System.out.println("早餐吃油条");
                break;
            case '日':
                System.out.println("吃主席套餐");
                break;
        }

        }
    }

