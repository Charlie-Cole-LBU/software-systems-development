public class Circle extends Shape {
    private Double radius;

    public Double getarea() {
        return radius * radius * Math.PI;
    }

    Circle(Double radius) {
        super(1);
        this.radius = radius;

    }

}
