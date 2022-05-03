public class TestPerson {
    public static void main(String[] args) {
        Student s1=new Student("Tan Ah Teck","1 Happy Ave");
        s1.addCoursesGrade("IM101",97);
        s1.addCoursesGrade("IM102",68);
        s1.printGrade();
        System.out.println("Average is "+ s1.getAverageGrade());

        Teacher t1=new Teacher("Paul Tan", "8 sunset way");
        System.out.println(t1);
        String[] courses = {"IM101","IM102","IM101"};
        for (String courses: courses){
            if (t1.addCourses(courses)){
                System.out.println(courses+" added");
            } else {
                System.out.println(courses+"cannot be added");
            }
        }
        for (String courses: courses){
            if (t1.removeCourses(courses)){
                System.out.println(courses+ " removed");
            } else {
                System.out.println(courses+" cannot be removed");
            }
        }
    }
}
