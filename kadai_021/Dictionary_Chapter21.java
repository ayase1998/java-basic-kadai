package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	//HashMapの宣言
	   public void check(String[] keyword) {
			HashMap<String,String> wordMap = new HashMap<String,String>();
		
			wordMap.put("apple", "りんご");
			wordMap.put("peach", "桃");
			wordMap.put("banana", "バナナ");
			wordMap.put("lemon", "レモン");
			wordMap.put("pear", "梨");
			wordMap.put("kiwi", "キウイ");
			wordMap.put("strawberry", "いちご");
			wordMap.put("grape", "ぶどう");
			wordMap.put("muscat", "マスカット");
			wordMap.put("cherry", "さくらんぼ");
			
			// 受け取ったキーワードに対してループする
			for (String word : keyword) {
				String mean = wordMap.get(word);

				if (mean == null) {
					System.out.println(word + "は辞書に存在しません");
				} else {
					System.out.println(word + "の意味は" + mean);
				}
			}
		}
}
	   

