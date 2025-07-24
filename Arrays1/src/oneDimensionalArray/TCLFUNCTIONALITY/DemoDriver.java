package oneDimensionalArray.TCLFUNCTIONALITY;

import java.util.Arrays;

public class DemoDriver {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.addName("sid");
        d.updateName("nikhil","sagar");
        d.addName("harshal");
        d.removeName("swaraj");
        d.rollback(1);

//        d.commit();
//        d.addName("harshal");

        d.showSavePoint();
        System.out.println();
        d.showDB();
    }
}
