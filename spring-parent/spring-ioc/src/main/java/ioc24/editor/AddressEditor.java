package ioc24.editor;

import ioc24.Address;

import java.awt.*;
import java.beans.PropertyChangeListener;
import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Author: 徐明皓
 * Date: 2021-05-10 19:46
 * Description: <定义一个属性编辑器>
 */
public class AddressEditor extends PropertyEditorSupport {

    //将Adress转换成String
    @Override
    public String getAsText() {
        Address address = (Address) getValue();
        return "["+address.getCity()+"-"+address.getProvince()+"]";
    }

    //将String转换成Address
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        Pattern pattern = Pattern.compile("\\[(.*)-(.*)\\]");
        Matcher matcher = pattern.matcher(text);
        if (matcher.matches()){
            String city = matcher.group(1);
            String province = matcher.group(2);
            Address address = new Address();
            address.setCity(city);
            address.setProvince(province);
            //调用setValue()设置值
            setValue(address);
        }
    }
}
