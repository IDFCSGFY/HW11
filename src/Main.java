import java.time.LocalDate;

public class Main {
    public static void checkForLeapYear(int year) {
        if (year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void recommendCompatibleVersion(int OS, int year) {
        if (OS == 0 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (OS == 0 && year >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (OS == 1 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int calculateDeliverySpan(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance > 20 && distance <= 60) {
            return 2;
        } else if (distance > 60 && distance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        //1
        System.out.println("\n#1\n");
        int currentYear = LocalDate.now().getYear();
        checkForLeapYear(currentYear);

        //2
        System.out.println("\n#2\n");
        int clientDeviceYear = 2015;
        int clientOS = 1;
        recommendCompatibleVersion(clientOS, clientDeviceYear);

        //3
        System.out.println("\n#3\n");
        int deliveryDistance = 95;
        int deliverySpan = calculateDeliverySpan(deliveryDistance);
        if (deliverySpan == -1) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliverySpan);
        }
    }
}
