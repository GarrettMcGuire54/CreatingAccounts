import java.text.NumberFormat;
import static java.lang.System.out;


public class Account {
    String lastName;
    int id;
    double balance;

    void display() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        out.print("The account with the last name ");
        out.print(lastName);
        out.print(" and ID number ");
        out.print(id);
        out.print(" has a balance ");
        out.println(currency.format(balance));
    }

}
