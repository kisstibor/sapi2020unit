package ro.sapientia.test1.unittest.factory;

import org.junit.Test;
import org.mockito.Mockito;

public class NyomtatoTeszt {

	@Test
	public void tesztNyomtatas() {
		final FNyomtato fnyomtato = Mockito.mock(FNyomtato.class);
		Mockito.spy(fnyomtato);
		Factory.addMap(FNyomtato.class, ()->fnyomtato);
		Nyomtato nyomtato = new Nyomtato();
		Document doc = Mockito.mock(Document.class);
		Mockito.when(doc.getHeader()).thenReturn("Teszt");
		nyomtato.nyomtat(doc);
		Mockito.verify(fnyomtato).print(Mockito.anyString());
	}
}
