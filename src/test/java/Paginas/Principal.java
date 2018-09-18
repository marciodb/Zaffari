package Paginas;

import AcessaSite.Web;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "CadastroDeUmUsuario.csv")

public class Principal {

    private WebDriver navegador;

    @Before
    public void AbrirNavegador() {
        navegador = Web.createChrome();
    }

    @Test
    public void Principal(@Param(name="Nome")String Nome,
                          @Param(name="Email")String Email,
                          @Param(name="Aniversario") String Aniversario,
                          @Param(name="CPF")String CPF
    ) {




        new Cadastre(navegador)
                .FormularioPreenchido()
                .digitarNome(Nome)
                .digitarEmail(Email)
                .digitarAniversario(Aniversario)
                .digitarCPF(CPF);


            navegador.findElement(By.cssSelector("div.container div.coluna-esq-2 div:nth-child(3) form:nth-child(1) div.cadastre-se-col:nth-child(2) div.cadastre-se-form > input.submit-2:nth-child(11)")).click();







    }

}