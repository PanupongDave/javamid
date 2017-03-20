public class Test{
  public static void main(String[] args){
    Point pt = new Point(10.0,5.0,6.0);
    pt.moveTo(7.0,5.0,3.0);

    Point pt2 = new Point(0.0,0.0,0.0);
    pt2.moveTo(pt);
    System.out.println(pt2.toString());
  }
}
