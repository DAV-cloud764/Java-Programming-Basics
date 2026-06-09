public class Student{

    String name;
    double test1;
    double test2;
    double test3;

    public Student(String name, double test1, double test2, double test3){
        this.name = name;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
    }

    public double calculateAverage(){
        return (test1 + test2 + test3)/3;
    }

    public void displayInfo(){
        System.out.println("Name is: " + name);
        System.out.println("The Average is: " + calculateAverage());
        System.out.println("The Grade is: " + calculateGrade());
    }

    
    public String calculateGrade(){

        double average = calculateAverage();
        if (80 <= average && average <= 100 ){
            return "A";
        } else if (70 <= average && average <= 79){
            return "B";
        } else if (60 <= average && average <= 69){
            return "C";
        } else if (50 <= average && average <= 59){
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args){
        Student student = new Student("David", 80, 90, 80);
        student.displayInfo();
    }
}