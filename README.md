# CollectionTask

partOne
Реализовал свой односвязный LinkedList. Сравнил его производительность с джавовским для 100 000 элементов String, получил следующее:
Добавление в MyLinkedList:
46852816500
Добавление в LinkedList:
45360500
Поиск в MyLinkedList
5686200
Поиск в LinkedList
3433600
Удаление в MyLinkedList
3225600
Удаление в LinkedList
636500

Видно, что мой проигрывает, по всем фронтам:)

partTwo
Сравнил время затраченное на основные операции для различных реализаций List, Map и Set для 100 000 элементов String, получил следующее:

Добавление в ArrayList и LinkedList 100 000 элементов

Добавление в ArrayList:
332350300

Добавление в LinkedList:
96914100
Поиск по индексу в ArrayList и LinkedList:

Поиск в ArrayList:
44100

Поиск в LinkedList
324100

Удаление по индексу в ArrayList и LinkedList:

Удаление в ArrayList
159300

Удаление в LinkedList
14121700

Test for Set
Добавление в HashSet, LinkedHashSet и TreeSet 100 000 элементов

Добавление в HashSet
359886000

Добавление в LinkedHashSet
212735500

Добавление в TreeSet
335945400

Проверка содержания элемента в HashSet, LinkedHashSet и TreeSet

Проверка содержания в HashSet:
21800

Проверка содержания в LinkedHashSet:
3000
Проверка содержания в TreeSet:
589900
Удаление из HashSet, LinkedHashSet и TreeSet 100 000 элементов

Удаление из HashSet:
29400

Удаление из LinkedHashSet:
8500

Удаление из TreeSet:
70400

Test for Map
Добавление в HashMap, LinkedHashMap и TreeMap 100 000 элементов

Добавление в HashMap
79576000

Добавление в LinkedHashMap
91877100

Добавление в TreeMap
134830100

Проверка содержания элемента по значению в HashMap, LinkedHashMap и TreeMap

Содержание элемента по значению в HashMap:
17264400

Содержание элемента по значению в LinkedHashMap:
13554900

Содержание элемента по значению в TreeMap:
24412200

Удаление в HashMap, LinkedHashMap и TreeMap 100 000 элементов

Удаление из HashMap:
31500

Удаление из LinkedHashMap:
8300

Удаление из TreeMap:
139000


Process finished with exit code 0
