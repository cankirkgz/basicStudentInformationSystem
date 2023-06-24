// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Cemil Kavakçı", "05462415532", "CLCS");
        Teacher teacher2 = new Teacher("Mustafa Düldül", "05494322334", "PHY");
        Teacher teacher3 = new Teacher("Sevim Sevgi", "05445524454", "BIO");

        Course calculus = new Course("Calculus", "101", "CLCS", 30,60);
        calculus.addTeacher(teacher1);

        Course physic = new Course("Physic", "103", "PHY",20,80);
        physic.addTeacher(teacher2);

        Course biology = new Course("Biology", "106", "BIO",35,65);
        biology.addTeacher(teacher3);

        Student s1 = new Student("Can Kırkgöz", calculus, physic, biology, "18025029", "4");
        s1.addBulkExamNote(60,42,73,30,23,95);
        s1.printNote();
        s1.isPass();
    }
}