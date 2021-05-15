import java.util.Scanner;

public class TriangleArea {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      Triangle triangle1 = new Triangle();
      Triangle triangle2 = new Triangle();
      double base1;
      double base2;
      double hei1;
      double hei2;
      
      base1 = scnr.nextDouble();
      hei1 = scnr.nextDouble();
      base2  = scnr.nextDouble();
      hei2  = scnr.nextDouble();

      // TODO: Read and set base and height for triangle1 (use setBase() and setHeight())
      triangle1.setBase(base1);
      triangle1.setHeight(hei1);
      // TODO: Read and set base and height for triangle2 (use setBase() and setHeight())
      triangle2.setBase(base2);
      triangle2.setHeight(hei2);
      // TODO: Determine larger triangle (use getArea())
      
      System.out.println("Triangle with larger area:");
      // TODO: Output larger triangle's info (use printInfo())
      if (triangle1.getArea() < triangle2.getArea()){
         triangle2.printInfo();
         }
      else {
         triangle1.printInfo();
         }
   }
   
}
