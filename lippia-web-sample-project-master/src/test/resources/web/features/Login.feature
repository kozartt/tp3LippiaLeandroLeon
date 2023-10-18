Feature: Como cliente necesito acceder a la pagina usando mi usuario y contraseña

  @Pooka
  Background:
    Given Estoy en la URL "http://practice.automationtesting.in/"
    When hago click en el menu My Account

  @Pooka1
  Scenario Outline: Loguear una cuenta en la web usando mail y password
    And ingreso un <e-mail> correcto en la caja de texto mail del login
    And ingreso un <password> correcto en la caja de texto password del login
    And hago click en el boton Login
    Then el cliente sera logueado exitosamente

  Examples:
    |     e-mail        |    password   |
    | Aurelio@gmail.com | Aurelio1234?? |

  @Pooka2
  Scenario Outline: Intentar loguear con una cuenta en la web usando mail y password incorrectos
    And ingreso un <e-mail> incorrecto en la caja de texto mail del login
    And ingreso un <password> incorrecto en la caja de texto password del login
    And hago click en el boton Login
    Then el cliente no podra acceder con su cuenta y vera un mensaje de "incorrect username/password"

  Examples:
    |      e-mail         |    password   |
    | Aurelion@gmail.com  | Aurelio1234?! |
