package kukskti3;

// 台形の計算
class TrapezoidCalculator implements ShapeCalculation {
    private double upperBase;
    private double lowerBase;
    private double height;

    public TrapezoidCalculator(double upperBase, double lowerBase, double height) {
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (upperBase + lowerBase) * height;
    }

    @Override
    public double calculateVolume() {
        return 0; // 台形の場合、体積は意味がありませんので0を返す
    }
}