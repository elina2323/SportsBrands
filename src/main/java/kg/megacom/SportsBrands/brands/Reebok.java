package kg.megacom.SportsBrands.brands;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:prop.properties")
public class Reebok {

    @Value(value = "${reebok.site}")
    private String site;
    @Value(value = "${reebok.slogan}")
    private String slogan;

    public Reebok(String site, String slogan) {
        this.site = site;
        this.slogan = slogan;
    }

    public Reebok() {
    }

    @Override
    public String toString() {
        return "Reebok{" +
                "site='" + site + '\'' +
                ", slogan='" + slogan + '\'' +
                '}';
    }
}
