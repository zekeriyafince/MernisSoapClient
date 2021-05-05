package com.zekeriyafince.javamernisdemo.adapters;

import com.zekeriyafince.javamernisdemo.entities.Customer;
import com.zekeriyafince.javamernisdemo.interfaces.RealPersonService;
import com.zekeriyafince.javamernisdemo.models.Result;
import java.time.ZoneId;
import tr.gov.nvi.tckimlik.ws.KPSPublic;
import tr.gov.nvi.tckimlik.ws.KPSPublicSoap;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 03.05.2021 17:12
 */
public class MernisServiceAdapter implements RealPersonService {

    public Result CheckIfRealPerson(Customer customer) {
        KPSPublic service = new KPSPublic();
        KPSPublicSoap kpsPublicSoapProxy = service.getKPSPublicSoap();
        boolean result = true;

        try {
            result = kpsPublicSoapProxy.tcKimlikNoDogrula(
                    Long.parseLong(customer.getIdentityNumber()),
                    customer.getFirstName().toUpperCase(),
                    customer.getLastName().toUpperCase(),
                    customer.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear()
            );
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if (result) {
            return new Result(true);
        } else {
            return new Result(false, "kimlik doğrulama başarısız.");
        }

    }

}
