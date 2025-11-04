Feature: Inicio de sesión
  Como usario registrado
  Quiero poder iniciar sesión en la pagina web
  Para acceder a mi cuenta personal

  Scenario Outline: Iniciar sesión con credenciales válidas e inválidas
    Given que el usario se encuentra en la pagina de iniciar sesión
    When ingresa el usario "<correo>" y la contraseña "<password>"
    And hace click en el botón iniciar sesión
    Then debería visualizar "<resultado>"

    Examples:
    |correo|password|resultado|
    |rojassb1.dt@gmail.com|Salome1996@|Pagina principal(HOME)|
    |rojassb1.dt@gmail.com|Salome19|Mensaje de ERROR|
    |rojassb1.dt@gmail|Salome1996@|Mensaje de ERROR|