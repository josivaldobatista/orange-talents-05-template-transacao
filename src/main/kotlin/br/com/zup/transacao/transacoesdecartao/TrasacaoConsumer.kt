package br.com.zup.transacao.transacoesdecartao

import br.com.zup.transacao.transacoesdecartao.cartao.CartaoRepository
import br.com.zup.transacao.transacoesdecartao.estabelecimento.EstabelecimentoRepository
import org.springframework.context.annotation.Bean
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.kafka.support.converter.JsonMessageConverter
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
class TrasacaoConsumer(
  val estabelecimentoRepository: EstabelecimentoRepository,
  val cartaoRepository: CartaoRepository,
  val transacaoRepository: TransacaoRepository
) {

  @KafkaListener(
    groupId = "{spring.kafka.consumer.group-id}",
    topics = ["spring.kafka.topic.transactions"])
  @Transactional
  fun consome(dto: TransacaoDTO) {
    val transacao: Transacao = dto.toModel(estabelecimentoRepository, cartaoRepository)
    println("**** TRANSAÇÃO: $transacao")
    transacaoRepository.save(transacao)
  }

}