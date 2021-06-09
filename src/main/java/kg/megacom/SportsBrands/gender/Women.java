package kg.megacom.SportsBrands.gender;

import kg.megacom.SportsBrands.brands.Nike;
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
public class Women{

    @Autowired
    private Nike nike;

    @Value(value = "#{'${women.shoes}'.split(',')}")
    private List<Integer> womenShoes;
    @Value(value = "#{'${women.clothing}'.split(',')}")
    private List<String> womenClothing;

    private List<String> womenStyle = new LinkedList<>();
    private Map<String, Integer> womenStylePrice = new HashMap<>();

    public Women() {
        womenStyle.add("Trousers");
        womenStyle.add("Blouse");

        womenStylePrice.put("Trousers", 5000);
        womenStylePrice.put("Blouse", 4000);

    }

    @Value("#{women.womenStylePrice['Trousers']}")
    private Integer trousersPrice;

    @Value("#{women.womenStylePrice['Blouse']}")
    private Integer blousePrice;

    public Women(Nike nike, List<Integer> womenShoes, List<String> womenClothing, List<String> womenStyle, Map<String, Integer> womenStylePrice, Integer trousersPrice, Integer blousePrice) {
        this.nike = nike;
        this.womenShoes = womenShoes;
        this.womenClothing = womenClothing;
        this.womenStyle = womenStyle;
        this.womenStylePrice = womenStylePrice;
        this.trousersPrice = trousersPrice;
        this.blousePrice = blousePrice;
    }

    public Map<String, Integer> getWomenStylePrice() {
        return womenStylePrice;
    }

    @Override
    public String toString() {
        return "Women{" +
                "brand=" + nike + ", \n" +
                "womenShoes=" + womenShoes + ", \n" +
                "womenClothing=" + womenClothing + ", \n" +
                "trousersPrice=" + trousersPrice + ", \n" +
                "blousePrice=" + blousePrice + ", \n" +
                '}' + "\n";
    }
}
