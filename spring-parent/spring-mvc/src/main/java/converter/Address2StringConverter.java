package converter;

import entity.Address;
import org.springframework.core.convert.converter.Converter;

/**
 * Author: 徐明皓
 * Date: 2021-07-30 20:38
 * Description: <描述>
 */
public class Address2StringConverter implements Converter<Address,String> {
    @Override
    public String convert(Address address) {
        return "["+address.getCity()+"-"+address.getProvince()+"]";
    }
}
