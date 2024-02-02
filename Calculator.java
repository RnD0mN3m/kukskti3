package kukskti3;

// 計算機能の基底クラス。
/**
 * このクラスは他の計算機能の実装に基づいています。
 * 各計算機能のクラスはこの基底クラスを拡張して作成されます。
 */
public class Calculator {
    /** 計算結果を保持する変数。 */
    protected double result;

    /**
     * 計算機能の基底クラスのコンストラクタ。
     * 計算結果を初期化します。
     */
    public Calculator() {
        this.result = 0;
    }

    /**
     * 計算結果を取得します。
     * @return 計算結果。
     */
    public double getResult() {
        return result;
    }
}