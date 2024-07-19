public class IfElse{
    public int score=60;
    public static void main(String[]args){
  IfElse f=new IfElse();
     // Complete the Reamaining Logic using score variable for a value
     // Determine grade based on score
  if (f.score > 90 && f.score <= 100) {
      System.out.println("Grade: A+");
  } 
  else if (f.score > 80 && f.score <= 90) {
      System.out.println("Grade: A");
  }
   else if (f.score > 70 && f.score <= 80) {
      System.out.println("Grade: B+");
  }
   else if (f.score > 60 && f.score <= 70) {
      System.out.println("Grade: B");
  }
   else if (f.score >= 0 && f.score <= 60) {
      System.out.println("Grade: F");
  } 
  else {
      System.out.println("Invalid score"); // Handle scores outside expected range
  }
}
}