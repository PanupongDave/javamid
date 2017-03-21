import java.util.*;
public class TestEngStd{
  public  static void main(String[] args){
    EngStudent[] estd = new EngStudent[3];
    estd[0] = new EngStudent("5810110901","John Smith",
                              "Computer Engineering");
    estd[1] = new EngStudent("5810110902","Jen Smiley",
                              "Civil Engineering");
    estd[2] = new EngStudent("5810110901","Jack Small",
                              "Industrial Engineering");
    Scanner scan = new Scanner(System.in);
    int i=0;
    for(EngStudent est:estd){
      System.out.print("Hello "+est.getName() +",please input GPA: ");
      Double g = scan.nextDouble();
      est.setGPA(g);
    }
    for(EngStudent est:estd){
      System.out.println(est.toString());
    }
  }

}
