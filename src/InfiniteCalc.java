public class InfiniteCalc {
    int x = 0;

    public int Calc(int operand1, int operand2, char operation) {
        if (operation == 's') {
            return 0;
        } else {

            switch (operation) {

                case '-':
                    x = operand1 - operand2;
                    break;
                case '+':
                    x = operand1 + operand2;
                    break;
                case '*':
                    x = operand1 * operand2;
                    break;
                case '/':
                    x = operand1 / operand2;
                    break;
                case 's':
                    break;
                case 'C':
                    x = 0;
                    break;
                default:
                    break;
            }
            return x;
        }
    }
}

