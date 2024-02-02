package kukskti3;

// 万千入力の機能を提供するクラス
class NumberInputCalculator {
     private double value;
    /**
     * 指定された値を千倍にして返します。
     *
     * @param value 入力された数値
     * @return 千倍にされた値
     */
    public double inputInThousands(double value) {
        return value * 1000;
    }
}