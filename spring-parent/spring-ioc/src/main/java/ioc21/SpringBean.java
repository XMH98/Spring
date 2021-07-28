package ioc21;

import org.springframework.core.io.Resource;

/**
 * Author: 徐明皓
 * Date: 2021-05-10 15:38
 * Description: <描述>
 */
public class SpringBean {

    private Resource resource;

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }
}
