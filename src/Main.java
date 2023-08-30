import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            int result;
            try {
                result = calc(str);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }
            System.out.println(result);
        }
    }

    public static int calc(String input) throws Exception {
        String input2 = input.trim();
        String[] strArr = input2.split("\\s+");
        int x;
        int y;
        String operator;

        if (strArr.length != 3)
            throw new Exception("throws Exception // т.к. строка не является математической операцией");
        if (strArr[0].length() > 2 || strArr[2].length() > 2)
            throw new Exception("throws Exception // Только целые числа");
        try {
            x  = Integer.parseInt(strArr[0]);
        } catch (Exception e) {
            throw new Exception("throws Exception // Первое значение не являтся числом");
        }
        try {
            y  = Integer.parseInt(strArr[2]);
        } catch (Exception e) {
            throw new Exception("throws Exception // Второе значение не являтся числом");
        }
        if ((x > 10 || x < 1) || (y > 10 || y < 1))
            throw new Exception("throws Exception // только числа от 1 до 10 включительно!");

        operator = strArr[1];

        return switch (operator) {
            case "+":
                yield (x + y);
            case "-":
                yield (x - y);
            case "*":
                yield (x * y);
            case "/":
                yield (x / y);
            default:
                throw new Exception("throws Exception // Неверный оператор");
        };

//        if (operator.equals("+")) return String.valueOf(x + y);
//        else  if (operator.equals("-")) return String.valueOf(x - y);
//        else  if (operator.equals("*")) return String.valueOf(x * y);
//        else  if (operator.equals("/")) return String.valueOf(x / y);
//        else throw new Exception("throws Exception //Неверный оператор");

//        deprecated
//        switch (operator) {
//            case "+":
//                return String.valueOf(x + y);
//            case "-":
//                return String.valueOf(x - y);
//            case "*":
//                return String.valueOf(x * y);
//            case "/":
//                return String.valueOf(x / y);
//            default:
//                throw new Exception("throws Exception //Неверный оператор")
    }
}

