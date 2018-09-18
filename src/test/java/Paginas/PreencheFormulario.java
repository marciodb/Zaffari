
package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PreencheFormulario extends pages.BasePage {

    public PreencheFormulario(WebDriver navegador) {
        super(navegador);
    }



    public PreencheFormulario digitarNome(String Nome) {
        navegador.findElement(By.id("nome")).sendKeys(Nome);


        return this;
    }

    public PreencheFormulario digitarEmail(String Email) {
        navegador.findElement(By.id("email")).sendKeys(Email);

        return this;
    }
    public PreencheFormulario digitarAniversario(String Aniversario) {
        navegador.findElement(By.id("aniversario")).sendKeys(Aniversario);

        return this;

    }

    public PreencheFormulario digitarCPF(String CPF) {
        navegador.findElement(By.id("cpfCadastro")).sendKeys(CPF);

        return this;

    }













    }




























/*package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PreencheFormulario {
    private WebDriver navegador;

    public PreencheFormulario(WebDriver navegador) {
        this.navegador = navegador;
    }

    public ConfirmaCadastro FimCadastro(){

       navegador.findElement(By.id("nome")).sendKeys("Nome");

        navegador.findElement(By.id("email")).sendKeys("Email");
        navegador.findElement(By.id("aniversario")).sendKeys("Aniversario");
        navegador.findElement(By.id("cpfCadastro")).sendKeys("CPF");
        //navegador.findElement(By.cssSelector("div.container div.coluna-esq-2 div:nth-child(3) form:nth-child(1) div.cadastre-se-col:nth-child(2) div.cadastre-se-form > input.submit-2:nth-child(11)")).click();





    return new ConfirmaCadastro(navegador);
    }










}*/
