package kg.megacom.SportsBrands;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SportsBrandsApplication {


	public static void main(String[] args) {
		SpringApplication.run(SportsBrandsApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CompanyConfig.class);
		Company company = context.getBean(Company.class);
		company.test();
		System.out.println(company);

		context.close();
	}

}
