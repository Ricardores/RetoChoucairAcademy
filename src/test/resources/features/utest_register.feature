# Author: Ricardo
  @stories
  Feature: Crear una cuenta de usuario exitosa
    Como aprendiz de automatizacion necesito crear una cuenta de usuario para lograr el reto de Choucair Academy

  @Scenario1
  Scenario: Crear una cuenta de usuario en la pagina Utest
    Given Ricardo desea ir a la pagina Utest
    When ingresa los siguientes datos
      |nombre|apellido|correo|mes|dia|ano|ciudad|zip|pais|computador|version|idioma|mobile|modelo|so|contrasena|
      |Magolo|Arias|richartestes@gmail.com|June|10|1990|Medellín|050040|Colombia|Windows|10|Spanish|Apple|iPhone 7|iOS 13|Magolo12345|
    Then Se valida el titulo del ultimo paso The last step


