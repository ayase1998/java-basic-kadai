package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		//子クラスのインスタンスの作成
		KatoTaro_Chapter18 katoTaro = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 katoIchiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 katoHanako = new KatoHanako_Chapter18();
		
		//setGivenNameメソッドの実行
		katoTaro.setGivenName();
		katoIchiro.setGivenName();
		katoHanako.setGivenName();
		
		//execlntroduceメソッドの実行
		katoTaro.execIntroduce(); //太朗
		
		katoIchiro.execIntroduce(); //一朗
		
		katoHanako.execIntroduce(); //花子
		
	}

}
