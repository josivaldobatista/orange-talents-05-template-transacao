package br.com.zup.transacao.transacoesdecartao

import br.com.zup.transacao.transacoesdecartao.cartao.Cartao
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface TransacaoRepository: CrudRepository<Transacao, Long> {
    fun findByCartaoId(id: Long): List<Transacao>
}
