package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cadastre {

    private WebDriver navegador;

    public Cadastre(WebDriver navegador) {
        this.navegador = navegador;
    }

    public Cadastre() {

    }

    public PreencheFormulario FormularioPreenchido () {

        navegador.findElement(By.xpath("//*[@id=\"topo\"]/div/div[1]/div[4]/ul/li[5]/a/cufon/canvas")).click();



        return new PreencheFormulario(navegador);
    }
}
