class Car
{
 String make = "TATA";
 String model = "SUV";
 double year = 2019;
 
 public void getDisplayInfo()
 {
 System.out.println("car make by:"+make);
 System.out.println("car model:"+model);
 System.out.println("car year:"+year);
 
 }

 public static void main(String[] args)
 {
 Car obj=new Car();
 obj.getDisplayInfo();
 
 }

}