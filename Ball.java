package object3Kadai2;

public class Ball{
	//半径の変数radiusをprivateで宣言
	private double radius;
	//コンストラクタ
	Ball(double radius){
		this.radius = radius;
	}

	//球の表面積メソッド
	public double volume() {
		return(4.0 / 3.0 * Math.PI * Math.pow(this.radius, 3.0));
	}

	//球の体積メソッド
	public double areaOfSurface() {
		return(4.0 * Math.PI * Math.pow(this.radius, 2.0));
	}
}