package br.com.zup.transacao.transacoesdecartao.cartao

data class CartaoDTO(
  val uuid: String,
  val email: String
) {
  fun toModel(cartaoRepository: CartaoRepository): Cartao {
    val entity = cartaoRepository.findByUuid(uuid)
    if (entity.isPresent) {
      return entity.get()
    }
    return Cartao(uuid, email)
  }
}
