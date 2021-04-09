grammar LT;

// analyseur lexical
// LES MOTS CLéS
COMPIL: 'compil';
START:'start';
SCAN:'scanCompil';
PRINT: 'printCompil';
IF:'if';
THEN: 'then';
ELSE:'else';

// LES BOUCLES

DO:'do';
WHILE:'while';

//LES DECLARATION

INT: 'intCompil';
FLOAT: 'floatCompil ';
STRING: 'stringCompil';

//LES OPERATEURS

PLUS: '+';
MOIN: '-';
MUL: '*';
DIV: '/';
AFCT:'=';
EGAL:'==';
DIFF:'!=';
GREATER: '>';
LESS: '<';

SPACE: [ \n\t] -> skip;
COMMLINE : '/''/'(~[\n])* -> skip;
COMMMUL : '/*'(.)*?'*/' -> skip;

// LES EXPRESSIONS REGULERES

NOMPROG: [A-Z][a-zA-Z]*;
ID : [a-zA-Z][a-zA-Z0-9]*;
INTVAL: '0'|[+-]?[1-9][0-9]* ;
FLOATVAL: '0.0'|[+-]?[1-9][0-9]*('.'[0-9]*);
STRINGVAL: [a-zA-Z][a-z]*;

//ANALYSEUR SYNTAXIQUE

prog: COMPIL NOMPROG '(' ')' '{' declaration START listeinst '}' ;

//LA DECLARATION

declaration: dec declaration |dec;
dec: type var';';
type: INT | FLOAT | STRING;
var : ID ', ' var | ID;

// LES AFFECTATIONS
aff: ID AFCT exp ;
exp: exp pm complicated | complicated | ID;
complicated: complicated md fex | fex;
pm: PLUS | MOIN ;
md: MUL | DIV;
fex: ID | val |'(' exp ')' ;
val: INTVAL | FLOATVAL | STRINGVAL;

// LISTE INSTRUCTIONS

listeinst: (inst ';' listeinst) | inst ';' | inst ;
inst: aff | instif |instdo |read |write;

//LES INSTRUCTIONS READ/WRITE

read: SCAN'(' listeid ');';
write: PRINT'(' listeid ');';
listeid: ID',' listeid | ID;

// IF
instif: IF '(' cond ')' THEN '{' listeinst (|ELSE listeinst) '}';
cond: (exp op exp );
op: EGAL | DIFF | GREATER | LESS ;

// DO
instdo: DO '{' listeinst '}' WHILE'('cond')';

