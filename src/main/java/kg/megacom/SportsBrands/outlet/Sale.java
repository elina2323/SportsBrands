package kg.megacom.SportsBrands.outlet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sale {

    @Value("#{8000 / 100 * 30}") // 30% discount
    private double sweater;
    @Value("#{15000 / 100 * 50}") // 50% discount
    private double jacket;
    @Value("#{20000 / 100 * 60}") // 60% discount
    private double boots;


    public Sale(double sweater, double jacket, double boots) {
        this.sweater = sweater;
        this.jacket = jacket;
        this.boots = boots;
    }

    public Sale() {

    }

    @Override
    public String toString() {
        return "Sale{" +
                "sweater=" + sweater + ", \n" +
                "jacket=" + jacket + ", \n" +
                "boots=" + boots + ", \n" +
                '}' + "\n";
    }
}
