import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "C:" + separator + "Users" + separator + "artyo" + separator + "Desktop" + separator + "input.txt";
        File file = new File(path);
        Scanner sc = new Scanner(file);
        String num1 = sc.next();
        String operation = sc.next();
        String num2 = sc.next();
        double a, b = 0;
        try {
            a = Double.parseDouble(num1);
            b = Double.parseDouble(num2);
            Calculator calc = new Calculator(operation, a, b);
            calc.calculated();
        } catch (NumberFormatException e) {
            System.out.println("Error! Not number");
        }
        sc.close();
    }
}
