package generator;

public class BNF_Grammar {
    String[] classbnf = {

            "<package declaration> ::= package <package folder name>;",
            "<import declarations> ::= <import declaration>|<import declarations><import declaration>",
            "<import declaration> ::= <type import on demand declaration>",
            // "<single type import declaration> ::= import <type name> ;",
            "<type import on demand declaration> ::= import java.<import identifier>.*;",
            // "<type name> ::= <import identifier>|<package name>.<import identifier>",
            //"<package name> ::= <import identifier>",
            // "<package declaration> ::= package <package name> ;",
            "<import identifier> ::= lang|util|io|net",
            "<package folder name> ::= newlyGeneratedCode",


            //"<interface declaration> ::= <interface modifiers>? interface <identifier> <extends interfaces>? <interface body>",
            "<interface declaration> ::= <interface modifiers>? interface <interface type identifier> <interface body>",
            //"<interface modifiers> ::= <interface modifier> | <interface modifiers> <interface modifier>",
            "<interface modifiers> ::= <interface modifier>",
            "<interface modifier> ::= public | abstract",
            "<extends interfaces> ::= extends <interface type> | <extends interfaces> , <interface type>",
            "<interface body> ::= { <interface member declarations>? }",
            "<interface member declarations> ::= <interface member declaration> | <interface member declarations> <interface member declaration>",
            "<interface member declaration> ::= <constant declaration> | <abstract method declaration>",
            "<constant declaration> ::= <constant modifiers> <type> <variable declarator> ;",
            "<constant modifiers> ::= public | static | final",
            "<abstract method declaration>::= <abstract method modifiers>? <result type> <method declarator> ;",
            //"<abstract method modifiers> ::= <abstract method modifier> | <abstract method modifiers> <abstract method modifier>",
            "<abstract method modifiers> ::= <abstract method modifier>",
            "<abstract method modifier> ::= public | abstract",

            "<array initializer> ::= { <variable initializers>? }",
            "<variable initializers> ::= <variable initializer> | <variable initializers> , <variable initializer>",
            "<variable initializer> ::= <expression> ",
            "<array variable initializer> ::= <array initializer>",
            "<variable declarators> ::= <variable declarator> | <variable declarators> , <variable declarator>",
            "<variable declarator> ::= <variable declarator id> | <variable declarator id> = <variable initializer> | <array variable declarator id> = <array variable initializer> | ",
            "<variable declarator id> ::= <identifier> ",
            "<array variable declarator id> ::= <identifier> [ ] ",


            "<interface type identifier> ::= Interface1 | Interface2 | Interface3",

            "<type declarations> ::= <type declaration>\n | <type declarations> <type declaration>",
            "<type declaration> ::= <class declaration> |  <interface declaration>",
            //"<class declaration> ::= <class access specifiers>? <class modifiers>? class <type identifier> <super>? <interfaces>? <class body>",
            "<class declaration> ::= <class access specifiers>? <class modifiers>? class <class type identifier> <super>? <class body>",
            "<class modifiers> ::= <class modifier>",
            "<class access specifiers> ::= <modifier>",
            "<modifier> ::= public | private | protected ",
            "<class modifier> ::= abstract | final | static",
            "<super> ::= extends <class type>",
            "<class type> ::= <type name>",
            "<type name> ::= <class type identifier>|<package class name>.<class type identifier>",
            "<package class name> ::= <class type identifier> | <package folder name>.<class type identifier>",

            "<interfaces> ::= implements <interface type list>",
            "<interface type list> ::= <interface type> | <interface type list> , <interface type>",
            "<class body> ::= { \n<class body declarations> }",
            "<class body declarations> ::= <class body declaration> | <class body declarations> <class body declaration>",
            //"<class body declaration> ::= <class member declaration> | <static initializer> | <constructor declaration>",
            "<class body declaration> ::= <class member declaration> | <constructor declaration>",

            "<class type identifier> ::= Class1 | Class2 | Class3",

            "<class member declaration> ::= <field declaration> | <method declaration>",
            "<static initializer> ::= static <block>",
            "<constructor declaration> ::= <constructor modifiers>? <constructor declarator> <constructor body>",
            "<constructor modifiers> ::= <modifier> | <constructor modifiers> <modifier>",
            "<modifier> ::= public | protected | private",
            "<constructor declarator> ::= <simple constructor name> ( <formal parameter list>? )",
            "<formal parameter list> ::= <formal parameter> | <formal parameter list> , <formal parameter>",
            "<formal parameter> ::= <type> <variable declarator id>",
            //"<throws> ::= throws <class type list>",
            "<class type list> ::= <class type> | <class type list> , <class type>",
            "<constructor body> ::= { <block statements>? }",
            "<simple constructor name> ::= <constructor identifier>",

            "<constructor identifier> ::= ",

            "<method declaration> ::= <method header> <method body>",
            "<method header> ::= <method modifiers>? <result type> <method declarator>",
            "<result type> ::= <type> | void",
            "<method modifiers> ::= <method modifier> | <method modifiers> <method modifier>",
            //"<method modifier> ::= public | protected | private | static | abstract | final | synchronized | native",
            "<method modifier> ::= public | protected | private | static | abstract | final | synchronized",
            "<method declarator> ::= <method identifier> ( <formal parameter list>? )",
            "<method body> ::= <block> ",
            "<block> ::= { <block statements>? }",

            "<method identifier> ::= method1 | method2 | method3 | method4 | method5",

            "<block> ::= { <block statements>? }",
            "<block statements> ::= <block statement> | <block statements> <block statement>",
            "<block statement> ::= <local variable declaration statement> | <statement>",
            "<local variable declaration statement> ::= <local variable declaration> ;",
            "<local variable declaration> ::= <type> <variable declarators>",


            "<statement> ::= System.out.println(\"something is working, need to add statements\");",
            //"<statement> ::= <statement without trailing substatement> | <labeled statement> | <if then statement> | <if then else statement> | <while statement> | <for statement>",
            "<statement no short if> ::= <statement without trailing substatement> | <labeled statement no short if> | <if then else statement no short if> | <while statement no short if> | <for statement no short if>",
            "<statement without trailing substatement> ::= <block> | <empty statement> | <expression statement> | <switch statement> | <do statement> | <break statement> | <continue statement> | <return statement> ",
            "<empty statement> ::= ;",
            "<labeled statement> ::= <identifier> : <statement>",
            "<labeled statement no short if> ::= <identifier> : <statement no short if>",
            "<expression statement> ::= <statement expression> ;",
            "<statement expression> ::= <assignment> | <preincrement expression> | <postincrement expression> | <predecrement expression> | <postdecrement expression> | <method invocation> | <class instance creation expression>",

            "<field declaration> ::= <field modifiers>? <type> <variable declarators> ;",
            "<field modifiers> ::= <field modifier> | <field modifiers> <field modifier>",
            "<field modifier> ::= public | protected | private | static | final | transient | volatile",

            "<type> ::= <primitive type> | <reference type> | Object",
            "<primitive type> ::= <numeric type> | String | char | boolean",
            "<numeric type> ::= <integral type> | <floatingpoint type>",
            "<integral type> ::= byte | short | int | long | char",
            "<floatingpoint type> ::= float | double",
            "<reference type> ::= <class or interface type>",
            "<class or interface type> ::= <class type> | <interface type>",
            "<class type> ::= <type name>",
            "<interface type> ::= <type name>",
            //"<array type> ::= <type>[]",

            "<simple type name> ::= <identifier>",
            "<expression name> ::= <identifier> | <ambiguous name>.<identifier>",
            "<method name> ::= <identifier> | <ambiguous name>.<identifier>",
            "<ambiguous name>::= <identifier> | <ambiguous name>.<identifier>",
            "<identifier>::= a|b|c|d|e|f|g|h|i|j|k|l|m|n|o|p|q|r|s|t|u|v|w|x|y|z",

            "<if then statement>::= if ( <expression> ) <statement>",
            "<if then else statement>::= if ( <expression> ) <statement no short if> else <statement>",
            "<if then else statement no short if> ::= if ( <expression> ) <statement no short if> else <statement no short if>",
        /*
        "<switch statement> ::= switch ( <expression> ) <switch block>",
        "<switch block> ::= { <switch block statement groups>? <switch labels>? }",
        "<switch block statement groups> ::= <switch block statement group> | <switch block statement groups> <switch block statement group>",
        "<switch block statement group> ::= <switch labels> <block statements>",
        "<switch labels> ::= <switch label> | <switch labels> <switch label>",
        "<switch label> ::= case <constant expression> : | default :",
        */
            "<while statement> ::= while ( <expression> ) <statement>",
            "<while statement no short if> ::= while ( <expression> ) <statement no short if>",
            "<do statement> ::= do <statement> while ( <expression> ) ;",
            "<for statement> ::= for ( <for init>? ; <expression>? ; <for update>? ) <statement>",
            "<for statement no short if> ::= for ( <for init>? ; <expression>? ; <for update>? ) <statement no short if>",
            "<for init> ::= <statement expression list> | <local variable declaration>",
            "<for update> ::= <statement expression list>",
            "<statement expression list> ::= <statement expression> | <statement expression list> , <statement expression>",
            "<break statement> ::= break <identifier>? ;",
            "<continue statement> ::= continue <identifier>? ;",
            "<return statement> ::= return <expression>? ;",
        /*
        "<throws statement> ::= throw <expression> ;",
        "<synchronized statement> ::= synchronized ( <expression> ) <block>",
        "<try statement> ::= try <block> <catches> | try <block> <catches>? <finally>",
        "<catches> ::= <catch clause> | <catches> <catch clause>",
        "<catch clause> ::= catch ( <formal parameter> ) <block>",
        "<finally > ::= finally <block>",
        */
            "<constant expression> ::= <expression>",
            "<expression> ::= <assignment expression>",
            "<assignment expression> ::= <conditional expression> | <assignment>",
            "<assignment> ::= <left hand side> <assignment operator> <assignment expression>",
            "<left hand side> ::= <expression name> | <field access> | <array access>",
            "<assignment operator> ::= = | *= | /= | %= | += | -= | <<= | >>= | >>>= | &= | ^= | |=",
            "<conditional expression> ::= <conditional or expression> | <conditional or expression> ? <expression> : <conditional expression>",
            "<conditional or expression> ::= <conditional and expression> | <conditional or expression> || <conditional and expression>",
            "<conditional and expression> ::= <inclusive or expression> | <conditional and expression> && <inclusive or expression>",
            "<inclusive or expression> ::= <exclusive or expression> | <inclusive or expression> | <exclusive or expression>",
            "<exclusive or expression> ::= <and expression> | <exclusive or expression> ^ <and expression>",
            "<and expression> ::= <equality expression> | <and expression> & <equality expression>",
            "<equality expression> ::= <relational expression> | <equality expression> == <relational expression> | <equality expression> != <relational expression>",

            "<relational expression> ::= <shift expression> | <relational expression> < <shift expression> | <relational expressio> > <shift expression> | <relational expression> <= <shift expression> | <relational expression> >= <shift expression> | <relational expression> instanceof <reference type>",

            "<shift exression> ::= <additive expression> | <shift expression> << <additive expression> | <shift expression> >> <additive expression> | <shift expression> >>> <additive expression>",
            "<additive expression> ::= <multiplicative expression> | <additive expression> + <multiplicative expression> | <additive expression> - <multiplicative expression>",

            "<multiplicative expression> ::= <unary expression> | <multiplicative expression> * <unary expression> | <multiplicative expression> / <unary expression> | <multiplicative expression> % <unary expression>",
            "<cast expression> ::= ( <primitive type> ) <unary expression> | ( <reference type> ) <unary expression not plus minus>",
            "<unary expression> ::= <preincrement expression> | <predecrement expression> | + <unary expression> | - <unary expression> | <unary expression not plus minus>",
            "<predecrement expression> ::= -- <unary expression>",
            "<preincrement expression> ::= ++ <unary expression>",
            "<unary expression not plus minus> ::= <postfix expression> | ~ <unary expression> | ! <unary expression> | <cast expression>",
            "<postdecrement expression> ::= <postfix expression> --",
            "<postincrement expression> ::= <postfix expression> ++",
            "<postfix expression> ::= <primary> | <expression name> | <postincrement expression> | <postdecrement expression>",
            "<method invocation> ::= <method name> ( <argument list>? ) | <primary> . <identifier> ( <argument list>? ) | super . <identifier> ( <argument list>? )",
            "<field access> ::= <primary> . <identifier> | super . <identifier>",
            "<primary> ::= <primary no new array> | <array creation expression>",
            "<primary no new array> ::= <literal> | this | ( <expression> ) | <class instance creation expression> | <field access> | <method invocation> | <array access>",
            "<class instance creation expression> ::= new <class type> ( <argument list>? )",
            "<argument list> ::= <expression> | <argument list> , <expression>",
            "<array creation expression> ::= new <primitive type> <dim exprs> <dims>? | new <class or interface type> <dim exprs> <dims>?",
            "<dim exprs> ::= <dim expr> | <dim exprs> <dim expr>",
            "<dim expr> ::= [ <expression> ]",
            "<dims> ::= [ ] | <dims> [ ]",
            "<array access> ::= <expression name> [ <expression> ] | <primary no new array> [ <expression>]",
            "<package name> ::= <identifier> | <package name> . <identifier>",
            "<type name> ::= <identifier> | <package name> . <identifier>",
            "<simple type name> ::= <identifier>",
            "<expression name> ::= <identifier> | <ambiguous name> . <identifier>",
            "<method name> ::= <identifier> | <ambiguous name>. <identifier>",
            "<ambiguous name>::= <identifier> | <ambiguous name>. <identifier>",
            "<literal> ::= <integer literal> | <floating-point literal> | <boolean literal> | <character literal> | <string literal> | <null literal>",
            "<integer literal> ::= <decimal integer literal> | <hex integer literal> | <octal integer literal>",
            "<decimal integer literal> ::= <decimal numeral> <integer type suffix>?",
            "<hex integer literal> ::= <hex numeral> <integer type suffix>?",
            "<octal integer literal> ::= <octal numeral> <integer type suffix>?",
            "<integer type suffix> ::= l | L",
            "<decimal numeral> ::= 0 | <non zero digit> <digits>?",
            "<digits> ::= <digit> | <digits> <digit>",
            "<digit> ::= 0 | <non zero digit>",
            "<non zero digit> ::= 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9",
            "<hex numeral> ::= 0 x <hex digit> | 0 X <hex digit> | <hex numeral> <hex digit>",
            "<hex digit> ::= 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | a | b | c | d | e | f | A | B | C | D | E | F",
            "<octal numeral> ::= 0 <octal digit> | <octal numeral> <octal digit>",
            "<octal digit> ::= 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7",
            "<floating-point literal> ::= <digits> . <digits>? <exponent part>? <float type suffix>?",
            "<digits> ::= <exponent part>? <float type suffix>?",
            "<exponent part> ::= <exponent indicator> <signed integer>",
            "<exponent indicator> ::= e | E",
            "<signed integer> ::= <sign>? <digits>",
            "<sign> ::= + | -",
            "<float type suffix> ::= f | F | d | D",
            "<boolean literal> ::= true | false",
            "<character literal> ::= ' <single character> ' | ' <escape sequence> '",
            //"<single character> ::= <input character> except ' and \\",
            //"<string literal> ::= \" <string characters>?\" ",
            "<string characters> ::= <string character> | <string characters> <string character>",
            //"<string character> ::= <input character> except \" and \\ | <escape character>",
            //"<null literal> ::= null",
            "<keyword> ::= abstract | boolean | break | byte | case | catch | char | class | const | continue | default | do | double | else | extends | final | finally | float | for | goto | if | implements | import | instanceof | int | interface | long | native | new | package | private | protected | public | return | short | static | super | switch | synchronized | this | throw | transient | try | void | volatile | while",
            "<identifier> ::= sharan | x | y | z"
    };

}
