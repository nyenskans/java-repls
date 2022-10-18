package replTasksPart8;

public class Repl0180 {
    //Create Class EncapsulationDemo
    //create two variable as shown below
    //private String empName=John;
    //private int empAge=30;
    //Create only getters methods for each variable.
    //Print the values of each variable as shown below.
    //Expected Output:
    //Employee Name: John
    //Employee Age: 30
}
class EncapsulationDemo1{

    private String empName="John";
    private int empAge=30;

    public String getEmpName(){
        return empName;
    }
    public int getEmpAge(){
        return empAge;
    }

}
class Main {
    public static void main(String [] args){
        EncapsulationDemo1 demo=new EncapsulationDemo1();

        System.out.println("Employee Name: "+ demo.getEmpName());
        System.out.println("Employee Age: "+demo.getEmpAge());
    }
}