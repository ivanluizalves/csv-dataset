package entity.city;

import util.ConstantsTestHelper;

public class CityTestHelper {

    public City createSampleCity() {
        String ibgeId = ConstantsTestHelper.IBGE_ID;
        String uf = ConstantsTestHelper.UF;
        String name = ConstantsTestHelper.NAME;
        String capital = ConstantsTestHelper.CAPITAL;
        String lon = ConstantsTestHelper.LON;
        String lat = ConstantsTestHelper.LAT;
        String noAccents = ConstantsTestHelper.NO_ACCENTS;
        String alternativeNames = ConstantsTestHelper.ALTERNATIVE_NAMES;
        String microRegion = ConstantsTestHelper.MICRO_REGION;
        String mesoRegion = ConstantsTestHelper.MESO_REGION;

        City city = new City(ibgeId, uf, name, capital, lon, lat, noAccents, alternativeNames, microRegion, mesoRegion);
        return city;
    }
}