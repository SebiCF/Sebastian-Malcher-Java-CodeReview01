public class areaCalculator {
    public static void main(String[] args){

        int[] rectWidth = { 82, 45, 71, 29, 53, 9, 31 };
        int[] rectHeight = { 7, 92, 13, 42, 87, 28, 39 };

        System.out.println("\nRectangles from array");
        for(int i = 0; i < rectHeight.length; i++){
            System.out.println(calculateRectArea(rectWidth[i],rectHeight[i]) + " cm²");
        }

//      --------RectArea---------------
        System.out.println("\nRectangles area calculation");
        System.out.println(calculateRectArea(20,30) + " cm²");
        System.out.println(calculateRectArea(40,50) + " cm²");
        System.out.println(calculateRectArea(50,60) + " cm²");

//      --------squareArea--------------
        System.out.println("\nSquares area calculation");
        System.out.println(calculateSquareArea(30) + " cm²");
        System.out.println(calculateSquareArea(80) + " cm²");
        System.out.println(calculateSquareArea(50) + " cm²");

//      --------squarePerimeter---------
        System.out.println("\nSquares perimeter calculation");
        System.out.println(calculateSquarePerimeter(70) + " cm");
        System.out.println(calculateSquarePerimeter(90) + " cm");
        System.out.println(calculateSquarePerimeter(130) + " cm");

//      -------parameterCalculation-----
        System.out.println("\nRectangles area calculation with args from main()");
        for(int i = 0; i < args.length; i = i+2){
            System.out.println(calculateRectArea(Integer.parseInt(args[i]), Integer.parseInt(args[i+1])) + " cm²");
        }
    }

//  --------methods-------------
    public static int calculateRectArea(int width, int height){
        return width * height;
    }
    public static int calculateSquareArea(int width){
        return width * width;
    }
    public static int calculateSquarePerimeter(int width){
        return width * 4;
    }

}
