import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            String result;
            try {
                result = calc(str);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }
            System.out.println(result);
        }
    }

    public static String calc(String input) throws Exception {
        String input2 = input.trim();
        String[] strArr = input2.split("\\s+");
        int x;
        int y;
        String operator;

        if (strArr.length < 3)
            throw new Exception("throws Exception //т.к. строка не является математической операцией");
        if (strArr.length > 3)
            throw new Exception("throws Exception //т.к. строка не является математической операцией");
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
        if (Integer.parseInt(strArr[0]) > 10 && Integer.parseInt(strArr[0]) < 1)
            throw new Exception("throws Exception //только числа от 1 до 10 включительно!");
        if (Integer.parseInt(strArr[2]) > 10 && Integer.parseInt(strArr[2]) < 1)
            throw new Exception("throws Exception //только числа от 1 до 10 включительно!");

        operator = strArr[1];

        switch (operator) {
            case "+":
                return String.valueOf(x + y);
            case "-":
                return String.valueOf(x - y);
            case "*":
                return String.valueOf(x * y);
            case "/":
                return String.valueOf(x / y);
            default:
                throw new Exception("throws Exception //Неверный оператор");
        }
    }
}
