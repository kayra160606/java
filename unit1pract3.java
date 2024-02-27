public class unit1pract3
{
public static void main(String args[])
{
/* EMI = amount * rate /C100*60)

price = 200;

tax = 2

quantity = 5;*/

double total_price = 0;
int ch, quantity;

System .out.println("1. Seat cover");



System.out.println(" 2. Steering wheel");

System.out.println("3. Car lighting");
 System.out.println("4. Air purifiers"); 
 System.out.println("5. All others");

ch = Integer.parseInt (args[0]);
quantity = Integer.parseInt(args[1]);
switch(ch)
{
case 1:

total_price = 200*quantity + (2*200/100);
 break;
case 2:

total_price = 200* quantity + (3* 300/100); 
break;

case 3:

total_price = 400* quantity + (4*400/100); 
break;

case 4:

total_price = 500* quantity + (2.5 * 500/100); 
break;

case 5:

total_price = 100* quantity + (1.2*100/100);

break; 
default: System.out.println ("Invalid choice "); 
}
System.out. println ("Price"+ total_price);

}
}