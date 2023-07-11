public class Variables {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println((paper) + "\n"); // переход на новую строку для лучшей читаемости вывода в консоль
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog += 4);
        System.out.println(cat += 4);
        System.out.println((paper += 4) + "\n");
    }

    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog -= 3.5);
        System.out.println(cat -= 1.6);
        System.out.println((paper -= 7639) + "\n");
    }

    public static void task4() {
        System.out.println("Задача 4");
        var friends = 19;
        System.out.println(friends);
        System.out.println(friends += 2);
        System.out.println((friends /= 7) + "\n");
    }
}
