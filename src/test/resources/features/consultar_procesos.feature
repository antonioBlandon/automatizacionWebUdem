# language: es

  Característica: David como usuario
    Quiere consultar sus procesos judiciales
    Para ver los avances de su proceso judicial

  Escenario: Consultar el proceso judicial 000000000
    Dado que David esta consultando el proceso judicial
    Cuando selecciona Ciudad "MEDELLIN", entidad "TRIBUNAL ADMINISTRATIVO DE ANTIOQUIA (ESCRITURAL)" y numero de radicado "0000000000"
    Entonces debe poder activar la consulta