public class EqualLength {
    double x1;
    double x2;
    double x3;
    double x4;
    double y1;
    double y2;
    double y3;
    double y4;
    EqualLength(double x_1, double x_2,double x_3,double x_4, double y_1, double y_2,double y_3,double y_4){
        x1 = x_1;
        x2 = x_2;
        x3 = x_3;
        x4 = x_4;
        y1 = y_1;
        y2 = y_2;
        y3 = y_3;
        y4 = y_4;
    }
    public  boolean isLength(){
        double line_1 = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        double line_2 = Math.sqrt(Math.pow((x4-x3),2)+Math.pow((y4-y3),2));
        System.out.println("line_1 is : "+line_1);
        System.out.println("line_2 is : "+line_2);
        if(line_1 == line_2){
            return true;
        }
        else{
            return false;
        }
    }
    public void calculate(){
        if(isLength()==true){
            System.out.println("line_1 is : ");
            System.out.println("Two line is Equal");
        }
        else{
            System.out.println("Two line is not Equal");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
        EqualLength len= new EqualLength(1,1,1,1,4,8,9,7);
        len.calculate();
    }
}
