public class Ellipse extends Rectangle {
    private Double SemiMajorAxis;
    private Double SemiMinorAxis;

    public Double getarea() {
        return Math.PI * SemiMajorAxis * SemiMinorAxis;

    }

    Ellipse(Double width, Double height) {
        super(0.0,0.0);
        this.SemiMajorAxis = SemiMajorAxis;
        this.SemiMinorAxis = SemiMinorAxis;
    }

    }
