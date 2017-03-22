public class EngStudent extends Student{
  private String faculty = "Faculty Engineering";
  private String major;

  public EngStudent(String c,String nm,String major){
    super(c,nm);
    this.major = major;
  }

  public String toString(){
    String s = stCode + " " + name + " " +gpa+" "+faculty+" "+major
    ;
    return s;
  }
}

    
