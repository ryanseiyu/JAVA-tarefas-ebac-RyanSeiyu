import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AppTest {
    @Test
    public void testFemalesOnly() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", "F"));
        people.add(new Person("Bob", "M"));
        people.add(new Person("Charlie", "F"));
        people.add(new Person("Dave", "M"));

        List<Person> females = people.stream()
                                    .filter(person -> person.getGender().equals("F"))
                                    .collect(Collectors.toList());

        for (Person female : females) {
            assertEquals("F", female.getGender());
        }
    }
}