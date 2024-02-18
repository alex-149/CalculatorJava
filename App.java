import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Math Equation: ");
            String z = scanner.nextLine();
            char[] math_operations = new char[z.length()];
            int index = 0;
            for (char c : z.toCharArray()) {
                if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
                    math_operations[index] = c;
                    index++;
                }
            }
            if (math_operations[0] == '+') {
                String[] zs = z.split("\\+");
                double x = Double.parseDouble(zs[0]);
                double y = Double.parseDouble(zs[1]);
                System.out.println(Calculate(x, y, math_operations));
            } else if (math_operations[0] == '-') {
                String[] zs = z.split("-");
                double x = Double.parseDouble(zs[0]);
                double y = Double.parseDouble(zs[1]);
                System.out.println(Calculate(x, y, math_operations));
            } else if (math_operations[0] == '*') {
                String[] zs = z.split("\\*");
                double x = Double.parseDouble(zs[0]);
                double y = Double.parseDouble(zs[1]);
                System.out.println(Calculate(x, y, math_operations));
            } else if (math_operations[0] == '/') {
                String[] zs = z.split("/");
                double x = Double.parseDouble(zs[0]);
                double y = Double.parseDouble(zs[1]);
                System.out.println(Calculate(x, y, math_operations));
            } else if (math_operations[0] == '^') {
                String[] zs = z.split("\\^");
                double x = Double.parseDouble(zs[0]);
                double y = Double.parseDouble(zs[1]);
                System.out.println(Calculate(x, y, math_operations));
            }
        }
    }

    public static double Calculate(double x, double y, char[] math_operations) {
        double result = x;
        for (char operation : math_operations) {
            if (operation == '+') {
                result += y;
            } else if (operation == '-') {
                result -= y;
            } else if (operation == '*') {
                result *= y;
            } else if (operation == '/') {
                result /= y;
            } else if (operation == '^') {
                result = Math.pow(result, y);
            }
        }
        return result;
    }
}