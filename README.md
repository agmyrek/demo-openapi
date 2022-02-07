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
Das openapi-maven-plugin einbinden:

    <plugin>
        <groupId>org.openapitools</groupId>
        <artifactId>openapi-generator-maven-plugin</artifactId>
        <version>5.4.0</version>
        ...
    </plugin>

Den Pfad zur API-Beschreibung angeben:

    <inputSpec>${project.basedir}/src/main/resources/api.yaml</inputSpec>

Für Spring benötigt das Plugin die entsprechenden Spring Web Dependencies:

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
 
Dort sind nämlich die benötigten Annotationen wie z.B. @Controller
Es gibt auch eine Variante mit Plain Java...

Möchte man sonst zunächst nichts an der Konfiguration des Plugins ändern und es beim Default belassen, so braucht man
mindestens noch die Folgenden Dependencies:

com.fasterxml.jackson.dataformat.yaml.YAMLMapper:

    <dependency>
      <groupId>com.fasterxml.jackson.dataformat</groupId>
      <artifactId>jackson-dataformat-yaml</artifactId>
      <version>...</version>
    </dependency>

io.swagger.v3.oas.annotations.*:
Hierfür kann man springdoc verwenden. 

    <dependency>
      <groupId>org.springdoc</groupId>
      <artifactId>springdoc-openapi-ui</artifactId>
      <version>...</version>
    </dependency>

org.openapitools.jackson.nullable.JsonNullableModule:

    <dependency>
        <groupId>org.openapitools</groupId>
        <artifactId>jackson-databind-nullable</artifactId>
        <version>0.2.2</version>
    </dependency>

Ein vereinfachtes Setup lässt durch Konfiguration gestalten.

# Konfiguration

Möchte man die Api-Beschreibungen nicht veröffentlichen, kann man das mittels folgender Konfiguration unterbinden:

    <interfaceOnly>true</interfaceOnly>

Swagger-Dokumentation deaktivieren:

    <documentationProvider>none</documentationProvider>

# Ausführung

über maven clean compile

# Endpunkte:

OpenApi-Beschreibung:

    /openapi.yaml
    /openapi.json
# Documentation
maven plugin:

https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator-maven-plugin/README.md

maven plugin configuration options for spring:

https://openapi-generator.tech/docs/generators/spring

oas:

https://oai.github.io/Documentation/specification-structure.html

example:

https://raw.githubusercontent.com/openapitools/openapi-generator/master/modules/openapi-generator/src/test/resources/3_0/petstore.yaml