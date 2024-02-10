package counter;


public class UpDownCounter {
    private int count;


    public UpDownCounter() {
        count = 0;
    }


    public void increment() {
        if (count < 20) {
            count++;
        } else {
            decrement();
        }
    }

    public void decrement() {
        if (count > 0) {
            count--;
        } else {
            increment();
        }
    }


    public int getCount() {
        return count;
    }
}

// Usage Example for UpDownCounter

