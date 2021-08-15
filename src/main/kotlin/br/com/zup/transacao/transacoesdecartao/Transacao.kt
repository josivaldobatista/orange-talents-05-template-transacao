package br.com.zup.transacao.transacoesdecartao

import br.com.zup.transacao.transacoesdecartao.cartao.Cartao
import br.com.zup.transacao.transacoesdecartao.estabelecimento.Estabelecimento
import java.math.BigDecimal
import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Transacao(
  val uuid: String = "",
  val valor: BigDecimal = 0.0.toBigDecimal(),
  val criadoEm: LocalDateTime = LocalDateTime.now(),
  @ManyToOne(cascade = [CascadeType.ALL])
  val estabelecimento: Estabelecimento? = null,
  @ManyToOne(cascade = [CascadeType.ALL])
  val cartao: Cartao? = null
) {

  @Id
  @GeneratedValue
  val id: Long? = null

  constructor(): this("", 0.0.toBigDecimal(), LocalDateTime.now(), null, null)

}
