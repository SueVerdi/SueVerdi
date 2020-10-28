
public class SueVerdi {

    public static void main(String[] args) {
        // Задание 3 ( Первые два задания сдала )
        float a = 3.3f;
        float b = 7.7f;
        float c = 8.8f;
        float d = 9.9f;
        float f =  value(1, 4, 3, 6);
        System.out.println(sumBetween10and20(10, 5));
        System.out.println(f);
        System.out.println();
        PositiveOrNegative(10);
    }

    public static float value(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }
    // Задание 4. Написать метод, принимающий на вход два целых числа и проверяющий,
    // что сумма  лежит в пределах от 10 до 20 (включительно), если да - вернуть true,
    // в противном случае  - false.

    private static boolean sumBetween10and20(int a, int b) {
        int sum = a + b;
        if (sum <= 20 && sum >= 10) {
            return true;
        }
        return false;
    }
    // Задание 5. Написать метод, которому в качестве параметра передается число, метод должен
    // напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.

    public static void PositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        }
        if (a < 0) {
            System.out.println("Отрицательное число");
        }

    }
    // Задание 6. Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    private static boolean isNegative (int a) {
        if (a<=0) {
            return true;
        }
        return false;
    }

    // Задание 7. Написать метод, которому в качестве параметра передается строка,
    // обозначающая имя. Метож должен вывести в консоль сообщение "Привет, указанное_имя!"

    public static void greetings(String name) {
        System.out.println("Привет, " + name + "!");
    }

}






