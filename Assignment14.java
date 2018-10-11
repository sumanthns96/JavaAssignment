import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Assignment14{
 Pattern pattern1;
 Pattern pattern2;
 Matcher matcher1;
 Matcher matcher2;
 String regex1="\\d{3}-\\d{2}-\\d{4}";
 String regex2="^(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
 
 public Assignment14() {
  pattern1 =Pattern.compile(regex1);
  pattern2 =Pattern.compile(regex2);
 }
 private boolean validateID(String input) {
  matcher1 = pattern1.matcher(input);
  return matcher1.matches();
 }
 private boolean validatePassword(String input) {
  matcher2 = pattern2.matcher(input);
  return matcher2.matches();
 }
 public static void main(String[] args) {
  Assignment14 nv = new Assignment14();
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the ID");
  String input1 = sc.nextLine();
  boolean valid1 = nv.validateID(input1);
  System.out.println("Enter the password");
  String input2 = sc.nextLine();
  boolean valid2 = nv.validatePassword(input2);
  System.out.println("ID valid:" + valid1);
  System.out.println("Password valid:" + valid2);
 }
}
