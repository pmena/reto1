# Reto1 (Pablo Mena)
Retos preparados para el bootcamp purple #bootcamp

Escenario:
Se requiere crear una API REST que calcule el dígito verificador del DNI peruano. Utilizar para ello Java Spring Boot y aplicar conocimientos de arquitectura de software, programación funcional y reactiva (deseable).

Tomaremos como ejemplo el DNI 17801146.
 - Separamos cada uno de los dígitos 1, 7, 8, 0, 1, 1, 4, 6.
 - Multiplicamos cada dígito por esta serie en el mismo orden 3, 2, 7, 6, 5, 4, 3, 2 de esta forma: 1 x 3, 7 x 2, 8 x 7, 0 x 6, 1 x 5, 1 x 4, 4 x 3, 6 x 2
 - Sumamos todos los productos dándonos el resultado de 106
 - Dividimos el resultado anterior entre 11 y tomamos el residuo: 106/11 = 9 sobrándonos 7 (9 x 11 = 99 para 106 nos faltaría 7)
 - Al valor 11 (por defecto) le restamos el resultado anterior 7 , lo que nos daría 4. *Excepción, si el resultado del punto 6 sería 11, es decir 11 – 0 = 11 (0 es el resultado del punto 5, es decir se trata de una división exacta que no tiene residuo) entonces el resultado sería 0 y no 11.
 - Al resultado anterior le sumamos 1, es decir 4 + 1 = 5 lo que significa que vamos a buscar la 5ta posición en la serie NUMERICA (por defecto) 6, 7, 8, 9, 0, 1, 1, 2, 3, 4, 5 ó la 5ta posición en la serie ALFABÉTICA (por defecto) K, A, B, C, D, E, F, G, H, I, J.
 - El valor obtenido es el dígito verificador.

Evidencias.

1.- Ejecutando el api
![image](https://user-images.githubusercontent.com/265018/154599304-0063fa70-e9e3-4f67-ba25-f50d56e28bf7.png)

2.- Consulta del api. Resultado digito verificador igual a 0.

![image](https://user-images.githubusercontent.com/265018/154599903-91cfcbce-74b1-49ec-8fa6-db1a36925f90.png)
