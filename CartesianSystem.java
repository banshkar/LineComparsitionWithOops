public class CartesianSystem {
    double x1;
    double x2;
    double y1;
    double y2;
    CartesianSystem(double x_1, double x_2, double y_1, double y_2){
        x1 = x_1;
        x2 = x_2;
        y1 = y_1;
        y2 = y_2;
    }
    public double length(){
       double length = Math.sqrt(Math.pow((x2-x1),2) +Math.pow(y2-y1,2));
       return length;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
        CartesianSystem len= new CartesianSystem(5,2,6,7);
        double  calculate =len.length();
        System.out.println("A length 2 point (x1,x2) and (y1,y2) is : " + calculate);
    }
}
