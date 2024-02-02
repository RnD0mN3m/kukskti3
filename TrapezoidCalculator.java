package kukskti3;

// 台形の計算
/**
 * ShapeCalculation インターフェースを実装しています。
 */
class TrapezoidCalculator implements ShapeCalculation {
    private double upperBase;
    private double lowerBase;
    private double height;

    /**
     * 台形の計算クラスのコンストラクタ。
     *
     * @param upperBase 上底の長さ
     * @param lowerBase 下底の長さ
     * @param height 台形の高さ
     */
    public TrapezoidCalculator(double upperBase, double lowerBase, double height) {
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    /**
     * 台形の面積の計算します。
     * @return 計算された台形の計算
    */
    @Override
    public double calculateArea() {
        return 0.5 * (upperBase + lowerBase) * height;
    }

    @Override
    public double calculateVolume() {
        return 0; // 台形の場合、体積は意味がありませんので0を返す
    }
}