package client;

import domain.response.PessoaResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@FeignClient(url = "http://ec2-18-231-70-20.sa-east-1.compute.amazonaws.com:8080/v1/pessoa", name = "PessoaClient")
@FeignClient(url = "http://localhost:8081/v1/pessoa", name = "PessoaClient")
public interface PessoaClient {

    @RequestMapping(value = "/buscaPessoa/{id}", method = RequestMethod.GET)
    PessoaResponse getPessoa(@PathVariable(value = "id") Long id);
}
