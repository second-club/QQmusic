package cn.bdqn.conversion;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class String2DateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String source) {
        if (source==null || "".equals(source.trim())) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try{
            return sdf.parse(source);
        }catch (Exception e){
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
            try{
                return sdf2.parse(source);
            }catch (Exception e1){
                throw new RuntimeException("传入的参数有问题");
            }
        }
    }

}
