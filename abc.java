package kukskti3;
import java.util.Scanner;
public class abc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.println("計算機能を選択してください:");
            System.out.println("1. 平方根機能");
            System.out.println("2. 税金計算機能");
            System.out.println("3. 時間計算機能");
            System.out.println("4. 四捨五入や切り捨て機能");
            System.out.println("5. 万千入力機能");
            System.out.println("6. 四則混合機能");
            System.out.println("7. 図形計算機能");
            System.out.println("8. 単位変換機能");
            System.out.println("end. プログラムを終了");

            command = scanner.nextLine();

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
                    System.out.println("無効なコマンドです。もう一度お試しください。");
            }
        } while (!command.equals("end"));

        scanner.close();
    }

    private static void executeSquareRootFeature(Scanner scanner) {
        SquareRootCalculator squareRootCalculator = new SquareRootCalculator();

        System.out.println("数値を入力してください:");
        try {
            double value = Double.parseDouble(scanner.nextLine());
            squareRootCalculator.calculateSquareRoot(value);
            System.out.println("平方根: " + squareRootCalculator.getResult());
        } catch (NumberFormatException e) {
            System.out.println("エラー: 無効な数値です。");
        }
    }

    private static void executeTaxCalculationFeature(Scanner scanner) {
        try {
            System.out.println("価格を入力してください:");
            double price = Double.parseDouble(scanner.nextLine());

            System.out.println("税率を入力してください（小数形式で）:");
            double taxRate = Double.parseDouble(scanner.nextLine());

            TaxCalculator taxCalculator = new TaxCalculator(taxRate);
            System.out.println("税込み価格: " + taxCalculator.calculateWithTax(price));
            System.out.println("税抜き価格: " + taxCalculator.calculateWithoutTax(price));
        } catch (NumberFormatException e) {
            System.out.println("エラー: 無効な数値です。");
        }
    }

    private static void executeTimeCalculationFeature(Scanner scanner) {
        try {
            System.out.println("秒数を入力してください:");
            int seconds = Integer.parseInt(scanner.nextLine());

            TimeCalculator timeCalculator = new TimeCalculator();
            System.out.println("時間の形式: " + timeCalculator.convertToTimeFormat(seconds));
        } catch (NumberFormatException e) {
            System.out.println("エラー: 無効な数値です。");
        }
    }

    private static void executeRounding1Feature(Scanner scanner) {
        RoundingCalculator roundingCalculator = new RoundingCalculator();

        try {
            System.out.println("切り上げに切り替えますか？ (yes/no):");
            String toggleRoundingMode = scanner.nextLine().toLowerCase();
            if (toggleRoundingMode.equals("yes")) {
                roundingCalculator.toggleRoundingMode();
            }

            System.out.println("数値を入力してください:");
            double value = Double.parseDouble(scanner.nextLine());

            System.out.println("端数処理後の結果: " + roundingCalculator.applyRounding(value));
        } catch (NumberFormatException e) {
            System.out.println("エラー: 無効な数値です。");
        }
    }
    
    private static void executeThousandInputFeature(Scanner scanner) {
        NumberInputCalculator numberInputCalculator = new NumberInputCalculator();

        try{
            System.out.println("数値を入力してください:");
            double value = Double.parseDouble(scanner.nextLine());

            System.out.println("千単位の入力: " + numberInputCalculator.inputInThousands(value));
        } catch (NumberFormatException e) {
            System.out.println("エラー: 無効な数値です。");
        }
    }

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
                        System.out.println("無効な入力です。数値または正しい演算子を入力してください。");
                    }
                }

                System.out.println("最終結果: " + result);
                System.out.print("もう一度四則混合機能を実行しますか？ (yes/no): ");
                command = scanner.nextLine();

            } while (command.equalsIgnoreCase("yes"));

            System.out.println("プログラムを終了します。");
            scanner.close();
        } catch (NumberFormatException e) {
            System.out.println("エラー: 無効な数値です。");
        }
    }

    private static void executeShapeCalculationFeature(Scanner scanner) {
        String shape;
        try{
            do {
                System.out.println("図形を選択してください:");
                System.out.println("1. 三角形");
                System.out.println("2. 四角形");
                System.out.println("3. 円");
                System.out.println("4. 球");
                System.out.println("5. 台形");
                System.out.println("end. 前のメニューに戻る");

                shape = scanner.nextLine();

                if (!shape.equals("end")) {
                    System.out.println("選択した図形のパラメータを入力してください:");

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
                            System.out.println("無効な図形の選択です。もう一度お試しください。");
                            break;
                    }
                }
            } while (!shape.equals("end"));
        } catch (NumberFormatException e) {
            System.out.println("エラー: 無効な数値です。");
        }
    }

    private static void executeUnitConversionFeature(Scanner scanner) {
        try {
            // カテゴリの選択
            System.out.println("変換するカテゴリを選択してください:");
            System.out.println("1. 長さ");
            System.out.println("2. 重さ");
            System.out.println("3. 容積");
            int categoryChoice = Integer.parseInt(scanner.nextLine());


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
                    System.out.println("無効なカテゴリの選択です。");
            }
        } catch (NumberFormatException e) {
            System.out.println("エラー: 無効な数値です。");
        }
    }


    private static void executeTriangleCalculation(Scanner scanner) {
        try{
            System.out.println("底辺の長さを入力してください:");
            double base = Double.parseDouble(scanner.nextLine());

            System.out.println("高さを入力してください:");
            double height = Double.parseDouble(scanner.nextLine());

            TriangleCalculator triangleCalculator = new TriangleCalculator(base, height);
            System.out.println("三角形の面積: " + triangleCalculator.calculateArea());
        } catch (NumberFormatException e) {
            System.out.println("エラー: 無効な数値です。");
        }
    }

    private static void executeSquareCalculation(Scanner scanner) {
        try{
            System.out.println("縦の長さを入力してください:");
            double vertical = Double.parseDouble(scanner.nextLine());

            System.out.println("横の長さを入力してください:");
            double horizontal = Double.parseDouble(scanner.nextLine());

            SquareCalculator squareCalculator = new SquareCalculator(vertical, horizontal);
            System.out.println("四角形の面積: " + squareCalculator.calculateArea());
        } catch (NumberFormatException e) {
            System.out.println("エラー: 無効な数値です。");
        }
    }

    private static void executeCircleCalculation(Scanner scanner) {
        try{
            System.out.println("半径を入力してください:");
            double radius = Double.parseDouble(scanner.nextLine());

            CircleCalculator circleCalculator = new CircleCalculator(radius);
            System.out.println("円の面積: " + circleCalculator.calculateArea());
        } catch (NumberFormatException e) {
            System.out.println("エラー: 無効な数値です。");
        }
    }

    private static void executeSphereCalculation(Scanner scanner) {
        try{
            System.out.println("半径を入力してください:");
            double radius = Double.parseDouble(scanner.nextLine());

            SphereCalculator sphereCalculator = new SphereCalculator(radius);
            System.out.println("球の体積: " + sphereCalculator.calculateVolume());
        } catch (NumberFormatException e) {
            System.out.println("エラー: 無効な数値です。");
        }
    }

    private static void executeTrapezoidCalculation(Scanner scanner) {
        try{
            System.out.println("上底の長さを入力してください:");
            double upperBase = Double.parseDouble(scanner.nextLine());

            System.out.println("下底の長さを入力してください:");
            double lowerBase = Double.parseDouble(scanner.nextLine());

            System.out.println("高さを入力してください:");
            double height = Double.parseDouble(scanner.nextLine());

            TrapezoidCalculator trapezoidCalculator = new TrapezoidCalculator(upperBase, lowerBase, height);
            System.out.println("台形の面積: " + trapezoidCalculator.calculateArea());
        } catch (NumberFormatException e) {
            System.out.println("エラー: 無効な数値です。");
        }
    }
}
