public class complex
{
    int real,image;
    complex ()
    {}
    complex(int real1,int image1)
    {
        real=real1;
        image=image1;
    }
    static complex add ( complex c1,complex c2)
    {
      complex csum=new complex();
      csum.real=c1.real+c2.real;
      csum.image=c1.image+c2.image;
      return csum;
    }
    static complex sub ( complex c1,complex c2)
    {
      complex csub=new complex();
      csub.real=c1.real-c2.real;
      csub.image=c1.image-c2.image;
      return csub;
    }
    static complex mul ( complex c1,complex c2)
    {
      complex cmul=new complex();
      cmul.real=c1.real*c2.real-c1.image*c2.image;
      cmul.image=c1.real*c2.image+c1.image*c2.real;
      return cmul;
    }
    public static void main(String[] args) {
        complex c1=new complex(4,8);
        complex c2=new complex(5,7);
        complex c3=new complex();
        c3=c3.add(c1,c2);
        System.out.println("Sum:"+c3.real+"+i"+c3.image);
        c3=c3.sub(c1,c2);
        System.out.println("Sub:"+c3.real+"+i"+c3.image);
        c3=c3.mul(c1,c2);
        System.out.println("Mul:"+c3.real+"+i"+c3.image);
        
    }


}
