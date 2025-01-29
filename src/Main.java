import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "C:" + separator + "Users" + separator + "artyo" + separator + "Desktop" + separator + "input.txt";
        File file = new File(path);
        Scanner sc = new Scanner(file);

        String separator2 = File.separator;
        String path2 = "C:" + separator2 + "Users" + separator2 + "artyo" + separator2 + "Desktop" + separator2 + "output.txt";
        File file2 = new File(path2);
        PrintWriter pw = new PrintWriter(file2);

        String num1 = sc.next();
        String operation = sc.next();
        String num2 = sc.next();
        double a, b = 0;
        try {
            a = Double.parseDouble(num1);
            b = Double.parseDouble(num2);
            Calculator calc = new Calculator(operation, a, b);
            pw.println(calc.calculated());
        } catch (NumberFormatException e) {
            pw.println("Error! Not number");
        }
        sc.close();
        pw.close();
    }
}
