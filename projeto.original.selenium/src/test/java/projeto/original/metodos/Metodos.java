package projeto.original.metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import metodos.Browser;

public class Metodos extends Browser {

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("----- error ao clicar -----" + e.getMessage());

		}

	}

	public void digitar(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("---- error ao digitar ----" + e.getMessage());
		}

	}
	public void validarTexto(String url) {
		try {
			String urlCapturada = driver.getCurrentUrl();
			assertEquals (url,urlCapturada);
		} catch (Exception e) {
			System.err.println("----- error ao validar Url -----" + e.getMessage());
		}
		
	}

	public void fechar() {
		driver.quit();
		System.out.println("-------- Teste Finalizado com Sucesso -------");
		

	}
}
