public class DataTypesTester {
    public static void testByte() {

	System.out.println("**********TEST Byte**********");

	byte a = 8, b = 3, c;
	System.out.println("\n****** Arithmetical Operators ******");
	// addition
	c =(byte) (a + b);
	System.out.printf("%d + %d = %d\n", a, b, c);

	//subtraction
	c =(byte) (a - b);
	System.out.printf("%d - %d = %d\n", a, b, c);

	//multiplication
	c =(byte) (a * b);
	System.out.printf("%d * %d = %d\n", a, b, c);

	//division
	c =(byte) (a / b);
	System.out.printf("%d / %d = %d\n", a, b, c);
	// c = a / 0; --> Arithmetical Exception
	
	//modulus
	c =(byte) (a % b);
	System.out.printf("%d %% %d = %d\n", a, b, c);
	// c = a % 0; --> Arithmetical Exception

	//unary minus
	c =(byte) -a;
	System.out.printf("-%d = %d\n", a, c);

	//unary minus with int
	int h;
	h = -a;
	System.out.printf("-%d = %d\n", a, h);
	
	//unary plus
	c =(byte) +a;
	System.out.printf("+%d = %d\n", a, c);

	//unary plus whith int
	h = +a;
	System.out.printf("+%d = %d\n", a, c);

	//prefix increment
	a = 25;
	System.out.printf("++%d = %d\n", a, ++a);
	
	//postfix increment
	a = 25;
	System.out.printf("%d++ = %d\n", a, a++);
	
	//prefix decrement
	a = 30;
	System.out.printf("--%d = %d\n", a, --a);
	
	//postfix decrement
	a = 30;
	System.out.printf("%d-- = %d\n", a, a--);
	
	System.out.println("\n****** Relational Operators ******");

	//equal to 
	System.out.printf("%d == %d --> %b\n", a, b, a == b);
	
	//not equal to
	System.out.printf("%d != %d --> %b\n", a, b, a != b);

	//greater than
	System.out.printf("%d > %d --> %b\n", a, b, a > b);
	
	//less than
	System.out.printf("%d < %d --> %b\n", a, b, a < b);

	//greatre than or equal to
	System.out.printf("%d >= %d --> %b\n", a, b, a >= b);

	//less than or equal to
	System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
	
	System.out.println("\n****** Bitwise Operators ******");
	
	//bitwise &
	c =(byte) (a & b);
	System.out.printf("%d & %d = %d\n", a, b, c);
	System.out.println("In binary form:");
	System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

	//biwise or
	c = (byte) (a | b);
	System.out.printf("%d | %d = %d\n", a, b, c);
	System.out.println("In binary form:");
	System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

	//bitwise XOR
	c = (byte) (a ^ b);
	System.out.printf("%d ^ %d = %d\n", a, b, c);
	System.out.println("In binary form:");
	System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

	//bitwise unary compliment
	c = (byte) (~a);
	System.out.printf("~%d = %d\n", a, c);
	System.out.println("In binary form:");
	System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

	//left shift
	c = (byte) (a << 1);
	System.out.printf("%d << 1 = %d\n", a, c);
	System.out.println("In binary form:");
	System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
	
	//right shift
	c = (byte) (a >> 1);
	System.out.printf("%d >> 1 = %d\n", a, c);
	System.out.println("In binary form:");
	System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

	//right shift
	a = -9;
	c = (byte) (a >> 1);
	System.out.printf("%d >> 1 = %d\n", a, c);
	System.out.println("In binary form:");
	System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

	//zero fill right shift
	a = 9;
	c = (byte) (a >>> 1);
	System.out.printf("%d >>> 1 = %d\n", a, c);
	System.out.println("In binary form:");
	System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

	//zero fill right shift
	a = -9;
	c = (byte) (a >>> 1);
	System.out.printf("%d >>> 1 = %d\n", a, c);
	System.out.println("In binary form:");
	System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

	
	System.out.println("\n****** Assigment Operators ******");
	a = 4;
	c = 23;
	System.out.printf("%d += %d --> %d\n", c, a, c += a);
	System.out.printf("%d -= %d --> %d\n", c, a, c -= a);
	System.out.printf("%d *= %d --> %d\n", c, a, c *= a);
	System.out.printf("%d /= %d --> %d\n", c, a, c /= a);
	// if a = 0; c /= a; --> Arithmetical Exception

	System.out.printf("%d %%= %d --> %d\n", c, a, c %= a);
	// if a = 0; c /= a; --> Arithmetical Exception

	System.out.printf("%d &= %d --> %d\n", c, a, c &= a);
	System.out.printf("%d |= %d --> %d\n", c, a, c |= a);
	System.out.printf("%d ^= %d --> %d\n", c, a, c ^= a);
	System.out.printf("%d >>= %d --> %d\n", c, a, c >>= a);
	System.out.printf("%d <<= %d --> %d\n", c, a, c <<= a);

	System.out.println("\n****** Logical Operators ******");

	//logical AND
	System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

	//bitwise logical AND
	System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));

	//logical OR
	System.out.printf("(%d > %d) || (%d != 0) --> %b\n", a, b, a, (a > b) || (a != 0));

	//bitwise logical OR
	System.out.printf("(%d > %d) | (%d != 0) --> %b\n", a, b, a, (a > b) | (a != 0));

	//logical XOR
	System.out.printf("(%d > %d) ^ (%d != 0) --> %b\n", a, b, a, (a > b) ^ (a != 0));

	//Logical Not
	System.out.printf("!(%d > %d) --> %b\n", a, b, !(a > b));


	System.out.println("\n****** Misc Operators ******");

	System.out.println("\nCondition Operator:");
	System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, 
		(a > b ? a : b));


	System.out.println("\nType Cast Operator:");
	short sh = -32000;
	char ch = '\u0002';
	int nt = 100_000_000;
	long l = 100_000_000_000_000_000L;
	float f = 1.9f;
	double d = 123456789.625;
	boolean bool = true;
	c = (byte) sh;
	System.out.printf("byte = short: c = (byte) %d --> c = %d\n", sh, c);

	c = (byte) ch;
	System.out.printf("byte = char: c = (byte) '%c' --> c = %d\n", ch, c);

	c = (byte) nt;
	System.out.printf("byte = int: c = (byte) %d --> c = %d\n", nt, c);

	c = (byte) l;
	System.out.printf("byte = long: c = (byte) %d --> c = %d\n", l, c);

	c = (byte) f;
	System.out.printf("byte = float: c = (byte) %f --> c = %d\n", f, c);

	c = (byte) d;
	System.out.printf("byte = double: c = (byte) %f --> c = %d\n", d, c);

	//c = (byte) bool;
	System.out.printf("byte = boolean: c = (byte)%b --> Compile Error - \"Boolean cannot be converted to byte\"\n",
		bool);	
	
    }

    public static void testShort() {

	System.out.println("\n**********TEST SHORT**********");

	short a = 11, b = 3, c;
	System.out.println("\n****** Arithmetical Operators ******");
	// addition
	c =(short) (a + b);
	System.out.printf("%d + %d = %d\n", a, b, c);

	//subtraction
	c =(short) (a - b);
	System.out.printf("%d - %d = %d\n", a, b, c);

	//multiplication
	c =(short) (a * b);
	System.out.printf("%d * %d = %d\n", a, b, c);

	//division
	c =(short) (a / b);
	System.out.printf("%d / %d = %d\n", a, b, c);
	// c = a / 0; --> Arithmetical Exception
	
	//modulus
	c =(short) (a % b);
	System.out.printf("%d %% %d = %d\n", a, b, c);
	// c = a % 0; --> Arithmetical Exception

	//unary minus
	c =(short) -a;
	System.out.printf("-%d = %d\n", a, c);

	//unary minus with int
	int h;
	h = -a;
	System.out.printf("-%d = %d\n", a, h);
	
	//unary plus
	c =(short) +a;
	System.out.printf("+%d = %d\n", a, c);

	//unary plus whith int
	h = +a;
	System.out.printf("+%d = %d\n", a, c);

	//prefix increment
	a = 25;
	System.out.printf("++%d = %d\n", a, ++a);
	
	//postfix increment
	a = 25;
	System.out.printf("%d++ = %d\n", a, a++);
	
	//prefix decrement
	a = 30;
	System.out.printf("--%d = %d\n", a, --a);
	
	//postfix decrement
	a = 30;
	System.out.printf("%d-- = %d\n", a, a--);
	
	System.out.println("\n****** Relational Operators ******");

	//equal to 
	System.out.printf("%d == %d --> %b\n", a, b, a == b);
	
	//not equal to
	System.out.printf("%d != %d --> %b\n", a, b, a != b);

	//greater than
	System.out.printf("%d > %d --> %b\n", a, b, a > b);
	
	//less than
	System.out.printf("%d < %d --> %b\n", a, b, a < b);

	//greatre than or equal to
	System.out.printf("%d >= %d --> %b\n", a, b, a >= b);

	//less than or equal to
	System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
	
	System.out.println("\n****** Bitwise Operators ******");
	
	//bitwise &
	c =(short) (a & b);
	System.out.printf("%d & %d = %d\n", a, b, c);
	System.out.println("In binary form:");
	System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

	//biwise or
	c = (short) (a | b);
	System.out.printf("%d | %d = %d\n", a, b, c);
	System.out.println("In binary form:");
	System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

	//bitwise XOR
	c = (short) (a ^ b);
	System.out.printf("%d ^ %d = %d\n", a, b, c);
	System.out.println("In binary form:");
	System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

	//bitwise unary compliment
	c = (short) (~a);
	System.out.printf("~%d = %d\n", a, c);
	System.out.println("In binary form:");
	System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

	//left shift
	c = (short) (a << 1);
	System.out.printf("%d << 1 = %d\n", a, c);
	System.out.println("In binary form:");
	System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
	
	//right shift
	c = (short) (a >> 1);
	System.out.printf("%d >> 1 = %d\n", a, c);
	System.out.println("In binary form:");
	System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

	//right shift
	a = -29;
	c = (short) (a >> 1);
	System.out.printf("%d >> 1 = %d\n", a, c);
	System.out.println("In binary form:");
	System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

	//zero fill right shift
	a = 29;
	c = (short) (a >>> 1);
	System.out.printf("%d >>> 1 = %d\n", a, c);
	System.out.println("In binary form:");
	System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

	//zero fill right shift
	a = -29;
	c = (short) (a >>> 1);
	System.out.printf("%d >>> 1 = %d\n", a, c);
	System.out.println("In binary form:");
	System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

	
	System.out.println("\n****** Assigment Operators ******");
	a = 4;
	c = 23;
	System.out.printf("%d += %d --> %d\n", c, a, c += a);
	System.out.printf("%d -= %d --> %d\n", c, a, c -= a);
	System.out.printf("%d *= %d --> %d\n", c, a, c *= a);
	System.out.printf("%d /= %d --> %d\n", c, a, c /= a);
	// if a = 0; c /= a; --> Arithmetical Exception

	System.out.printf("%d %%= %d --> %d\n", c, a, c %= a);
	// if a = 0; c /= a; --> Arithmetical Exception

	System.out.printf("%d &= %d --> %d\n", c, a, c &= a);
	System.out.printf("%d |= %d --> %d\n", c, a, c |= a);
	System.out.printf("%d ^= %d --> %d\n", c, a, c ^= a);
	System.out.printf("%d >>= %d --> %d\n", c, a, c >>= a);
	System.out.printf("%d <<= %d --> %d\n", c, a, c <<= a);

	System.out.println("\n****** Logical Operators ******");

	//logical AND
	System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

	//bitwise logical AND
	System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));

	//logical OR
	System.out.printf("(%d > %d) || (%d != 0) --> %b\n", a, b, a, (a > b) || (a != 0));

	//bitwise logical OR
	System.out.printf("(%d > %d) | (%d != 0) --> %b\n", a, b, a, (a > b) | (a != 0));

	//logical XOR
	System.out.printf("(%d > %d) ^ (%d != 0) --> %b\n", a, b, a, (a > b) ^ (a != 0));

	//Logical Not
	System.out.printf("!(%d > %d) --> %b\n", a, b, !(a > b));


	System.out.println("\n****** Misc Operators ******");

	System.out.println("\nCondition Operator:");
	System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, 
		(a > b ? a : b));


	System.out.println("\nType Cast Operator:");
	byte bt = 1;
	char ch = '\u0002';
	int nt = 100_000_000;
	long l = 100_000_000_000_000_000L;
	float f = 1.9f;
	double d = 123_456_789.625;
	boolean bool = true;

	c = bt;
	System.out.printf("short = byte: c = %d --> c = %d\n", bt, c);

	c = (short) ch;
	System.out.printf("short = char: c = '%c' --> c = %d\n", ch, c);

	c = (short) nt;
	System.out.printf("short = int: c = (short) %d --> c = %d\n", nt, c);

	c = (short) l;
	System.out.printf("short = long: c = (short) %d --> c = %d\n", l, c);

	c = (short) f;
	System.out.printf("short = float: c = (short) %f --> c = %d\n", f, c);

	c = (short) d;
	System.out.printf("short = double: c = (short) %f --> c = %d\n", d, c);

	//c = (short) bool;
	System.out.printf("short = boolean: c = (short)%b --> Compile Error - \"Boolean cannot be converted to byte\"\n",
		bool);	

    }

    public static void testChar() {
	System.out.println("**********TEST Char**********");

	char a = '\u0038', b = '\u0033', c;
	System.out.println("\n****** Arithmetical Operators ******");
	// addition
	c =(char) (a + b);
	System.out.printf("%c + %c = %c\n", a, b, c);

	//subtraction
	c =(char) (a - b);
	System.out.printf("%c - %c = %c\n", a, b, c);

	//multiplication
	c =(char) (a * b);
	System.out.printf("%c * %c = %c\n", a, b, c);

	//division
	c =(char) (a / b);
	System.out.printf("%c / %c = %c\n", a, b, c);
	// c = a / 0; --> Arithmetical Exception
	
	//modulus
	c =(char) (a % b);
	System.out.printf("%c %% %c = %c\n", a, b, c);
	// c = a % 0; --> Arithmetical Exception

	//unary minus
	c =(char) -a;
	System.out.printf("-%c = %c\n", a, c);

	//unary minus with int
	//int h;
	//h = -a;
	//System.out.printf("-%c = %c\n", a, h);
	
	//unary plus
	c =(char) +a;
	System.out.printf("+%c = %c\n", a, c);

	//unary plus whith int
	int h;
	h = +a;
	System.out.printf("+%c = %c\n", a, c);

	//prefix increment
	a = '\u0038';
	System.out.printf("++%c = %c\n", a, ++a);
	
	//postfix increment
	a = '\u0038';
	System.out.printf("%c++ = %c\n", a, a++);
	
	//prefix decrement
	a = '\u0038';
	System.out.printf("--%c = %c\n", a, --a);
	
	//postfix decrement
	a = '\u0038';
	System.out.printf("%c-- = %c\n", a, a--);
	
	System.out.println("\n****** Relational Operators ******");

	//equal to 
	System.out.printf("%c == %c --> %b\n", a, b, a == b);
	
	//not equal to
	System.out.printf("%c != %c --> %b\n", a, b, a != b);

	//greater than
	System.out.printf("%c > %c --> %b\n", a, b, a > b);
	
	//less than
	System.out.printf("%c < %c --> %b\n", a, b, a < b);

	//greatre than or equal to
	System.out.printf("%c >= %c --> %b\n", a, b, a >= b);

	//less than or equal to
	System.out.printf("%c <= %c --> %b\n", a, b, a <= b);
	
	System.out.println("\n****** Bitwise Operators ******");
	
	//bitwise &
	c =(char) (a & b);
	System.out.printf("%c & %c = %c\n", a, b, c);
	System.out.println("In binary form:");
	System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

	//biwise or
	c = (char) (a | b);
	System.out.printf("%c | %c = %c\n", a, b, c);
	System.out.println("In binary form:");
	System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

	//bitwise XOR
	c = (char) (a ^ b);
	System.out.printf("%c ^ %c = %c\n", a, b, c);
	System.out.println("In binary form:");
	System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

	//bitwise unary compliment
	c = (char) (~a);
	System.out.printf("~%c = %c\n", a, c);
	System.out.println("In binary form:");
	System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

	//left shift
	c = (char) (a << 1);
	System.out.printf("%c << 1 = %c\n", a, c);
	System.out.println("In binary form:");
	System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
	
	//right shift
	c = (char) (a >> 1);
	System.out.printf("%c >> 1 = %c\n", a, c);
	System.out.println("In binary form:");
	System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));


	//zero fill right shift
	a = '\u0038';
	c = (char) (a >>> 1);
	System.out.printf("%c >>> 1 = %c\n", a, c);
	System.out.println("In binary form:");
	System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

	
	System.out.println("\n****** Assigment Operators ******");
	a = '\u0003';
	c = '\u0137';
	System.out.printf("%c += %c --> %c\n", c, a, c += a);
	System.out.printf("%c -= %c --> %c\n", c, a, c -= a);
	System.out.printf("%c *= %c --> %c\n", c, a, c *= a);
	System.out.printf("%c /= %c --> %c\n", c, a, c /= a);
	// if a = 0; c /= a; --> Arithmetical Exception

	System.out.printf("%c %%= %c --> %c\n", c, a, c %= a);
	// if a = 0; c /= a; --> Arithmetical Exception

	System.out.printf("%c &= %c --> %c\n", c, a, c &= a);
	System.out.printf("%c |= %c --> %c\n", c, a, c |= a);
	a = '\u0003';
	c = '\u0137';
	System.out.printf("%c ^= %c --> %c\n", c, a, c ^= a);
	System.out.printf("%c >>= %c --> %c\n", c, a, c >>= a);
	System.out.printf("%c <<= %c --> %c\n", c, a, c <<= a);

	System.out.println("\n****** Logical Operators ******");

	//logical AND
	System.out.printf("(%c > %c) && (%c > 12) --> %b\n", a, b, a, (a > b) && (a > 0));

	//bitwise logical AND
	System.out.printf("(%c > %c) & (%c > 12) --> %b\n", a, b, a, (a > b) & (a > 0));

	//logical OR
	System.out.printf("(%c > %c) || (%c != 4) --> %b\n", a, b, a, (a > b) || (a != 0));

	//bitwise logical OR
	System.out.printf("(%c > %c) | (%c != 4) --> %b\n", a, b, a, (a > b) | (a != 0));

	//logical XOR
	System.out.printf("(%c > %c) ^ (%c != 4) --> %b\n", a, b, a, (a > b) ^ (a != 0));

	//Logical Not
	System.out.printf("!(%c > %c) --> %b\n", a, b, !(a > b));


	System.out.println("\n****** Misc Operators ******");

	System.out.println("\nCondition Operator:");
	System.out.printf("%c > %c ? %c : %c --> %c\n", a, b, a, b, 
		(a > b ? a : b));


	System.out.println("\nType Cast Operator:");
	byte bt = 1;
	short sh = -32001;
	int nt = 100_000_000;
	long l = 100_000_000_000_000_000L;
	float f = 1.9f;
	double d = 123456789.625;
	boolean bool = true;
	c = (char) bt;
	System.out.printf("char = byte: c = %d --> c = %c\n", bt, c);

	c = (char) sh;
	System.out.printf("char = char: c = %d --> c = %c\n", sh, c);

	c = (char) nt;
	System.out.printf("char = int: c = (char) %d --> c = %c\n", nt, c);

	c = (char) l;
	System.out.printf("char = long: c = (char) %d --> c = %c\n", l, c);

	c = (char) f;
	System.out.printf("char = float: c = (char) %f --> c = %c\n", f, c);

	c = (char) d;
	System.out.printf("byte = double: c = (char) %f --> c = %c\n", d, c);

	//c = (char) bool;
	System.out.printf("byte = boolean: c = (byte)%b --> Compile Error - \"Boolean cannot be converted to byte\"\n",
		bool);	

    }

    public static void testInt() {

	System.out.println("\n**********TEST INT**********");
        int a = 11, b = 3, c;

        System.out.println("\n****** Arithmetical Operators *****");

        //addition
        c = b + a;
        System.out.printf("%d + %d = %d\n", a, b, c);

	// subtraction
	c = a - b;
	System.out.printf("%d - %d = %d\n", a, b, c);

	// multiplication
	c = a * b;
	System.out.printf("%d * %d = %d\n", a, b, c);

	// division
	c = a / b;
	System.out.printf("%d / %d = %d\n", a, b, c);

	// modulus
	c = a % b;
	System.out.printf("%d %% %d = %d\n", a, b, c);
	// c = a / 0; --> Arithmetical Exception
	// c = a % 0; --> Arithmetical Exception

	a = 17;
	// unary minus
	c = -a;
	System.out.printf("-%d = %d\n", a, c);

	// unary plus
	c = +a;
	System.out.printf("+%d = %d\n", a, c);

	// prefix increment
	a = 15;
	System.out.printf("++%d = %d\n", a, ++a);

	// postfix increment
	a = 15;
	System.out.printf("%d++ = %d\n", a, a++);

	// prefix decrement
	a = 15;
	System.out.printf("--%d = %d\n", a, --a);

	// postfix decrement
	a = 15;
	System.out.printf("%d-- = %d\n", a, a--);


	System.out.println("\n***** Bitwise Operators *****");

	c = a & b; // bitwise AND
	System.out.printf("%d & %d = %d\n", a, b, c);
	System.out.println("in binary form:");
	System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(b), Integer.toBinaryString(c));

	c = a | b; // bitwise OR
	System.out.printf("%d | %d = %d\n", a, b, c);
	System.out.println("in binary form:");
	System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(b), Integer.toBinaryString(c));

	c = a ^ b; // bitwise XOR
	System.out.printf("%d ^ %d = %d\n", a, b, c);
	System.out.println("in binary form:");
	System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(b), Integer.toBinaryString(c));

	c = ~a; // bitwise unary compliment
	System.out.printf("~%d = %d\n", a, c);
	System.out.println("in binary form:");
	System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
	Integer.toBinaryString(c));

	c = a << 1; // left shift
	System.out.printf("%d << 1 = %d\n", a, c);
	System.out.println("in binary form:");
	System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(c));

	c = a >> 1; // right shift
	System.out.printf("%d >> 1 = %d\n", a, c);
	System.out.println("in binary form:");
	System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(c));

	a = -5;
	c = a >> 1; // right shift
	System.out.printf("%d >> 1 = %d\n", a, c);
	System.out.println("in binary form:");
	System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(c));

	a = 5;
	c = a >>> 1; // zero fill right shift
	System.out.printf("%d >>> 1 = %d\n", a, c);
	System.out.println("in binary form:");
	System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(c));

	a = -5;
	c = a >>> 1; // zero fill right shift
	System.out.printf("%d >>> 1 = %d\n", a, c);
	System.out.println("in binary form:");
	System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(c));


	System.out.println("\n***** Assignment Operators *****");

	c = 7;
	System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
	System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
	System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
	System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
	System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
	// c %= 0; --> Arithmetical Exception
	// c /= 0; --> Arithmetical Exception
	System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
	System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
	System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
	System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
	System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
	System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);


	System.out.println("\n***** Relational Operators *****");

	// greater than
	System.out.printf("%d > %d --> %b\n", a, b, a > b);

	// greater than or equal to
	System.out.printf("%d >= %d --> %b\n", a, b, a >= b);

	// less than
	System.out.printf("%d < %d --> %b\n", a, b, a < b);

	// less than or equal to
	System.out.printf("%d <= %d --> %b\n", a, b, a <= b);

	// equal to
	System.out.printf("%d == %d --> %b\n", a, b, a == b);

	// not equal to
	System.out.printf("%d != %d --> %b\n", a, b, a != b);


	System.out.println("\n***** Logical Operations *****");

	// logical AND
	System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, 
		(a > b) && (a > 0));
	// bitwise logical AND
	System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, 
		(a > b) & (a > 0));

	// logical OR
	System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, 
		(a >= b) || (b != 0));

	// bitwise logical OR
	System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, 
		(a >= b) | (b != 0));

	// logical XOR
	System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, 
		(a >= b) ^ (b != 0));

	// logical NOT
	System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));


	System.out.println("\n***** Misc Operators *****");

	System.out.println("\nCondition Operator:");
	System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, 
		(a > b ? a : b));


	System.out.println("\nType Cast Operator:");
	byte bt = 1;
	short sh = -32000;
	char ch = '\u0002';
	long l = 100000000000000000L;
	float f = 1.9f;
	double d = 123456789.625;
	boolean bool = true;
	c = bt;
	System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
	c = sh;
	System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
	c = ch;
	System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
	c = (int) l;
	System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
	c = (int) f;
	System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
	c = (int) d;
	System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
	// c = (int)bool;
	System.out.printf("int = boolean: c = (int)%b --> Compile Error\n",
		bool);
    }

    public static void testLong() {
	System.out.println("\n**********Test LONG**********");

	long a = 8L, b = 3L, c;
	System.out.println("\n****** Arithmetical Operators ******");
	// addition
	c =a + b;
	System.out.printf("%d + %d = %d\n", a, b, c);

	//subtraction
	c = a - b;
	System.out.printf("%d - %d = %d\n", a, b, c);

	//multiplication
	c = a * b;
	System.out.printf("%d * %d = %d\n", a, b, c);

	//division
	c = a / b;
	System.out.printf("%d / %d = %d\n", a, b, c);
	// c = a / 0; --> Arithmetical Exception
	
	//modulus
	c = a % b;
	System.out.printf("%d %% %d = %d\n", a, b, c);
	// c = a % 0; --> Arithmetical Exception

	//unary minus
	c = -a;
	System.out.printf("-%d = %d\n", a, c);

	
	//unary plus
	c = +a;
	System.out.printf("+%d = %d\n", a, c);


	//prefix increment
	a = 25L;
	System.out.printf("++%d = %d\n", a, ++a);
	
	//postfix increment
	a = 25L;
	System.out.printf("%d++ = %d\n", a, a++);
	
	//prefix decrement
	a = 30L;
	System.out.printf("--%d = %d\n", a, --a);
	
	//postfix decrement
	a = 30L;
	System.out.printf("%d-- = %d\n", a, a--);
	
	System.out.println("\n****** Relational Operators ******");

	//equal to 
	System.out.printf("%d == %d --> %b\n", a, b, a == b);
	
	//not equal to
	System.out.printf("%d != %d --> %b\n", a, b, a != b);

	//greater than
	System.out.printf("%d > %d --> %b\n", a, b, a > b);
	
	//less than
	System.out.printf("%d < %d --> %b\n", a, b, a < b);

	//greatre than or equal to
	System.out.printf("%d >= %d --> %b\n", a, b, a >= b);

	//less than or equal to
	System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
	
	System.out.println("\n****** Bitwise Operators ******");
	
	//bitwise &
	c = a & b;
	System.out.printf("%d & %d = %d\n", a, b, c);
	System.out.println("In binary form:");
	System.out.printf("%s & %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));

	//biwise or
	c = a | b;
	System.out.printf("%d | %d = %d\n", a, b, c);
	System.out.println("In binary form:");
	System.out.printf("%s | %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));

	//bitwise XOR
	c = a ^ b;
	System.out.printf("%d ^ %d = %d\n", a, b, c);
	System.out.println("In binary form:");
	System.out.printf("%s ^ %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));

	//bitwise unary compliment
	c = ~a;
	System.out.printf("~%d = %d\n", a, c);
	System.out.println("In binary form:");
	System.out.printf("~%s = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

	//left shift
	c = a << 1;
	System.out.printf("%d << 1 = %d\n", a, c);
	System.out.println("In binary form:");
	System.out.printf("%s << 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));
	
	//right shift
	c = a >> 1;
	System.out.printf("%d >> 1 = %d\n", a, c);
	System.out.println("In binary form:");
	System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

	//right shift
	a = -9L;
	c = a >> 1;
	System.out.printf("%d >> 1 = %d\n", a, c);
	System.out.println("In binary form:");
	System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

	//zero fill right shift
	a = 9L;
	c = a >>> 1;
	System.out.printf("%d >>> 1 = %d\n", a, c);
	System.out.println("In binary form:");
	System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

	//zero fill right shift
	a = -9L;
	c = a >>> 1;
	System.out.printf("%d >>> 1 = %d\n", a, c);
	System.out.println("In binary form:");
	System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

	
	System.out.println("\n****** Assigment Operators ******");
	a = 4L;
	c = 23L;
	System.out.printf("%d += %d --> %d\n", c, a, c += a);
	System.out.printf("%d -= %d --> %d\n", c, a, c -= a);
	System.out.printf("%d *= %d --> %d\n", c, a, c *= a);
	System.out.printf("%d /= %d --> %d\n", c, a, c /= a);
	// if a = 0; c /= a; --> Arithmetical Exception

	System.out.printf("%d %%= %d --> %d\n", c, a, c %= a);
	// if a = 0; c /= a; --> Arithmetical Exception

	System.out.printf("%d &= %d --> %d\n", c, a, c &= a);
	System.out.printf("%d |= %d --> %d\n", c, a, c |= a);
	System.out.printf("%d ^= %d --> %d\n", c, a, c ^= a);
	System.out.printf("%d >>= %d --> %d\n", c, a, c >>= a);
	System.out.printf("%d <<= %d --> %d\n", c, a, c <<= a);

	System.out.println("\n****** Logical Operations ******");

	//logical AND
	System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

	//bitwise logical AND
	System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));

	//logical OR
	System.out.printf("(%d > %d) || (%d != 0) --> %b\n", a, b, a, (a > b) || (a != 0));

	//bitwise logical OR
	System.out.printf("(%d > %d) | (%d != 0) --> %b\n", a, b, a, (a > b) | (a != 0));

	//logical XOR
	System.out.printf("(%d > %d) ^ (%d != 0) --> %b\n", a, b, a, (a > b) ^ (a != 0));

	//Logical Not
	System.out.printf("!(%d > %d) --> %b\n", a, b, !(a > b));


	System.out.println("\n****** Misc Operators ******");

	System.out.println("\nCondition Operator:");
	System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, 
		(a > b ? a : b));


	System.out.println("\nType Cast Operator:");
	byte bt = 1;
	short sh = -32000;
	char ch = '\u0002';
	int nt = 100_000_000;
	float f = 1.9f;
	double d = 123456789.625;
	boolean bool = true;
	c = bt;
	System.out.printf("long = byte: c = %d --> c = %d\n", bt, c);

	c = sh;
	System.out.printf("long = short: c = %d --> c = %d\n", sh, c);

	c = ch;
	System.out.printf("long = char: c = %c --> c = %d\n", ch, c);

	c = nt;
	System.out.printf("long = int: c =  %d --> c = %d\n", nt, c);

	c = (long) f;
	System.out.printf("long = float: c = (long) %f --> c = %d\n", f, c);

	c = (long) d;
	System.out.printf("long = double: c = (long) %f --> c = %d\n", d, c);

	//c = (long) bool;
	System.out.printf("long = boolean: c = (byte)%b --> Compile Error - \"Boolean cannot be converted to byte\"\n",
		bool);

    }

    public static void testFloat() {
	System.out.println("\n**********Test FLOAT");

	float a = 8.5f, b = 3.2f, c;
	System.out.println("\n****** Arithmetical Operators ******");
	// addition
	c = a + b;
	System.out.printf("%f + %f = %f\n", a, b, c);

	//subtraction
	c = a - b;
	System.out.printf("%f - %f = %f\n", a, b, c);

	//multiplication
	c = a * b;
	System.out.printf("%f * %f = %f\n", a, b, c);

	//division
	c = a / b;
	System.out.printf("%f / %f = %f\n", a, b, c);
	// c = a / 0; --> Arithmetical Exception
	
	//modulus
	c = a % b;
	System.out.printf("%f %% %f = %f\n", a, b, c);
	// c = a % 0; --> Arithmetical Exception

	//unary minus
	c = -a;
	System.out.printf("-%f = %f\n", a, c);

	
	//unary plus
	c = +a;
	System.out.printf("+%f = %f\n", a, c);


	//prefix increment
	a = 25.8f;
	System.out.printf("++%f = %f\n", a, ++a);
	
	//postfix increment
	a = 25.8f;
	System.out.printf("%f++ = %f\n", a, a++);
	
	//prefix decrement
	a = 30.2f;
	System.out.printf("--%f = %f\n", a, --a);
	
	//postfix decrement
	a = 30.2f;
	System.out.printf("%f-- = %f\n", a, a--);
	
	System.out.println("\n****** Relational Operators ******");

	//equal to 
	System.out.printf("%f == %f --> %b\n", a, b, a == b);
	
	//not equal to
	System.out.printf("%f != %f --> %b\n", a, b, a != b);

	//greater than
	System.out.printf("%f > %f --> %b\n", a, b, a > b);
	
	//less than
	System.out.printf("%f < %f --> %b\n", a, b, a < b);

	//greatre than or equal to
	System.out.printf("%f >= %f --> %b\n", a, b, a >= b);

	//less than or equal to
	System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
	
	System.out.println("\n****** Bitwise Operators ******");
	
	//Bitwise operators used only with int, long, short, char, byte

	
	System.out.println("\n****** Assigment Operators ******");
	a = 4.5f;
	c = 23.7f;
	System.out.printf("%f += %f --> %f\n", c, a, c += a);
	System.out.printf("%f -= %f --> %f\n", c, a, c -= a);
	System.out.printf("%f *= %f --> %f\n", c, a, c *= a);
	System.out.printf("%f /= %f --> %f\n", c, a, c /= a);
	// if a = 0; c /= a; --> Arithmetical Exception

	System.out.printf("%f %%= %f --> %f\n", c, a, c %= a);
	// if a = 0; c /= a; --> Arithmetical Exception
	//bitwise assigment operators used only with int, long, short, char, byte


	System.out.println("\n****** Logical Operations ******");

	//logical AND
	System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

	//bitwise logical AND
	System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a, (a > b) & (a > 0));

	//logical OR
	System.out.printf("(%f > %f) || (%f != 0) --> %b\n", a, b, a, (a > b) || (a != 0));

	//bitwise logical OR
	System.out.printf("(%f > %f) | (%f != 0) --> %b\n", a, b, a, (a > b) | (a != 0));

	//logical XOR
	System.out.printf("(%f > %f) ^ (%f != 0) --> %b\n", a, b, a, (a > b) ^ (a != 0));

	//Logical Not
	System.out.printf("!(%f > %f) --> %b\n", a, b, !(a > b));


	System.out.println("\n****** Misc Operators ******");

	System.out.println("\nCondition Operator:");
	System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, 
		(a > b ? a : b));


	System.out.println("\nType Cast Operator:");
	byte bt = 1;
	short sh = -32000;
	char ch = '\u0002';
	int nt = 100_000_000;
	long l = 100000000000000000L; 
	double d = 123456789.625;
	boolean bool = true;
	c = bt;
	System.out.printf("float = byte: c = %d --> c = %f\n", bt, c);

	c = sh;
	System.out.printf("float = short: c = %d --> c = %f\n", sh, c);

	c = ch;
	System.out.printf("float = char: c = %c --> c = %f\n", ch, c);

	c = nt;
	System.out.printf("float = int: c =  %d --> c = %f\n", nt, c);

	c = l ;
	System.out.printf("float = long: c = %d --> c = %f\n", l, c);

	c = (float) d;
	System.out.printf("float = double: c = (float) %f --> c = %f\n", d, c);

	//c = (byte) bool;
	System.out.printf("float = boolean: c = (byte)%b --> Compile Error - \"Boolean cannot be converted to byte\"\n",
		bool);

    }

    public static void testDouble() {
	System.out.println("\n**********TEST DOUBLE**********");

	double a = 8.5, b = 3.2, c;
	System.out.println("\n****** Arithmetical Operators ******");
	// addition
	c = a + b;
	System.out.printf("%f + %f = %f\n", a, b, c);

	//subtraction
	c = a - b;
	System.out.printf("%f - %f = %f\n", a, b, c);

	//multiplication
	c = a * b;
	System.out.printf("%f * %f = %f\n", a, b, c);

	//division
	c = a / b;
	System.out.printf("%f / %f = %f\n", a, b, c);
	// c = a / 0; --> Arithmetical Exception
	
	//modulus
	c = a % b;
	System.out.printf("%f %% %f = %f\n", a, b, c);
	// c = a % 0; --> Arithmetical Exception

	//unary minus
	c = -a;
	System.out.printf("-%f = %f\n", a, c);

	
	//unary plus
	c = +a;
	System.out.printf("+%f = %f\n", a, c);


	//prefix increment
	a = 25.8;
	System.out.printf("++%f = %f\n", a, ++a);
	
	//postfix increment
	a = 25.8;
	System.out.printf("%f++ = %f\n", a, a++);
	
	//prefix decrement
	a = 30.2;
	System.out.printf("--%f = %f\n", a, --a);
	
	//postfix decrement
	a = 30.2;
	System.out.printf("%f-- = %f\n", a, a--);
	
	System.out.println("\n****** Relational Operators ******");

	//equal to 
	System.out.printf("%f == %f --> %b\n", a, b, a == b);
	
	//not equal to
	System.out.printf("%f != %f --> %b\n", a, b, a != b);

	//greater than
	System.out.printf("%f > %f --> %b\n", a, b, a > b);
	
	//less than
	System.out.printf("%f < %f --> %b\n", a, b, a < b);

	//greatre than or equal to
	System.out.printf("%f >= %f --> %b\n", a, b, a >= b);

	//less than or equal to
	System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
	
	System.out.println("\n****** Bitwise Operators ******");
	
	//Bitwise operators used only with int, long, short, char, byte

	
	System.out.println("\n****** Assigment Operators ******");
	a = 4.5;
	c = 23.7;
	System.out.printf("%f += %f --> %f\n", c, a, c += a);
	System.out.printf("%f -= %f --> %f\n", c, a, c -= a);
	System.out.printf("%f *= %f --> %f\n", c, a, c *= a);
	System.out.printf("%f /= %f --> %f\n", c, a, c /= a);
	// if a = 0; c /= a; --> Arithmetical Exception

	System.out.printf("%f %%= %f --> %f\n", c, a, c %= a);
	// if a = 0; c /= a; --> Arithmetical Exception
	//bitwise assigment operators used only with int, long, short, char, byte


	System.out.println("\n****** Logical Operations ******");

	//logical AND
	System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

	//bitwise logical AND
	System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a, (a > b) & (a > 0));

	//logical OR
	System.out.printf("(%f > %f) || (%f != 0) --> %b\n", a, b, a, (a > b) || (a != 0));

	//bitwise logical OR
	System.out.printf("(%f > %f) | (%f != 0) --> %b\n", a, b, a, (a > b) | (a != 0));

	//logical XOR
	System.out.printf("(%f > %f) ^ (%f != 0) --> %b\n", a, b, a, (a > b) ^ (a != 0));

	//Logical Not
	System.out.printf("!(%f > %f) --> %b\n", a, b, !(a > b));


	System.out.println("\n****** Misc Operators ******");

	System.out.println("\nCondition Operator:");
	System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, 
		(a > b ? a : b));


	System.out.println("\nType Cast Operator:");
	byte bt = 1;
	short sh = -32000;
	char ch = '\u0002';
	int nt = 100_000_000;
	long l = 100000000000000000L; 
	float f = 1.9f;
	boolean bool = true;
	c = bt;
	System.out.printf("double = byte: c = %d --> c = %f\n", bt, c);

	c = sh;
	System.out.printf("double = short: c = %d --> c = %f\n", sh, c);

	c = ch;
	System.out.printf("double = char: c = %c --> c = %f\n", ch, c);

	c = nt;
	System.out.printf("double = int: c =  %d --> c = %f\n", nt, c);

	c = l ;
	System.out.printf("double = long: c = %d --> c = %f\n", l, c);

	c = f;
	System.out.printf("double = float: c = %f --> c = %f\n", f, c);

	//c = (double) bool;
	System.out.printf("double = boolean: c = (byte)%b --> Compile Error - \"Boolean cannot be converted to byte\"\n",
		bool);
    }

    public static void testBoolean() {
	System.out.println("\n**********TEST BOOLEAN**********");

	boolean a = true, b = false, c;

	System.out.println("\n***** Arithmetical Operators *****");
	// c = a + b; // addition
	// c = a - b; // subtraction
	// c = a * b; // multiplication
	// c = a / b; // division
	// c = a % b; // modulus
	// c = -a; // unary minus
	// c = +a; // unary plus
	// c = ++a; // prefix increment
	// c = a++; // postfix increment
	// c = --a; // prefix decrement
	// c = a--; // postfix decrement
	
	System.out.println("\n***** Bitwise Operators *****");

	c = a & b; // bitwise AND
	System.out.printf("%b & %b = %b\n", a, b, c);

	c = a | b; // bitwise OR
	System.out.printf("%b | %b = %b\n", a, b, c);

	c = a ^ b; // bitwise XOR
	System.out.printf("%b ^ %b = %b\n", a, b, c);

	// c = ~a; // bitwise unary compliment
	// c = a << 1; // left shift
	// c = a >> 1; //right shift
	// c = a >>> 1; // zero fill right shift

	System.out.println("\n***** Assignment Operators *****");

	System.out.printf("%b |= %b --> c = %b\n", c, a, c |= a);
	System.out.printf("%b &= %b --> c = %b\n", c, a, c &= a);
	System.out.printf("%b ^= %b --> c = %b\n", c, a, c ^= a);

	// c += a;
	// c -= a;
	// c *= a;
	// c /= a;
	// c %= a;
	// c >>= 1;
	// c <<= 1;
	// c >>>= 1;

	System.out.println("\n***** Relational Operators *****");

	// equal to
	System.out.printf("%b == %b --> %b\n", a, b, a == b);

	// not equal to
	System.out.printf("%b != %b --> %b\n", a, b, a != b);

	// c = a > b; // greater than
	// c = a >= b; // greater than or equal to
	// c = a < b; // less than
	// c = a <= b; // less than or equal to

	System.out.println("\n***** Logical Operations *****");

	c = a && b; // logical AND
	System.out.printf("%b && %b = %b\n", a, b, c);

	c = a || b; // logical OR
	System.out.printf("%b || %b = %b\n", a, b, c);

	c = a ^ b; // logical XOR
	System.out.printf("%b ^ %b = %b\n", a, b, c);

	// logical NOT
	System.out.printf("!%b --> %b\n", a, !a);

	System.out.println("\n***** Misc Operators *****");

	System.out.println("\nCondition Operator:");
	System.out.printf(" %b ? %b : %b --> %b\n", c, a, b, (c ? a : b));
	System.out.println("\nType Cast Operator:");

	//    byte bt = 1;
	//    short sh = -32000;
	//    char ch = '\u0002';
	//    long l = 100000000000000000L;
	//    float f = 1.9f;
	//    double d = 123456789.625;
	boolean bool = true;
	//c = (boolean) bt;
	//c = (boolean) sh;
	//c = (boolean) ch;
	//c = (boolean) l;
	//c = (boolean) f;
	//c = (boolean) d;
	c = bool;
    }

    public static void testString() {

	System.out.println("\n**********TEST STRING**********");
        String a = "Hello", b = "World", c;

        System.out.println("\n****** Arithmetical Operators *****");

        //addition
        c = b + a;
        System.out.printf("%s + %s = %s\n", a, b, c);

	System.out.println("\n***** Bitwise Operators *****");
	
	System.out.println("\n***** Assignment Operators *****");

	System.out.printf("%s += %s --> a = %s\n", a, b, a += b);

	System.out.println("\n***** Relational Operators *****");



	System.out.println("\n***** Logical Operations *****");

	System.out.println("\n****** Instanceof operator ******");
	String name = "Sergey";
	boolean result = name instanceof String;
	System.out.printf("%s instaceof String --> %b\n", name, result);


    }
    
    public static void testStudent(Student student){
	Student std= new Student("Sergey", 8);
	System.out.println("\n****** Relational Operators ******");

	//equal to 
	System.out.printf("%s == %s --> %b\n", student.toString(), std.toString(), student == std );
	
	//not equal to
	System.out.printf("%s != %s --> %b\n", student.toString(), std.toString(), student != std);
		
	System.out.println("\n****** Assignment Operators ******");
	
	//assignment
	System.out.println("studen before assignment - " + student);
	student = std;
	System.out.println("student after assignment - " + student);

	System.out.println("\n***** Logical Operators *****");

	System.out.println("\n****** Instanceof operator ******");
	boolean result = student instanceof Object;
	System.out.printf("%s instaceof Object --> %b\n", student.toString(), result);

    }

}
