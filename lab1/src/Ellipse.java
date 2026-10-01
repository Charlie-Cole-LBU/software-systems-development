public class Ellipse extends Rectangle {
    private Double majorRadius;
    private Double minorRadius;

    public Double getarea() {
        return majorRadius * minorRadius * Math.PI;
    }

    Ellipse(Double majorRadius, Double minorRadius) {
        super(0.0,0.0);
        this.minorRadius = minorRadius;
        this.majorRadius = majorRadius;

    }
}