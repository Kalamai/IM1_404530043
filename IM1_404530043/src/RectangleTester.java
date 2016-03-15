/*
 * [A]96
 * [TA's advise]
 * 1.����Ш̷ӧ@�~�n�D�榡�L�X���G.
 * 2.�غc�l���ݭn�S�O�׹��L.
 * 3.�å���@toString()��override, ��������2��.
 * 4.�å��ϥ�getHeight(), getWeight()�h�p��, �A�g��toString()�O�ϥ�this���覡�h�i����ȳ�, ��������2��.
 * */

//��ĳ��ۦ�غc�����O��b�e��
class Rectangle {
	//weight or width?
	double height, weight, x, y;

	//Rectangle(){this(-1,-1,-1,-1);}//��ĳ�[�W�o�@��|���A���{���󧹾�.
		
	
	//������N�L�ŧi��public�O?
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

	
	//public String toString(){return ...}//�o�ˤ~��override��, �ݬ�toString()���j�p�g���D.
	
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
