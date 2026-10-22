package practice.src;

public class Driver {
    public static void main(String[] args) {        // java starts running the program, think of this as a starting point
        Calculator calc = new Calculator();        // creates a new calculator in object memory

        calc.useCalc();
        calc.add();
        calc.sub();
        calc.multi();
    }
}

