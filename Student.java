public class Student {
    private  String name;
    private  int studentNum;
    private int gpa;
    private static int nextStudentNumber = 100;
    public Student(String name, int gpa) {
        this.name = name;
        this.gpa = gpa;
        studentNum = nextStudentNumber;
        nextStudentNumber++;
    }
    public void setGpa(int gpa) throws  Exception {
        if (gpa<0){
            throw new  Exception("sorry, gpa is incorrect");

        }
        this.gpa = gpa;
}
public int getStudentNum(){
    return studentNum;
}
}
