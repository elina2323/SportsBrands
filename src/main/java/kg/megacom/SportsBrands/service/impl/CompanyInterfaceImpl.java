package kg.megacom.SportsBrands.service.impl;

import kg.megacom.SportsBrands.outlet.Sale;
import kg.megacom.SportsBrands.service.CompanyInterface;
import org.springframework.stereotype.Service;

@Service
public class CompanyInterfaceImpl implements CompanyInterface {
    @Override
    public Sale getInfoSale() {
        return new Sale(80000, 15000, 20000);
    }
}
