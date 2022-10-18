
package UseClass;

import BuildClass.Time;

public class MainUse {
    public static void main(String[] args) {
        // Khai bao doi tuong
        Time O = new Time(0, 0, 1);
        System.out.println("Thoi gian da thiet lap: " + O.toString());
        while (true) {
            // Hien thi thoi gian hien tai
            System.out.println(O.toString());
            try {
                Thread.sleep(1000);
                O.tangGiay();
            } catch (Exception ex) {

            }
        }
    }
}
