package TestEnum;

public class TestEnum {
    public  enum WeekDay {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        
    }
    public  enum WeekDay1 {
        MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7), SUNDAY(8);
        private int value;
        WeekDay1(int value) {
            this.value = value;
        }
        public static WeekDay1 getWeekDayByValue(int value) {
            for (WeekDay1 d : WeekDay1.values()) {
                if (d.value == value) {
                    return d;
                }
            }
            return null;
        }
    }
}
