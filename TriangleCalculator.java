package kukskti3;

// 三角形の計算
class TriangleCalculator implements ShapeCalculation {
    private double base;
    private double height;

    /**
         * 三角形の計算クラスのコンストラクタ。
         *
         * @param vertical 底辺の長さ
         * @param horizontal 三角形の高さ
        */
    public TriangleCalculator(double base, double height) {
        this.base = base;
        this.height = height;
    }

    /**
     * 三角形の面積の計算します。
     * @return 計算された三角形の計算
    */
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public double calculateVolume() {
        return 0; // 三角形の場合、体積は意味がありませんので0を返す
    }
}