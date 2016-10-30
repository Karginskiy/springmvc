package wiring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Field;

/**
 * BeanPostProcessor
 * For Fuddifying beans. Replace R & L by W.
 *
 */
public class Fuddifier implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        Field[] fields = o.getClass().getDeclaredFields();

        try {
            for (Field field : fields) {
                if (field.getType().equals(String.class)) {
                    field.setAccessible(true);
                    String original = (String) field.get(o);
                    field.set(o, fuddify(original));
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return o;
    }

    private String fuddify(String orig) {
        if (orig == null) return orig;
        return orig.replaceAll("(r|l)", "w").replaceAll("(R|L)", "W");
    }
}
