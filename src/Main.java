import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество дней");
        int day = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите сумму ");
        int cymma = scanner2.nextInt();

        while (day > 0) {
            if (cymma > 0) {
                day--;
                cymma = cymma - 200;
                System.out.println("остлось копить:" + day);
            }
        }
    }
}
