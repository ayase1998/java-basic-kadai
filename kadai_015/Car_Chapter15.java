package kadai_015;

public class Car_Chapter15 {
	//属性（データ）
	//宣言
	private int gear = 1; //ギア
	private int speed = 10; //ギアチェンジ後の速度
	
	//コンストラクタ
	public Car_Chapter15() {
		}
	
	//操作（メソッド）
	public void gearChange(int afterGear) {
		//ギアの値により速度を変える 
		 int i = afterGear;
		     if(0 < i && i < 6) {
		    	 speed = i * 10;
				} else {
					speed = 10;
				}
		     gear = afterGear;
		   } 
	
	public void run() {
		//ギアチェンジ後の速度の表示
		System.out.println("ギアが" + gear +"に変更されました。");
		System.out.println("現在の速度は時速" + speed + "kmです。");
	}
	
	
	}

