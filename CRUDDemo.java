import java.util.*;

class Student {
	private int stdroll;
	private String stdname;
	private int stdmarks;
	
	Student(int rollno,String name,int marks ){
		this.stdroll=stdroll;
		this.stdname=stdname;
		this.stdmarks=stdmarks;
	}
	public int getstdroll() {
		return stdroll;
	}
	public int getstdmarks() {
		return stdmarks;
	}
	public String getstdname() {
		return stdname;
	}
	
	public String toString(){
		return stdroll+" "+stdname+" "+stdmarks;
	}

}
class CRUDDemo{
	public static void main(String[] args) {
		List<Student> c=new ArrayList<Student>();
		Scanner s= new Scanner(System.in);
		Scanner s1= new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.INSERT");
			System.out.println("2.DISPLAY");
			System.out.println("3.SEARCH");
			System.out.println("4.DELETE");
			System.out.println("5.UPDATE");
			System.out.println("Enter Your Choice : ");
			ch=s.nextInt();
			
			switch(ch) {
			case 1:
				System.out.print("Enter stdroll : ");
				int studentroll=s.nextInt();
				System.out.print("Enter stdname : ");
				String studentname=s1.nextLine();
				System.out.print("Enter stdmarks : ");
				int studentmarks=s.nextInt();
				c.add(new Student(studentroll,studentname,studentmarks));
			break;
			case 2:
				System.out.println("-----------------");
				Iterator<Student> i=c.iterator();
				while(i.hasNext()) {
					Student S=i.next();
					System.out.println(S);
				}
				System.out.println("-----------------");
			break;
			case 3:
				boolean found=false;
				System.out.println("Enter studentroll to serch : ");
				int stdntroll=s.nextInt();
				System.out.println("-----------------");
				 i=c.iterator();
				while(i.hasNext()) {
					Student S=i.next();
					if(S.getstdroll()==stdntroll) {
					System.out.println(S);
					found=true;
					}
				}
				
				if (!found) {
					System.out.println("Record not found");
				}
				System.out.println("-----------------");
			break;
			case 4:
				 found=false;
				System.out.println("Enter studentroll to Delete : ");
				 stdntroll=s.nextInt();
				System.out.println("-----------------");
				 i=c.iterator();
				while(i.hasNext()) {
					Student S=i.next();
					if(S.getstdroll()==stdntroll) {
					i.remove();
					found=true;
					}
				}
				
				if (!found) {
					System.out.println("Record not found");
				}else {
					System.out.println("Record is Deleted Successfully...!");
				}
				System.out.println("-----------------");
			break;
			case 5:
				 found=false;
				System.out.println("Enter studentroll to Update : ");
				 stdntroll=s.nextInt();
				
				 ListIterator<Student>li= c.listIterator();
				while(li.hasNext()) {
					Student S=li.next();
					if(S.getstdroll()==stdntroll) {
					System.out.print("Enter new Name : ");
					studentname=s1.nextLine();
					System.out.print("Enter new Marks : ");
					studentmarks=s.nextInt();
					li.set(new Student(stdntroll,studentname,studentmarks));
					found=true;
					}
				}
				
				if (!found) {
					System.out.println("Record not found");
				}else {
					System.out.println("Record is Updated Successfully...!");
				}
			
			break;	
			}
		}while(ch!=0);
	}
}