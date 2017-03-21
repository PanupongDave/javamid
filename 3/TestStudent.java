import java.util.Scanner;
import java.util.ArrayList;

public class TestStudent{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    ArrayList<Student> sts = new ArrayList<Student>();

    System.out.print("Enter number of students: ");
    int max = scan.nextInt();
    System.out.println("Enter student information");
    for(int i = 0;i<max;i++){
      scan.nextLine();
      System.out.print("Student code: ");
      String code = scan.nextLine();
      System.out.print("Student name: ");
      String name = scan.nextLine();
      System.out.print("GPA: ");
      double gpa = scan.nextDouble();
      Student st = new Student(code,name,gpa);
      sts.add(st);
    }
    int i = 0;
    for(Student st:sts){
      i++;
      System.out.println(i+") "+st.toString());
    }
    scan.nextLine();
    System.out.print("Enter Code of search: ");
    String scd = scan.nextLine();
    int num = searchCode(sts,scd);
    System.out.println("Code of" + scd+" : " + num);
  }
  public static int searchCode(ArrayList<Student> sts, String scd){
    int total = 0;
    for(Student st:sts){
      String Code = st.getCode();
      String subCode = Code.substring(7,Code.length());
      if(scd.equals(subCode))
        total++;
    }
    return total;
  }
}
