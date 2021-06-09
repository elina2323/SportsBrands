package kg.megacom.SportsBrands.gender;


import kg.megacom.SportsBrands.brands.Puma;
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
public class Kids{

    @Autowired
    private Puma puma;

    @Value(value = "#{'${kids.shoes}'.split(',')}")
    private List<Integer> boysShoes;
    @Value(value = "#{'${kids.clothing}'.split(',')}")
    private List<String> boysClothing;

    @Value(value = "#{'${kids.shoes}'.split(',')}")
    private List<Integer> girlsShoes;
    @Value(value = "#{'${kids.clothing}'.split(',')}")
    private List<String> girlsClothing;

    private List<String> boysStyle = new LinkedList<>();
    private Map<String, Integer> boysStylePrice = new HashMap<>();

    private List<String> girlsStyle = new LinkedList<>();
    private Map<String, Integer> girlsStylePrice = new HashMap<>();

    public Kids() {

        boysStyle.add("Shorts");
        boysStyle.add("T-shirt");

        boysStylePrice.put("Shorts", 4000);
        boysStylePrice.put("T-shirt", 3000);

        girlsStyle.add("Dress");
        girlsStyle.add("Skirt");

        girlsStylePrice.put("Dress", 6700);
        girlsStylePrice.put("Skirt", 5800);
    }

    @Value("#{kids.boysStylePrice['Shorts']}")
    private Integer shortsPrice;

    @Value("#{kids.boysStylePrice['T-shirt']}")
    private Integer tShirtPrice;

    @Value("#{kids.girlsStylePrice['Dress']}")
    private Integer dressPrice;

    @Value("#{kids.girlsStylePrice['Skirt']}")
    private Integer skirtPrice;

    public Kids(Puma puma, List<Integer> boysShoes, List<String> boysClothing, List<Integer> girlsShoes, List<String> girlsClothing, List<String> boysStyle, Map<String, Integer> boysStylePrice, List<String> girlsStyle, Map<String, Integer> girlsStylePrice, Integer shortsPrice, Integer tShirtPrice, Integer dressPrice, Integer skirtPrice) {
        this.puma = puma;
        this.boysShoes = boysShoes;
        this.boysClothing = boysClothing;
        this.girlsShoes = girlsShoes;
        this.girlsClothing = girlsClothing;
        this.boysStyle = boysStyle;
        this.boysStylePrice = boysStylePrice;
        this.girlsStyle = girlsStyle;
        this.girlsStylePrice = girlsStylePrice;
        this.shortsPrice = shortsPrice;
        this.tShirtPrice = tShirtPrice;
        this.dressPrice = dressPrice;
        this.skirtPrice = skirtPrice;
    }

    public Map<String, Integer> getBoysStylePrice() {
        return boysStylePrice;
    }

    public Map<String, Integer> getGirlsStylePrice() {
        return girlsStylePrice;
    }

    @Override
    public String toString() {
        return "Kids{" +
                "brand=" + puma + ", \n" +
                "boysShoes=" + boysShoes + ", \n" +
                "boysClothing=" + boysClothing + ", \n" +
                "girlsShoes=" + girlsShoes + ", \n" +
                "girlsClothing=" + girlsClothing + ", \n" +
                "shortsPrice=" + shortsPrice + ", \n" +
                "tShirtPrice=" + tShirtPrice + ", \n" +
                "dressPrice=" + dressPrice + ", \n" +
                "skirtPrice=" + skirtPrice + ", \n" +
                '}' + "\n";
    }
}
