# APAW. ECP1. Patrones de Diseño

## Requisitos de las entidades

- Cuatro entidades, con un mínimo de 2 atributos y si se guarda en BD directamente atributo Id de tipo String
- Un mínimo de 14 atributos entre todas las entidades (incluidos id)
- Debe existir alguna entidad con relación de 0..1 con otra entidad
- Debe existir alguna entidad con relación de 0..n con otra entidad
- Alguna entidad no debe tener relaciones
- Algún atributo de tipo  Enumerado (mínimo 3 valores), otro de tipo LocalDateTime, otro de tipo Boolean y otro de tipo Integer

## Ejercicios

- (+2). Factoría con patrón Singleton de una entidad. Se almacenan y se buscan las entidades por la id de la entidad . La factoría no los crea, solo gestiona los objetos. Debe ir con test de prueba
- (+2). Builder de una entidad. Debe ir con test de prueba
- (+2). Patrón Composite de una entidad . La entidad no puede ser cambiada de su interfaz publico dado. Mediante el método view() se visualiza la id si es una entidad y name (String) si es una agrupación. Debe ir con test de prueba
- (+2). Patrón Strategy. Buscar, comprender , explicar y realizar un ejemplo propio de su funcionamiento
- (+2). A la Factoría anterior,  aplicarle el patrón Observer, para que cada vez que se añade un objeto nuevo, provoque un evento, es decir, se notifique a todos los observadores.  Debe ir con test de prueba
