Описание проекта gradle_task1:

    Проект совместим с Java 17 и использует Gradle с поддержкой Kotlin DSL.
    
    Создан .jar файл utils-1.3.5.jar, который содержит класс StringUtils с методом проверки строк на представление положительного числа: boolean isPositiveNumber(String str). Манифест файла содержит имя и версию .jar файла.

    Для класса StringUtils написан unit test с использованием JUnit 5, проверяющий работу метода isPositiveNumber.

Описание проекта gradle_task2:

    Проект разделен на два модуля: core и api.

    Core модуль: Содержит класс Utils с методом boolean isAllPositiveNumbers(String... str), который использует метод из библиотеки utils-1.3.5.jar(jar файл лежит в core модуле в папке libs)

    API модуль: Содержит класс App с методом main, в котором происходит вызов метода Utils.isAllPositiveNumbers().

    Для класса Utils написан unit test с использованием JUnit 5, проверяющий работу метода isAllPositiveNumbers.
