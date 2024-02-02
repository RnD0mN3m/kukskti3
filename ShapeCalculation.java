package kukskti3;

// 図形計算のインターフェース
/**
 * このインターフェースを実装するクラスは、
 * 面積と体積を計算するためのメソッドを提供する必要があります。
 */
interface ShapeCalculation {
    /**
     * 図形の面積を計算します。
     *
     * @return 図形の面積
     */
    double calculateArea();
    /**
     * 図形の体積を計算します。
     *
     * @return 図形の体積
     */
    double calculateVolume();
}