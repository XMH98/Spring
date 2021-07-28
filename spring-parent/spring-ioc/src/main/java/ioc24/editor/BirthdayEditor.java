package ioc24.editor;

import ioc24.Address;
import ioc24.Birthday;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Author: 徐明皓
 * Date: 2021-05-10 20:32
 * Description: <描述>
 */
public class BirthdayEditor extends PropertyEditorSupport {
    @Override
    public String getAsText() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format((Date)getValue());
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = dateFormat.parse(text);
            setValue(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
