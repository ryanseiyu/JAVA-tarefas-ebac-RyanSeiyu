import java.lang.reflect.Field;

public class MyClass {

    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
        // get the annotation
        Tabela tabela = new Tabela("nomeDaTabela");
        // print the value
        for (Field field : tabela.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(ImportantString.class)) {
                Object objectValue = field.get(tabela);

                if (objectValue instanceof String) {
                    String stringValue = (String) objectValue;
                    System.out.println(stringValue);
                }
            }
        }
    }
}