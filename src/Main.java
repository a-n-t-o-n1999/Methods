public class Main {
    public static void checkingLeapYear(int year) {
        if (year < 1584) {
            System.out.println("В " + year + " году еще не знали про високосные года");
        } else if (year % 4 != 0) {
            System.out.println(year + " не високосный год");
        } else if (year % 400 == 0) {
            System.out.println(year + " високосный год");
        } else if (year % 100 == 0) {
            System.out.println(year + " не високосный год");
        } else {
            System.out.println(year + " високосный год");
        }
    }

    public static void assistantInstaller(boolean clientOS, int clientDeviceYear) {
        if (clientOS && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (!clientOS && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (!clientOS && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }

    public static int assistantDelivery(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance < 100) {
            return 3;
        } else {
            System.out.println("Доставки нет");
            return -1;
        }
    }

    public static void main(String[] args) {
        checkingLeapYear(2021);
        assistantInstaller(true, 2016);
        System.out.println(assistantDelivery(75));
    }
}
