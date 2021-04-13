package observer;

public class ClassroomMain {

	public static void main(String[] args) {
		
		Classroom springTrimester  = new Classroom();
		
		Observer stu1 = new Student("Иван Илиев");
		Observer stu2 = new Student("Доброслава Петкова");
		Observer stu3 = new Student("Петър Жечев");
		
		springTrimester.list(stu1);
		springTrimester.list(stu2);
		springTrimester.list(stu3);
		
		springTrimester.setClassroom("Internet technologies");
		System.out.println();
		springTrimester.setClassroom("Software and architecture design");

	}

}
