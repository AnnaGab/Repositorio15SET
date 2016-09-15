package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC01CadastrarEmpresa {
	static Empresa empresa;
	static EmpresaDAO empresaDAO;
	
	//ESTABELECE AS PRÉ-CONDIÇÕES DE TESTES - BeforeClass
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresaDAO = new EmpresaDAO();
		empresa = new Empresa();
		empresa.setNomeDaEmpresa("empresa x");
		empresa.setCNPJ("89424232000180");
		empresa.setNomeFantasia("empresa x");
		empresa.setEndereco("rua taquari");
		empresa.setTelefone("2222");
	}


	// O que acontece depois do teste
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	
	}
    
	//projeta o teste
	@Test
	public void CTCadastrarComSucesso() {
		assertEquals(1, empresaDAO.adiciona(empresa));
	}

}
