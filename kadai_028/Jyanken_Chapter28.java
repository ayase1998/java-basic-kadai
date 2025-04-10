package kadai_028;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	public String getMyChoice(Scanner scanner) {
		System.out.println("じゃんけんの手を入力してください（rspでの入力）");
		try {
			String input = scanner.nextLine();
			return input;
		} catch (InputMismatchException e) {
			System.out.println("エラー：じゃんけんの指定の手を選択してください");
			return "Error";
		}
	}
	
	public String getRandom() {
		//配列設定
		String[] hand = {"r", "s", "p"};
		//ハンド設定
		String random = hand[(int) Math.floor(Math.random() * 3)];
		//ハンドを返す
		return random;
	}
	
	public void playGame() {
		try (Scanner scanner = new Scanner(System.in)) {
			//ハンドの定義
			String myHand = getMyChoice(scanner);
			String yourHand = getRandom();
					
			//じゃんけんの手をコレクション
			HashMap<String, String> hand = new HashMap<String, String>();
			hand.put("r", "グー");
			hand.put("s", "チョキ");
			hand.put("p", "パー");
			
			//手の出力
			System.out.println("自分の手は" + hand.get(myHand) + "です");
			System.out.println("コンピューターの手は" + hand.get(yourHand) + "です");
			
			//じゃんけん結果の出力
			if (myHand.equals(yourHand)) {
				System.out.println("あいこです");
			} else if (myHand.equals("r")) {
				if (yourHand.equals("s")) {
					System.out.println("自分の勝ちです");
				} else {
					System.out.println("自分の負けです");
				}
			} else if (myHand.equals("s")) {
				if (yourHand.equals("p")) {
					System.out.println("自分の勝ちです");
				} else {
					System.out.println("自分の負けです");
				}
			} else if (myHand.equals("p")) {
				if (yourHand.equals("r")) {
					System.out.println("自分の勝ちです");
				} else {
					System.out.println("自分の負けです");
				}
			} else {
				System.out.println("無効な入力です");
			}
		}
	}
}