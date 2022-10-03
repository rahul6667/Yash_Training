package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class Info {

	public Info(int rollno, String sname, String classname, double totalmarks) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.classname = classname;
		this.totalmarks = totalmarks;
		// this.subject= subject;

	}

	int rollno;

	public Info(Subject subject) {
		super();
		this.subject = subject;
	}

	public Subject getSubject() {
		return subject;
	}

	@Override
	public String toString() {
		return "Info [rollno=" + rollno + ", sname=" + sname + ", classname=" + classname + ", totalmarks=" + totalmarks
				+ ", subject=" + subject + "]";
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	String sname, classname;
	double totalmarks;
	Subject subject;

	void display() {
		System.out.println(rollno + " " + sname + " " + classname + " " + totalmarks);
		// System.out.println(subject.biology+" "+subject.chemistry+"
		// "+subject.english+" "+subject.hindi+" "+subject.maths);
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public double getTotalmarks() {
		return totalmarks;
	}

	public void setTotalmarks(double totalmarks) {
		this.totalmarks = totalmarks;
	}

}

class Subject {
	int maths, biology, chemistry, hindi, english;

	public int getMaths() {
		return maths;
	}

	@Override
	public String toString() {
		return "Subject [getMaths()=" + getMaths() + ", getBiology()=" + getBiology() + ", getChemistry()="
				+ getChemistry() + ", getHindi()=" + getHindi() + ", getEnglish()=" + getEnglish() + "]";
	}

	public Subject(int maths, int biology, int chemistry, int hindi, int english) {
		// super();
		this.maths = maths;
		this.biology = biology;
		this.chemistry = chemistry;
		this.hindi = hindi;
		this.english = english;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getBiology() {
		return biology;
	}

	public void setBiology(int biology) {
		this.biology = biology;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getHindi() {
		return hindi;
	}

	public void setHindi(int hindi) {
		this.hindi = hindi;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}
}

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List studentlistfirst = new ArrayList();
		TreeMap tm = new TreeMap();

		System.out.println("put the no of student in class room");
		Scanner sc = new Scanner(System.in);
		int total_student = sc.nextInt();

		for (int i = 0; i < total_student; i++) {
			System.out.println("put the Name of Student");
			String namestudend = sc.next();

			System.out.println("Roll No. Of Student");
			int rollno = sc.nextInt();

			System.out.println("Class Name Of Student");
			String classname = sc.next();

			System.out.println("No. of Biology");
			int Bio = sc.nextInt();

			System.out.println("No. of Chemistry");
			int che = sc.nextInt();

			System.out.println("No. of English");
			int eng = sc.nextInt();

			System.out.println("No. of Hindi");
			int hind = sc.nextInt();

			System.out.println("No. of Math");
			int math = sc.nextInt();

			Subject forFirstStudent = new Subject(math, Bio, che, hind, eng);
			double totalmarks = forFirstStudent.getBiology() + forFirstStudent.getChemistry()
					+ forFirstStudent.getEnglish() + forFirstStudent.getHindi() + forFirstStudent.getMaths();
			Info s1 = new Info(rollno, namestudend, classname, totalmarks);

			tm.put((totalmarks / 5), s1.getSname());
		}

		System.out.println(tm);
		System.out.println("name of students who secure first, second and third position. ");
		Set<Double> keySet = tm.descendingKeySet();
		int count = 0;
		for (Double key : keySet) {
			// Print key:value of the TreeMap
			if (count == 3) {
				break;
			}
			System.out.println(key + " = " + tm.get(key));

			count++;
		}

		System.out.println("name of students who secure below 50 % ");

		Set<Double> below50 = tm.descendingKeySet();

		for (Double key : below50) {

			if (key < 50) {
				System.out.println(key + " = " + tm.get(key));

			}
		}

		System.out.println("name of students who secure below 35 % ");

		Set<Double> below35 = tm.descendingKeySet();

		for (Double key : below35) {

			if (key < 35) {
				System.out.println(key + " = " + tm.get(key));

			}
		}

	}

}
