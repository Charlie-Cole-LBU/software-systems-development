class Rectangle extends Shape {
    private int width;
    private int height;

    public int getarea() {
        return width * height;

    }


    Rectangle(int width, int height) {
        super(4);
        this.height = height;
        this.width = width;
    }

}
