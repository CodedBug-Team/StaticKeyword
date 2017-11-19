class Student 
{
    String name;
    int rollNo;
     
    // static variable
    static String schoolName;
     
    // static counter to set unique roll no
    static int counter = 0;
     
     
    public Student(String name) 
    {
        this.name = name;
         
        this.rollNo = setRollNo();
    }
     
    static int setRollNo()
    {
        counter++;
        return counter;
    }
     
    // static method
    static void setschool(String name){
        schoolName = name ;
    }
     
    // instance method
    void getStudentInfo(){
        System.out.println("name : " + this.name);
        System.out.println("rollNo : " + this.rollNo);
         
        // accessing static variable
        System.out.println("cllgName : " + schoolName);
    }
}
 
//Driver class
public class StaticDemo 
{
    public static void main(String[] args)
    {
        Student.setschool("SCHOOL_NAME");
     
        Student s1 = new Student("MICKEY");
        Student s2 = new Student("DONALD");
         
        s1.getStudentInfo();
        s2.getStudentInfo();
         
    }
}