public class Main {
    public static void main(String[] args) {

        System.out.println();

        Student student = new Student("Vasya", " Ivanov", " 25-KI");

        System.out.print(student.name);
        System.out.print(student.surname);
        System.out.println(student.groupNumber);
        System.out.println();

        Student.passExam();
    }
}