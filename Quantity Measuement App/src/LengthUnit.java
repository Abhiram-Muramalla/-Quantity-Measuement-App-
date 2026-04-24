public enum LengthUnit {
    FEET(1.0),
    INCH(1.0 / 12.0),
    YARD(3.0),
    CM(1.0 / 30.48);

    private final double factorToBase;

    LengthUnit(double factorToBase) {
        this.factorToBase = factorToBase;
    }

    public double convertToBaseUnit(double value) {
        return value * this.factorToBase;
    }

    public double convertFromBaseUnit(double baseValue) {
        return baseValue / this.factorToBase;
    }
}