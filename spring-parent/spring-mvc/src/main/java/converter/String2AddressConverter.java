package converter;

import entity.Address;
import org.springframework.core.convert.converter.Converter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Author: 徐明皓
 * Date: 2021-07-30 20:31
 * Description: <描述>
 */
public class String2AddressConverter implements Converter<String, Address> {

    @Override
    public Address convert(String source) {
        Pattern pattern = Pattern.compile("\\[(.*)-(.*)\\]");
        Matcher matcher = pattern.matcher(source);
        if(matcher.matches()){
            String city = matcher.group(1);
            String province = matcher.group(2);
            Address address = new Address();
            address.setCity(city);
            address.setProvince(province);
            return address;
        }else {
            throw  new RuntimeException("地址转换失败");
        }
    }
}
