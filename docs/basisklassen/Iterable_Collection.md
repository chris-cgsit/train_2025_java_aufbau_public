
Eine `List` in Java ist Teil einer klar aufgebauten Vererbungshierarchie.  
Viele ihrer Methoden stammen gar nicht direkt aus der `List`, sondern werden von übergeordneten Interfaces geerbt.


## Hierarchie

```

Iterable<E>
↑
Collection<E>
↑
List<E>

```

---

## Iterable

Das Interface **Iterable** ist die grundlegende Basis für alle Collections.  
Es definiert, dass eine Klasse über ihre Elemente iteriert werden kann, z. B. mit einer `for-each`-Schleife.

**Wichtige Methoden**
- `iterator()` – gibt einen Iterator zurück, um Elemente zu durchlaufen  
- `forEach(Consumer<? super E> action)` – wendet eine Funktion auf alle Elemente an  
- Unterstützt den **Enhanced for-Loop** (`for (Element e : collection) {...}`)

---

## Collection

**Collection** erweitert `Iterable` um allgemeine Methoden zum Hinzufügen, Entfernen und Abfragen von Elementen.  
Alle gängigen Datentypen wie `List`, `Set` oder `Queue` sind Untertypen von `Collection`.

**Beispiele für Collection-Methoden**

| Methode | Beschreibung |
|----------|---------------|
| `add(E e)` | Fügt ein Element hinzu |
| `addAll(Collection<? extends E> c)` | Fügt alle Elemente einer anderen Collection hinzu |
| `remove(Object o)` | Entfernt ein Element |
| `removeIf(Predicate<? super E> filter)` | Entfernt Elemente nach Bedingung |
| `clear()` | Entfernt alle Elemente |
| `contains(Object o)` | Prüft, ob ein Element vorhanden ist |
| `isEmpty()` | Prüft, ob die Collection leer ist |
| `size()` | Liefert die Anzahl der Elemente |
| `iterator()` | Gibt einen Iterator zurück |
| `forEach(Consumer<? super E> action)` | Führt eine Aktion für jedes Element aus |
| `stream()` / `parallelStream()` | Erzeugt einen (parallelen) Stream |

Diese Methoden bilden die gemeinsame Basis für alle Sammlungen in Java.

---

## List

**List** erweitert `Collection` um zusätzliche Funktionen, die auf **indizierte und geordnete Elemente** ausgelegt sind.  
Sie erlaubt den Zugriff über Positionen und die gezielte Steuerung der Reihenfolge.

**Zusätzliche Methoden von List**

| Methode | Beschreibung |
|----------|---------------|
| `get(int index)` | Gibt das Element an einer bestimmten Position zurück |
| `set(int index, E element)` | Ersetzt ein Element an einer Position |
| `add(int index, E element)` | Fügt ein Element an einer bestimmten Position ein |
| `remove(int index)` | Entfernt das Element an einer bestimmten Position |
| `indexOf(Object o)` / `lastIndexOf(Object o)` | Liefert die Position eines Elements |
| `listIterator()` | Gibt einen Iterator zurück, der vor- und rückwärts gehen kann |
| `subList(int fromIndex, int toIndex)` | Gibt eine Teilliste eines bestimmten Bereichs zurück |

---

## Zusammenfassung

- **Iterable**: definiert die Möglichkeit, über Elemente zu iterieren (`for-each`, `iterator()`)  
- **Collection**: bietet grundlegende Operationen wie `add`, `remove`, `contains`, `size`  
- **List**: erweitert um positionsbasierte Zugriffe und erlaubt eine definierte Reihenfolge  

Oder kurz gesagt:

> Eine *List* ist eine spezialisierte *Collection*,  
> und jede *Collection* ist etwas, über das man mit *Iterable* iterieren kann.
```
