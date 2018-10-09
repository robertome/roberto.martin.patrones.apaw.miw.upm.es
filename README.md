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

## Solución

### Modelo de datos escogido
![alt text](https://raw.githubusercontent.com/robertome/roberto.martin.patrones.apaw.miw.upm.es/develop/doc/APAW.ECP1.Modelo.png)

### Modelo de datos con patrones aplicados
![alt text](https://raw.githubusercontent.com/robertome/roberto.martin.patrones.apaw.miw.upm.es/develop/doc/APAW.ECP1.Patrones.png)

### Patrón Strategy

El Patrón Strategy es un patrón de diseño de software de comportamiento (Behavioral pattern) que permite seleccionar un algoritmo en tiempo de ejecución. 
Permite que un objeto tenga parte o la totalidad de su comportamiento definido en términos de otro objeto que sigue una interfaz particular. 
Se proporciona una instancia particular de esta interfaz al cliente cuando se crea una instancia o se invoca, proporcionando el comportamiento concreto que se utilizará. 
El patrón Strategy se utiliza ampliamente para lograr el principio de responsabilidad única, el principio de dependencia explícita y el principio de inversión de dependencia, y es una clave para la inyección de dependencia y el uso de contenedores de inversión de control.

#### Intención
- Encapsular algoritmos relacionados en clases y hacerlos intercambiables.
- Se permite que la selección del algoritmo se haga según el objeto que se trate.

#### Aplicaciones
- Se quiera configurar una clase con un comportamiento determinado de entre varios.
- Se permite cambiar el algoritmo dinámicamente
- Se necesitan distintas variaciones de un algoritmo.
- Los distintos comportamientos de una clase aparecen como múltiples sentencias condicionales. El patrón Strategy permite mover cada rama de esos condicionales anidados a su propia clase.

#### Ejemplo
##### Diagrama
![alt text](https://raw.githubusercontent.com/robertome/roberto.martin.patrones.apaw.miw.upm.es/develop/doc/APAW.ECP1.Strategy.png)


##### Código

```java

interface NombreCompletoPersonaStrategy {
  String toString(Persona persona);
}

class Persona {
  private String nombre;
  private String apellido1;
  private String apellido2;
  private NombreCompletoPersonaStrategy strategy;

  public Persona(NombreCompletoPersonaStrategy strategy) {
    this.strategy = strategy;
  }

  public String getNombreCompleto() {
    return strategy.toString(this);
  }

  public String getNombreCompleto(NombreCompletoPersonaStrategy strategy) {
    return strategy.toString(this);
  }

  public void setNombreCompletoPersonaStrategy(NombreCompletoPersonaStrategy strategy) {
    this.strategy = strategy;
  }

  /* Getters/Setters*/
  
}

class NombreApellidosPersonaStrategy implements NombreCompletoPersonaStrategy {
  @Override
  public String toString(Persona persona) {
    return String.format("%s %s %s", persona.getNombre(), persona.getApellido1(), persona.getApellido2());
  }
}

class ApellidosNombrePersonaStrategy implements NombreCompletoPersonaStrategy {
  @Override
  public String toString(Persona persona) {
    return String.format("%s %s, %s", persona.getApellido1(), persona.getApellido2(), persona.getNombre());
  }
}

public static void main(String[] args) {
  Persona persona = new Persona(new NombreApellidosPersonaStrategy());
  persona.setNombre("Roberto");
  persona.setApellido1("Martin");
  persona.setApellido2("Escribano");

  persona.getNombreCompleto(); //Roberto Martin Escribano

  persona.setNombreCompletoPersonaStrategy(new ApellidosNombrePersonaStrategy());
  persona.getNombreCompleto(); //Martin Escribano, Roberto

  persona.getNombreCompleto(new NombreApellidosPersonaStrategy()); //Roberto Martin Escribano
}

```

