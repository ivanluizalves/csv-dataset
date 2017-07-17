package entity;

import java.lang.reflect.Field;

import util.Constants;

public abstract class Entity {

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                str.append(field.get(this));
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            str.append(Constants.SEPARATOR);
        }
        if (str.toString().isEmpty()) {
            return "";
        } else {
            return str.toString().substring(0, str.toString().length() - 1);
        }
    }

    public Object getValueByFieldName(String fieldName) {
        String name = fieldName.toLowerCase();
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.getName().toLowerCase().equals(name)) {
                try {
                    field.setAccessible(true);
                    return field.get(this);
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
