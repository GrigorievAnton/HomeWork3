import java.util.Scanner;
public class Variables {
    public static void main(String[] args) {
        // �������� �������
        Scanner scan = new Scanner(System.in);

            System.out.println("������� ����� �����");

        int x = scan.nextInt();
        if (x % 2 == 0)
            System.out.println("����� ������");
        else
            System.out.println("����� ��������");

        Scanner scan1 = new Scanner(System.in);
        {
            System.out.println("������� ����� ������ (� ������), � ����� ���������� �������");
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





