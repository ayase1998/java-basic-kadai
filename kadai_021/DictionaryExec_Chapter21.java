package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		
		//辞書クラスのインスタンスを作成
		Dictionary_Chapter21 jisyo = new Dictionary_Chapter21();
		//調べる英単語を配列にセットする
		String [] word = {"apple", "banana", "grape", "orange"};
		//実行
		jisyo.check(word);
		

	}

}
