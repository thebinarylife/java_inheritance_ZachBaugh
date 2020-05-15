package co.binarylife.inheritance.person;

public class TeacherTmpl extends PersonBaseTmpl implements Teacher {
	private String thoughtCourseTitle;
	
	public TeacherTmpl(String _name, String _thoughtCourseTitle) {
		super(_name);
		
		this.thoughtCourseTitle = _thoughtCourseTitle;
	}
	
	@Override
	public String teachesFor() {
		return thoughtCourseTitle;
	}
	
	@Override
	public String getDetails() {
		return "teacher";
	}

}
