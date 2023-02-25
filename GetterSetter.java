/*
 !                      Encapsulation
*/


public class GetterSetter {

    // here we have made our variables to PRIVATE, so now we cannot access this variables in main() directly
    private int studentID;
    private String studentName;

    // to access this variables we use GETTER and SETTER methods
    // this methods also can be use to apply VALIDATION to avoid run-time errors
    public int getID() {                                //this method return the 'studentID'
        return studentID;
    }
    public void setID(int enroll) {                     //this method get the data from main() method,
        studentID = enroll;                             //and set the value to the 'studentID'
    }

    public String getName() {                           //this method return the 'studentName'
        return studentName;
    }
    public void setName(String name) {                  //this method get the data from main() method,
        studentName = name;                             //and set the value to the 'studentName'
    }

    public static void main(String[] args) {

        // int enteredID, enteredName;
        // Scanner scan = new Scanner(System.in);

        GetterSetter gs = new GetterSetter();
        gs.setID(502);
        gs.setName("Meet Patadia");

        System.out.println("Enrollment:" + gs.getID());
        System.out.println("Name:" + gs.getName());
    }
}
