package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18  {

	public void setGivenName(String name) {
		//名を表すフィールドの値をセットする
		givenName = name;
	}
		
	//個別の紹介のオーバーライド
	public void eachIntroduce() {
			System.out.println("私はJavaが得意です");
		}
}


