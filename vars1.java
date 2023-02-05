import java.util.Scanner;

class vars1 {
    public static void main(String args[]) {



        // включаем возможность ввода с клавиатуры
        Scanner in = new Scanner(System.in);



        /* переменные
        int x, y, z, sum, umnozh;
        String name;


        //---------------------- МЕГА ПРОГА--------------------------
        // System.out.print("Привет! Как тебя зовут?");
        // name = in.nextLine();
        //  System.out.println("Привет, " + name);

        System.out.println("привет! как тебя зовут?");
        name = in.nextLine();
        System.out.println("привет, " + name + "!");
        System.out.println("программа сложения двух чисел");
        System.out.print("введите первое число: ");
        x = in.nextInt();
        System.out.print("введите второе число: ");
        y = in.nextInt();
        sum = x + y;
        System.out.println(name + ", сумма чисел = " + sum);
        System.out.println();

        // умножение 3х чисел
        System.out.println("а теперь, " + name + ", программа умножения 3х чисел");
        System.out.print("введите первое число: ");
        x = in.nextInt();
        System.out.print("введите второе число: ");
        y = in.nextInt();
        System.out.print("введите третье число: ");
        z = in.nextInt();
        umnozh = x * y * z;
        System.out.println(name + ", произведение чисел = " + umnozh);
        System.out.println();

        1. получить на ввод два числа
        - вывести x - y
        - вывести y - x
        2. получить на ввод два числа
        - разделить x на y, вывести результат деления и вывести остаток который не делится нацело %
        x = 16
        y = 5
        x/y ==3
        x%y ==1

        int x, y;
        String name;
        System.out.println("Привет! Как тебя зовут?");
        name = in.nextLine();
        System.out.println("Привет, " + name + "!");
        System.out.println("Это программа разности двух чисел");
        System.out.println("Введи первое число");
        x = in.nextInt();
        System.out.println("Веди второе число");
        y = in.nextInt();
        System.out.println(name + ", разность двух чисел " + (x-y));
        System.out.println("А теперь деление!");
        System.out.println(name + ", введи первое число");
        x = in.nextInt();
        System.out.println("Введи второе число");
        y = in.nextInt();
        System.out.println("Результат получившийся при делении " + x/y + " неделимый остаток равен " + x%y);

        int x;
        System.out.print("Введи число: ");
        x = in.nextInt();

        if (x>0) {
            System.out.println("Число больше 0");
        }
        else {
            if(x==0) {
                System.out.println("Число равно 0");
            }
            else {
                System.out.println("Число меньше 0");
            }
        }


        String name;
        int x;
        System.out.println("Как тебя зовут?");
        name = in.nextLine();
        System.out.println("Привет, " + name + ", ответь на несколько вопросов. 1 - да, 2 нет.");
        System.out.println("Вареники пробовал?");
        x = in.nextInt();
        if (x == 1) {
            System.out.println("Вкусные?");
            x = in.nextInt();
            // 1+
            if (x == 1) {
                System.out.println("С картохой збс?");
                x = in.nextInt();
                // 1+ 2+
                if (x == 1) {
                    System.out.println("Мне тоже нравится");
                    x = in.nextInt();
                    // 1+ 2+ 3+
                }
                else {
                    System.out.println("Ну с вишней тоже ничего");
                    //1+ 2+ 3-
                }
            }
            else {
                System.out.println("Пельмеши больше любишь?");
                x = in.nextInt();
                // 1+ 2-
                if (x == 1) {
                    // 1+ 2- 3+
                    System.out.println("Пельмеши тоже збс");
                    x = in.nextInt();
                    // ------------
                }
                else {
                    System.out.println("Ну тогда я хз");
                    // 1- 2- 3-
                }
            }
        }

        else {
            System.out.println("Как не пробовал, дурак чтоли?");
            x = in.nextInt();
            // 1-
            if (x == 1) {
                System.out.println("Ладно, надо срочно попробовать");
                x = in.nextInt();
                // 1- 2+
                if (x == 1) {
                    System.out.println("Збс, варю с картохой");
                    x = in.nextInt();
                    // 1- 2+ 3+
                }
                else {
                    System.out.println("Оке, тогда пельмеши");
                    // 1- 2+ 3-
                }
            }
            else {
                System.out.println("Как не дурак? кто вообще не пробовал вареники. Давай сварю?");
                x = in.nextInt();
                // 1- 2-
                if (x == 1) {
                    System.out.println("Збс, варю с картохой");
                    x = in.nextInt();
                    // 1- 2- 3+
                }
                else {
                    System.out.println("Ну и ходи голодный, придурок");
                    // 1- 2- 3-
                }
            }
        }
*/
     /*   System.out.println("что вы хотите больше всего?");
        System.out.println("банан (1)");
        System.out.println("кокос (2)");
        System.out.println("арбуз (3)");
        System.out.println("персик (4)");
        System.out.println("яблоко (5)");
        System.out.print(" : ваш вариант");
        int x = in.nextInt();
        switch (x) {
            case 1:
                System.out.println("Ты латентный пидарас");
                break;
            case 2:
                System.out.println("Ты латентный нарик");
                break;
            case 3:
                System.out.println("Ты латентный зассанец");
                break;
            case 4:
                System.out.println("Ты латентный жополюб");
                break;
            case 5:
                System.out.println("хз не придумала");
                break;
            default:
                System.out.println("число не равно 1, 2, 3, 4, 5");

        }
*/
      /*  int a, b, c;
        if (a>b && a>c) {

        }

        if (a>b || a>c) {

        }

        if (a>b && a!==c) {

        } */


        /* int x, b, c;
        b = 2;
        c = 3;
        System.out.println("загадай число от 1 до 5");
        x = in.nextInt();
        if (x>b && x>c) {
            System.out.println("твое число больше 2 и 3");
            System.out.println("загадай еще одно число");
            x = in.nextInt();
            if ((x>b || x>c)) {
                System.out.println("твое число больше 2 или 3");
            }
            else {
                System.out.println("твое число меньше 2 или 3");
            }
        }
        else {
            System.out.println("твое число меньше 2 и 3");
        }

         */
        int x;
        int a;
        a = 147483647;
        x = in.nextInt();
        a = a+x;
        System.out.println(a);



























    }
}
