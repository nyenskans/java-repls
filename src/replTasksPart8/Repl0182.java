package replTasksPart8;

public class Repl0182 {
    //Encapsulation
    //Create  a Person class with the following:
    //Class Variables
    //firstname
    //lastname
    //birthmonth
    //birthday
    //birthyear
    //String ssn
    //Constructor : The main constructor should take in all values and assign them to their respective private class variables
    //Methods:
    //Create a public getters to access all the variables.
    //Create a public method called formatBirthday, which will return a String composed of their birthday in mm/dd/yyyy format. For example, if birthmonth=3, birthday=22, birthyear=2000, it should return the String "3/22/2000"
    //in Main Class:
    //Instantiate an object of Person class and provide values. follows below outputs for values.
    //using getter and method print them separately.
    //Expected Output:
    //John          Doe      10/25/1900        123-45-6789
}
class Person {
    private String firstName;
    private String lastName;
    private int birthMonth;
    private int birthDay;
    private int birthYear;
    private String ssn;

    public Person(String firstName, String lastName, int birthMonth, int birthDay, int birthYear, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }


    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }


    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }


    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String formatBirthday(int birthMonth, int birthDay, int birthYear) {

        String formattedBday;
        formattedBday = Integer.toString(birthMonth) + "/" + Integer.toString(birthDay) + "/" + Integer.toString(birthYear);

        return formattedBday;
    }
}
class Main9{
    public static void main(String [] args){

        Person person=new Person("John","Doe",10,25,1900,"123-45-6789");

        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.formatBirthday(10,25,1900));
        System.out.println(person.getSsn());

    }
}