public class Counter {
    private int minValue;
    private int maxValue;
    private int currentValue;

    public Counter(int minValue, int maxValue, int currentValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.currentValue = currentValue;
    }

    public Counter() {          //Default value
        this.minValue = 10;
        this.maxValue = 99;
        this.currentValue = minValue;
    }

    public void increaseValue(){
        if (currentValue==maxValue){
            throw new ArrayIndexOutOfBoundsException(currentValue+1);
        } else {
            currentValue++;
        }
    }

    public void decreaseValue(){
        if (currentValue==minValue){
            throw new ArrayIndexOutOfBoundsException(currentValue-1);
        } else {
            currentValue--;
        }
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int newValue) {
        if (newValue > maxValue || newValue < minValue){
            throw new ArrayIndexOutOfBoundsException(newValue);
        }
        else{
            this.currentValue = newValue;
        }
    }

    @Override
    public String toString() {
        return "Counter{" +
                "minValue=" + minValue +
                ", maxValue=" + maxValue +
                ", currentValue=" + currentValue +
                '}';
    }
}
