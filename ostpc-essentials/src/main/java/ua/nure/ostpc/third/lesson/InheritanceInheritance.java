package ua.nure.ostpc.third.lesson;

class Human {
    protected int age;
    protected String name;
    protected String surname;

    public Human(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }
}
class University {
    public String fullName;
    public int accreditationLevel;
}
class UniversityMember extends Human {
    public UniversityMember(int age, String name, String surname, University university) {
        super(age, name, surname);
        this.university = university;
    }

    protected University university;
}

class Student extends UniversityMember {
    public Student(boolean isLazy) {
        super(22, "Vasilii", "Terkin", new University());
        this.isLazy = isLazy;
    }


    public boolean isLazy = true;
    public void sleepAlot() {

    }
}

class Teacher extends UniversityMember {
    public Teacher() {
        super(45, "Marya", "Ivanovna", new University());
    }

    public void teach() {

    }
}

public class InheritanceInheritance {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.teach();

        Student student = new Student(false);
        student.sleepAlot();
        method(teacher);
        method(student);
    }

    public static void method(UniversityMember human) {
        System.out.println(human.age + " " + human.name + " " + human.surname);
        System.out.println(human.university.accreditationLevel);
    }
}
