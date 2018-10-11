public class Emp {
long id;
String name;
int age;
long mobile;
 public Emp(long id, String name, int age, long mobile) throws ValidateException{
  try {
   this.id=id;
   this.name=name;
   if(age>=18 && age<=60)
    this.age=age;
   else
    throw new ValidateException();
   char c=name.charAt(0);
   if(Character.isUpperCase(c))
    this.name=name;
   else
    throw new ValidateException(); 
   int length = (int) (Math.log10(mobile) + 1);
   if(length==10)
	   this.mobile=mobile;
   else
	   throw new ValidateException();
  }
  catch(ValidateException v) {
   System.out.println("INVALID");
  }
 
  
 }
 
}