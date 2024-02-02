package kukskti3;

// 四則混合機能を提供するクラス
class MixedOperationCalculator {
    /**
     * 与えられた二つの数値と演算子に基づいて四則演算を実行します。
     *
     * @param num1     最初の数値
     * @param num2     二番目の数値
     * @param operator 演算子（"+", "-", "*", "/"）
     * @return 四則演算の結果
     */
    public double performMixedOperation(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("エラー: ゼロで割り算はできません");
                    return 0;
                }
            default:
                System.out.println("無効な演算子です。");
                return 0;
        }
    }
}