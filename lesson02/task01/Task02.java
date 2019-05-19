public class Task02{
	public static void main (String[] args){
		DataTypesTester.testByte();
		DataTypesTester.testShort();
		DataTypesTester.testInt();
		DataTypesTester.testChar();
		DataTypesTester.testLong();
		DataTypesTester.testFloat();
		DataTypesTester.testDouble();
		DataTypesTester.testBoolean();
		DataTypesTester.testString();
		Student student = new Student("Vladimir",9);
        	DataTypesTester.testStudent(student);
	}
}