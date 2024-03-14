package br.com.henriquerodrigues.main.ioc_di;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MeuComponent {

    public String chamarMeuComponent() {
        return "Chamando o meu component";
    }
}
