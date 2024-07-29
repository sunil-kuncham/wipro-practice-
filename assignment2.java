class Person
{
 String name;
 int age ;
 public Person(String n,int x)
 
 {
   name=n;
   age=x;
 
 
 }
 
 
 public void getGreeting()
 {
 System.out.println("Hell0 my name is"+name);
 
 }
 public static void main(String[] args)
 {
  Person obj=new Person("sunilkuncham",23);
  System.out.println("person name:"+obj.name);
  System.out.println("person age:"+obj.age);
  obj.getGreeting();
  
 }


}