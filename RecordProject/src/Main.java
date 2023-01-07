public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Student s = new Student(
                    "S92300" + i,
                    getName(i),
                    "05/11/1985",
                    "Java Masterclass"
            );
            System.out.println(s);
        }
        System.out.println("******* Record Example *******");
        for (int i = 0; i < 5; i++) {
            LPAStudent s = new LPAStudent(
                    "S92300" + i,
                    getName(i),
                    "05/11/1985",
                    "Java Masterclass"
            );
            System.out.println(s);
        }
        System.out.println();
        Student pojoStudent = new Student("S923006", "Ann", "05/11/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill", "05/11/1985", "Java Masterclass");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
        // Records are immutable
        
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
    public static String getName(int i) {
        return switch (i) {
            case 1 -> "Mary";
            case 2 -> "Carol";
            case 3 -> "Tim";
            case 4 -> "Harry";
            case 5 -> "Lisa";
            default -> "Anonymous";
        };
    }
}
