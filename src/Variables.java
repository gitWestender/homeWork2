public class Variables {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
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

    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        System.out.println(frog *= 10);
        System.out.println(frog /= 3.5);
        System.out.println((frog += 4) + "\n");
    }

    public static void task6() {
        System.out.println("Задача 6");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        System.out.println("Общий вес боксеров: " + (firstBoxer + secondBoxer));
        System.out.println("Разница в весе боксеров: " + (secondBoxer - firstBoxer) + "\n");
    }

    public static void task7() {
        System.out.println("Задача 7");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        System.out.println("Разница в весе спортсменов");
        System.out.println("Первый способ: " + (secondBoxer - firstBoxer));
        System.out.println("Второй способ: " + (secondBoxer % firstBoxer) + "\n");
    }
}
