class Circle extends Shape {
    private Double radius;
    private Double PI;

    public Double getarea() {
        return radius * radius * Math.PI;

    }

    Circle(double radius) {
        super(1);
        this.radius = radius;
    }



}
