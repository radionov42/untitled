public class Main2 {
    public static void main(String[] args) {
        int a1 = 8;
        int a2 = 2;
        int res = plus(a1, a2);
        System.out.println(res);
        int res1 = minus(a1, a2);
        System.out.println(res1);
        int res2 = multiply(a1, a2);
        System.out.println(res2);
        int res3 = divide(a1, a2);
        System.out.println(res3);

    }
    public static int plus(int number, int number2) {
        return number + number2;
    }
    public static int minus(int number, int number2) {
        return number - number2;
    }
    public static int multiply(int number, int number2) {
        return number * number2;
    }
    public static int divide(int number, int number2) {
        return number / number2;
    }
}

