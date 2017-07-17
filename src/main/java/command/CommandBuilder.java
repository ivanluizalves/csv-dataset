package command;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import read.Reader;
import util.Constants;

public class CommandBuilder {

    public Map<CommandEnum, Map<String, String>> readCommand(String command) {
        if (command != null && (command.trim().equals(Constants.EXIT) || command.trim().equals(Constants.QUIT))) {
            System.exit(0);
        } else if (command != null) {
            if (command.matches(Constants.REGEX_COUNT_PROPERTIE)) {
                return this.buildCountCommand(command);
            } else if (command.matches(Constants.REGEX_COUNT)) {
                Map<CommandEnum, Map<String, String>> map = new HashMap<>();
                map.put(CommandEnum.COUNT, null);
                return map;
            } else if (command.matches(Constants.REGEX_FILTER)) {
                return this.buildFilterCommand(command);
            }
        }
        return null;
    }

    private Map<CommandEnum, Map<String, String>> buildFilterCommand(String command) {
        Map<CommandEnum, Map<String, String>> map = new HashMap<>();
        Map<String, String> values = new HashMap<>();
        String keys[] = command.split(" ");
        List<String> commands = Arrays.asList(keys);
        if (commands != null && commands.size() >= Constants.MAX_COMMANDS) {
            String propertie = commands.get(1);
            String value = commands.get(2);
            value = (String) command.subSequence(command.indexOf(value), command.length());
            Reader reader = new Reader();
            if (reader.getHeader().contains(propertie)) {
                values.put(Constants.PROPERTIE, propertie);
                values.put(Constants.VALUE, value);
                map.put(CommandEnum.FILTER_PROPERTIE_VALUE, values);
                return map;
            }
        }
        return null;
    }

    private Map<CommandEnum, Map<String, String>> buildCountCommand(String command) {
        Map<CommandEnum, Map<String, String>> map = new HashMap<>();
        Map<String, String> values = new HashMap<>();
        String keys[] = command.split(" ");
        List<String> commands = Arrays.asList(keys);
        if (commands != null && commands.size() >= Constants.MAX_COMMANDS) {
            String propertie = commands.get(2);

            Reader reader = new Reader();
            if (reader.getHeader().contains(propertie)) {
                values.put(Constants.PROPERTIE, propertie);
                map.put(CommandEnum.COUNT_DISTINCTY_PROPERTY, values);
                return map;
            }
        }
        return null;
    }
}
