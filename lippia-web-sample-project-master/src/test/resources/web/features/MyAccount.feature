Feature: Como un cliente en la web, necesito poder ver mis pedidos, datos y poder desconectarme

  @Redcap
  Background:
    Given Estoy en la URL “http://practice.automationtesting.in/”
    When hago click en el menu My Account
    And ingreso un e-mail en el login
    And ingreso un password en el login
    And hago click en el boton de Login
    And hago click en el link My Account

  @Redcap1
  Scenario: Poder ver el Dashboard
    Then el usuario puede ver el Dashboard

  @Redcap2
  Scenario: Revisar ordenes de compra hechas
    And hago click en el boton orders
    Then el cliente puede ver sus pedidos de compra



