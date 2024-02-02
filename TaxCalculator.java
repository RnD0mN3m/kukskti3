package kukskti3;

// 税金の計算機能を実装する
/**
 * クラス税率を指定して税込み価格と税抜き価格を計算します。
 */
public class TaxCalculator implements TaxCalculation {
    private final double taxRate; // 税率

    /**
     * 税率を指定して TaxCalculator クラスの新しいインスタンスを作成します。
     *
     * @param taxRate 税率（小数形式で指定，例: 0.08 は 8% の税率を表します）
     */
    public TaxCalculator(double taxRate) {
        this.taxRate = taxRate;
    }

    /**
     * 税込み価格を計算します。
     *
     * @param value 税抜き価格
     * @return 税込み価格
     */
    @Override
    public double calculateWithTax(double value) {
        return Math.floor(value * (1 + taxRate));
    }

    /**
     * 税抜き価格を計算します。
     *
     * @param value 税込み価格
     * @return 税抜き価格
     */
    @Override
    public double calculateWithoutTax(double value) {
        return Math.floor(value / (1 + taxRate));
    }
}