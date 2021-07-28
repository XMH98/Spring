package ioc05;

import java.util.*;

/**
 * Author: 徐明皓
 * Date: 2021-05-08 16:28
 * Description: <描述>
 */
public class SpringBean {

    //其他bean的引用
    private OtherBean otherBean;

    //集合类型装配
    private Integer[] arrays;
    private List<OtherBean> list;
    private Set<OtherBean> set;
    private Map<OtherBean,Class> map;
    private Properties properties;


    public Integer[] getArrays() {
        return arrays;
    }

    public void setArrays(Integer[] arrays) {
        this.arrays = arrays;
    }

    public List<OtherBean> getList() {
        return list;
    }

    public void setList(List<OtherBean> list) {
        this.list = list;
    }

    public Set<OtherBean> getSet() {
        return set;
    }

    public void setSet(Set<OtherBean> set) {
        this.set = set;
    }

    public Map<OtherBean, Class> getMap() {
        return map;
    }

    public void setMap(Map<OtherBean, Class> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public OtherBean getOtherBean() {
        return otherBean;
    }

    public void setOtherBean(OtherBean otherBean) {
        this.otherBean = otherBean;
    }

    @Override
    public String toString() {
        return "SpringBean{" +
                "otherBean=" + otherBean +
                ", arrays=" + Arrays.toString(arrays) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
