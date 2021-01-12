public class CounterRealisation {
    public static void main(String[] args) {
        Counter def = new Counter(); //Default Counter
        System.out.println("Default Values: " + def.toString());

        Counter val = new Counter(20, 40, 37);
        System.out.println("Start values: " + val.toString());

        val.increaseValue();
        System.out.println("Increased value: " + val.getCurrentValue());

        val.setCurrentValue(25);
        System.out.println("New value: " + val.getCurrentValue());

        val.decreaseValue();
        System.out.println("Decreased value: " + val.getCurrentValue());

      /*  val.setCurrentValue(20);
        val.decreaseValue();
        System.out.println("Decreased value: " + val.getCurrentValue());*/



    }
}
