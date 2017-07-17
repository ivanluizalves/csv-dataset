package query;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import entity.city.City;
import read.Reader;
import util.ConstantsTestHelper;

public class QueryTest {

    @Test
    public void testCount() {
        QueryBuilder builder = new QueryBuilderImpl();
        Reader reader = new Reader();
        List<City> dataList = reader.getListCitys();
        Assert.assertEquals(builder.count(dataList), new Integer(ConstantsTestHelper.LIST_FULL_SIZE));
    }

    @Test
    public void testCountDistinctUf() {
        QueryBuilder builder = new QueryBuilderImpl();
        Reader reader = new Reader();
        List<City> dataList = reader.getListCitys();
        Assert.assertEquals(builder.countDistinctProperty(dataList, ConstantsTestHelper.UF),
                new Integer(ConstantsTestHelper.DISTINCT_VALUES_UF));
    }

    @Test
    public void testCountDistinctIds() {
        QueryBuilder builder = new QueryBuilderImpl();
        Reader reader = new Reader();
        List<City> dataList = reader.getListCitys();
        Assert.assertEquals(builder.countDistinctProperty(dataList, ConstantsTestHelper.IBGE_ID),
                new Integer(ConstantsTestHelper.LIST_FULL_SIZE));
    }

    @Test
    public void testFilterUfGo() {
        QueryBuilder builder = new QueryBuilderImpl();
        Reader reader = new Reader();
        List<City> dataList = reader.getListCitys();
        List<City> cityes = builder.filterPropertieByValue(dataList, ConstantsTestHelper.UF, ConstantsTestHelper.UF_GO);
        Assert.assertNotNull(cityes);
        Assert.assertEquals(ConstantsTestHelper.UF_GO_SIZE, cityes.size());
    }

    @Test
    public void testFilterUfAp() {
        QueryBuilder builder = new QueryBuilderImpl();
        Reader reader = new Reader();
        List<City> dataList = reader.getListCitys();
        List<City> cityes = builder.filterPropertieByValue(dataList, ConstantsTestHelper.UF, ConstantsTestHelper.UF_AP);
        Assert.assertNotNull(cityes);
        Assert.assertEquals(ConstantsTestHelper.UF_AP_SIZE, cityes.size());
    }
}
