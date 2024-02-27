public class returnarray {
    public static int [] display ()
    {
        int a[]={10,20,30,40,50};
        return(a);
    }
    public static void main(String[] args) {
        int n[];
        n=display();
        for(int i=0;i<5;i++)
        {
            System.out.println(n[i]);
        }
    }
}
