
 package Exercise13;

 

public class Exercise13_5Test {
    
    public static void main(String[] args) {

        Circle circ1 = new Circle(15, "green", true); 
        Circle circ2 = new Circle(10, "red", false); 
        Circle maxCircle = (Circle)GeometricObject.max(circ1, circ2);
        System.out.println("Circle 1: " + circ1);
        System.out.println("Circle 2: " + circ2);
        System.out.println("Max circ is: " + maxCircle);
        
        Rectangle rec1 = new Rectangle(4, 5, "cyan", true);
        Rectangle rec2 = new Rectangle(4, 5, "gray", true);
        Rectangle maxRectangle = (Rectangle)GeometricObject.max(rec1, rec2);
        System.out.println("MyRec 1: " + rec1);
        System.out.println("MyRec 2: " + rec2);
        System.out.println("Max Rec is: " + maxRectangle);
    }
}


    

