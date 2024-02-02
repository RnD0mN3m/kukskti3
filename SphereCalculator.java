package kukskti3;

// 球の計算
class SphereCalculator implements ShapeCalculation {
    private double radius;

    public SphereCalculator(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 0; // 球の場合、面積は意味がありませんので0を返す
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}