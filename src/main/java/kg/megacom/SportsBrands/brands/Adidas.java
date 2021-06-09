package kg.megacom.SportsBrands.brands;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:prop.properties")
public class Adidas {

    @Value(value = "${adidas.site}")
    private String site;
    @Value(value = "${adidas.slogan}")
    private String slogan;

    public Adidas(String site, String slogan) {
        this.site = site;
        this.slogan = slogan;
    }

    public Adidas() {
    }

    @Override
    public String toString() {
        return "Adidas{" +
                "site='" + site + '\'' +
                ", slogan='" + slogan + '\'' +
                '}';
    }
}
