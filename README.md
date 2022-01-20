# demo-openapi

* Schema first vs. Code first
* Einen Server Stub generieren
* Einen Client Stub generieren
* Schnittstelle ist dokumentiert



# Aber
* Flexibilität geht verloren
  * generierter Code kann nicht geändert werden (oder nur aufwendig/umständlich)
  * problematisch wenn man speziellere Validierungen schon im Controller oder im DTO machen will
  * oder auch bei Mapping-Logik

* erhöhte Wartbarkeit oder Einfachheit? Wirklich?
  * Schema kann sich ändern: z.b. von Swagger 2 auf Swagger 3 (oas3)
  * Openapi spec 3 erst sehr spät im Generator verfügbar


# Setup

man benötigt für den Spring generator die entsprechenden Spring Web Dependency:.

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
 
Dort sind nämlich die benötigten Annotationen wie z.B. @Controller
Es gibt auch eine Variante mit Plain Java...

SpringFox und Swagger, wtf?!

# Ausführung

über maven clean compile

# Documentation
maven plugin:

https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator-maven-plugin/README.md

oas:

https://oai.github.io/Documentation/specification-structure.html

example:

https://raw.githubusercontent.com/openapitools/openapi-generator/master/modules/openapi-generator/src/test/resources/3_0/petstore.yaml