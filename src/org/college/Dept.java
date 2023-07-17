package org.college;

public class Dept extends Hostel {
	
	public void deptname()
	{
		System.out.println("Department of physics");
	}
	public static void main(String[]args)
	{
		Dept d=new Dept();
		d.collegecode();
		d.collegename();
		d.collegerank();
		d.studentid();
		d.studentname();
		d.Studentdept();
		d.deptname();
		
	}

}
