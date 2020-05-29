package hibernate;

public class Main {
	
	public static void main(String[] args) {
		
		Cadastro pessoa1 = new Cadastro();
		pessoa1.setNome("Enzo Kozoroski Giovanini");
		pessoa1.setData_nascimento("14/08/2002");
		
		Cadastro pessoa2 = new Cadastro();
		pessoa2.setNome("Michelle Calonga Dias Alem");
		pessoa2.setData_nascimento("08/12/2000");
		
		Cadastro pessoa3 = new Cadastro();
		pessoa3.setNome("Plinio Joaquim Calonga Dias Alem Kozoroski Giovanini");
		pessoa3.setData_nascimento("14/08/2002");
		
		CadastroController cc = new CadastroController();
		//cc.save(pessoa1);
		//cc.save(pessoa2);
		//cc.save(pessoa3);
	}
	
}
