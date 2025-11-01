package at.cgsit.train.java.mv.firma;

import at.cgsit.train.java.mv.personen.Kunde;
import at.cgsit.train.java.mv.personen.Mitarbeiter;
import at.cgsit.train.java.mv.personen.Person;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Implementierung mit Streams.
 */
public class FirmaImplStream extends Firma {

  /**
   * Entfernt eine Person anhand ihrer ID mit der Verwendung von Streams.
   *
   * @param id Die ID der Person, die entfernt werden soll.
   * @return true, wenn die Person erfolgreich entfernt wurde, ansonsten false.
   */
  public boolean removeByIdWithStreams(String id) {
    int initialSize = personen.size();
    personen.removeIf(person -> person.getId().equals(id));
    return initialSize > personen.size();
  }

  @Override
  public boolean removeById(String id) {
    return false;
  }

  @Override
    public Optional<Person> findById(String id) {
        return personen.stream()
                       .filter(person -> person.getId().equals(id))
                       .findFirst();
    }

    @Override
    public List<Person> findByName(String teil) {
        return personen.stream()
                       .filter(person -> (person.getVorname() + " " + person.getNachname())
                                         .toLowerCase()
                                         .contains(teil.toLowerCase()))
                       .collect(Collectors.toList());
    }

}
