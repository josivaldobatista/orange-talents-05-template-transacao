package br.com.zup.transacao.transacoesdecartao

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface TransacaoRepository: CrudRepository<Transacao, Long>
