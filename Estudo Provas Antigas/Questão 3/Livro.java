
public class Livro {
	private String id;
	
	public Livro(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	//3b
	@Override
	public boolean equals(Object o) {
		if(o instanceof Livro) {
			return this.id.equals(((Livro)o).getId());
		} else {
			return false;
		}
	}
}
