package br.com.zup.transacao.transacoesdecartao.estabelecimento

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface EstabelecimentoRepository: CrudRepository<Estabelecimento, Long> {
  fun findByNome(nome: String): Optional<Estabelecimento>
}
