package ro.sapientia.test1.unittest.factory;

public class Nyomtato {
	
	@Service
	final FNyomtato fnyomtato;
	
	public Nyomtato() {
		fnyomtato = (FNyomtato)Factory.create(FNyomtato.class);
	}

	public void nyomtat(Document doc) {
		String head = doc.getHeader();
		fnyomtato.print(head);	
	}

}
