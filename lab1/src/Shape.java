abstract class Shape {


    private int sides;


    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    abstract public int getarea();
    Shape(int sides) {
        this.sides = sides;
    }




}