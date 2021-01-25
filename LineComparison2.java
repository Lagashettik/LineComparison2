import java.util.*;
public class LineComparison2 {

	int Coordinate_x1;
	int Coordinate_y1;
	int Coordinate_x2;
	int Coordinate_y2;

	LineComparison2(){}

	LineComparison2(String s){
	System.out.println("Welcome to Line Comparison Computation Program");
	}

	double LineCalc() {
	Scanner In = new Scanner(System.in);
	Coordinate_x1 = In.nextInt();
	Coordinate_y1 = In.nextInt();
	Coordinate_x2 = In.nextInt();
	Coordinate_y2 = In.nextInt();

	double Length = Math.sqrt(Math.pow((Coordinate_x2-Coordinate_x1),2) + Math.pow((Coordinate_y2-Coordinate_y1),2));
	System.out.println("Length of line: "+Length);
	return Length;
	}

	void Equals(LineComparison2 Line2){
	String s1= String.valueOf(this.LineCalc());
	String s2= String.valueOf(Line2.LineCalc());

	double var =s1.compareTo(s2);

	if(var == 0 ){
		System.out.println("Both Lines Length are equal");
		}
	else if(var > 0){
		System.out.println("Length of Line1 is Greater");
		}
	else{
		System.out.println("Length of Line2 is Greater");
		}
	}

	public static void main(String args[]){
	LineComparison2 Line1= new LineComparison2("Line");
	LineComparison2 Line2= new LineComparison2();
	Line1.Equals(Line2);
	}
}
