public class J2A8
{
public static void main (String[] args)
{

String customerName;
customerName = "Aditya Sharma"; // This declares the customers name

String Statement;
Statement = "You have bought a"; // This declares the first sentence on the receipt

String EndStatement;
EndStatement = " Thank you for coming to SharmaDonalds. Have a great day, we hope to see you soon. ";

final double  HST;
HST = 0.13; // This is the Tax on any item that they buy

double VeggieBurger = 25.0;
double ColdDrink = 50.0;
double Fries = 25.0; 

/* The only reason why the prices are so high is because this was brought in Jamica
where prices are extremely high. */


double Price = VeggieBurger + ColdDrink + Fries;
double Tax = HST * Price;
double Total = Tax + Price;

// These functions ^^^ are necessary for a cashier to input orders

System.out.println (customerName);
System.out.println ( Statement + "  Burger, Fries and a Drink. " + "\n");
System.out.println ( "$" + Price + " price");
System.out.println ( "$" + Tax +  " HST");
System.out.println ("-----------------");
System.out.println ( "$" + Total + " Total" + "\n \n");
System.out.println (EndStatement);
}
}