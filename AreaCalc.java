public class AreaClac {
    static double Area(int x)
    {
        return x*x;
    }
    static double Area( int x,y)
    {
        return x*y;
    }
    public static void main (String [] args)
    {
        int x,y;
        x= Integer.parseInt(args[0]);
        y= Integer.parseInt(args[1]);
        AreaCalc a= new AreaCalc();
        System.out.println("Area of squre"+a.Area (x));
        System.out.println("Area of rectangle"+a.Area(x,y));
    }
    }
    
}
