
package selection;


public class Person {
   private int am;
   private String firstname;
   private String lastname;
   private int bornyear;
   private int importyear;
   private char gender;
  public address newaddress;
   private int mathnumber;
   private Course [] courses=new Course[10];
   private int counter=-1;
   
  
   public Person(){
       this.am=0;
       this.firstname="";
       this.lastname="";
       this.bornyear=0;
       this.importyear=0;
       
   }
   
   
    public Person(int a,String b,String c,int d,int e,char f){
       this.am=a;
       this.firstname=b;
       this.lastname=c;
       this.bornyear=d;
       this.importyear=e;
       this.gender=f;
      
       
    }
    public void setaddress(address a){
        newaddress=a;
    }
    
    
    
    public void setam(int a){
        this.am=a;
    }
    public int getam(){
        return am;
    }
    
     public void setfirstname(String a){
        this.firstname=a;
    }
    public String getfirstname(){
        return firstname;
    }
    
    public void setlastname(String a){
        this.lastname=a;
    }
    public String getlastname(){
        return lastname;
    }
    
    public void setbornyear(int d){
        this.bornyear=d;
    }
    public int getbornyear(){
        return bornyear;
    }
    
    
    
    
    public void setimportyear(int e){
        this.importyear=e;
    }
    public int getimportyear(){
        return importyear;
    }
    
    
    
    public void setgender(char a){
        this.gender=a;
    }
    public char getgender(){
        return gender;
    }
    public void setcounter(int a){
        counter=a;
    }
    public int getcounter(){
        return counter;
    }
    
    public void setcourse(Course a){
        counter++;
        courses[counter]= a;
        
    }
    
    
    
    public Course[] getcourses(){
        return courses;
    }
    
    public String getcoursename(int a){
             return courses[a].getcoursename();
         }
    public String getcoursecode(int a){
             return courses[a].getcoursecode();
         }
    public int getects(int a){
             return courses[a].getects();
         }
    public int getsemester(int a){
             return courses[a].getsemester();
         }
    public double getgrade(int a){
             return courses[a].getgrade();
         }
   
   
   @Override
    public String toString(){
        String y;
     y= "AM = " + am + "  Firstname = " + firstname + "  Lastname = " + lastname + "  Bornyear = " + bornyear+ " Import year = "+importyear+"  gender = "+ gender+"\n" + newaddress.toString(); 
     if(counter==-1){
         y=y+"\n"+"No courses have register";
     }else{
     for(int i=0;i<=counter;i++){
         y=y+courses[i].toString();
       }
     }
     return y;
    }  
    public String printcourses(){
        String y="";
    
     if(counter==-1){
         y="\n"+"No courses have register";
     }else{
     for(int i=0;i<=counter;i++){
         y=y+courses[i].toString();
       }
     }
     return y;
    }  
}
