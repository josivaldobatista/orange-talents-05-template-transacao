package br.com.zup.transacao.transacoesdecartao

import br.com.zup.transacao.transacoesdecartao.cartao.CartaoDTO
import br.com.zup.transacao.transacoesdecartao.cartao.CartaoRepository
import br.com.zup.transacao.transacoesdecartao.estabelecimento.EstabelecimentoDTO
import br.com.zup.transacao.transacoesdecartao.estabelecimento.EstabelecimentoRepository
import java.math.BigDecimal
import java.time.LocalDateTime

data class TransacaoDTO(
  val uuid: String,
  val valor: BigDecimal,
  val criadoEm: LocalDateTime,
  val estabelecimentoDto: EstabelecimentoDTO,
  val cartaoDto: CartaoDTO
) {
  fun toModel(
    estabelecimentoRepository: EstabelecimentoRepository,
    cartaoRepository: CartaoRepository
  ): Transacao {
    return Transacao(
      uuid,
      valor,
      criadoEm,
      estabelecimentoDto.toModel(estabelecimentoRepository),
      cartaoDto.toModel(cartaoRepository)
      )
  }
}
