import java.util.Arrays;

public class Stats {
    int[] numbers;
    int count;

    public void addValue(int value) {
        this.numbers[this.count] = value;
        ++this.count;
    }

    public int getCount() {
        return this.count;
    }

    public int getA() {
        int max = this.numbers[0];

        for(int i = 1; i < this.numbers.length; ++i) {
            if (this.numbers[i] > max) {
                max = this.numbers[i];
            }
        }

        return max;
    }

    public int getB() {
        int min = this.numbers[0];

        for(int i = 1; i < this.numbers.length; ++i) {
            if (this.numbers[i] < min) {
                min = this.numbers[i];
            }
        }

        return min;
    }

    public int getTotal() {
        int total = 0;

        for(int i = 0; i < this.numbers.length; ++i) {
            total += this.numbers[i];
        }

        return total;
    }

    public double getAverage() {
        int x = 0;

        for(int i = 0; i < this.numbers.length; ++i) {
            x += this.numbers[i];
        }

        double y = (double)x / (double)this.numbers.length;
        return y;
    }

    public String toString() {
        return Arrays.toString(this.numbers);
    }

    public Stats(int capacity) {
        this.numbers = new int[capacity];
    }
}
