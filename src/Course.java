
package selection;


public class Course {
     private String coursename;
     private String coursecode;
     private int ects;
     private int semester;
     private double grade;
         public Course(){
            this.coursename="";
            this.coursecode="";
            this.ects=0;
            this.semester=0;
            this.grade=0.0;
 }
         public Course(String a,String b,int c,int d,double e){
             this.coursename=a;
             this.coursecode=b;
             this.semester=c;
             this.ects=d;
             this.grade=e;
         }
         
         public void setcoursename(String a){
             coursename=a;
         }
         public String getcoursename(){
             return coursename;
         }
         
         public void setcoursecode(String a){
             coursecode=a;
         }
         public String getcoursecode(){
             return coursecode;
         }
         
         public void setsemester(int a){
             semester=a;
         }
         public int getsemester(){
             return semester;
         }
         
          public void setects(int a){
             ects=a;
         }
         public int getects(){
             return ects;
         }
          public void setgrade(double a){
             grade=a;
         }
         public double getgrade(){
             return grade;
         }
         
         @Override
    public String toString(){
        String s;
        s= "Course Name= "+ coursename+" Course Code= "+coursecode+" Semester= "+semester +" Ects= "+ects+" Grade= "+grade+"\n";
        return s;
    }
             
}
