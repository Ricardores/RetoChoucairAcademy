# Autor: Ric

Feature: Academy Choucair
    As an user, i want to learn how to automate in screamplay at the Choucair Academy with the automation course
    @scenario1
    Scenario: Search for a automation course
        Given than Ric wants to learn automation at the Academy Choucair
        | strUser   |strPassword    |
        | 15514793 |Choucair2021*   |
        When he search for the course on the Choucair Academy plataform
        |strCourse              |
        |ISTQB - Test Automation Engineer|
        Then he finds the course called resources
        |strCourse              |
        |ISTQB - Test Automation Engineer|
