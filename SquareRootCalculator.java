package kukskti3;
// 平方根の機能を提供するクラス
/**
 * {@code Calculator} クラスを継承しています。
 */
public class SquareRootCalculator extends Calculator {
    
    /**
     * 計算対象の値。
     */
    private double value;
        // メソッドにアクセス修飾子を追加

    /**
     * 指定された値の平方根を計算し、結果を親クラスの {@code result} フィールドに設定します。
     * @param value 平方根を計算する対象の値
     */
    public void calculateSquareRoot(double value) {
        // 親クラスのresultを使っているように見えるので、valueの設定は不要かもしれませんが、
        // 一応コメントアウトして残しておきます。
        // this.value = value;
        result = Math.sqrt(value);
        
    }
}
