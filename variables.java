// In Java, a variable is a named memory location used to store data. 
// The value of a variable can change during program execution.

//SYNTAX : dataType variableName = value;

public class variables {
    public static void main(String args[]){
        int a = 9;
        int b= 7;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);
        String name = "Saisha" ;
        System.out.println(name);

        int score = 50;
        score = 75;  // Value updated
        System.out.println(score);
    }
}

/*Variable Naming Rules: 
Must begin with a letter (A-Z, a-z), underscore (_), or dollar sign ($).
Cannot start with a number.
Cannot use Java keywords (e.g., int, class, public).
Variable names are case-sensitive (age and Age are different).
Use camelCase for readability (e.g., studentName, totalMarks). */