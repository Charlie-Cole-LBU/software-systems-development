abstract class Shape {

    private int sides;


    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    abstract public Double getarea();

    Shape(int sides) {
        this.sides = sides;
    }


}



