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
  * 