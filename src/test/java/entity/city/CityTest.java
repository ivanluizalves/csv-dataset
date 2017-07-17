package entity.city;

import org.junit.Assert;
import org.junit.Test;

import util.ConstantsTestHelper;

public class CityTest {

    CityTestHelper helper = new CityTestHelper();

    @Test
    public void testCityConstrutor() {
        City city = this.helper.createSampleCity();

        Assert.assertEquals(city.getIbgeId(), ConstantsTestHelper.IBGE_ID);
        Assert.assertEquals(city.getUf(), ConstantsTestHelper.UF);
        Assert.assertEquals(city.getName(), ConstantsTestHelper.NAME);
        Assert.assertEquals(city.getCapital(), ConstantsTestHelper.CAPITAL);
        Assert.assertEquals(city.getLon(), ConstantsTestHelper.LON);
        Assert.assertEquals(city.getLat(), ConstantsTestHelper.LAT);
        Assert.assertEquals(city.getNoAccents(), ConstantsTestHelper.NO_ACCENTS);
        Assert.assertEquals(city.getAlternativeNames(), ConstantsTestHelper.ALTERNATIVE_NAMES);
        Assert.assertEquals(city.getMicroRegion(), ConstantsTestHelper.MICRO_REGION);
        Assert.assertEquals(city.getMesoRegion(), ConstantsTestHelper.MESO_REGION);
    }

    @Test
    public void testToString() {
        City city = this.helper.createSampleCity();
        Assert.assertEquals(city.toString(), ConstantsTestHelper.HEADER);
    }

    @Test
    public void getValueByFieldName() {
        City city = this.helper.createSampleCity();
        Assert.assertEquals(city.getValueByFieldName("capital"), ConstantsTestHelper.CAPITAL);
        Assert.assertEquals(city.getValueByFieldName("name"), ConstantsTestHelper.NAME);
        Assert.assertEquals(city.getValueByFieldName("uf"), ConstantsTestHelper.UF);
    }

}
