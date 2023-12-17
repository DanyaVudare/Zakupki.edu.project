ZakupkiParser

Данный проект является учебным и реализован в рамках дисциплины "Наука о данных и Индустрия 4.0"
Парсер для http://zakupki.gov.ru/ позволяет осуществить выгрузку планов закупки, договоров и извещений о закупке с ftp сервера.

Инструкция по запуску:

Разработка велась на Java 17

1. Настройка базы данных
В данной программе используется база данных MySQL 8.0, которую необходимо предварительно настроить
Для начала нужно установить базу данных MySQL обычным способом

ВАЖНО! Пароль для пользователя root должен быть 12345.
В противном случае необходимо зайти в файл src/main/resources/application.yml и изменить 12345 на свой пароль.
Также пароль необходимо сменить в файле open_data/insert_from_file.py

После установки необходимо подключиться к базе данных и выполнить скрипт из файла database/docker/sql/create_db.sql

2. Табличные данные
Перед парсингом необходимо заполнить базу данных табличными данными. Для этого нужно перейти в папку open_data/ 
и запустить скрипт insert_all.py. Для этого понадобится библиотека pymysql.

3. Запуск парсера
В первую очередь нужно открыть проект в среде разработки и настроить проект Maven.
Далее запускаем программу Application.java

Перед началом загрузки можно выбрать какие именно папки и регионы нужны, а также выбрать период времени.

