package object3Kadai2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 [課題02]で作成したプログラムを用いて、以下のプログラムを作成してください。

　　　　　　　・利用者に「円の面積」、「円の円周」、「球の表面積」、「球の体積」のうち、何を計算させるか選択させる。
　　　　　　　・半径（数値）の入力を受け付け、選択された計算の答えを表示する。
　　　　　　　・利用者が望む限り、何回でも計算できるようにする。

 	　　　　　★利用者の使いやすいようにプログラムをカスタマイズしてみましょう！
 */

public class Main {
	public static void main(String[] args) {
		// scannerｸﾗｽを宣言System.in指定
		Scanner scanner = new Scanner(System.in);

		boolean bool = true;
		String answer = "a";

		// 1~4が入力されるまでループ
		while (bool) {
			// double型で 半径の変数を宣言し初期値を0に設定
			double radius = 0;
			// int型で 選択するメソッドの変数を宣言し初期値を0に設定
			int method = 0;

			// 例外処理にて、入力する半径とメソッドの型をチェック
			try {
				// 入力を促す文章を表示
				System.out.println("半径を数字で入力.ENTERで終了>");
				// 入力された数字をdouble型で初期化していた半径の変数radiusへ代入
				radius = scanner.nextDouble();
				System.out.println("半径は " + radius + " です");

				// 入力した半径での計算メソッドを促す文章を表示
				System.out.println(
						"\n入力した半径で行う計算を、1~4の数字で選択してください。\n 1.円の面積 \n 2.円の円周 \n 3.球の表面積 \n 4.球の体積 \n <ENTERで終了>");
				// 入力された数字をint型で初期化していたメソッドの変数methodへ代入
				method = scanner.nextInt();

				// Circleのインスタンス化
				Circle circle = new Circle(radius);
				// ballのインスタンス化
				Ball ball = new Ball(radius);

				// 入力した半径radiusでの計算メソッドをswitchで条件分岐し入力されたmethodで選択
				switch (method) {
				// 1が選択された場合
				case 1:
					// 円の面積を表示
					System.out.println("半径 " + radius + " の円の面積 : " + circle.area() + "㎡");
					break;// 1が選択された場合、ここで終了
				// 2が選択された場合
				case 2:
					// 円の円周を表示
					System.out.println("半径 " + radius + " の円の円周 : " + circle.circumference() + "cm\n");
					break;// 2が選択された場合、ここで終了
				// 3が選択された場合
				case 3:
					// 球の表面積の表示
					System.out.println("半径 " + radius + " の球の表面積 : " + ball.volume() + "㎡");
					break;// 3が選択された場合、ここで終了
				// 4が選択された場合
				case 4:
					// 球の表面積の表示
					System.out.println("半径 " + radius + " の球の体積 : " + ball.areaOfSurface() + "㎡");
					break;// 4が選択された場合、ここで終了
				// 1~4以外が入力された場合
				default:
					// エラー表示を出力
					System.out.println("1~4で選んでください。");
				}

				// 続けるか終了か選ぶ文章を表示
				System.out.println("終了しますか？[Y=yes,N=no]");

				// 入力された文字を変数answerとして宣言
				answer = scanner.next();

				// answerがyかYかｙかＹだった場合に表示しループ
				if (answer.equals("y") || answer.equals("Y") || answer.equals("ｙ") || answer.equals("Ｙ")) {
					System.out.println("\n\nもう一度、");
					bool = true;
				}
				// answerがNかnかｎかＮだった場合はループ終了
				else if (answer.equals("N") || answer.equals("n") || answer.equals("ｎ") || answer.equals("Ｎ")) {
					System.out.println("終了します。");
					// while終了
					bool = false;
				}
				// yとn以外はErrorで終了
				else {
					System.out.println("Error");
				}
			}
			// radiusとmethodで宣言した型で入力されたかの例外処理
			catch (InputMismatchException error) {
				// error表記を表示
				System.out.println("数字で選んでください。\n\nもう一度、");
				// 入力された文字列をnextメソッドで取得してクリア、処理を終了してループに戻る
				scanner.next();
			}
		}
		// scannerを閉じる
		scanner.close();
	}
}
