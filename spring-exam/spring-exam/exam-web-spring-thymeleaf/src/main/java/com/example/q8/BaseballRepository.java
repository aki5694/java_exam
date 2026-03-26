package com.example.q8;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class BaseballRepository {
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	private static final RowMapper<BaseballDomain> baseballDomainRowMapper = (rs, i) ->{
		Integer id = rs.getInt("id");
		String name = rs.getString("name");
		Date date = rs.getDate("established_date");
		String stadiumName = rs.getString("stadium_name");
		return new BaseballDomain(id,name,stadiumName,date);
		};
	
	public List<BaseballDomain> findAll(){
		String sql = "SELECT t.id, t.name, s.name AS stadium_name, t.established_date "
				+ "FROM teams AS t "
				+ "JOIN stadiums AS s ON t.stadium_id = s.id "
				+ "ORDER BY t.established_date ASC";
		
		List<BaseballDomain> baseballDomainList = template.query(sql, baseballDomainRowMapper);
		
		return baseballDomainList;
	}
	public BaseballDomain load(Integer id){
		//未実装
		return null;
	}
	public BaseballDomain save(BaseballDomain baseballDomain){
		//未実装
		return null;
	}
	public BaseballDomain delete(Integer id){
		//未実装
		return null;
	}
}
