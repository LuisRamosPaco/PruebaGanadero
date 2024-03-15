@tag
  Feature: Portal Web Banco Ganadero

  @tag1
  Scenario Outline: Listado de datos de contacto GanaMóvil Empresa
    Given Dado que Ingrese al portal web www.bg.com.bo
    When Cuando Ingreso al menu (Negocios Menu hamburguesa GanaMovil Empresas)
    Then Entonces obtengo un listado con el <Telefono>, <Whatsapp>, <Email> y <Horarios>
    Examples:
      | Telefono    | Whatsapp         | Email                   | Horarios                             |
      | 800-10-3999 | (+591)-721-03001 | bancoganadero@bg.com.bo | 07:00 a 22:00 Hrs. (Lunes a Domingo) |