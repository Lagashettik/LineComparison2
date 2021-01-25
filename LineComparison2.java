import java.util.*;
public class LineComparison2 {

	int Coordinate_x1;
	int Coordinate_y1;
	int Coordinate_x2;
	int Coordinate_y2;

	LineComparison2(){
	System.out.println("Welcome to Line Comparison Computation Program");
	}

	void LineCalc() {
	Scanner In = new Scanner(System.in);
	Coordinate_x1 = In.nextInt();
	Coordinate_y1 = In.nextInt();
	Coordinate_x2= In.nextInt();
	Coordinate_y2 = In.nextInt();

	double Length = Math.sqrt(Math.pow((Coordinate_x2-Coordinate_x1),2) + Math.pow((Coordinate_y2-Coordinate_y1),2));
	System.out.println("Length of line: "+Length);
	}

	public static void main(String args[]){
	LineComparison2 Line= new LineComparison2();
	Line.LineCalc();
	}
}
