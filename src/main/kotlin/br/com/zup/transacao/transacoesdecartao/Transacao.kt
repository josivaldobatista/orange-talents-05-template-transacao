package br.com.zup.transacao.transacoesdecartao

import br.com.zup.transacao.transacoesdecartao.cartao.Cartao
import br.com.zup.transacao.transacoesdecartao.estabelecimento.Estabelecimento
import java.math.BigDecimal
import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Transacao(
  val uuid: String,
  val valor: BigDecimal,
  val criadoEm: LocalDateTime,
  @ManyToOne(cascade = [CascadeType.ALL])
  val estabelecimento: Estabelecimento,
  @ManyToOne(cascade = [CascadeType.ALL])
  val cartao: Cartao
) {

  @Id
  @GeneratedValue
  val id: Long? = null
}
