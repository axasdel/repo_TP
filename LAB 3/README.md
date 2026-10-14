# LAB 3. Порождающие паттерны

## *Структура проекта*

```
LAB 3/
├── singleton/
├── factorymethod/
├── abstractfactory/
└── builder/
```

## *Реализация паттернов*

### SINGLETON

**Смысл:** гарантия, что у класса есть только один экземпляр, и глобальная точка доступа к нему.

**Файл:** `singleton/Singleton.java`

**Код:**

```
public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void testMethod() {
        System.out.println("Рабочее");
    }
}
```

**Файл:** `singleton/Main.java`

**Код:**

```java
public class Main {
    public static void main(String[] args) {
        Singleton sing1 = Singleton.getInstance();
        Singleton sing2 = Singleton.getInstance();

        System.out.println(sing1 == sing2);

        sing1.testMethod();
    }
}
```

**Вывод:**

```
true
Рабочее
```

### FACTORY METHOD

**Смысл:** определение интерфейса для создания объектов; подклассы решают, какой именно класс создавать.

**Файлы:** `factorymethod/*.java`

**Классы:**
- `Logger` — интерфейс

- `FileLogger`, `ConsoleLogger` — конкретные объекты

- `LoggerFactory` — абстрактная фабрика

- `FileLoggerFactory`, `ConsoleLoggerFactory` — конкретные фабрики

**Вывод:**

```
Logging to file: Hi from file
Logging to console: Hi from console
```

### ABSTRACT FACTORY

**Смысл:** предоставление интерфейса для создания семейства взаимосвязанных объектов, не привязываясь к конкретным классам.

**Файлы:** `abstractfactory/*.java`

**Классы:**
- `Button`, `Checkbox` — интерфейсы

- `CertainButton`, `CertainCheckbox`, `AnotherButton`, `AnotherCheckbox` — конкретные объекты

- `GUIFactory` — абстрактная фабрика

- `CertainFactory`, `AnotherFactory` — конкретные фабрики

- `Application` — клиент

**Вывод:**

```
Im button
Im checkbox
Im another button
Im another checkbox
```

### BUILDER

**Смысл:** создание сложного объекта пошагово.

**Файлы:** `builder/*.java`

**Классы:**
- `Computer` — продукт
- `ComputerBuilder` — интерфейс строителя
- `GamingComputerBuilder` — конкретный строитель
- `ComputerDirector` — директор, отвечающий за порядок сборки

**Вывод:**

```
Computer: cpu - Intel core i5, ram - 16 GB RAM, hdd - 1 TB SSD
```