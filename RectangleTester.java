/*
 * [A]96
 * [TA's advise]
 * 1.之後請依照作業要求格式印出結果.
 * 2.建構子不需要特別修飾他.
 * 3.並未實作toString()的override, 此部分扣2分.
 * 4.並未使用getHeight(), getWeight()去計算, 你寫的toString()是使用this的方式去進行取值喔, 此部分扣2分.
 * */

//建議把自行建構的類別放在前面
class Rectangle {
	//weight or width?
	double height, weight, x, y;

	//Rectangle(){this(-1,-1,-1,-1);}//建議加上這一行會讓你的程式更完整.
		
	
	//為什麼將他宣告成public呢?
	public Rectangle(double _height, double _weight, double _x, double _y) {
		this.height = _height;
		this.weight = _weight;
		this.x = _x;
		this.y = _y;
	}

	double getHeight() {
		return this.height;
	}

	double getWeight() {
		return this.weight;
	}

	
	//public String toString(){return ...}//這樣才有override喔, 看看toString()的大小寫問題.
	
	public String tostring() {
		double area = this.height * this.weight;
		double perimeter = (this.height + this.weight) * 2;
		return "Area=" + area + "Perimeter=" + perimeter + "Height=" + this.height + "Weight=" + this.weight + "x="
				+ this.x + "y=" + this.y;
	}
}

public class RectangleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle R1 = new Rectangle(18, 57, 25, 15);
		Rectangle R2 = new Rectangle(47, 60, 12, 0);
		System.out.println(R1.tostring());
		System.out.println(R2.tostring());

	}
}
