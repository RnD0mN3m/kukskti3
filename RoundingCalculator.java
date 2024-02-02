package kukskti3;

// 四捨五入や切り捨てのモードを切り替える機能を提供するクラス
class RoundingCalculator {
    private boolean roundUp; // 切り上げフラグ

    public void toggleRoundingMode() {
        roundUp = !roundUp;
    }

    /**
     * 指定された値を切り上げ・切り捨てにして返します。
     *
     * @param value 入力された数値
     * @return 切り上げ・切り捨てにされた値
     */
    public double applyRounding(double value) {
        if (roundUp) {
            return Math.ceil(value); // 切り上げ
        } else {
            return Math.floor(value); // 切り捨て
        }
    }
}