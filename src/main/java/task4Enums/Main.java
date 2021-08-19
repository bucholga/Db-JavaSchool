package task4Enums;

public class Main {
    public static void main(String[] args) {
        HttpService httpService = new HttpService();
        httpService.handleHttpCode(400);
        httpService.handleHttpCode(355);
        httpService.handleHttpCode(505);
        httpService.handleHttpCode(200);
        httpService.handleHttpCode(199);
        httpService.handleHttpCode(600);

    }
}
