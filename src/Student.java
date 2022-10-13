import jdk.jfr.Enabled;

public class Student {
    public String name;
    public String surname;
    public int yearOfBirth;

    Student(String name, String surname, int yearOfBirth){
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString(){
        return name + " " + surname + " " + yearOfBirth;
    }

}
