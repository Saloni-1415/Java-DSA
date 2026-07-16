public class SwitchCase {
    public static void main(String[] args) {
        int number = 2;

        switch (number) {
            case 1 -> System.out.println("Samosa");
            case 2 -> System.out.println("Burger");
            case 3 -> System.out.println("Pizza");
            default -> System.out.println("Chinese");
        }
    }
}
