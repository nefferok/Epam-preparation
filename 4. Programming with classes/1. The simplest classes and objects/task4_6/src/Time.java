public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time() {
        this.hour = 23;
        this.minute = 59;
        this.second = 59;
    }

    public void setHour(int newHour) {
        if (newHour < 0 || newHour > 23){
            this.hour = 0;
        } else {
            this.hour = newHour;
        }
    }

    public void setMinute(int newMinute) {
        if (newMinute < 0 || newMinute > 59){
            this.minute = 0;
        } else {
            this.minute = newMinute;
        }
    }

    public void setSecond(int newSecond) {
        if (newSecond < 0 || newSecond > 59){
            this.second= 0;
        } else {
            this.second = newSecond;
        }
    }

    public void setTime (int newHour, int newMinute, int newSecond){
        this.setHour(newHour);
        this.setMinute(newMinute);
        this.setSecond(newSecond);
    }

    @Override
    public String toString() {
        return "Time{" + hour +
                ":" + minute +
                ":" + second +
                '}';
    }
}
