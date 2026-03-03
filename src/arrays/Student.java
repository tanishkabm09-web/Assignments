package arrays;

 class Student {
    String name;
    int USN;

}
class Intern{
     String name;
     int id;

    Intern(String name, int id){
        this.name=name;
        this.id = id;
    }
}
 class E7{
    public static void main(String[] args){
        Student[] students = new Student[3];
        students[0] = new Student();
        students[0].name = "Ruhi";
        students[0].USN = 112;
        System.out.println(students[0].name + " " +students[0].USN);
        Intern[] interns = new Intern[]{
                new Intern("Rachana", 79),
                new Intern("Tanishka", 72),
                new Intern("Siri", 86),

        };
        // The data type is the class itself
        for (Intern i : interns){
            System.out.println(i.name+" "+ i.id);
        }



    }
}
