import java.io.File;
import java.util.logging.*;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Program {

    public static void main(String[] args) {
        
        // calc();
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int res;
        // triangle_sum();
        //int res = factoriall(n);
        //System.out.println(res);
        // prost_chisla ();
   }




// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

    // public static void triangle_sum () {
    //     int sum = 0;
    //     System.out.println("Введите число ");
    //     Scanner sc = new Scanner(System.in);
    //     int N = sc.nextInt();
        
    //     for (int i = 1; i <= N; i++) {
    //         sum += i;
    //         }

    // System.out.println("сумма чисел равна");
    // System.out.println(sum);
    // }
   
    // // public static int factoriall (int n) {
    //     int fact = 1;
    //     for (int i = 1; i <= n; i++) {
    //         fact *= i;
    //     }

    // System.out.println("Факториал числа n равен ");
    // return fact;
    // }
    
// 3) Реализовать простой калькулятор
    
    // // public static void calc () {
    //     int a, b, result;
    //     char q;
    //     Scanner num = new Scanner (System.in);
    //     System.out.println("Добро пожаловать в калькулятор. Для начала введите любой символ. Для выхода нажмите q "); 
        
    //     while ((q = num.next().charAt(0)) != 'q') {
        
    //         System.out.println("Введите два неотрицательныых числа:");
    //         System.out.println("Число а: ");
    //         a = num.nextInt();
    //         System.out.println("Число b: ");
    //         b = num.nextInt();
        
    //         while ((a < 0) || (b < 0)) {
    //             System.out.println("Введите неотрицателные числа ");
                
    //             System.out.println("Число а: ");
    //             a = num.nextInt();
                
    //             System.out.println("Число b: ");
    //             b = num.nextInt();
            
    //             while (((int)a != a) || ((int)b != b)) {
    //                 System.out.println("Введите неотрицателные числа ");

    //                 System.out.println("Число a: ");
    //                 a = num.nextInt();

    //                 System.out.println("Число b: ");
    //                 b = num.nextInt();   
    //             }
    //         } 
    //         boolean isTrue = true;
    //         char lit;
    //         System.out.println("Выберите операцию над числами: +, -, * или / ");
    //         lit = num.next().charAt(0);

    //         while ( isTrue)  { 
                
    //             if ((lit != '+') && (lit != '-') && (lit != '*') && (lit != '/')) {
    //                 System.out.println("Вы ввели не ту операцию. Выберите операцию над числами: +, -, * или / ");
    //                 lit = num.next().charAt(0);
    //                 continue;
    //             }
    //             else {
    //                 isTrue = false; 
    //                 break;
    //             }    
    //         }

    //         result = switch (lit) {
    //             case '+': 
    //                 yield (a + b) ;

    //             case '-':
    //                 yield (a - b) ;

    //             case '*':
    //                 yield (a * b) ;
                
    //             case '/':
    //                 yield (a / b) ;
                
    //             default:
    //                 throw new IllegalArgumentException("Unexpected value: " + lit);
    //         };

    //         System.out.println("РЕЗУЛЬТАТ: "); 
    //         System.out.println(result );

    //         System.out.println("Введите два неотрицательных числа. Для выхода нажмите q "); 
        
      

    //     }
    
    // System.out.println("Вы вышли из калькулятора. Всего доброго");
    // }

    
    
//  2) Вывести все простые числа от 1 до 1000
    
    // public static void prost_chisla () {

    //     Scanner cs = new Scanner(System.in);

    //     System.out.println("Введите длину массива: ");
    //     int len = cs.nextInt();
        
    //     List <Integer> lis = new ArrayList<>(); 

    //     for (int i = 2; i <= len; i++) {
    //         boolean flag = true;
    //         for (int j = 2; j < i; j++) {
    //             if (i % j == 0) {
    //                 flag = false;
    //             }
    //         }

    //     if (flag) System.out.println(i);
    //     else flag = false;
    //     }
                

    //     }    
    // }

    }
  