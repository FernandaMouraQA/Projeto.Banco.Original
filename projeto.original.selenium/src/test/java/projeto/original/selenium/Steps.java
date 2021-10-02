package projeto.original.selenium;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Browser;
import metodos.Elementos;
import projeto.original.metodos.Metodos;

public class Steps {
	
	Browser browser = new Browser();
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	

	@Given("que acesso o site {string}")
	public void que_acesso_o_site(String site) {
	    browser.abrirNavegador(site);
	    	
	}

	
	@Given("acessar o formulario de abertura de conta")
	public void acessar_o_formulario_de_abertura_de_conta() {
	    metodos.clicar(el.getAbrirMinhaConta());
	 
	}

	@Given("preencher o campo nome {string}")
	public void preencher_o_campo_nome(String texto) {
	  metodos.digitar(el.getNome(),texto);

	}

	@Given("preencher o campo celular {string}")
	public void preencher_o_campo_celular(String celular) {
	   metodos.digitar(el.getCelular(), celular);
		
	}

	@Given("preencher o campo email {string}")
	public void preencher_o_campo_email(String email) {
		metodos.digitar(el.getEmail(), email);
	  
	}

	@Given("preencher o campo cpf {string}")
	public void preencher_o_campo_cpf(String cpf) {
		metodos.digitar(el.getCpf(), cpf);
		
	}

	@When("clicar no bot?o avancar")
	public void clicar_no_bot_o_avancar() {
		metodos.clicar(el.getBtnEnviar());
	   
	}

	@Then("formulario enviado com sucesso")
	public void formulario_enviado_com_sucesso() {
		String url = "https://www.original.com.br/mkt/abra-sua-conta-pf/sucesso";
	    metodos.validarTexto(url);
	   
	}
	
	@When("clicar no botao avancar")
	public void clicar_no_botao_avancar() {
	    metodos.fechar();
	}


}
