package CHALLANGES.lecture_code.kgcoding.challange97;

public enum Day {
    sunday(false),
    monday(true),
    tuesday(true),
    wednesday(true),
    thursday(true),
    friday(true),
    saturday(false);

    private final boolean isweekday;

    Day(boolean isweekday) {
        this.isweekday = isweekday;
    }
    public String gettype(){
        return isweekday ? "weekday":"weekend";
    }
}
