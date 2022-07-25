package com.mjv.projetofinal.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.mjv.projetofinal.model.locacao.dto.LocacaoListagem;
import com.mjv.projetofinal.model.locacao.dto.LocacaoListagem2;

@Repository
public class LocacaoCustomRepository {
	@PersistenceContext
	private EntityManager em;
	
	public List<LocacaoListagem2> listarLocacaoDetalhes(Integer idLocacao) {
		StringBuilder sql = new StringBuilder();
		sql.append("select li.locacao_id as id, e.tipo_equipamento as tipoequip, e.grupo as grupo, e.valor_locacao as valor, l.data_retirada as retirada"
				+ " from locacao_item li "
				+ "	inner join locacao l "
				+ "	on li.locacao_id = l.id "
				+ "	inner join equipamento e "
				+ "	on li.equipamento_id  = e.id "
				+ " where li.locacao_id  = :id");
		
		@SuppressWarnings("deprecation")
		List<LocacaoListagem2> lista = em.createNativeQuery(sql.toString())
			 .setParameter("id", idLocacao)
	         .unwrap(org.hibernate.query.NativeQuery.class)
	         .setResultTransformer(Transformers.aliasToBean(LocacaoListagem2.class))
	         .getResultList();

	        return lista;
	}
	
	
	
	public List<LocacaoListagem> listLocacaoComCliente(){
		StringBuilder sql = new StringBuilder();

	    sql.append("select l.id as id, l.data_retirada as retirada, l.data_devolucao as devolucao, l.valor_final as valor, c.nome as cliente"
	             + " from locacao l "
	             + " inner join cliente c "
	             + " on l.cliente_id  = c.id");

	    @SuppressWarnings("deprecation")
		List<LocacaoListagem> lista = em.createNativeQuery(sql.toString())
	         .unwrap(org.hibernate.query.NativeQuery.class)
	         .setResultTransformer(Transformers.aliasToBean(LocacaoListagem.class))
	         .getResultList();

	        return lista;
    }
}

