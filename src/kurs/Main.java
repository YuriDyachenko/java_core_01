package kurs;

public class Main {

    //1. Создать пустой проект в IntelliJ IDEA и прописать метод main()
    public static void main(String[] args) {

        //2. Создать переменные всех пройденных типов данных и инициализировать их значения
        System.out.println("2.");
        byte byteVal = 101;
        short shortVal = 10001;
        int intVal = 1000001;
        long longVal = 1000000000001L;
        float floatVal = 100.01f;
        double doubleVal = 10000.0001;
        char charVal = 'z';
        boolean booleanVal = true;
        System.out.println("byteVal = " + byteVal);
        System.out.println("shortVal = " + shortVal);
        System.out.println("intVal = " + intVal);
        System.out.println("longVal = " + longVal);
        System.out.println("floatVal = " + floatVal);
        System.out.println("doubleVal = " + doubleVal);
        System.out.println("charVal = " + charVal);
        System.out.println("booleanVal = " + booleanVal);

        //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        //где a, b, c, d – аргументы этого метода, имеющие тип float.
        System.out.println("3.");
        outSomeCalc(1.35f, 2.77f, 3.45f, 7.66f);

        //4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
        //в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
        System.out.println("4.");
        outIsSumBetween10And20(5, 7);
        outIsSumBetween10And20(2, 3);
        outIsSumBetween10And20(7, 15);

        //5.Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
        //в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом
        //6. Написать метод, которому в качестве параметра передается целое число.
        //Метод должен вернуть true, если число отрицательное, и вернуть false если положительное
        System.out.println("5, 6.");
        outPositiveNegative(-77);
        outPositiveNegative(0);
        outPositiveNegative(33);

        //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
        //Метод должен вывести в консоль сообщение «Привет, указанное_имя!»
        System.out.println("7.");
        outName("Anna");

        //8. Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
        //Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный
        System.out.println("8. 1890 - 1905");
        for (int i = 1890; i <= 1905; i++) {
            outIsLeapYear(i);
        }
        System.out.println("8. 1990 - 2021");
        for (int i = 1990; i <= 2021; i++) {
            outIsLeapYear(i);
        }
    }

    //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – аргументы этого метода, имеющие тип float.
    public static float someCalc(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }
    public static void outSomeCalc(float a, float b, float c, float d) {
        System.out.println("" + a + " * (" + b + " + (" + c + " / " + d + ")) = " + someCalc(a, a, c, d));
    }

    //4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
    //в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean isSumBetween10And20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
    public static void outIsSumBetween10And20(int a, int b) {
        System.out.println("(" + a + " + " + b +") is between 10 and 20 = " + isSumBetween10And20(a, b));
    }

    //5.Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
    //в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом
    public static void outPositiveNegative(int a) {
        String s = "passed: " + a + " - is ";
        if (isNegative(a)) {
            System.out.println(s + "negative");
        }
        else {
            System.out.println(s + "positive");
        }
    }

    //6. Написать метод, которому в качестве параметра передается целое число.
    //Метод должен вернуть true, если число отрицательное, и вернуть false если положительное
    public static boolean isNegative(int a) {
        return a < 0;
    }

    //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    //Метод должен вывести в консоль сообщение «Привет, указанное_имя!»
    public static void outName(String name) {
        System.out.println("Hello, " + name + "!");
    }

    //8. Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    //Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный
    public static void outIsLeapYear(int year) {
        boolean isLeap = false;
        if (year % 400 == 0) isLeap = true;
        else
            if ((year % 4 == 0) && (year % 100 != 0)) isLeap = true;
        String res = "year " + year;
        if (isLeap) System.out.println(res + " is leap");
        else System.out.println(res);
    }
}
