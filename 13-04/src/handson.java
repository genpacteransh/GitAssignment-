import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Address {
	
	public Address(String zipcode) {
		super();
		this.zipcode = zipcode;
	}
	
	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String zipcode;
}


class MobileNumber{
	public String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public MobileNumber(String number) {
		super();
		this.number = number;
	}
	
}


class TempStudent{
	public String name;
	 public int age;
	 public  Address address;
	 public List<MobileNumber> mobileNumbers;
	 
	 public TempStudent(String name, int age, Address address, List<MobileNumber> mobileNumbers) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.mobileNumbers = mobileNumbers;
	}
}

class Student{
	private String name;
	 private int age;
	 private  Address address;
	 private List<MobileNumber> mobileNumbers;
	public Student(String name, int age, Address address, List<MobileNumber> mobileNumbers) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.mobileNumbers = mobileNumbers;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<MobileNumber> getMobileNumbers() {
		return mobileNumbers;
	}
	public void setMobileNumbers(List<MobileNumber> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}
	 
}

public class handson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileNumber m1=new MobileNumber("3333");
		MobileNumber m2=new MobileNumber("8313");
		MobileNumber m3=new MobileNumber("8316");
		List<MobileNumber> mst1=new ArrayList<MobileNumber>();
		mst1.add(m1);
		mst1.add(m2);
		mst1.add(m3);
		MobileNumber m4=new MobileNumber("1233");
		MobileNumber m5=new MobileNumber("1234");
		MobileNumber m6=new MobileNumber("8316");
		List<MobileNumber> mst2=new ArrayList<MobileNumber>();
		mst2.add(m4);
		mst2.add(m5);
		mst2.add(m6);
		MobileNumber m7=new MobileNumber("1234");
		MobileNumber m8=new MobileNumber("8318");
		MobileNumber m9=new MobileNumber("8316");
		List<MobileNumber> mst3=new ArrayList<MobileNumber>();
		mst3.add(m7);
		mst3.add(m8);
		mst3.add(m9);
		Student st1=new Student("JAYESH", 23, new Address("1235"),mst1);
		Student st2=new Student("SHUBHAM", 22, new Address("12344"),mst2);
		Student st3=new Student("PULKIT", 22, new Address("1235"),mst3);
		
		List<Student> al= new ArrayList<Student>();
		al.add(st1);
		al.add(st2);
		al.add(st3);
		
		System.out.println("ANSWER 1 for student with name jayesh");
		
		al.stream().filter(x->x.getName()=="JAYESH").forEach(x->System.out.println("NAME "+x.getName()+"AGE :"+x.getAge()+" "));
		System.out.println("Answer 2 for address matching with 1235");
		
		//al.stream().filter(x->x.getAddress().zipcode).forEach(x->System.out.println("NAME "+x.getName()+"AGE :"+x.getAge()+" "));
		al.stream().filter( x->x.getAddress().getZipcode()=="1235").forEach(x->System.out.println("NAME "+x.getName()+"AGE :"+x.getAge()+" "));
		
		TempStudent tst1=new TempStudent("ANSH", 23, new Address("1234"), Arrays.asList(new MobileNumber("123"),new MobileNumber("1234"),new MobileNumber("1234")));
		TempStudent tst2=new TempStudent("SHUBHAM", 22, new Address("1223"), Arrays.asList(new MobileNumber("123"),new MobileNumber("1234"),new MobileNumber("1234")));
		TempStudent tst3=new TempStudent("ANSH GUPTA", 23, new Address("123324"), Arrays.asList(new MobileNumber("123"),new MobileNumber("1234"),new MobileNumber("1234")));
		
		List<TempStudent> tStudents=new ArrayList<TempStudent>();
		tStudents.add(tst1);
		tStudents.add(tst2);
		tStudents.add(tst3);
		
		List<Student> lstudent=tStudents.stream().map(x->new Student(x.name, x.age, x.address, x.mobileNumbers)).collect(Collectors.toList());
		System.out.println("CONVERTION FROM LIST OF TEMP STU TO STUDENT" + lstudent);
		
		
		List<String> nameStrings=al.stream().map(x->x.getName()).collect(Collectors.toList());
		System.out.println("FROM LIST OF STUDENT TO LIST OF STRING" + nameStrings);
		
		
		String nameString=al.stream().map(x->x.getName()).collect(Collectors.joining(" "));
		System.out.println("NAMES OF ALL STUDENTS CONCATINATED" + nameString);
		
		
		System.out.println("");
		List<String> namecase=al.stream().map(x->x.getName().toLowerCase()).collect(Collectors.toList());
		for(String a:namecase) {
			System.out.println(a);
		}
	}
}


