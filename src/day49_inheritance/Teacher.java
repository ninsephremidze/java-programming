package day49_inheritance;

public class Teacher {
    /**
     * Sub class
     * Child class
     * Derived class
     */
    public class Teacher extends Person {
        int teacherID;

        public void teach(String topic) {
            System.out.println("Teacher is teaching " + topic);
        }
    }
}
