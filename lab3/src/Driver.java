//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Random;

/**
 * The type Driver.
 */
public class Driver {
    /**
     * The entry point of application, used to execute the attributes which are set in the Stats.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        final int VALUES = 10;

        Stats stats = new Stats(VALUES);

        Random random = new Random();

        for (int i = 0; i < VALUES; i++) {
            stats.addValue(random.nextInt(100));
        }

        System.out.println("Numbers stored : ");

        System.out.println(stats);

        System.out.println("Average = " + stats.getAverage());

        System.out.println("Count = " + stats.getCount());

        System.out.println("Total = " + stats.getTotal());

        System.out.println("Minimum value = " + stats.getB());

        System.out.println("Maximum value = " + stats.getA());
    }
}
