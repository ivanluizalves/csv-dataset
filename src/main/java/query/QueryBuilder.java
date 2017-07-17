package query;

import java.util.List;

import entity.city.City;

public interface QueryBuilder {

    public Integer count(List<City> dataList);

    public Integer countDistinctProperty(List<City> dataList, String propertie);

    public List<City> filterPropertieByValue(List<City> dataList, String propertie, String value);
}
