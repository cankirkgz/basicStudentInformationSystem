public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int oralWeight;
    int examWeight;
    double oralNote;
    double examNote;

    Course(String name, String code,String prefix,  int oralWeight, int examWeight){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.oralWeight = oralWeight;
        this.examWeight = examWeight;
        this.oralNote = 0.0;
        this.examNote = 0.0;
    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor.");
        }
    }
    void printTeacher(){
        this.teacher.print();
    }
}
