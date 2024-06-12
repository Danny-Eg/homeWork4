public class Main {
    public static void main(String[] args) {
        System.out.println("Задание1");

        int clientOS = 2;
        if (clientOS == 0) {
            System.out.println("«Установите версию приложения для iOS по ссылке»");
        } else if (clientOS == 1) {
            System.out.println("«Установите версию приложения для Android по ссылке»");
        } else {
            System.out.println("Нет результата");
        }

        System.out.println("Задание2");

        int clientOS1 = 1;
        int year1 = 2015;
        int clientOS1Year = 2016;
        if (clientOS1 == 0 && clientOS1Year < year1) {
            System.out.println("«Установите облегченную версию приложения для iOS по ссылке».");
        } else if (clientOS1 == 0 && clientOS1Year >= year1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS1 == 1 && clientOS1Year < year1) {
            System.out.println("«Установите облегченную версию приложения для Android по ссылке».");
        } else if (clientOS1 == 1 && clientOS1Year >= year1) {
            System.out.println("«Установите версию приложения для Android по ссылке»");
        } else {
            System.out.println("Нет результата");
        }

        System.out.println("Задание3");

        int year = 2401;
        if (year >= 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println("« " + year + " год является високосным»");
        } else {
            System.out.println(" « " + year + " год не является високосным»");
        }

        System.out.println("Задание4");

        int deliveryDistance = 100;
        int deliveryDay = 1;
        if (deliveryDistance <= 20) {
            try {
                System.out.println("Потребуется дней: " + deliveryDay + " ");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else if (deliveryDistance <= 60) {
            deliveryDay++;
            System.out.println("Потребуется дней: " + deliveryDay + " ");
        } else if (deliveryDistance <= 100) {
            deliveryDay += 2;
            System.out.println("Потребуется дней: " + deliveryDay + " ");
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println("Задание 5");

        int monthNumber = 4;
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Принадлежит к сезону зима");
                break;
            case 3, 4, 5:
                System.out.println("Принадлежит к сезону весна");
                break;
            case 6, 7, 8:
                System.out.println("Принадлежит к сезону лета");
                break;
            case 9, 10, 11:
                System.out.println("Принадлежит к сезону осень");
                break;
            default:
                System.out.println("Не найдено");

        }

    }
}