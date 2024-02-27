public class unit1pract4 {
    public static void main(String[] args) {
        int a, b, c, max;
        a= Integer.parseInt(args[0]);
        b= Integer.parseInt(args[1]);
        c= Integer.parseInt(args[2]);
        if(a>b)
        {
            if(a>c)
            max=a;
            else
            max=c;
        }
        else
        {
            if(b>c)
            max=b;
            else
            max=c;
        }
        System.out.println("Max among"+ a +","+ b +"and"+ c +"is..."+max);
    }
}
