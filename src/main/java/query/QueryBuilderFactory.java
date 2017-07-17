package query;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import command.CommandBuilder;
import command.CommandEnum;
import entity.city.City;
import read.Reader;
import util.Constants;

public class QueryBuilderFactory {

    private QueryBuilder builder;
    private Reader reader;
    private List<City> dataList;

    public static void main(String[] args) {
        QueryBuilderFactory factory = new QueryBuilderFactory();
        factory.init();
    }

    public void init() {
        this.builder = new QueryBuilderImpl();
        this.reader = new Reader();
        this.dataList = this.reader.getListCitys();
        this.scannerCommand();
    }

    private void scannerCommand() {
        Map<CommandEnum, Map<String, String>> map = null;
        Scanner scanner = new Scanner(System.in);
        while (map == null) {
            System.out.println(Constants.ENTER_COMMAND);
            String command = scanner.nextLine();
            CommandBuilder is = new CommandBuilder();
            map = is.readCommand(command);
            if (map == null) {
                System.out.println(Constants.INCORRECT);
            } else {
                this.runCommand(map);
                map = null;
            }
        }
        scanner.close();
    }

    private void runCommand(Map<CommandEnum, Map<String, String>> map) {
        CommandEnum key = map.keySet().iterator().next();
        switch (key) {
            case COUNT:
                System.out.println(this.builder.count(this.dataList));
                break;
            case COUNT_DISTINCTY_PROPERTY:
                System.out.println(this.builder.countDistinctProperty(this.dataList, map.get(key).get(Constants.PROPERTIE)));
                break;
            case FILTER_PROPERTIE_VALUE:
                System.out.println(this.reader.getHeader());
                List<City> list = this.builder.filterPropertieByValue(this.dataList, map.get(key).get(Constants.PROPERTIE),
                        map.get(key).get(Constants.VALUE));
                for (City city : list) {
                    System.out.println(city.toString());
                }
        }
    }
}
