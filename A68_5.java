import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Amit", 78));
        students.add(new Student("Pooja", 92));
        students.add(new Student("Rahul", 85));
        students.add(new Student("Neha", 92));
        students.add(new Student("Kiran", 67));

        Collections.sort(students, new Comparator<Student>() {

            public int compare(Student s1, Student s2) {

                // Descending marks
                if (s1.marks != s2.marks) {
                    return s2.marks - s1.marks;
                }

                // Alphabetical name if marks are equal
                return s1.name.compareTo(s2.name);
            }
        });

        for (Student s : students) {
            System.out.println(s.name + " " + s.marks);
        }
    }
}