
package selection;


public class address {
   private String city;
   private String  addressname;
   private int number;
   private int tk;
    
   public address(){
       this.city="";
       this.addressname="";
       this.number=0;
       this.tk=0;
    }
   
    public address(String a,String b,int c,int d ){
       this.city=a;
       this.addressname=b;
       this.number=c;
       this.tk=d;
    }
    
    public void setcity(String a){
        city=a;
    }
    public String getcity(){
        return city;
    }
    
    
    public void setaddress(String b){
        addressname=b;
    }
    public String getadddress(){
        return addressname;
    }
    
    
    public void setnumber(int c){
        number=c;
    }
    public int getnumber(){
        return number;
    }
    
    
    public void settk(int d){
        tk=d;
    }
    public int gettk(){
        return tk;
    }
    
    
    
    
    
    @Override
    public String toString(){
        String s;
        s= "  ΠΟΛΗ = " + city + "  ΟΔΟΣ = " + addressname + "  ΑΡΙΘΜΟΣ = " + number + "  TK= " + tk +"\n";
        return s;
    }
}
