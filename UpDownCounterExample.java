public class UpDownCounterExample {

    public static void main(String[] args) {
        counter.UpDownCounter counter = new counter.UpDownCounter();

        // Count up to 20
        for (int i = 0; i <= 20; i++) {
            counter.increment();
            System.out.println("Count: " + counter.getCount());
        }

        // Count back down to 0
        for (int i = 0; i <= 20; i++) {
            counter.decrement();
            System.out.println("Count: " + counter.getCount());
        }
    }

}
