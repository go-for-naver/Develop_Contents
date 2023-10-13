package sec2;

public enum Week {
    MONDAY("월요일", "月"),
    TUESDAY("화요일", "火"),
    WEDNESDAY("수요일", "水"),
    THURSDAY("목요일", "木"),
    FRIDAY("금요일", "金"),
    SATURDAY("토요일", "土"),
    SUNDAY("일요일", "日");
    public String korean;
    public String chinese;
    Week(String korean, String chinese) {
        this.korean = korean;
        this.chinese = chinese;
    }

}
