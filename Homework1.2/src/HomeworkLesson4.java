import java.util.Scanner;

public class HomeworkLesson4 {
    public static void main(String[] args) {
        //int a = 5;
        //int b = 6;
        //int c = 7;
        //int catCount1 = 8;
        //int catCount2 = 9;
        //String d = "Helo word!";
        //char e = '$';
        //char f = '%';
        //int g = 10;
        //double h = 3.14;
        //System.out.println(a);
        //System.out.println(b);
        //System.out.println(c);
        //System.out.println(catCount1);
        //.out.println(catCount2);
        //System.out.println(d);
        //System.out.println(e);
        //System.out.println(f);
        //System.out.println(g);
        //System.out.println(h);
        System.out.println("Введите 1 число : ");
        Scanner a = new Scanner(System.in);
        double firstNum = a.nextDouble();
        System.out.println("Введите 2 число : ");
        Scanner b = new Scanner(System.in);
        double secondNum = b.nextDouble();
        System.out.println("Ваш Результат сложения :");
        System.out.println(firstNum + secondNum);
    }

     {
        System.out.println("Введите 1 число : ");
        Scanner a = new Scanner(System.in);
        double firstNum = a.nextDouble();
        System.out.println("Введите 2 число : ");
        Scanner b = new Scanner(System.in);
        double secondNum = b.nextDouble();
        System.out.println("Ваш Результат вычетания :");
        System.out.println(firstNum - secondNum);
    }
    {
        System.out.println("Введите 1 число : ");
        Scanner a = new Scanner(System.in);
        double firstNum = a.nextDouble();
        System.out.println("Введите 2 число : ");
        Scanner b = new Scanner(System.in);
        double secondNum = b.nextDouble();
        System.out.println("Ваш Результат деления :");
        System.out.println(firstNum / secondNum);
    }
}
