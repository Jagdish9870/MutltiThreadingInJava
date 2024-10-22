package LambdaExpression;


interface Student{
    public void bio(String name);
}
public class Example2 {
    public static void main(String[] args) {
        Student s = (name)->{ System.out.println(name+ " is bright student");};    // first method 



        Student s2 = name-> System.out.println(name+ " is bright student");  // second method
        s.bio("ram");
        s2.bio("Shyam");
        
    }
    
}
