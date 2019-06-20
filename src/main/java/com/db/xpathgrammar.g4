/*

(absolute path) ap → doc(fileName)/rp
                        | doc(fileName)//rp
(relative path) rp → tagName | ∗ | . | .. | text() | @attName
                        | (rp) | rp1/rp2 | rp1//rp2 | rp[f] | rp1, rp2
(path filter) f → rp | rp1 = rp2 | rp1 eq rp2 | rp1 == rp2 | rp1 is rp2
                        | (f) | f1 and f2 | f1 or f2 | not f
*/

grammar xpathgrammar;


// parser (lowercase)
ap          :   DOC LPAREN filename RPAREN SLASH SLASH? rp  #ap_ap
            ;

rp          :   tagName                                     #rp_tagName
            |   STAR                                        #rp_star
            |   DOT DOT?                                    #rp_dot_dot
            |   TEXT LPAREN RPAREN                          #rp_text
            |   AT attName                                  #rp_at
            |   LPAREN rp RPAREN                            #rp_rp
            |   rp SLASH SLASH? rp                          #rp_slash_rp
            |   rp LBRACKET f RBRACKET                      #rp_filter
            |   rp COMMA rp                                 #rp_comma_rp
            ;

f           :   rp                                          #f_rp
            |   rp (EQUAL | EQ) rp                          #f_eq
            |   rp (EQUAL EQUAL | IS) rp                    #f_is
            |   LPAREN f RPAREN                             #f_f
            |   f AND f                                     #f_and_f
            |   f OR f                                      #f_or_f
            |   NOT f                                       #f_not_f
            ;

filename    :   FILEPATHNAME
            ;

tagName     :   NAME
            ;

attName     :   NAME
            ;

// milestone 2
xq          :   var                                                                     #xq_var
            |   stringConstant                                                          #xq_stringcon
            |   ap                                                                      #xq_ap
            |   LPAREN xq RPAREN                                                        #xq_xq
            |   xq COMMA xq                                                             #xq_comma_xq
            |   xq SLASH SLASH? rp                                                      #xq_slash_rp
            |   LESS tagName GREAT LCBRACKET xq RCBRACKET LESS SLASH tagName GREAT      #xq_t_xq_t
            |   LESS tagName GREAT xq LESS SLASH tagName GREAT                          #xq_t_xq_t_no_bracket
            |   forClause letClause? whereClause? returnClause                          #xq_for_let_where_return
            |   letClause xq                                                            #xq_let
            |   joinClause                                                              #xq_join
            ;

var         :   '$' NAME
            ;

stringConstant: STRING | FILEPATHNAME
            ;

forClause   :   FOR (var IN xq COMMA)* var IN xq
            ;

letClause   :   LET (var ASSIGN xq COMMA)* var ASSIGN xq
            ;

whereClause :   WHERE cond
            ;

returnClause:   RETURN xq
            ;

cond        :   xq (EQUAL | EQ) xq                                                      #cond_eq
            |   xq (EQUAL EQUAL | IS) xq                                                #cond_is
            |   EMPTY LPAREN xq RPAREN                                                  #cond_empty
            |   SOME (var IN xq COMMA)* var IN xq SATISFIES cond                        #cond_some
            |   LPAREN cond RPAREN                                                      #cond_cond
            |   cond AND cond                                                           #cond_and_cond
            |   cond OR cond                                                            #cond_or_cond
            |   NOT cond                                                                #cond_not_cond
            ;

joinClause  :   JOIN LPAREN xq COMMA xq COMMA joinAtt COMMA joinAtt RPAREN				#join_clause
            ;

joinAtt     :   LBRACKET (varName COMMA)* varName RBRACKET				    			#join_attr
            ;

varName     :   NAME
            ;

// lexer (uppercase)
DOC         :   'doc' ;
IS          :   'is' ;
EQ          :   'eq' ;
AND         :   'and' ;
OR          :   'or' ;
NOT         :   'not';
TEXT        :   'text' ;
FOR         :   'for' ;
IN          :   'in' ;
LET         :   'let' ;
WHERE       :   'where' ;
RETURN      :   'return' ;
EMPTY       :   'empty' ;
SOME        :   'some' ;
SATISFIES   :   'satisfies' ;
JOIN        :   'join' ;
ASSIGN      :   ':=' ;
AT          :   '@' ;
LPAREN      :   '(' ;
RPAREN      :   ')' ;
SLASH       :   '/' ;
STAR        :   '*' ;
DOT         :   '.' ;
LBRACKET    :   '[' ;
RBRACKET    :   ']' ;
LCBRACKET   :   '{' ;
RCBRACKET   :   '}' ;
LESS        :   '<' ;
GREAT       :   '>' ;
COMMA       :   ',' ;
EQUAL       :   '=' ;
WS          :   [ \t\r\n]+ -> skip ;
NAME        :   [a-zA-Z0-9_]+ ;
FILEPATHNAME:   '"' [a-zA-Z0-9./_]+ '"' ;
STRING      :   '"' (~["\r\n])* '"';