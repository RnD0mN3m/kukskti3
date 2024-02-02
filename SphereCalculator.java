package kukskti3;

// 球の計算
/**
 * ShapeCalculation インターフェースを実装しています。
 */
class SphereCalculator implements ShapeCalculation {
    private double radius;

    /**
     * 球の計算クラスのコンストラクタ。
     *
     * @param radius 球の半径
     */
    public SphereCalculator(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 0; // 球の場合、面積は意味がありませんので0を返す
    }

    /**
     * 球の体積の計算します。
     * @return 計算された体積の計算
    */
    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}