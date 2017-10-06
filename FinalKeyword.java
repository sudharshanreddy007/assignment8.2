package finalkeyword;

public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();//creating an object 
		Student1 student1=new Student1();
		
		student.display();//displaying the student value
		student1.display();
	}

}
//if I have taken Student class as final and that class cannot be extended
//another subclass because we declared it has final.
final class Student{//here the final keyword restrict to use other class. it means class can't 
//be extended. It can't take final class into subclass
	final int rollno=36745;
	//here we are taking rollnum as 36745 and we are taking final 
	//even I tried to have a value of the rollnum outside the final we 
	//can't change the value
	public final void display()
	{//we are using the display as final and the final variables will not change
	//and will have blank variables
		System.out.println("rollno of student:"+rollno);
	}
}
class Student1 extends Student
//here we are extending the final class we can assign them using constructor
{
	public void display()//displaying the values
	{
		System.out.println("print the rollno");
			
				

	}
}
