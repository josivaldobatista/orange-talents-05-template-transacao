package br.com.zup.transacao.transacoesdecartao.estabelecimento

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Estabelecimento(
  val nome: String,
  val cidade: String,
  val endereco: String
) {

  @Id
  @GeneratedValue
  val id: Long? = null

  @Column(nullable = false)
  val criadoEm: LocalDateTime = LocalDateTime.now()

}
