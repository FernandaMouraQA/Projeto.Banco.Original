package projeto.original.selenium;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Browser;

public class Steps {
	
	Browser browser = new Browser();
	

	@Given("que acesso o site {string}")
	public void que_acesso_o_site(String site) {
	    browser.abrirNavegador(site);
	    	
	}

	
	@Given("acessar o formulario de abertura de conta")
	public void acessar_o_formulario_de_abertura_de_conta() {
	    
	 
	}

	@Given("preencher o campo nome {string}")
	public void preencher_o_campo_nome(String string) {
	  

	}

	@Given("preencher o campo celular {string}")
	public void preencher_o_campo_celular(String string) {
	   
	}

	@Given("preencher o campo email {string}")
	public void preencher_o_campo_email(String string) {
	   
	  
	}

	@Given("preencher o campo cpf {string}")
	public void preencher_o_campo_cpf(String string) {
	   
		
	}

	@When("clicar no bot?o avancar")
	public void clicar_no_bot_o_avancar() {
	   
	   
	}

	@Then("formulario enviado com sucesso")
	public void formulario_enviado_com_sucesso() {
	    
	   
	}
	
	@When("clicar no botao avancar")
	public void clicar_no_botao_avancar() {
	    
	}


}
