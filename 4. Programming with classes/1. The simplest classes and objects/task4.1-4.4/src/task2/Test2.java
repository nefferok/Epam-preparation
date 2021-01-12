package task2;

public class Test2 {
    private String value1;
    private int value2;

    public Test2(String value1, int value2) { // Коснтруктор с входными параметрами
        this.value1 = value1;
        this.value2 = value2;
    }
    public Test2() { // Коснтруктор с входными параметрами
        this.value1 = "Default";
        this.value2 = 0;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "Test2{" + "value1='" + value1 + '\'' +
                ", value2=" + value2 + '}';
    }
}
