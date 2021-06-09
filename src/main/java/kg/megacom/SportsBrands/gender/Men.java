package kg.megacom.SportsBrands.gender;

import kg.megacom.SportsBrands.brands.UnderArmour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Component
@PropertySource("classpath:prop.properties")
public class Men{

    @Autowired
    private UnderArmour underArmour;

    @Value(value = "#{'${men.shoes}'.split(',')}")
    private List<Integer> menShoes;
    @Value(value = "#{'${men.clothing}'.split(',')}")
    private List<String> menClothing;

    private List<String> menStyle = new LinkedList<>();
    private Map<String, Integer> menStylePrice = new HashMap<>();

    public Men() {
        menStyle.add("Pants");
        menStyle.add("Polo");

        menStylePrice.put("Pants", 7000);
        menStylePrice.put("Polo", 6000);

    }

    @Value("#{men.menStylePrice['Pants']}")
    private Integer pantsPrice;

    @Value("#{men.menStylePrice['Polo']}")
    private Integer poloPrice;

    public Men(UnderArmour underArmour, List<Integer> menShoes, List<String> menClothing, List<String> menStyle, Map<String, Integer> menStylePrice, Integer pantsPrice, Integer poloPrice) {
        this.underArmour = underArmour;
        this.menShoes = menShoes;
        this.menClothing = menClothing;
        this.menStyle = menStyle;
        this.menStylePrice = menStylePrice;
        this.pantsPrice = pantsPrice;
        this.poloPrice = poloPrice;
    }

    public Map<String, Integer> getMenStylePrice() {
        return menStylePrice;
    }

    @Override
    public String toString() {
        return "Men{" +
                "brand=" + underArmour + ", \n" +
                "menShoes=" + menShoes + ", \n" +
                "menClothing=" + menClothing + ", \n" +
                "pantsPrice=" + pantsPrice + ", \n" +
                "poloPrice=" + poloPrice + ", \n" +
                '}' + "\n";
    }
}
