package kg.megacom.SportsBrands.brands;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:prop.properties")
public class UnderArmour {

    @Value(value = "${underarmour.site}")
    private String site;
    @Value(value = "${underarmour.slogan}")
    private String slogan;

    public UnderArmour(String site, String slogan) {
        this.site = site;
        this.slogan = slogan;
    }

    public UnderArmour() {
    }

    @Override
    public String toString() {
        return "UnderArmour{" +
                "site='" + site + '\'' +
                ", slogan='" + slogan + '\'' +
                '}';
    }
}
