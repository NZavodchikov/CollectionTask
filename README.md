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

ArrayList and LinkedList
Добавление в ArrayList:
124829800
Добавление в LinkedList:
50147800
Поиск в ArrayList
496700
Поиск в LinkedList
881000
Удаление в ArrayList
384000
Удаление в LinkedList
1740300
HashSet and LinkedHashSet and TreeSet
Добавление в HashSet
93910100
Добавление в LinkedHashSet
71966700
Добавление в TreeSet
328154500
Удаление из HashSet:
114300
Удаление из LinkedHashSet:
157500
Удаление из TreeSet:
238900
HashMap and LinkedHashMap and TreeMap
Добавление в HashMap
163444100
Добавление в LinkedHashMap
121218100
Добавление в TreeMap
90839100
Удаление из HashMap:
112000
Удаление из LinkedHashMap:
75700
Удаление из TreeMap:
190800

Выводы:

Для LinkedList и ArrayList:

Добавление быстрее в LinkedList
Взятие по индексу быстрее в ArrayList
Удаление почему то быстрее получилось для ArrayList

Для HashSet LinkedHashSet и TreeSet:

Добавление быстрее всего в LinkedHashSet, медленнее в TreeSet
Удаление быстрее из HashSet, медленее из TreeSet

Для HashMap, LinkedHashMap  и TreeMap

Добавление быстрее в TreeMap, медленнее в HashMap
Удаление быстрее в LinkedHashMap, меленнее в TreeMap




