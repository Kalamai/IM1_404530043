
public class RectangleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Rectangle R1 = new Rectangle(18,57,25,15);
	Rectangle R2 = new Rectangle(47,60,12,0);
	System.out.println(R1.tostring());
	System.out.println(R2.tostring());
	
	}
}
class Rectangle
{   double height,weight,x,y;
	
    public Rectangle(double _height,double _weight,double _x,double _y)
	{
		this.height=_height;
		this.weight=_weight;
		this.x=_x;
		this.y=_y;
	}

    double getHeight()
    {
    	return this.height;
    }
    double getWeight()
    {
    	return this.weight;
    }

    public String tostring()
    {  
    	double area=this.height*this.weight;
        double perimeter=(this.height+this.weight)*2;
    	return "Area=" + area + "Perimeter="+ perimeter +"Height="+this.height+"Weight="+this.weight+"x="+ this.x +"y="+this.y ;
    }
}



