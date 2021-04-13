package observer;

public class Student implements Observer {

	private String name;
	private Subject classroom;

	public Student(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		
		if(this.classroom == null) {
			System.out.println(this.getName() + "has not joined any classrooms yet!");
			return;
		}
		
		String lastClassroom = this.classroom.getUpdate();
		System.out.println("Hey, "+ this.getName() + ", classroom '" + lastClassroom +"' just got updated!");
	}

	@Override
	public void setClassroom(Subject classroom) {
		this.classroom = classroom;
	}

	public String getName() {
		return name;
	}

}
