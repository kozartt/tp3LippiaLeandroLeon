Feature: Como un cliente en la web, necesito registrarme en la misma

  @Test
  Background:
    Given Estoy en la URL “http://practice.automationtesting.in/”
    When hago click en el menu My Account

  @Test1
  Scenario Outline: Registrar una cuenta en la web usando mail y password
    And ingreso un <e-mail> correcto en la caja de texto mail del register
    And ingreso un <password> correcto en la caja de texto password del register
    And hago click en el boton Register
    Then el cliente sera registrado exitosamente

  Examples:
    |        e-mail         |      password     |
    | pepeargento@gmail.com | aguanteRacing12?? |

  @Test2
  Scenario Outline: Registrar una cuenta con un mail no valido
    And ingreso un <e-mail> incorrecto en la caja de texto mail del register
    And ingreso un <password> correcto en la caja de texto password del register
    And hago click en el boton Register
    Then El cliente vera que su registro fue fallido, junto con el siguiente mensaje: "You must enter a valid email address"

  Examples:
    |        e-mail         |      password     |
    | pepeargento@gmail.com | aguanteRacing12?? |