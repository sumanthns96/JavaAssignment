import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Assignment16 {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
   System.out.println("Enter the ID");
   long id = scan.nextLong();
   System.out.println("Enter the name");
   String name = scan.next();
   System.out.println("Enter the age");
   int age = scan.nextInt();
   System.out.println("Enter the mobile number");
   long mobile = scan.nextLong();
  FileWriter fw = null;
  BufferedWriter bw = null;
  String regex="\\[\\]";
  File f = new File("myfile1.txt");
  FileReader fr = null;
  BufferedReader br = null;
  List<String> ContentList = null;
   try {
   Emp e = new Emp(id, name, age, mobile);
   fw = new FileWriter(f, true);
   bw = new BufferedWriter(fw);
   bw.write(e.id + "," + e.name + "," + e.age + "," + e.mobile + "\n");
  
   } catch (FileNotFoundException e) {
   e.printStackTrace();
   } catch (IOException e2) {
   e2.printStackTrace();
   } catch (ValidateException e1) {
   e1.printStackTrace();
   }
   finally {
   if (bw != null) {
   try {
   bw.close();
   } catch (IOException e) {
   e.printStackTrace();
   }
   }
  
   }
  try {
   fr = new FileReader(f);
   br = new BufferedReader(fr);
   String line;
   String[] ss= null;
   String s=null;
   while ((line = br.readLine()) != null) {
	   ss=line.split(",");
	   try {
		   s= s+ss[3].concat("L");
		Emp e1=new Emp(Long.parseUnsignedLong(ss[0]),ss[1],Integer.parseInt(ss[2]),Long.parseLong(ss[3]));
		System.out.println("ID:"+e1.id);
		System.out.println("NAME:"+e1.name);
		System.out.println("AGE:"+e1.age);
		System.out.println("MOBILE:"+e1.mobile);
	} catch (ValidateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
  } catch (FileNotFoundException e) {
   e.printStackTrace();
  } catch (IOException e) {
   e.printStackTrace();
  } catch (NumberFormatException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } 
  finally {
   if (br != null) {
    try {
     br.close();
    } catch (IOException e) {
     e.printStackTrace();
    }
   }
  }
 }
}
