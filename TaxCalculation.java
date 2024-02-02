package kukskti3;
// 税金の計算機能を提供するインターフェース
/**
 * このインターフェースを実装するクラスは、
 * 税込みおよび税抜き価格を計算するためのメソッドを提供する必要があります。
 */
public interface TaxCalculation {
    /**
     * 指定された価格に対する税込み価格を計算します。
     *
     * @param value 計算対象の価格
     * @return 計算結果の税込み価格
     */
    double calculateWithTax(double value);

    /**
     * 指定された価格に対する税抜き価格を計算します。
     *
     * @param value 計算対象の価格
     * @return 計算結果の税抜き価格
     */
    double calculateWithoutTax(double value);
}