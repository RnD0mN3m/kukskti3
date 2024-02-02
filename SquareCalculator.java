package kukskti3;

// 四角形の計算
/**
 * ShapeCalculation インターフェースを実装しています。
 */
class SquareCalculator implements ShapeCalculation {
    private double vertical;
    private double horizontal;

    /**
     * 四角形の計算クラスのコンストラクタ。
     *
     * @param vertical 縦の辺
     * @param horizontal 横の辺
    */
    public SquareCalculator(double vertical, double horizontal) {
        this.vertical = vertical;
        this.horizontal = horizontal;
    }

    /**
     * 四角形の面積の計算します。
     * @return 計算された四角形の計算
    */
    @Override
    public double calculateArea() {
        return vertical * horizontal;
    }

    @Override
    public double calculateVolume() {
        return 0; // 四角形の場合、体積は意味がありませんので0を返す
    }
}