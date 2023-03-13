# Тесты на сайт ["edujira"](https://edujira.ifellow.ru/)
##
***
1. Создайте отдельную директорию на локальном компьютере
2. Установить JVM
3. Необходима java JDK 8
4. Установить apache-maven-3.8.1
5. Скачайте все файлы которые расположены в [директории](https://github.com/AlexnovichAS/web.git) <br>
   git clone https://github.com/AlexnovichAS/web.git
6. Установить Allure
7. Откройте проект
8. Установить все библиотеки из файла pom.xml
9. Запустите все тесты mvn clean test
10. Введите команду mvn allure:install
11. Сформируйте отчет Allure mvn allure:serve
12. В проекте используется maven-surefire-plugin версия 2.22.2

## Описание проекта
***
Целью написания данного проекта является проверка корректной работы функционала сайта ["edujira"](https://edujira.ifellow.ru/) <br>

В проекте реализовано автоматическое создание отчета в Allure и прикрепление скриншота при падении теста.

## Описание тестов
***
В данный тестовый набор вошли следующие проверки:
### Тест loginTest
- переходит на страницу авторизации ["edujira"](https://edujira.ifellow.ru/)
- вводит пароль и логин
- проверяет что пользователь зарегистрирован
- нажимает на верхней панели на кнопку "Проекты"
- в выпадающем меню выбирает проект "Test (TEST)"
- переходит в проект "Test (TEST)"
- выбирает на левой панели меню "Задачи"
- открывает выпадающее меню "Переключить фильтр"
- выбирает пункт меню "Все задачи"
- сохраняет значение количества задач на странице "Все задачи"
- нажимает на верхней панели на значок "Пользовательский профиль"
- в выпадающем меню выбирает пункт "Навигатор задач"
- нажимает на кнопку "Экспорт"
- в выпадающем меню выбирает пункт "Для печати"
- переходит на страницу печати
- сравнивает значение общего количества задач страницы "Все задачи" и страницы "Для печати"

### Тест checkStatusTest()
- переходит на страницу авторизации ["edujira"](https://edujira.ifellow.ru/)
- вводит пароль и логин
- проверяет что пользователь зарегистрирован
- нажимает на верхней панели на кнопку "Проекты"
- в выпадающем меню выбирает проект "Test (TEST)"
- переходит в проект "Test (TEST)"
- выбирает на левой панели меню "Задачи"
- открывает выпадающее меню "Переключить фильтр"
- выбирает пункт меню "Все задачи"
- нажимает на кнопку "Посмотреть все задачи и фильтры"
- нажимает на кнопку "Тип"
- в выпадающем меню выбирает тип "Задача"
- в окно поиска вводит название задачи "TestSelenium"
- нажимает кнопку "Поиск"
- переходит в задачу "TestSelenium"
- проверяет, что пользователь перешел в задачу "TestSelenium"
- проверяет статус задачи
- проверяет привязку задачи к затронутой версии

### Тест createTaskTest()
- переходит на страницу авторизации ["edujira"](https://edujira.ifellow.ru/)
- вводит пароль и логин
- проверяет что пользователь зарегистрирован
- нажимает на верхней панели на кнопку "Проекты"
- в выпадающем меню выбирает проект "Test (TEST)"
- переходит в проект "Test (TEST)"
- нажимает на верхней панели на кнопку "Создать"
- в окне "Создание задачи" выбирает значение у поля "Тип задачи"
- в окне "Создание задачи" заполняет поле "Тема"
- в окне "Создание задачи" заполняет поле "Описание"
- в окне "Создание задачи" выбирает значение у поля "Приоритет"
- в окне "Создание задачи" заполняет поле "Окружение"
- в окне "Создание задачи" выбирает значение у поля "Исполнитель"
- в окне "Создание задачи" выбирает значение у поля "Спринт"
- в окне "Создание задачи" нажимает на кнопку "Создать"
- открывает выпадающее меню "Переключить фильтр"
- выбирает пункт меню "Все задачи"
- нажимает на кнопку "Посмотреть все задачи и фильтры"
- нажимает на кнопку "Тип"
- в выпадающем меню выбирает тип
- в окно поиска вводит название задачи 
- нажимает кнопку "Поиск"
- проверяет, что задача найдена
- проверяет статус задачи
- меняет статус задачи на статус 'В работе'
- проверяет статус задачи
- меняет статус задачи на статус 'Готово'
- проверяет статус задачи