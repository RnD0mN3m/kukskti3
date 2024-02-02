package kukskti3;

// 円の計算
class CircleCalculator implements ShapeCalculation {
    private double radius;

    public CircleCalculator(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculateVolume() {
        return 0; // 円の場合、体積は意味がありませんので0を返す
    }
}