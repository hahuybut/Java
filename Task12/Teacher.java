public class Teacher extends Person {
    private int numCourses;
    private String[] courses;
    private static final int MAX_COURSES=5;

    public Teacher(String name, String address){
        super(name,address);
        numCourses=0;
        courses=new String[MAX_COURSES];
    }
     public String toString(){
        return" Teacher: "+super.toString();
     }

     public boolean addCourses(String courses){
        for (int i=0;i<numCourses;i++){
            if(courses[i].equals(courses)) return false;
        }
        courses[numCourses]=courses;
        numCourses++;
        return true;
     }
     public boolean removeCourses(String courses){
        boolean found=false;
        int coursesIndex = -1;
        for (int i=0;i<numCourses;i++){
            if (courses[i].equals(courses)){
                coursesIndex=i;
                found=true;
                break;
            }
        }
        if (found){
            for (int i=coursesIndex;i<numCourses;i++){
                courses[i]=courses[i+1];
            }
            numCourses--;
            return true;
        } else {
            return false;
        }
     }
}
