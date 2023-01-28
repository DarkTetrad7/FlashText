public class Cards {
    public static int i = 0;
    public String front;
    public String back;
    public static boolean side = true;

    public Cards (String front, String back) {
        this.front = front;
        this.back = back;
    }

    static Cards[] pile = new Cards[600];
    {Cards.pile[1] = Cards.card1;}
    {Cards.pile[2] = Cards.card2;}
    {Cards.pile[3] = Cards.card3;}
    {Cards.pile[4] = Cards.card4;}
    {Cards.pile[5] = Cards.card5;}
    {Cards.pile[6] = Cards.card6a;}
    {Cards.pile[7] = Cards.card6b;}
    {Cards.pile[8] = Cards.card7;}
    {Cards.pile[9] = Cards.card8;}
    {Cards.pile[10] = Cards.card9a;}
    {Cards.pile[11] = Cards.card9b;}
    {Cards.pile[12] = Cards.card10;}
    {Cards.pile[13] = Cards.card11;}
    {Cards.pile[14] = Cards.card12;}
    {Cards.pile[15] = Cards.card13;}
    {Cards.pile[16] = Cards.card14;}
    {Cards.pile[17] = Cards.card15;}
    {Cards.pile[18] = Cards.card16;}
    {Cards.pile[19] = Cards.card17;}
    {Cards.pile[20] = Cards.card18;}
    {Cards.pile[21] = Cards.card19;}
    {Cards.pile[22] = Cards.card20;}
    {Cards.pile[23] = Cards.card21;}
    {Cards.pile[24] = Cards.card22;}
    {Cards.pile[25] = Cards.card23;}
    {Cards.pile[26] = Cards.card24;}
    {Cards.pile[27] = Cards.card25;}
    {Cards.pile[28] = Cards.card26;}
    {Cards.pile[29] = Cards.card27;}
    {Cards.pile[30] = Cards.card28;}
    {Cards.pile[31] = Cards.card29;}
    {Cards.pile[32] = Cards.card30;}
    {Cards.pile[33] = Cards.card31;}
    {Cards.pile[34] = Cards.card32;}
    {Cards.pile[35] = Cards.card33;}
    {Cards.pile[36] = Cards.card34;}
    {Cards.pile[37] = Cards.card35;}
    {Cards.pile[38] = Cards.card36;}
    {Cards.pile[39] = Cards.card37;}
    {Cards.pile[40] = Cards.card38;}
    {Cards.pile[41] = Cards.card39;}
    {Cards.pile[42] = Cards.card40;}
    {Cards.pile[43] = Cards.card41;}
    {Cards.pile[44] = Cards.card42;}
    {Cards.pile[45] = Cards.card43;}
    {Cards.pile[46] = Cards.card44;}
    {Cards.pile[47] = Cards.card45;}
    {Cards.pile[48] = Cards.card46;}
    {Cards.pile[49] = Cards.card47;}
    {Cards.pile[50] = Cards.card48;}
    {Cards.pile[51] = Cards.card49;}
    {Cards.pile[52] = Cards.card50;}
    {Cards.pile[53] = Cards.card51;}
    {Cards.pile[54] = Cards.card52;}
    {Cards.pile[55] = Cards.card53;}
    {Cards.pile[56] = Cards.card54;}








    static Cards card1 = new Cards("array", "An ordered collection of identical objects, or " +
            "literals, chronologically and statically indexed, starting at zero.");

    static Cards card2 = new Cards("Declare an array.  Then on the next line assign the size to the array. Do both of the above in one statement.","<DataType>[] <ArrayName>;\n<ArrayName> = new <DataType>[Size];\n<DataType>[] <ArrayName> = new <DataType>[Size];");

    static Cards card3 = new Cards("Initialize an array.", "<DataType>[] <ArrayName> = {Element1, Element2, ... Elementn};");

    static Cards card4 = new Cards("Add an element to an array.", "<ArrayName>[Index] = VAL;");

    static Cards card5 = new Cards("module", "A reusable code snippet that can be plugged-in to code and used in a well-defined straight forward manner.");

    static Cards card6a = new Cards("object", "A module that has a state and subroutines.  In java the states are known as attributes or fields, and the subroutines are known as methods.");

    static Cards card6b = new Cards("Create an object.", "<ClassName> <objectName> = new <ClassName> (<arg(s))");

    static Cards card7 = new Cards("<var1><operator>=<var2>", "<var1> = <var1> <operator> <var2>;");

    static Cards card8 = new Cards("return", "When the computer, usually in reference to a method, passes an argument.");

    static Cards card9a = new Cards("signature (of a subroutine)", "visibility, static/non-static, return-type, name, and the parameter list.\nEverything before the brace, or body of the method.");

    static Cards card9b = new Cards("body (of a subroutine)", "The statements in the braces.");

    static Cards card10 = new Cards("formal parameters vs dummy parameters vs actual parameters", "The first two (formal and dummy) are general parameters.  Whereas actual parameters are the actual arguments being passed.");

    static Cards card11 = new Cards("extends keyword.\nShow the format.", "Allows the class using the keyword to inherit another class.\n<visibility> class <SubclassName> extends <ParentClass> {...");

    static Cards card12 = new Cards("Initialize an enum.", "enum <EnumIdentifier> {\nELEMENT1,\nELEMENT2,...\nELEMENTn}");

    static Cards card13 = new Cards("Initialize an enum object.\nCall an enum element.", "<EnumIdentifier> <enumObject>;\n<EnumIdentifier>.ELEMENTx");

    static Cards card14 = new Cards("abstract class", "A class with no objects.  Exists solely to instantiate new subclasses.");

    static Cards card15 = new Cards("else keyword\nelse if keyword", "Used after an if statement if the boolean conditional is false.\nSame as above but can be a chain where the last else if will be just else.");

    static Cards card16 = new Cards("accessor method", "aka getter method.  A public method that returns returns a private variable.");

    static Cards card17 = new Cards("mutator method", "aka setter method.  A public method that allows for assignments of private variables.");

    static Cards card18 = new Cards("block", "Any statements enclosed by curly braces (in java).");

    static Cards card19 = new Cards("Are bugs syntactically incorrect?  How about semantically?", "Bugs are syntactically correct.  They are semantically incorrect.");

    static Cards card20 = new Cards("pseudocode","A step by step chronologically set of instructions to execute a desired goal.\nThey are written in ordinary human language, and are to be translated to high-level programming language.\nIt is useful for designing algorithms.");

    static Cards card21 = new Cards("if keyword format usage", "if (<conditional_boolean>) {...\n} else {...\n}");

    static Cards card22 = new Cards("program (computer science)", "A step by step list of instructions to be completed by a computer.");

    static Cards card23 = new Cards("format specifier appearance", "Always starts with a % and followed by a letter matching the variable it encodes for");

    static Cards card24 = new Cards("subroutines vs functions vs methods","Subroutines are collection of statements to be executed one after the other after the subroutine is called.\nA function is a subroutine with a return value.\nA method is a subroutine that belongs to a class (in java all subroutines are methods).");

    static Cards card25 = new Cards("variable", "An identifier for a location in memory that can store data.");

    static Cards card26 = new Cards("How many primitive data types are there?\nWhat are they?", "There are 7.\nshort (2 bytes). int (4 bytes). long (8 bytes). float (4 bytes). double (8 bytes). char (2 bytes).  boolean.");

    static Cards card27 = new Cards("Show the format of a while loop.", "while (<conditional_boolean>) {...\nKeep in mind the while loop must have statements that alter the conditional otherwise it will be a infinite loop.");

    static Cards card28 = new Cards("Show the format of a do... while loop and explain why it's used.", "do {...\n} while (<conditional_boolean>);\nA do... while loop ensures that the staements are executed at least once.");

    static Cards card29 = new Cards("continue keyword","Immediately stops the current iteration in a loop and goes back to test the conditional boolean.");

    static Cards card30 = new Cards("break keyword", "Immediately exits the current loop.");

    static Cards card31 = new Cards("Initialization vs Assignment", "Initialization gives the very first value to a var whilst assignments are later changes to the variable.");

    static Cards card32 = new Cards("The two types of control structures.", "loops and branches");

    static Cards card33 = new Cards("instance", "objects of classes");

    static Cards card34 = new Cards("Show the format for a for each loop with enums", "for (<EnumIdentifier> <varLabel> : <EnumIdentifier>.values()) {...");

    static Cards card35 = new Cards("Decalre a variable.", "<dataType> <var>;");

    static Cards card36 = new Cards("Backlash in strings.", "<text>|<quote>, t tab, n new line, u<4digitHexaDecimal>");

    static Cards card37 = new Cards("Null Reference", "When a var refers to null or a method is called that returns null");

    static Cards card38 = new Cards("sentinel value and flag variable", "Sentinel value is an illegal input value to break a loop, and if a boolean is used then it is known as a flag variable.");

    static Cards card39 = new Cards("UPER", "Understand, Plan, Execute, Reflect");

    static Cards card40 = new Cards("Show the format of a for loop and an enhanced for loop for an array.", "for (int i, i < <arrayName>.length(); i++) {...\nfor (<dataType> var: <arrayName>) {...");

    static Cards card41 = new Cards("default initializations in java", "int/short/float: 0\nfloat/double: 0.0\nboolean: false\nchar: null char u0000");

    static Cards card42 = new Cards("Show the format of a switch statement.", "switch (<expression>) {\n\tcase <constant1>:\n\t\t<statements1>;\n\tcase <constant2>:\n\t\t<statements2>;\n\t...\n\tcase <constantn>:\n\t\t<statementsn>;\n}");

    static Cards card43 = new Cards("API", "Application Programming Interface");

    static Cards card44 = new Cards("jar", "A subdirectory fo the main java installation directory.  Java archives.");

    static Cards card45 = new Cards("javadoc", "A special comment in a java program /** [SPACE]");

    static Cards card46 = new Cards("JVM, JRE, JDK", "Java Virtual Machine (compiler), Java Runtime Environment (JVM + Libraries), Java Development Kit (JRE + Development tools)");

    static Cards card47 = new Cards("HTML use and full name", "Programming language used to create webpages. Short for hypertextmarkup language");

    static Cards card48 = new Cards("doc tags", "the @ symbol in javadocs to explain what a param or it returns");

    static Cards card49 = new Cards("class vars and class methods", "Another name for static methods and static variables.");

    static Cards card50 = new Cards("this keyword", "'this' refers to the already instantiated attribute in the beginning of the class and the second one is the arg in the method.");

    static Cards card51 = new Cards("modulus operator", "<value1>%<value2> and it shows the remainder of a division");

    static Cards card52 = new Cards("&&", "and boolean operator");

    static Cards card53 = new Cards("||", "or boolean operator");

    static Cards card54 = new Cards("Show the format of a for loop.", "for (int i; i <relational_operator> <chosen amount>; i++;) {...");



}
