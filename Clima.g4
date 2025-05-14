grammar Clima;

//Parser

clima_script 
  : AUTO CLIMA ID LKEY (action)* RKEY 
  ;

action
  : monitoreo
  | respuesta
  | imprimir
  ;

monitoreo
  : MONI sensor_clima CADA NUM MIN SEMI;

respuesta
  : WHEN sensor_clima SUBE DE NUM (TEM|HUME) HACER ACTIVAR aspecto SEMI
  ;

imprimir
  : PRINT STRING CADA NUM MIN SEMI
  ;

sensor_clima
  : TEMP
  | HUM
  ;

aspecto
  : VENTI
  | RIEGO
  ;

//Lexer

AUTO: 'automate';
CLIMA: 'clima';
MONI: 'monitorear';
CADA: 'cada';
MIN: 'min';
WHEN:'cuando';
SUBE:'sube';
DE:'de';
HACER: 'hacer';
ACTIVAR:'activar';
TEMP:'temperatura';
HUM:'humedad';
PRINT:'imprimir';
RIEGO:'riego';
VENTI:'ventilacion';

SEMI: ';';
LKEY: '{';
RKEY: '}';
NUM: [0-9]+;
TEM: '\u00B0';
HUME: '\u0025';
ID: [a-zA-Z_][a-zA-Z_0-9]* ;
STRING: '"' (~["\r\n])* '"';

WS: [ \t\n\r] -> skip;