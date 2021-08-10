package br.com.zup.transacao.transacoesdecartao

import br.com.zup.transacao.transacoesdecartao.cartao.CartaoDTO
import br.com.zup.transacao.transacoesdecartao.cartao.CartaoRepository
import br.com.zup.transacao.transacoesdecartao.estabelecimento.EstabelecimentoDTO
import br.com.zup.transacao.transacoesdecartao.estabelecimento.EstabelecimentoRepository
import java.math.BigDecimal
import java.time.LocalDateTime

data class TransacaoDTO(
  val id: String,
  val valor: BigDecimal,
  val efetivadaEm: LocalDateTime,
  val estabelecimento: EstabelecimentoDTO,
  val cartao: CartaoDTO
) {
  fun toModel(
    estabelecimentoRepository: EstabelecimentoRepository,
    cartaoRepository: CartaoRepository
  ): Transacao {
    return Transacao(
      id,
      valor,
      efetivadaEm,
      estabelecimento.toModel(estabelecimentoRepository),
      cartao.toModel(cartaoRepository)
      )
  }
}
