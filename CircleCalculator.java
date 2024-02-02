package kukskti3;

// 円の面積
/**
 * ShapeCalculation インターフェースを実装しています。
 */
public class CircleCalculator implements ShapeCalculation {
    private double radius;

     /**
     * 円の計算クラスのコンストラクタ。
     *
     * @param radius 円の半径
     */
    public CircleCalculator(double radius) {
        this.radius = radius;
    }

    /**
     * 円の面積の計算します。
     * @return 計算された面積の計算
    */
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculateVolume() {
        return 0; // 円の場合、体積は意味がありませんので0を返す
    }
}