import java.util.ArrayList;

public class PointDemo{
  public static void main(String[] args){
    ArrayList<Point> pts = new ArrayList<Point>();
    pts.add(new Point(0.0,0.0,0.0));
    pts.add(new Point(1.1,1.1,1.1));
    pts.add(new Point(2.2,2.2,2.2));

    int i = 0;
    for(Point pt:pts){
      i++;
      System.out.println("Point " + i + " = " +pt.toString());
    }
  }
}
