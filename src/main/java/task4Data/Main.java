package task4Data;

public class Main {
    public static void main(String[] args) {
        DateUtils dateUtils = new DateUtils();
        dateUtils.convertStringToDate("19-08-2021");
        System.out.println(dateUtils.convertStringToDate("19-08-2021"));
        DataClass dataClass = new DataClass(20, 8, 2021);
        System.out.println(dateUtils.convertDateToString(dataClass));
        DataClass dataClass1 = new DataClass(32, 8, 2021);
    }


}
