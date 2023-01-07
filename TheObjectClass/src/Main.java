public class Main {
    public static void main(String[] args) {
        Student max = new Student("Max", 21);
        System.out.println(max.toString());
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
