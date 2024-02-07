Feature: Purchase products at opencart

  @Test3
  Scenario Outline: Proceso de compra
    Given USER ESTOY EN LA PAGINA DE OPENCART
    When SELECCIONO UN PRODUCTO
    Then AGREGO EL PRODUCTO AL CARRITO
    And VEO EL CARRITO

    When INGRESO DATOS <firstname> <lastname> <email> <telephone> <company> <address_1> <city> <postcode> <country> <region>
    Then VEO NUEVO FORMULARIO

    Examples:
      | firstname | lastname | email               | telephone | company | address_1 | city | postcode | country | region |
      | Armando    | Maldonado | testbrumi@gmail.com | 123456789 | Test  | UIO       | Quito | 170895   | Ecuador | Sierra |