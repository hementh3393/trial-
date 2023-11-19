
class Student {
   String name;
   int age;
  
   public void getInfo() {
       System.out.println("The name of this Student is " + this.name);
       System.out.println("The age of this Student is " + this.age);
   }
}
class Pen
{
    String color;
    String type;
    
    public void infoofpen()
    {
        
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

public class Hello{
   public static void main(String args[]) {
       Student s1 = new Student();
       Pen p1=new Pen();
       
       s1.name = "Aman";
       s1.age = 24;
       s1.getInfo();

       Student s2 = new Student();
       s2.name = "Shradha";
       s2.age = 22;
       s2.getInfo();
       
       p1.color="blue";
       p1.type="gel";
       p1.infoofpen();
   }
}
