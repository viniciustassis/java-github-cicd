package br.com.vta.javaGithubCicd;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class OlaController {

    @GetMapping("/")
    public String dizerOla() {
        return "Olá, bem-vindo(a)";
    }
}
