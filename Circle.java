package object3Kadai2;

public class Circle {
	//半径の変数radiusをprivateで宣言
	private double radius;
	//コンストラクタ
	Circle(double radius){
		this.radius = radius;
	}

	//円の面積メソッド
	public double area() {
		return(Math.PI * Math.pow(this.radius , 2.0));
	}
	//円周メソッド
	public double circumference() {
		return(2.0 * Math.PI * this.radius);
	}
}
