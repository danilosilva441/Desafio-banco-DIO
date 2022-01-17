
public class Cliente {

	private String fastName;
	private String lastName;
	
	public Cliente() {
	}	
	
	public Cliente(String fastName, String lastName) {
		this.fastName = fastName;
		this.lastName = lastName;
	}

	public String getFastNome() {
		return fastName;
	}
	public void setFastNome(String fastName) {
		this.fastName = fastName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
