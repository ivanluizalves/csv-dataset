package entity.city;

import entity.Entity;

public class City extends Entity {
    private String ibge_id;
    private String uf;
    private String name;
    private String capital;
    private String lon;
    private String lat;
    private String no_accents;
    private String alternative_names;
    private String microRegion;
    private String mesoRegion;

    public City(String ibgeId, String uf, String name, String capital, String lon, String lat, String noAccents,
            String alternativeNames, String microRegion, String mesoRegion) {
        this.ibge_id = ibgeId;
        this.uf = uf;
        this.name = name;
        this.capital = capital;
        this.lon = lon;
        this.lat = lat;
        this.no_accents = noAccents;
        this.alternative_names = alternativeNames;
        this.microRegion = microRegion;
        this.mesoRegion = mesoRegion;
    }

    public String getIbgeId() {
        return this.ibge_id;
    }

    public void setIbgeId(String ibge_id) {
        this.ibge_id = ibge_id;
    }

    public String getUf() {
        return this.uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return this.capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getLon() {
        return this.lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return this.lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getNoAccents() {
        return this.no_accents;
    }

    public void setNoAccents(String no_accents) {
        this.no_accents = no_accents;
    }

    public String getAlternativeNames() {
        return this.alternative_names;
    }

    public void setAlternativeNames(String alternative_names) {
        this.alternative_names = alternative_names;
    }

    public String getMicroRegion() {
        return this.microRegion;
    }

    public void setMicroRegion(String microRegion) {
        this.microRegion = microRegion;
    }

    public String getMesoRegion() {
        return this.mesoRegion;
    }

    public void setMesoRegion(String mesoRegion) {
        this.mesoRegion = mesoRegion;
    }
}
