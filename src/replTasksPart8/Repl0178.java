package replTasksPart8;

public class Repl0178 {
 //Encapsulation
    //Create Class EncapsulationDemo
    //create two variable as shown below.
    //private String empName;
    //private int empAge;
    //Create the getter/setter methods for each variable.
    //In Main Class and main method.
    //Using setter methods assign the values as "John" and "30"
    //Using getter methods print the values as below outputs.
    //Expected Output:
    //Employee Name: John
    //Employee Age: 30
}
class EncapsulationDemo{
    private String empName;
    private int empAge;

    public void setEmpName(String empName){
        this.empName=empName;
    }
    public String getEmpName(){
        return empName;
    }
    public void setEmpAge(int empAge){
        this.empAge=empAge;
    }
    public int getEmpAge(){
        return empAge;
    }
}
class Main6 extends EncapsulationDemo{
    public static void main(String [] args){
        EncapsulationDemo demo=new EncapsulationDemo();
        demo.setEmpName("John");
        demo.getEmpName();
        demo.setEmpAge(30);
        demo.getEmpAge();
        System.out.println("Employee Name: "+demo.getEmpName());
        System.out.println("Employee Age: "+demo.getEmpAge());
    }
}