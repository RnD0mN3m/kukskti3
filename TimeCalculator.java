package kukskti3;

// 時間の計算機能を提供するクラス
class TimeCalculator {
    public String convertToTimeFormat(int seconds) {
        int hours = seconds / 3600; // 時間
        int minutes = (seconds % 3600) / 60; // 分間
        int remainingSeconds = seconds % 60; // 秒間

        return String.format("%02d:%02d:%02d", hours, minutes, remainingSeconds);
    }
}