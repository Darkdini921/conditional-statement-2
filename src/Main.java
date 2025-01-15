public class Main {
    public static void main(String[] args) {

        // Задача 1 и 2

        byte clientOS = 0;
        int clientDeviceYear = 2014;

        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        // Задача 3

        int year = 2021;
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

        // Задача 4

        int days = 1;
        int deliveryDistance = 95;

        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней - " + days);
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            days = days + 1;
            System.out.println("Потребуется дней - " + days );
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            days = days + 2;
            System.out.println("Потребуется дней - " + days);
        } else {
            System.out.println("Слишком далеко");
        }

        // Задача 5

        char monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Сейчас зима!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осень!");
                break;
        }

    }
}