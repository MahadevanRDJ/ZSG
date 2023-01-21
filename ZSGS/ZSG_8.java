public class ZSG_8 {
    public int n = 0;
    static int i;
    static int count = 0;
    ZSG_8() {
        count++;
    } // Constructor
    public static void main(String[] args) {
        System.out.println(count); // 0
        ZSG_8 a = new ZSG_8();
        ZSG_8 b = new ZSG_8();
        System.out.println(count); // 2, because there is one instance of count is created.
        a.count = 5;
        System.out.println(b.count); // 5, values shared among all the instances of class.
        
        a.display(); // Non - static methods need an object to access it.
        greetings(); // Static methods doesn't need an object.
    }
    
    static void greetings() {
        // n++; display(); --> Static methods cannot access non-static methods and non - static variables.
       
        System.out.println("Greetings!");
    }

    void display() {
        System.out.println("Displaying...");
    }
}
