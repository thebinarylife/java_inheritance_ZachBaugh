package co.binarylife.inheritance.person;

public class StudentTmpl extends PersonBaseTmpl implements Student {
	
	private String takenCourseTitle;
	
	public StudentTmpl(String _name, String _takenCourseTitle) {
		super(_name);
		
		this.takenCourseTitle = _takenCourseTitle;
	}
	
	@Override
	public String studiesFor() {
		return takenCourseTitle;
	}
	
	@Override
	public String getDetails() {
		return "student";
	}

}
