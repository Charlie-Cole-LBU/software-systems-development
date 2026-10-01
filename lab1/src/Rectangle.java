class Rectangle extends Shape {
    private Double width;
    private Double height;

    public Double getarea() {
        return width * height;

    }


    Rectangle(Double width, Double height) {
        super(4);
        this.height = height;
        this.width = width;
    }

}
