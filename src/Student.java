public class Student {

    private int studentID;
    private int registrationID;

    public static void main(String[] args) {
        Student student1 = new Student(1, 11);
        Student student2 = new Student(2, 11);
        System.out.println(student1.equals(student2));
    }

    public Student(int studentID, int registrationID) {
        this.studentID = studentID;
        this.registrationID = registrationID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return registrationID == student.registrationID;
    }
}