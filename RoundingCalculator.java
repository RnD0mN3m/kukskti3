package kukskti3;

// 四捨五入や切り捨てのモードを切り替える機能を提供するクラス
class RoundingCalculator {
    private boolean roundUp; // 切り上げフラグ

    public void toggleRoundingMode() {
        roundUp = !roundUp;
    }

    public double applyRounding(double value) {
        if (roundUp) {
            return Math.ceil(value); // 切り上げ
        } else {
            return Math.floor(value); // 切り捨て
        }
    }
}