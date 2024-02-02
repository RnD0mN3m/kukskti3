package kukskti3;

// 四則混合機能を提供するクラス
class MixedOperationCalculator {
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