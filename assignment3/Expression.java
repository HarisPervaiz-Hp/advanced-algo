// Java program to illustrate declaration, assignment & expression.

public class Expression { 
    public void StudentAge() 
    {  
        int age;            //Declaring local variable age
        age = 0;            //Assigning 0 to local variable age
        age = age + 18;      //age + 18 is an expression
        System.out.println("Student age is : " + age); 
    } 
  
    public static void main(String args[]) 
    { 
        Expression obj = new Expression(); 
        obj.StudentAge(); 
    } 
} 