package observer;

import java.util.ArrayList;
import java.util.List;

public class Classroom implements Subject {

	private List<Observer> students;
	private String classroom;
	
	public Classroom() {
		this.students = new ArrayList<>();
	}

	@Override
	public void list(Observer student) {
		students.add(student);
		student.setClassroom(this);
	}

	@Override
	public void unlist(Observer student) {
		students.remove(student);
	}

	@Override
	public void notifyObservers() {
		for (Observer student : this.students) {
			student.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.classroom;
	}

	public void setClassroom(String newClassroom) {
		this.classroom = newClassroom;
		this.notifyObservers();
	}
}
