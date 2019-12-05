import java.util.Scanner;
import java.io.IOException;

/**Класс для запуска калькулятора поддерживает ввод с клавиатуры*/

public class InteractRunner {

    public static void main(String[] arg) throws IOException, InterruptedException {
        Scanner reader = new Scanner(System.in);

        try {
            Calculator calc = new Calculator();
            String exit = "no";
            while (!exit.equals("yes")) {
                System.out.println("Input first arg: ");
                String first = reader.next();
                System.out.println("Input second arg");
                String second = reader.next();
                calc.add(Integer.valueOf(first), Integer.valueOf(second));
                System.out.println("Choose an action: + or * or - or /");
                String action = reader.next();
                switch (action) {
                    case "+":
                        System.out.println("Summ Result is: " + calc.getSummResult());
                        break;
                    case "*":
                        System.out.println("Mult Result is: " + calc.getMultResult());
                        break;
                    case "-":
                        System.out.println("Sub Result is: " + calc.getSubResult());
                        break;
                    case "/":
                        System.out.println("Div Result is: " + calc.getDivResult());
                        break;
                }
                calc.cleanResult();
                System.out.println("Exit: yes/no");
                exit = reader.next();
            }
        }
        finally {
            reader.close();
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
    }
}
