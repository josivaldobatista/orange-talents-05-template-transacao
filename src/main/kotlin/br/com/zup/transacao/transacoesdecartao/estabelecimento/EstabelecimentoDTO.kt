package br.com.zup.transacao.transacoesdecartao.estabelecimento

data class EstabelecimentoDTO(
  val nome: String,
  val cidade: String,
  val endereco: String
) {

  fun toModel(repository: EstabelecimentoRepository): Estabelecimento {
    val entity = repository.findByNome(nome)
    if (entity.isPresent) {
      return entity.get()
    }
    return Estabelecimento(nome, cidade, endereco)
  }
}
