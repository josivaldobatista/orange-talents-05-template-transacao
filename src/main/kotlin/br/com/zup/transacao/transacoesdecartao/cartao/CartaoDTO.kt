package br.com.zup.transacao.transacoesdecartao.cartao

data class CartaoDTO(
  val id: String,
  val email: String
) {
  fun toModel(cartaoRepository: CartaoRepository): Cartao {
    val entity = cartaoRepository.findByUuid(id)
    if (entity.isPresent) {
      return entity.get()
    }
    return Cartao(id, email)
  }
}
