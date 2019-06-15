package pos_java_hibernate.pos_java_hibernate;

import org.junit.Test;

import dao.DaoGeneric;
import model.UsuarioPessoa;

public class HibernateTeste {
	
	@Test
	public void TesteHibernate() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		UsuarioPessoa pessoa = new UsuarioPessoa();
		pessoa.setNome("Lane Lima");
		pessoa.setEmail("lane.lima@hotmail.com");
		pessoa.setSetor("Financeiro");
		pessoa.setFuncao("Analista Financeiro");
		
		daoGeneric.salvar(pessoa);
	}
	
	@Test
	public void testeBuscar() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		UsuarioPessoa pessoa = new UsuarioPessoa();
		pessoa.setId(1L);
		pessoa = daoGeneric.pesquisar(pessoa);
		System.out.println(pessoa);
	}
}
