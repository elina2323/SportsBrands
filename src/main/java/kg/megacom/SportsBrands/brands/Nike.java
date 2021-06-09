package kg.megacom.SportsBrands.brands;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:prop.properties")
public class Nike {

    @Value(value = "${nike.site}")
    private String site;
    @Value(value = "${nike.slogan}")
    private String slogan;

    public Nike(String site, String slogan) {
        this.site = site;
        this.slogan = slogan;
    }

    public Nike() {

    }

    @Override
    public String toString() {
        return "Nike{" +
                "site='" + site + '\'' +
                ", slogan='" + slogan + '\'' +
                '}';
    }
}
