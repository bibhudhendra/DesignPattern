import Client.MainClient;

public class Main {
    public static void main(String[] args) {
        MainClient mainClient = new MainClient();
        Integer area = mainClient.calculateArea(5, 5, 10, 0);
        System.out.println(area);
    }
}
