package kukskti3;

import java.util.Scanner;

public class UnitConversionCalculator {

    // 長さの変換
    public static void convertLength(double value) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("変換元の長さの単位を選択してください:");
        System.out.println("1. メートル");
        System.out.println("2. キロメートル");
        System.out.println("3. センチメートル");
        System.out.println("4. ミリメートル");
        int sourceUnitChoice = scanner.nextInt();

        System.out.println("変換先の長さの単位を選択してください:");
        System.out.println("1. メートル");
        System.out.println("2. キロメートル");
        System.out.println("3. センチメートル");
        System.out.println("4. ミリメートル");
        int targetUnitChoice = scanner.nextInt();

        double result = 0.0;

        // 長さの単位変換
        switch (sourceUnitChoice) {
            case 1: // メートル
                switch (targetUnitChoice) {
                    case 1: // メートル
                        result = value;
                        break;
                    case 2: // キロメートル
                        result = value / 1000.0;
                        break;
                    case 3: // センチメートル
                        result = value * 100.0;
                        break;
                    case 4: // ミリメートル
                        result = value * 1000.0;
                        break;
                    default:
                        System.out.println("無効な長さの単位変換です。");
                        return;
                }
                break;
            // 他の変換元の単位に対する処理を追加
            default:
                System.out.println("無効な長さの単位変換です。");
                return;
        }

        System.out.println("変換後の値: " + result + " " + getLengthUnitName(targetUnitChoice));
    }

    // 重さの変換
    public static void convertWeight(double value) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("変換元の重さの単位を選択してください:");
        System.out.println("1. キログラム");
        System.out.println("2. トン");
        System.out.println("3. グラム");
        System.out.println("4. ミリグラム");
        int sourceUnitChoice = scanner.nextInt();

        System.out.println("変換先の重さの単位を選択してください:");
        System.out.println("1. キログラム");
        System.out.println("2. トン");
        System.out.println("3. グラム");
        System.out.println("4. ミリグラム");
        int targetUnitChoice = scanner.nextInt();

        double result = 0.0;

        // 重さの単位変換
        switch (sourceUnitChoice) {
            case 1: // キログラム
                switch (targetUnitChoice) {
                    case 1: // キログラム
                        result = value;
                        break;
                    case 2: // トン
                        result = value / 1000.0;
                        break;
                    case 3: // グラム
                        result = value * 1000.0;
                        break;
                    case 4: // ミリグラム
                        result = value * 1000000.0;
                        break;
                    default:
                        System.out.println("無効な重さの単位変換です。");
                        return;
                }
                break;
            // 他の変換元の単位に対する処理を追加
            default:
                System.out.println("無効な重さの単位変換です。");
                return;
        }

        System.out.println("変換後の値: " + result + " " + getWeightUnitName(targetUnitChoice));
    }

    // 容積の変換
    public static void convertVolume(double value) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("変換元の容積の単位を選択してください:");
        System.out.println("1. リットル");
        System.out.println("2. キロリットル");
        System.out.println("3. デシリットル");
        System.out.println("4. ミリリットル");
        int sourceUnitChoice = scanner.nextInt();

        System.out.println("変換先の容積の単位を選択してください:");
        System.out.println("1. リットル");
        System.out.println("2. キロリットル");
        System.out.println("3. デシリットル");
        System.out.println("4. ミリリットル");
        int targetUnitChoice = scanner.nextInt();

        double result = 0.0;

        // 容積の単位変換
        switch (sourceUnitChoice) {
            case 1: // リットル
                switch (targetUnitChoice) {
                    case 1: // リットル
                        result = value;
                        break;
                    case 2: // キロリットル
                        result = value / 1000.0;
                        break;
                    case 3: // デシリットル
                        result = value * 10.0;
                        break;
                    case 4: // ミリリットル
                        result = value * 1000.0;
                        break;
                    default:
                        System.out.println("無効な容積の単位変換です。");
                        return;
                }
                break;
            // 他の変換元の単位に対する処理を追加
            default:
                System.out.println("無効な容積の単位変換です。");
                return;
        }

        System.out.println("変換後の値: " + result + " " + getVolumeUnitName(targetUnitChoice));
    }

    // 他の変換カテゴリ（長さ、重さ）に対する変換メソッドを追加する

    // 長さの単位名を取得
    public static String getLengthUnitName(int unitChoice) {
        switch (unitChoice) {
            case 1:
                return "メートル";
            case 2:
                return "キロメートル";
            case 3:
                return "センチメートル";
            case 4:
                return "ミリメートル";
            default:
                return "不明な単位";
        }
    }

    // 重さの単位名を取得
    public static String getWeightUnitName(int unitChoice) {
        switch (unitChoice) {
            case 1:
                return "キログラム";
            case 2:
                return "トン";
            case 3:
                return "グラム";
            case 4:
                return "ミリグラム";
            default:
                return "不明な単位";
        }
    }

    // 容積の単位名を取得
    public static String getVolumeUnitName(int unitChoice) {
        switch (unitChoice) {
            case 1:
                return "リットル";
            case 2:
                return "キロリットル";
            case 3:
                return "デシリットル";
            case 4:
                return "ミリリットル";
            default:
                return "不明な単位";
        }
    }
}
