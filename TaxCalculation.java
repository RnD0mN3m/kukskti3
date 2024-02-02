package kukskti3;
// 税金の計算機能を提供するインターフェース
interface TaxCalculation {
    double calculateWithTax(double value);
    double calculateWithoutTax(double value);
}