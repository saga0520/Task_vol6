import java.util.Scanner;

/**
 * Leetの置き換えをするクラス
 */
public class Leet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		// lineArayに1文字多い配列を作る
		String[] lineAray = new String[line.length()];
		System.out.println( );

		// 標準入力lineの長さは100文字以内とし、lineの長さ分回す
		if (1 > line.length() || line.length() >= 100) {
			System.out.print("標準入力の文字列の長さは1文字以上100文字以下です");
		}
		for (int i = 0; i < line.length(); i++) {

			// lineの先頭から1文字ずつString型にして取り出す
			lineAray[i] = String.valueOf(line.charAt(i));

			//置き換える規則と比較し、条件と一致したら変換する
			if(lineAray[i].equals("A")) {
				lineAray[i] = "4";
			}else if(lineAray[i].equals("E")) {
				lineAray[i] = "3";
			}else if(lineAray[i].equals("G")) {
				lineAray[i] = "6";
			}else if(lineAray[i].equals("I")) {
				lineAray[i] = "1";
			}else if(lineAray[i].equals("O")) {
				lineAray[i] = "0";
			}else if(lineAray[i].equals("S")) {
				lineAray[i] = "5";
			}else if(lineAray[i].equals("Z")) {
				lineAray[i] = "2";
			}

			//変換した文字列を出力する
			System.out.print(lineAray[i]);
		}
	}
}
