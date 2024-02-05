package kukskti3;
import java.util.Scanner;
/**
 * 計算機能を提供するクラス
 */
class Kukskti3 {
    /**
     * メインメソッド
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;

        // メニューの表示とユーザーの入力を繰り返す
        do {
            System.out.println("----- ↓これから先は半角で入力してください。↓ -----");
            System.out.print("1. 平方根機能　　");
            System.out.println("2. 税金計算機能");
            System.out.print("3. 時間計算機能　");
            System.out.println("4. 四捨五入や切り捨て機能");
            System.out.print("5. 万千入力機能　");
            System.out.println("6. 四則混合機能");
            System.out.print("7. 図形計算機能　");
            System.out.println("8. 単位変換機能");
            System.out.println("end. プログラムを終了");
            System.out.print("計算機能を選択してください:");
            
            command = scanner.nextLine(); // メニューの表示
            
            System.out.println();

            // 入力に対する処理の分岐
            switch (command) {
                case "1":
                    executeSquareRootFeature(scanner);
                    break;
                case "2":
                    executeTaxCalculationFeature(scanner);
                    break;
                case "3":
                    executeTimeCalculationFeature(scanner);
                    break;
                case "4":
                    executeRounding1Feature(scanner);
                    break;
                case "5":
                    executeThousandInputFeature(scanner);
                    break;
                case "6":
                    executeMixedOperationFeature(scanner);
                    break;
                case "7":
                    executeShapeCalculationFeature(scanner);
                    break;
                case "8":
                    executeUnitConversionFeature(scanner);
                    break;
                case "end":
                    System.out.println("プログラムを終了します。");
                    break;
                default:
                    System.out.println("エラー：無効なコマンドです。もう一度お試しください。\n");
            }
        } while (!command.equals("end"));

        scanner.close();
    }

    /**
    * 平方根機能を実行し、ユーザーに数値の入力を求めます。。
    *
    * @param scanner ユーザー入力に使用される Scanner オブジェクト。
    */
    private static void executeSquareRootFeature(Scanner scanner) {
        SquareRootCalculator squareRootCalculator = new SquareRootCalculator();

        System.out.print("数値を入力してください:");
        try {
            double value = Double.parseDouble(scanner.nextLine());
            squareRootCalculator.calculateSquareRoot(value);
            System.out.println("平方根: " + squareRootCalculator.getResult());
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("エラー: 無効な数値です。\n");
        }
    }

    /**
     * 税金計算機能を実行するメソッド
     * @param scanner 入力を受け取るための Scanner オブジェクト
     */
    private static void executeTaxCalculationFeature(Scanner scanner) {
        try {
            System.out.print("価格を入力してください:");
            double price = Double.parseDouble(scanner.nextLine());

            System.out.print("税率を入力してください（小数形式で）:");
            double taxRate = Double.parseDouble(scanner.nextLine());

            TaxCalculator taxCalculator = new TaxCalculator(taxRate);
            System.out.println("税込み価格: " + taxCalculator.calculateWithTax(price));
            System.out.println("税抜き価格: " + taxCalculator.calculateWithoutTax(price));
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("エラー: 無効な数値です。\n");
        }
    }

    /**
     * 時間計算機能を実行するメソッド
     * @param scanner 入力を受け取るための Scanner オブジェクト
     */
    private static void executeTimeCalculationFeature(Scanner scanner) {
        try {
            System.out.print("秒数を入力してください:");
            int seconds = Integer.parseInt(scanner.nextLine());

            TimeCalculator timeCalculator = new TimeCalculator();
            System.out.println("時間の形式: " + timeCalculator.convertToTimeFormat(seconds));
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("エラー: 無効な数値です。\n");
        }
    }

    /**
     * 四捨五入や切り捨て機能を実行するメソッド
     * @param scanner 入力を受け取るための Scanner オブジェクト
     */
    private static void executeRounding1Feature(Scanner scanner) {
        RoundingCalculator roundingCalculator = new RoundingCalculator();

        try {
            System.out.print("切り上げに切り替えますか？ (yes/no):");
            String toggleRoundingMode = scanner.nextLine().toLowerCase();
            if (toggleRoundingMode.equals("yes")) {
                roundingCalculator.toggleRoundingMode();
            }

            System.out.print("数値を入力してください:");
            double value = Double.parseDouble(scanner.nextLine());

            System.out.println("端数処理後の結果: " + roundingCalculator.applyRounding(value));
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("エラー: 無効な数値です。\n");
        }
    }
    
    /**
     *万千入力機能を実行するメソッド
     * @param scanner 入力を受け取るための Scanner オブジェクト
     */
    private static void executeThousandInputFeature(Scanner scanner) {
        NumberInputCalculator numberInputCalculator = new NumberInputCalculator();

        try{
            System.out.print("数値を入力してください:");
            double value = Double.parseDouble(scanner.nextLine());

            // 入力を万、千、および残りの部分に分解する
            double tenThousands = numberInputCalculator.inputInTenThousands(value);
            double thousands = numberInputCalculator.inputInThousands(value);
            double remaining = numberInputCalculator.remaining(value);

            System.out.println("万の位: " + tenThousands);
            System.out.println("千の位: " + thousands);
            System.out.println("その他: " + remaining);
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("エラー: 無効な数値です。\n");
        }
    }

    /**
     *  四則混合機能を実行するメソッド
     * @param scanner 入力を受け取るための Scanner オブジェクト
     */
    private static void executeMixedOperationFeature(Scanner scanner) {
        // MixedOperationCalculator mixedOperationCalculator = new MixedOperationCalculator();
        String command;

        try{
            do {
                System.out.println("四則混合機能を実行します。数値と演算子を交互に入力してください。");
                System.out.println("例: 3 + 5 * 2 / 4 =");

                double result = 0;
                boolean isFirstInput = true;

                while (true) {
                    System.out.print("入力: ");
                    String input = scanner.nextLine();

                    if (input.equals("=")) {
                        break;
                    }

                    try {
                        if (isFirstInput) {
                            // 最初の入力はresultにセット
                            result = Double.parseDouble(input);
                            isFirstInput = false;
                        } else {
                            // 演算子と数値を取得し、計算を実行
                            String operator = input;
                            double operand = Double.parseDouble(scanner.nextLine());

                            MixedOperationCalculator mixedOperationCalculator = new MixedOperationCalculator();
                            result = mixedOperationCalculator.performMixedOperation(result, operand, operator);
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("エラー：無効な入力です。数値または正しい演算子を入力してください。\n");
                    }
                }

                System.out.println("最終結果: " + result);
                System.out.print("もう一度四則混合機能を実行しますか？ (yes/no): ");
                command = scanner.nextLine();

            } while (command.equalsIgnoreCase("yes"));

            System.out.println("プログラムを終了します。");
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("エラー: 無効な数値です。\n");
        }
    }

    /**
     * 図形計算機能を実行するメソッド
     * @param scanner 入力を受け取るための Scanner オブジェクト
     */
    private static void executeShapeCalculationFeature(Scanner scanner) {
        String shape;
        try{
            // メニューの表示とユーザーの入力を繰り返す
            do {
                System.out.print("1. 三角形");
                System.out.print("2. 四角形");
                System.out.println("3. 円");
                System.out.print("4. 球　　");
                System.out.println("5. 台形　");
                System.out.println("end. 前のメニューに戻る");
                System.out.print("図形を選択してください:");

                shape = scanner.nextLine();// メニューの表示

                System.out.println();

                if (!shape.equals("end")) {
                    System.out.println("選択した図形のパラメータを入力してください:");

                    // 入力に対する処理の分岐
                    switch (shape) {
                        case "1":
                            executeTriangleCalculation(scanner);
                            break;
                        case "2":
                            executeSquareCalculation(scanner);
                            break;
                        case "3":
                            executeCircleCalculation(scanner);
                            break;
                        case "4":
                            executeSphereCalculation(scanner);
                            break;
                        case "5":
                            executeTrapezoidCalculation(scanner);
                            break;
                        default:
                            System.out.println("エラー：無効な図形の選択です。もう一度お試しください。\n");
                            break;
                    }
                }
            } while (!shape.equals("end"));
        } catch (NumberFormatException e) {
            System.out.println("エラー: 無効な数値です。\n");
        }
    }

    /**
     * 単位変換機能を実行するメソッド
     * @param scanner 入力を受け取るための Scanner オブジェクト
     */
    private static void executeUnitConversionFeature(Scanner scanner) {
        try {
            // カテゴリの選択
            System.out.println("1. 長さ");
            System.out.println("2. 重さ");
            System.out.println("3. 容積");
            
            System.out.print("変換するカテゴリを選択してください:");
            int categoryChoice = Integer.parseInt(scanner.nextLine());

            System.out.println();

            // 値の入力
            System.out.print("変換する値を入力してください: ");
            double valueToConvert = Double.parseDouble(scanner.nextLine());

            // 選択したカテゴリに基づく変換
            switch (categoryChoice) {
                case 1:
                    UnitConversionCalculator.convertLength(valueToConvert);
                    break;
                case 2:
                    UnitConversionCalculator.convertWeight(valueToConvert);
                    break;
                case 3:
                    UnitConversionCalculator.convertVolume(valueToConvert);
                    break;
                default:
                    System.out.println("エラー：無効なカテゴリの選択です。もう一度お試しください。\n");
            }
        } catch (NumberFormatException e) {
            System.out.println("エラー: 無効な数値です。\n");
        }
    }

    /**
     * 三角形の面積を計算するメソッド
     * @param scanner 入力を受け取るための Scanner オブジェクト
     */
    private static void executeTriangleCalculation(Scanner scanner) {
        try{
            System.out.print("底辺の長さを入力してください:");
            double base = Double.parseDouble(scanner.nextLine());

            System.out.print("高さを入力してください:");
            double height = Double.parseDouble(scanner.nextLine());

            TriangleCalculator triangleCalculator = new TriangleCalculator(base, height);
            System.out.printf("三角形の面積: %.2f\n" , triangleCalculator.calculateArea());
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("エラー: 無効な数値です。\n");
        }
    }

    /**
     * 四角形の面積を計算するメソッド
     * @param scanner 入力を受け取るための Scanner オブジェクト
     */
    private static void executeSquareCalculation(Scanner scanner) {
        try{
            System.out.print("縦の辺の長さを入力してください:");
            double vertical = Double.parseDouble(scanner.nextLine());

            System.out.print("横の辺の長さを入力してください:");
            double horizontal = Double.parseDouble(scanner.nextLine());

            SquareCalculator squareCalculator = new SquareCalculator(vertical, horizontal);
            System.out.printf("四角形の面積:%.2f\n" , squareCalculator.calculateArea());
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("エラー: 無効な数値です。\n");
        }
    }

    /**
     * 円の面積を計算するメソッド
     * @param scanner 入力を受け取るための Scanner オブジェクト
     */
    private static void executeCircleCalculation(Scanner scanner) {
        try{
            System.out.print("半径を入力してください:");
            double radius = Double.parseDouble(scanner.nextLine());

            CircleCalculator circleCalculator = new CircleCalculator(radius);
            System.out.printf("円の面積: %.2f\n" , circleCalculator.calculateArea());
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("エラー: 無効な数値です。\n");
        }
    }

    /**
     * 球の体積を計算するメソッド
     * @param scanner 入力を受け取るための Scanner オブジェクト
     */
    private static void executeSphereCalculation(Scanner scanner) {
        try{
            System.out.print("半径を入力してください:");
            double radius = Double.parseDouble(scanner.nextLine());

            SphereCalculator sphereCalculator = new SphereCalculator(radius);
            System.out.printf("球の体積: %.2f\n" , sphereCalculator.calculateVolume());
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("エラー: 無効な数値です。\n");
        }
    }

    /**
     * 台形の面積を計算するメソッド
     * @param scanner 入力を受け取るための Scanner オブジェクト
     */
    private static void executeTrapezoidCalculation(Scanner scanner) {
        try{
            System.out.print("上底の長さを入力してください:");
            double upperBase = Double.parseDouble(scanner.nextLine());

            System.out.print("下底の長さを入力してください:");
            double lowerBase = Double.parseDouble(scanner.nextLine());

            System.out.print("高さを入力してください:");
            double height = Double.parseDouble(scanner.nextLine());

            TrapezoidCalculator trapezoidCalculator = new TrapezoidCalculator(upperBase, lowerBase, height);
            System.out.printf("台形の面積: %.2f\n" , trapezoidCalculator.calculateArea());
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("エラー: 無効な数値です。\n");
        }
    }
}
