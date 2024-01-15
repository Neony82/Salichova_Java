import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int scanner = new Scanner(System.in).nextInt();
        if (scanner > 7) {
            System.out.println("Привет");
        }

        System.out.println("Введите имя: ");
        String name = new Scanner(System.in).nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

        Integer[] numbers = new Integer [] {12, 4, 8, 16, 27, 13, 18, 26, 45, 8};

        System.out.println("Первый вариант перебора:");
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i] % 3;
            if (num == 0) {
                System.out.println(numbers[i]);
            }
        }
        System.out.println("\n");

        System.out.println("Второй вариант перебора:");
        for (int elem : numbers) {
            int num = elem % 3;
            if (num == 0) {
                System.out.println(elem);
            }
        }

        System.out.println("\nОтвет на 2й вопрос: там одна лишняя слева круглая скобка, а справа - одна квадратная. Надо либо добавить соответственные, либо удалить эти");
    }
}