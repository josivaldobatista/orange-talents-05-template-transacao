package br.com.zup.transacao.transacoesdecartao

import br.com.zup.transacao.transacoesdecartao.cartao.Cartao
import br.com.zup.transacao.transacoesdecartao.estabelecimento.Estabelecimento
import java.math.BigDecimal
import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Transacao(
  uuid: String,
  valor: BigDecimal,
  criadoEm: LocalDateTime,
  toModel: Estabelecimento,
  toModel1: Cartao,
) {

  @Id
  @GeneratedValue
  val id: Long? = null

  @ManyToOne(cascade = [CascadeType.ALL])
  lateinit var estabelecimento: Estabelecimento

  @ManyToOne(cascade = [CascadeType.ALL])
  lateinit var cartao: Cartao
}
