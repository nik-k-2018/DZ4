public class Task4 {
    public static void main(String[] args) {
        int deliveryDistance = 95;

        if (deliveryDistance <= 20) {
            System.out.println("Дней потребуется: 1");
        } else if (deliveryDistance <= 60) {
            System.out.println("Дней потребуется: 2");
        } else if (deliveryDistance <= 100) {
            System.out.println("Дней потребуется: 3");
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }
}