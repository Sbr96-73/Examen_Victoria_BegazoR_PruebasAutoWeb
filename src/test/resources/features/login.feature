#language: es
@testfeature
Característica: Login
  Yo, como usuario
  Quiero, tener una opción para iniciar sesión
  Para ver todos los items

  @test
  Esquema del escenario: : Validación del precio de un producto
    Dado estoy en la pagina de la tienda
    Cuando me logueo con mi usuario "<correo>" y clave "<password>"
    Entonces valido autentificacion correcta de cliente "Victoria Salome Begazo Rojas"
    Y navego a la categoria "<category>" y subcategoria "<subcategory>"
    Y agrego 2 unidades del primer producto al carrito
    Entonces valido en el popup la confirmación del producto agregado


    Ejemplos:
      | correo | password | category | subcategory|
      | rojassb1.dt@gmail.com|Salome1996@| Clothes | Men|