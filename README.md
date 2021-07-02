# Летняя практика по Java 2021
Летняя практика студентов 2 курса. Студенты 9382: Круглова Виктория, Савельев Илья, Дюков Владимир
## Тема проекта  
Алгоритм А*. Визуализация поиска кратчайшего пути.  
## Задачи проекта  
Создание приложения, позволяющего создавать макеты прямоугольных карт с препятствиями и искать на них минимальных путь от точки до точки. Приложение должно обладать понятным, лаконичным, но эффективным пользовательским интерфейсом.  
## Распределение ролей  
1. Круглова Виктория - back-end
2. Савельев Илья - front-end
3. Дюков Владимир - тестировщик
## План разработки
1. Разработка спецификации, распределение ролей, подготовка репозитория к 03.07.2021.
2. Создание интерфейса и примерного дизайна приложения, определение визуальной части программы к 05.07.2021.
3. Тестирование и отладка алгоритма поиска минимального пути к 06.07.2021.
4. Первая версия проекта к 07.07.2021.
5. Отладка программы к 10.07.2021.
## Описание проекта  
Здесь будут указаны некоторые конкретные моменты планируемой реализации, такие как способ реализации алгоритма, визуализируемый алгоритм и тестирование.
### Способ реализации алгоритма
Алгоритм реализуется на прямоугольной, так называемой, карте, где каждый элемент либо пустой, либо является препятствием. Выбирается начальный и конечный элемент прямоугольной карты (не являющийся препятствием).
### Визуализация алгоритма
Все отображается на прямоугольной карте
+ Обновление списка открытых вершин.
+ Обновление списка закрытых вершин.
+ Текущая выбранная вершина.  
### Тестирование
Для тестирования работоспособности всех функций приложения необходимо разработать план тестирования. Тестирование должно проверять не только правильность найденного пути (его корректность), но также и работу интерфейса программы, его понятность и функциональность, стабильность работы приложения и наличие ошибок.

+ Чтобы убедиться в правильной работе алгоритма будут созданы заранее просчитанные примеры, с которыми будут сравниваться фактические результаты + работы приложения.
+ Чтобы убедиться в правильной работе и интуитивной понятности интерфейса программы необходимо провести ручное тестирование. Должны быть протестированы все элементы управления и информирования.
+ Для проверки программы на стабильную работу нужно провести длительное тестирование, провести множество сложных операций, попытаться "сломать" программу.
