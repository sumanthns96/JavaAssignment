import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Assignment17 {
 static Pattern pattern1;
 static Matcher matcher1;
 String regex1 = "\\d{3}-\\d{2}-\\d{4}";
 public Assignment17() {
  pattern1 = Pattern.compile(regex1);
 }
 public static void main(String[] args) throws ValidateException{
   String line;
   Assignment17 a=new Assignment17();
   BufferedWriter bufferwriter=null;
   BufferedReader bufferreader=null;
      try {
       bufferwriter = new BufferedWriter(new FileWriter("C:\\Users\\RINITHA KM\\Desktop\\output.txt"));
       bufferreader = new BufferedReader(new FileReader("C:\\Users\\RINITHA KM\\Desktop\\file.txt"));
          while ((line = bufferreader.readLine()) != null) {
           a.matcher1 = a.pattern1.matcher(line);
           if(a.matcher1.matches()) {
            bufferwriter.write(line+":Valid\n");
           }
            
           else
            bufferwriter.write(line+":Invalid\n");
          }
      } catch (FileNotFoundException ex) {
          ex.printStackTrace();
      } catch (IOException ex) {
          ex.printStackTrace();
      }
      finally {
       if(bufferwriter!=null && bufferreader!=null) {
        try {
      bufferreader.close();
      bufferwriter.close();
     } catch (IOException e) {
      e.printStackTrace();
     }
        
       }
    
   }
      
  }
}

