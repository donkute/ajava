class Student {
    String name;
    int age;
    int rollNo;

    static int StudentCount = 0;

    public Student(String name, int age, int rollNo) {

        this.name = name;
        this.age = age;
        this.rollNo = rollNo;

        StudentCount++;
    }

    public void displayStudent(){
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Roll No: " + rollNo);
    }

    public static void displaycount(){
        System.out.println("Studnet count" + StudentCount);
    }

    public static void main(String args[]){
        Student s1 = new Student("Alex", 19 , 20);
        Student s2 = new Student("Michael" , 19 , 21);
        Student s3 = new Student("Craig", 18 , 22);

        s1.displayStudent();
        s2.displayStudent();
        s3.displayStudent();

        Student.displaycount();
    }
}
