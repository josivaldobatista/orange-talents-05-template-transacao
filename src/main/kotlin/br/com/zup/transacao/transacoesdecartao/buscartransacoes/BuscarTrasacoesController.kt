package br.com.zup.transacao.transacoesdecartao.buscartransacoes

import br.com.zup.transacao.transacoesdecartao.Transacao
import br.com.zup.transacao.transacoesdecartao.TransacaoRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/bucar-transacoes")
class BuscarTrasacoesController(val repository: TransacaoRepository) {

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable("id") id: Long): ResponseEntity<List<Transacao>> {
        val possivelTransacao: List<Transacao> = repository.findByCartaoId(id)

        if(possivelTransacao.isEmpty()) {
            println("Não existe transação para esse ID")
        }


        return ResponseEntity.ok(possivelTransacao)
    }
}