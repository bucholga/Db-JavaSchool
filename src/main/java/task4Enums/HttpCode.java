package task4Enums;

public enum HttpCode {
    INFORMATIONAL(100, 199), SUCCESS(200, 299),REDIRECTION(300, 399), CLIENT_ERROR(400, 499), SERVER_ERROR(500,599)
    ;
    private final int min;
    private final int max;
    HttpCode(int min, int max) {
        this.min = min;
        this.max = max;
    }
    public int getMin () {
        return min;
    }

    public int getMax () {
        return max;
    }
}