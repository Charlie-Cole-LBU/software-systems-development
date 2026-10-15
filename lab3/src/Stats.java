import java.util.Arrays;


/**
 * The type Stats, this class contains the tools which will be used on the array,
 * here these attributes are not used in this class only set.
 */
public class Stats {
    /**
     * Declares numbers as an array of integer so that integer handling methods can be used on it.
     */
    int[] numbers;
    /**
     * The Count.
     */
    int count;


    /**
     * Adds the values.
     *
     * @param value is the value to be added
     */
    public void addValue(int value) {
        numbers[count] = value;
        count++;
    }

    /**
     * Gets count.
     *
     * @return count, which is the number of integers in the array
     */
    public int getCount() {
        return count;
    }

    /**
     * Gets the maximum value.
     *
     * @return the a
     */
    public int getA() {

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) max = numbers[i];
        }

        return max;
    }

    /**
     * Gets the minimum value.
     *
     * @return the b
     */
    public int getB() {
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < min)
                min = numbers[i];
        }

        return min;
    }

    /**
     * Gets total of all the values in the array.
     *
     * @return the total
     */
    public int getTotal() {

        int total = 0;

        // total all values within the array
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        return total;
    }

    /**
     * Gets average value per array of integers by dividing the total of the numbers by the length.
     *
     * @return the average
     */
    public double getAverage() {

        int x = 0;
        for (int i = 0; i < numbers.length; i++) {
            x += numbers[i];
        }

        double y = x / (double) numbers.length;

        return y;
    }

    @Override
    public String toString() {
        return Arrays.toString(numbers);
    }


    /**
     * Instantiates a new Stats.
     *
     * @param capacity the capacity
     */
    public Stats(int capacity) {
        numbers = new int[capacity];
    }


}