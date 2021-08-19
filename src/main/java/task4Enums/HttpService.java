package task4Enums;

public class HttpService {
    public void handleHttpCode(int httpCode) {
        boolean isFound = false;
        HttpCode[] codes = HttpCode.values();
        for (HttpCode code: codes){
            int codeMin = code.getMin();
            int codeMax = code.getMax();
            if (httpCode >= codeMin && httpCode <= codeMax) {
                System.out.println(httpCode+" is "+ code);
                isFound = true;
                break;
            }
        }
        if (!isFound){
            throw new IllegalStateException(httpCode+ " no such code");
        }
    }
}
