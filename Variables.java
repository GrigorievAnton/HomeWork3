import java.util.Scanner;
public class Variables {
    public static void main(String[] args) {
        // Домашнее задание
        Scanner scan = new Scanner(System.in);

            System.out.println("Введите целое число");

        int x = scan.nextInt();
        if (x % 2 == 0)
            System.out.println("Число четное");
        else
            System.out.println("Число нечетное");

        Scanner scan1 = new Scanner(System.in);
        {
            System.out.println("Введите сумму вклада (в рублях), а далее количество месяцев");
        }
        double y = scan.nextDouble();
        int x1 = scan.nextInt();
        double proc = 7 / 100.0;
        while(x1 > 0) {
            y = y + y * proc;
            x1--;
            System.out.println(y);
        }
           System.out.println(y);
    }
}





