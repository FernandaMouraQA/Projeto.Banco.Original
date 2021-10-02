package metodos;

import org.openqa.selenium.By;

public class Elementos {
	
	
	private By abrirMinhaConta = By.xpath("//*[@id=\"section-2\"]/div[2]/div/div/a");
    private By nome = By.id("nome");
    private By celular = By.id("telefone");
    private By email = By.id("email");
    private By cpf= By.id("cpf");
    private By btnEnviar = By.id("btnEnviar");
	
    
    public By getAbrirMinhaConta() {
		return abrirMinhaConta;
	}
	public By getNome() {
		return nome;
	}
	public By getCelular() {
		return celular;
	}
	public By getEmail() {
		return email;
	}
	public By getCpf() {
		return cpf;
	}
	public By getBtnEnviar() {
		return btnEnviar;
	}
	
	

}
