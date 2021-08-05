package br.com.zup.transacao.transacoesdecartao.cartao

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Cartao(
  val uuid: String,
  val email: String
) {

  @Id
  @GeneratedValue
  val id: Long? = null
}
