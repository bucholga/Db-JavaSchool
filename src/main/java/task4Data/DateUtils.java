package task4Data;

import lombok.Data;

@Data
public class DateUtils {//day-month-year
    public DataClass convertStringToDate(String stringData){
        String[] dates = stringData.split("-");
        System.out.println(dates.length);
        if (dates.length < 3){
            throw new IllegalStateException(stringData+ " incorrect format");
        }
        DataClass dataClass = new DataClass(Integer.parseInt(dates[0]), Integer.parseInt(dates[1]), Integer.parseInt(dates[2]));
        return dataClass;
    }

    public String convertDateToString(DataClass dataClass){
        String day, month;
        if (dataClass.getDay() > 0 && dataClass.getDay() < 10){
            day = "0" + dataClass.getDay();
        }
        else
        {
            day = ""+dataClass.getDay();
        }
        if (dataClass.getMonth() > 0 && dataClass.getMonth() < 10){
            month = "0" + dataClass.getMonth();
        }
        else
        {
            month = ""+dataClass.getMonth();
        }
        return day+"-"+ month + "-" + dataClass.getYear();
    }
}
