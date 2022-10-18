package replTasksPart8;

public class Repl0179 {
    //Encapsulation
    //Create Class EncapsulationDemo that will have 2 variables empName and empAge; Create the getter/setter methods for each variable.
    //In Main Class and main method
    //Using setter methods assign the values as "Mario" and "32"
    //Using getter methods print the values as below outputs.
    //Expected Output:
    //Employee Name: Mario
    //Employee Age: 32
}
class EncapsulationDemo2{
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
}class Main7 {
    public static void main(String [] args){
        EncapsulationDemo2 demo=new EncapsulationDemo2();
        demo.setEmpName("Mario");
        demo.setEmpAge(32);

        System.out.println("Employee Name: "+demo.getEmpName());
        System.out.println("Employee Age: "+demo.getEmpAge());
    }
}