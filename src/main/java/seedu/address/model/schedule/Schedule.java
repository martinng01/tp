package seedu.address.model.schedule;

import seedu.address.model.person.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

/**
 * Represents a Schedule that maps lists of Persons to dates.
 */
public interface Schedule {
    /**
     * Returns the schedule as a Map.
     */
    Map<LocalDate, ArrayList<Person>> getSchedule();

    /**
     * Adds a Person to the schedule on the given date.
     */
    void addPerson(Person person, LocalDate date);

    /**
     * Deletes a Person from the schedule on the given date.
     */
    void deletePerson(Person person, LocalDate date);
}
