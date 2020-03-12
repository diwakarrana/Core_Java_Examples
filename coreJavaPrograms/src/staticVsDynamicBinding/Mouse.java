package staticVsDynamicBinding;

public class Mouse extends Rodent {
	 protected  int tailLength = 8;
	 
	 protected  void m() {
		 System.out.println("Mouse.m()");
	 }
	 
	 public void getRodentDetails() {
         this.m();
	    }

	    public static void main(String[] args) {
	        Mouse mouse = new Mouse();
	        mouse.getRodentDetails();
	        System.out.println(mouse.tailLength);
	    }
}

class Rodent {

    protected int tailLength = 4;
    
    protected  void m() {
		 System.out.println("Rodent.m()");
	 }

    public void getRodentDetails() {
             this.m();
    }
}
