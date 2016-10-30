package wiring;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;


public class BeanCounter implements BeanFactoryPostProcessor {
    private Logger logger = Logger.getLogger(BeanCounter.class);
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory factory) throws BeansException {
        logger.debug("BEAN COUNT: " + factory.getBeanDefinitionCount());
    }
}
