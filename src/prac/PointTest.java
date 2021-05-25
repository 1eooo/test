package prac;

public class PointTest {

	public static void main(String[] args) {
		
		Point point = new Point();
		
		System.out.println(point.getX()+", "+point.getY());
		
		point.addX(point.getX());
		point.addY(point.getY());

		System.out.println(point.compare(point.getX(), point.getY()));
		System.out.println(point.getX()+", "+point.getY());
		
		point.addX(point.getX());
		point.subtractY(point.getY());

		System.out.println(point.compare(point.getX(), point.getY()));
		System.out.println(point.getX()+", "+point.getY());
		
		point.subtractX(point.getX());
		point.addY(point.getY());

		System.out.println(point.compare(point.getX(), point.getY()));
		System.out.println(point.getX()+", "+point.getY());
		
		point.subtractX(point.getX());
		point.subtractY(point.getY());

		System.out.println(point.compare(point.getX(), point.getY()));
		System.out.println(point.getX()+", "+point.getY());
		
	}

}
