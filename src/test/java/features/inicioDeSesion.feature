Feature: inicio de sesion en la pagina Saucedemo

  Yo como usuario de la pagina Saucedemo quiero hacer login

  Scenario: Inicio de sesion
    Given el usuario se encuentra en la pagina principal
    When el ingresa usuario y contraseña
    Then deberia hacer el proceso de login

