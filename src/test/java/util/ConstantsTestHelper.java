package util;

public class ConstantsTestHelper {

    public static String STRING_FAIL = "Fail";
    public static long TOTAL_SPACE_FILE = 125192630272l;
    public static String HEADER = "ibge_id,uf,name,capital,lon,lat,no_accents,alternative_names,microregion,mesoregion";
    public static int LIST_FULL_SIZE = 5565;

    public static String IBGE_ID = "ibge_id";
    public static String UF = "uf";
    public static String NAME = "name";
    public static String CAPITAL = "capital";
    public static String LON = "lon";
    public static String LAT = "lat";
    public static String NO_ACCENTS = "no_accents";
    public static String ALTERNATIVE_NAMES = "alternative_names";
    public static String MICRO_REGION = "microregion";
    public static String MESO_REGION = "mesoregion";

    public static int DISTINCT_VALUES_UF = 27;
    public static String UF_GO = "go";
    public static String UF_AP = "ap";
    public static int UF_GO_SIZE = 246;
    public static int UF_AP_SIZE = 16;

    public static String[] COMMANDS_OK = {"count *", "count distinct uf", "count distinct name",
            "filter name Correct Name", "filter uf sc", "filter alternative_names Assu"};

    public static String[] COMMANDS_NOK = {"count*", "count ", "count distinct namae", "count distinct *",
            "count distinct ", "filter namae Correct Name", "filter ufi sc", "filter alternative_namesAssu"};
}
