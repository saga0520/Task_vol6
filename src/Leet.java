import java.util.Scanner;

/**
 * Leetの置き換えをするクラス
 */
public class Leet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		// inputlineAray配列を作る
		String[] lineAray = new String[line.length()];
		System.out.println( );

		// 標準入力lineの長さは100文字以内とし、lineの長さ分回す
		if (1 > line.length() || line.length() > 100) {
			System.out.print("標準入力の文字列の長さは1文字以上100文字以下です");
		}

		//Leet変換メソッドを呼び出す
		LeetConversion(line,lineAray);
	}

	//Leet変換用のメソッド
	public static void LeetConversion(String inputLine,String[] inputlineAray) {
		for (int i = 0; i < inputLine.length(); i++) {

			// inputlineの先頭から1文字ずつString型にして取り出す
			inputlineAray[i] = String.valueOf(inputLine.charAt(i));

			//置き換える規則と比較し、条件と一致したら変換する
			if(inputlineAray[i].equals("A")) {
				inputlineAray[i] = "4";
			}else if(inputlineAray[i].equals("E")) {
				inputlineAray[i] = "3";
			}else if(inputlineAray[i].equals("G")) {
				inputlineAray[i] = "6";
			}else if(inputlineAray[i].equals("I")) {
				inputlineAray[i] = "1";
			}else if(inputlineAray[i].equals("O")) {
				inputlineAray[i] = "0";
			}else if(inputlineAray[i].equals("S")) {
				inputlineAray[i] = "5";
			}else if(inputlineAray[i].equals("Z")) {
				inputlineAray[i] = "2";

			//小文字のアルファベットは非表示とする
			}else if(inputlineAray[i].matches("[a-z]")) {
				System.out.println();
				System.out.println("アルファベットは大文字で入力してください");
				System.exit(0);
			}

			//Leet変換した文字列を出力する
			System.out.print(inputlineAray[i]);
		}
	}
}
