package kg.megacom.SportsBrands;
import kg.megacom.SportsBrands.gender.Kids;
import kg.megacom.SportsBrands.gender.Men;
import kg.megacom.SportsBrands.gender.Women;
import kg.megacom.SportsBrands.outlet.Sale;
import kg.megacom.SportsBrands.service.CompanyInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Company {
    private final Sale sale;
    private final Women women;
    private final Men men;
    private final Kids kids;
    private CompanyInterface companyInterface;


    @Autowired

    public Company(Sale sale, Women women, Men men, Kids kids, @Qualifier("companyInterfaceImpl") CompanyInterface companyInterface) {
        this.sale = sale;
        this.women = women;
        this.men = men;
        this.kids = kids;
        this.companyInterface = companyInterface;
    }

    public void test(){
        Sale sale = companyInterface.getInfoSale();
        System.out.println("Prices before discount: \n" + sale);

    }

    @Override
    public String toString() {
        return "Company{" + "\n" +
                "sale=" + sale + "\n" +
                "women=" + women + "\n" +
                "men=" + men + "\n" +
                "kids=" + kids + "\n" +
                '}';
    }
}
