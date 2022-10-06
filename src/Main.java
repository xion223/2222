import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); //метод считывает строку

       Calcullate calc = new Calcullate();

       char operation = 1;
       int x = 0;
        System.out.println("Введите число 1");

       int operand1 = scanner.nextInt(); //считывает число
       int operand2 = scanner.nextInt(); //считывает число

        /*Метод next() класса Scanner считывает строку,
    а метод charAt(0) позволяет взять первый символ в этой строке.
     так мы получаем операцию, которую нужно выполнить*/

        while (true) {
            operation = scanner.next().charAt(0);
            if (operation == 's') {
                break;
            } else if (operation == 'C') {
                x = 0;
                System.out.println("Введите число1");
                operand1 = scanner.nextInt(); //считывает число
            } else {
                System.out.println("Введите число2");

            if (operation == '/' && operand2 == 0) {
                System.out.println("Не делится на ноль");
            } else if (x == 0) {
                    x = calc.Calc(operand1, operand2, operation);
            } else {
                    x = calc.Calc(x, operand2, operation);

                }
            }
        }
    }
}