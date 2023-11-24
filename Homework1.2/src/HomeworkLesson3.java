import java.util.Scanner;

public class HomeworkLesson3 {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в конвертор температур !!\n" +
                "Введите температуру по цельсию :");
        Scanner a = new Scanner(System.in);
        double celTemp = a.nextDouble();
        System.out.println("Температура по Фарингейту :");
        System.out.println(celTemp * 1.8 + 32);

    }

}
