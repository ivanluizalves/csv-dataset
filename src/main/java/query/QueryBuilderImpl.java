package query;

import java.util.List;
import java.util.stream.Collectors;

import entity.city.City;

public class QueryBuilderImpl implements QueryBuilder {

    StringBuilder str = new StringBuilder();

    @Override
    public Integer count(List<City> dataList) {
        System.gc();
        return dataList.size();
    }

    @Override
    public Integer countDistinctProperty(List<City> dataList, String propertie) {
        System.gc();
        if (propertie == null) {
            return null;
        }
        List<City> results = dataList.stream()
                .filter(QueryUtil.distinctByKey(p -> p.getValueByFieldName(propertie).toString().toLowerCase()))
                .collect(Collectors.toList());

        return results.size();
    }

    @Override
    public List<City> filterPropertieByValue(List<City> dataList, String propertie, String value) {
        System.gc();
        List<City> results = dataList.stream()
                .filter(x -> value.toLowerCase().equals(x.getValueByFieldName(propertie).toString().toLowerCase()))
                .collect(Collectors.toList());
        return results;
    }

}
