package ma.enset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six"));
        Context context = new Context();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter strategy: ");
            String strategy_name = scanner.nextLine();
            System.out.println(strategy_name + "/n/n");
            if (strategy_name.equals("end")) {
                break;
            }
            try {
                Class c = Class.forName(strategy_name);
                Strategy strategy = (Strategy) c.newInstance();
                context.setStrategy(strategy);
                context.applyStrategy(list);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}