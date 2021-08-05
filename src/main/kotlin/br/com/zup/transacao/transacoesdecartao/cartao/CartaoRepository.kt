package br.com.zup.transacao.transacoesdecartao.cartao

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface CartaoRepository: CrudRepository<Cartao, Long> {
  fun findByUuid(uuid: String): Optional<Cartao>
}
