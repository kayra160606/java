public class unit1pract5 {
    public static void main(String[] args) {
        int x,y,z;
        double hyp;
        x= Integer.parseInt(args[0]);
        y= Integer.parseInt(args[1]);
        z= (x*x)+(y*y);
        hyp=Math.sqrt(z);
        System.out.println("hypotenuse="+hyp);
    }
    
}
