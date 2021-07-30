package editor;

import entity.Address;

import java.beans.PropertyEditorSupport;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Author: 徐明皓
 * Date: 2021-07-30 20:07
 * Description: <描述>
 */
public class AddressEditor extends PropertyEditorSupport {

    @Override
    public String getAsText() {
        Address address = (Address) getValue();
        return "["+address.getCity()+"-"+address.getProvince()+"]";
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        Pattern pattern = Pattern.compile("\\[(.*)-(.*)\\]");
        Matcher matcher = pattern.matcher(text);
        if(matcher.matches()){
            String city = matcher.group(1);
            String province = matcher.group(2);
            Address address = new Address();
            address.setCity(city);
            address.setProvince(province);
            setValue(address);
        }
    }
}
