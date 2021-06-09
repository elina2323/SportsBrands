package kg.megacom.SportsBrands;
import kg.megacom.SportsBrands.brands.*;
import kg.megacom.SportsBrands.gender.Kids;
import kg.megacom.SportsBrands.gender.Men;
import kg.megacom.SportsBrands.gender.Women;
import kg.megacom.SportsBrands.outlet.Sale;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "kg.megacom.SportsBrands")

public class CompanyConfig {

    @Bean
    public Women getWomen() {
        return new Women();
    }

    @Bean
    public Men getMen() {
        return new Men();
    }

    @Bean
    public Kids getKids() {
        return new Kids();
    }

    @Bean
    @Scope("prototype")
//    В большинстве случаев prototype Spring beans используется в многопоточном приложении, когда каждый поток
//    должен получить новую копию Bean, чтобы избежать проблем параллелизма, таких как чтение / запись общих
//    данных всеми потоками.
    public Sale getSale() {
        return new Sale();
    }

    @Bean
    public Puma getPuma(){return new Puma();}

    @Bean
    public Nike getNike(){return new Nike();}

    @Bean
    public UnderArmour getUnderArmour(){return new UnderArmour();}
}



