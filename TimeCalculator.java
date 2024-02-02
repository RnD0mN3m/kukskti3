package kukskti3;

// 時間の計算機能を提供するクラス
/**
 * このクラスは、秒数を受け取り、それを時分秒の形式に変換します。
 * 
 * 使用例:
 * TimeCalculator timeCalculator = new TimeCalculator();
 * String timeFormat = timeCalculator.convertToTimeFormat(3665);
 * System.out.println("時間の形式: " + timeFormat); // 出力: 01:01:05
 * 
 * 時間の計算機能以外の操作に関するメソッドは含まれていません。
 * 
 * @since 1.0
 */
public class TimeCalculator {
    /**
     * 指定された秒数を時分秒の形式に変換します。
     * 
     * @param seconds 変換する秒数
     * @return 時分秒の形式の文字列
     */

    public String convertToTimeFormat(int seconds) {
        int hours = seconds / 3600; // 時間
        int minutes = (seconds % 3600) / 60; // 分間
        int remainingSeconds = seconds % 60; // 秒間

        return String.format("%02d:%02d:%02d", hours, minutes, remainingSeconds);
    }
}