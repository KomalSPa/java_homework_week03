package java_homework_week03;

public class Programme14_PersonName {String firstname, lastname;
    int age;

    public static void main(String[] args) {
        Programme14_PersonName person = new Programme14_PersonName();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullname());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John "); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullname());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullname());
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 100) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullname(){
        return firstname + lastname;
    }
}
