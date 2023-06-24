public class Student {
    Course c1;

    Course c2;
    Course c3;
    String name;
    String studentNumber;
    String classes;
    double average;
    boolean isPass;

    public Student(String name, Course c1, Course c2, Course c3, String studentNumber, String classes) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.name = name;
        this.studentNumber = studentNumber;
        this.classes = classes;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote (double oralNote1, double examNote1, double oralNote2, double examNote2,
                          double oralNote3, double examNote3){
        if (oralNote1 >= 0 && oralNote1 <= 100 && examNote1 >= 0 && examNote1 <= 100) {
            this.c1.oralNote = oralNote1;
            this.c1.examNote = examNote1;
        }

        if (oralNote2 >= 0 && oralNote2 <= 100 && examNote2 >= 0 && examNote2 <= 100) {
            this.c2.oralNote = oralNote2;
            this.c2.examNote = examNote2;
        }

        if (oralNote3 >= 0 && oralNote3 <= 100 && examNote3 >= 0 && examNote3 <= 100) {
            this.c3.oralNote = oralNote3;
            this.c3.examNote = examNote3;
        }
        calculateAverage();
    }

    void printNote () {
        System.out.println(this.c1.name + " dersinin sözlü notu: " + this.c1.oralNote + ", sınav notu: " + this.c1.examNote);
        System.out.println(this.c2.name + " dersinin sözlü notu: " + this.c2.oralNote + ", sınav notu: " + this.c2.examNote);
        System.out.println(this.c3.name + " dersinin sözlü notu: " + this.c3.oralNote + ", sınav notu: " + this.c3.examNote);
    }

    void calculateAverage() {
        double c1WeightedAverage = (this.c1.oralNote * this.c1.oralWeight / 100) + (this.c1.examNote * this.c1.examWeight / 100);
        double c2WeightedAverage = (this.c2.oralNote * this.c2.oralWeight / 100) + (this.c2.examNote * this.c2.examWeight / 100);
        double c3WeightedAverage = (this.c3.oralNote * this.c3.oralWeight / 100) + (this.c3.examNote * this.c3.examWeight / 100);

        this.average = (c1WeightedAverage + c2WeightedAverage + c3WeightedAverage) / 3.0;
    }

    void isPass() {
        double roundedAverage = Math.round(this.average * 100.0) / 100.0;

        if (roundedAverage >= 55) {
            System.out.printf("%s isimli öğrenci sınıfı geçti. Tebrikler! Ortalama: %.2f%n", this.name, roundedAverage);
            this.isPass = true;
        } else {
            System.out.printf("Malesef, %s isimli öğrenci sınıfı geçemedi. Ortalama: %.2f%n", this.name, roundedAverage);
            this.isPass = false;
        }
    }
}
