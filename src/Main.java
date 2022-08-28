public class Main {

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    //### Задание 1
    //
    //Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
    //
    //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
    //
    //в формате: «Сумма трат за месяц составила … рублей».
    public static void main(String[] args) {
        taks1();
        task2();
        task3();
        task4();
    }
    public static void taks1(){
        int[] payments = generateRandomArray();
        int sum = 0;
        for (var salary : payments){
            sum += salary;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
    public static void task2(){
        //Следующая задача — найти минимальную и максимальную трату за день.
        //
        //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        //
        //в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
        int[] payments = generateRandomArray();
        int max = payments[0];
        int min = payments[0];
        for (var salary : payments){
            if (max < salary){
                max = salary;
            }
            if (min > salary){
                min = salary;
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей»", min , max);
        System.out.println();
    }
    //А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
    //
    //Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на количество дней), и вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».

    public static void task3 (){
        int daysOnMonth = 30;
        int sum = 0;
        int[] payments = generateRandomArray();
        for (var salary : payments){
            sum += salary;
        }
        var result = (double) sum / payments.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", result);
        System.out.println();
    }


    //Отойдем от подсчетов.
    //
    //В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф. И. О. сотрудников начали отображаться в обратную сторону. Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ».
    //
    //Данные с именами сотрудников хранятся в виде массива символов (char[]).
    //
    //Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде. В качестве данных для массива используйте:
    //
    //char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
    //
    //В результате в консоль должно быть выведено "Ivanov Ivan".
    //
    //**Важно**: не используйте дополнительные массивы для решения этой задачи. Необходимо корректно пройти по массиву циклом и распечатать его элементы в правильном порядке.

    public static void task4 (){
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}

