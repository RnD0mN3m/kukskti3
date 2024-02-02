package kukskti3;

// 税金の計算機能を実装するクラス
class TaxCalculator implements TaxCalculation {
    private final double taxRate; // 税率

    public TaxCalculator(double taxRate) {
        this.taxRate = taxRate;
    }

    @Override
    public double calculateWithTax(double value) {
        return Math.floor(value * (1 + taxRate));
    }

    @Override
    public double calculateWithoutTax(double value) {
        return Math.floor(value / (1 + taxRate));
    }
}