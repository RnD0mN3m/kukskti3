package kukskti3;

// 四角形の計算
class SquareCalculator implements ShapeCalculation {
    private double vertical;
    private double horizontal;

    public SquareCalculator(double vertical, double horizontal) {
        this.vertical = vertical;
        this.horizontal = horizontal;
    }

    @Override
    public double calculateArea() {
        return vertical * horizontal;
    }

    @Override
    public double calculateVolume() {
        return 0; // 四角形の場合、体積は意味がありませんので0を返す
    }
}