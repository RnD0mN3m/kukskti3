package kukskti3;

// 三角形の計算
class TriangleCalculator implements ShapeCalculation {
    private double base;
    private double height;

    public TriangleCalculator(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public double calculateVolume() {
        return 0; // 三角形の場合、体積は意味がありませんので0を返す
    }
}