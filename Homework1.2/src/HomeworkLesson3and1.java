import java.util.Scanner;

public class HomeworkLesson3and1 {
    public static void main(String[] args) {
        System.out.println("Введите количество гривен $ : ");
        Scanner grnToDollar = new Scanner(System.in);
        double x = grnToDollar.nextDouble();
        double cashDoll= x / 36.8;
        System.out.println("Конвертация Доллара :" + cashDoll);
        System.out.println("Введите количество гривен  Eur: ");
        Scanner grnToEuro = new Scanner(System.in);
        double y = grnToEuro.nextDouble();
        double cashEur = y / 42.3;
        System.out.println("Конвертация в евро :" + cashEur);
    }
}
