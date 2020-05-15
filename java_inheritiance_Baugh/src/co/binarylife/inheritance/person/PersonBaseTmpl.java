package co.binarylife.inheritance.person;

public abstract class PersonBaseTmpl implements Person {
	
	private String name;
	
	public PersonBaseTmpl(String _name) {
		this.name = _name;
	}
	@Override
	public String getName() {
		return name;
	}

}
