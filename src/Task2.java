public class Task2 {
    public static void main(String[] args) {
        int clientOS = 0; // 0 - iOS, 1 - Android
        int clientDeviceYear = 2015;

        String osType = (clientOS == 0) ? "iOS" : "Android";
        String version = (clientDeviceYear < 2015) ? "облегченную версию" : "версию";

        if (clientOS == 0 || clientOS == 1) {
            System.out.println("Установите " + version + " приложения для " + osType + " по ссылке");
        } else {
            System.out.println("Механическая операционная система");
        }
    }
}