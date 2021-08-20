package task4Data;

import lombok.Data;

@Data
public class DataClass {
    private int year;
    private int month;
    private int day;

    public DataClass(int day, int month, int year){
        if(((day > 0 && day <= 31 && (month % 2 == 1 || month == 8)) || (day > 0 && day <= 30 && (month % 2 == 0 && month != 8 && month!=2))
        ||(day > 0 && day <= 28 && month == 2)) && year > 0){
        this.day = day;
        this.month= month;
        this.year = year;
        }
        else
        {
            throw new IllegalStateException(" Wrong date");
        }

    }
}
