package kukskti3;

// 万千入力の機能を提供するクラス
class NumberInputCalculator {
    private double value;
     /**
     * 指定された値を万倍にして返します。
     *
     * @param value 入力された数値
     * @return 万倍にされた値
     */
    public double inputInTenThousands(double value) {
        return value * 10000;
    }

    /**
     * 指定された値を千倍にして返します。
     *
     * @param value 入力された数値
     * @return 千倍にされた値
     */
    public double inputInThousands(double value) {
        return (value % 10000) / 1000;
    }

    /**
     * 指定された値の残り部分を返します。
     *
     * @param value 入力された数値
     * @return 残りの値
     */
    public double remaining(double value) {
        return value % 1000;
    }
}