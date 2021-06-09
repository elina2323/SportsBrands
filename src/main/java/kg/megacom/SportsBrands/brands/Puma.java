package kg.megacom.SportsBrands.brands;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:prop.properties")
public class Puma {

    @Value(value = "${puma.site}")
    private String site;

    @Value(value = "${puma.slogan}")
    private String slogan;

    public Puma(String site, String slogan) {
        this.site = site;
        this.slogan = slogan;
    }

    public Puma() {
    }

    @Override
    public String toString() {
        return "Puma{" +
                "site='" + site + '\'' +
                ", slogan='" + slogan + '\'' +
                '}';
    }
}
