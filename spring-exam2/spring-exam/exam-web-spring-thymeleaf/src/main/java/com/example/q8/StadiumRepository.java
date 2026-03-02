package com.example.q8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class StadiumRepository {

    @Autowired
	private NamedParameterJdbcTemplate template;
	
	private static final RowMapper<StadiumDomain> stadiumDomainRowMapper = (rs, i) ->{
        StadiumDomain stadium = new StadiumDomain();
        stadium.setId(rs.getInt("id"));
		stadium.setName(rs.getString("name"));
        stadium.setPrefecureCode(rs.getString("prefecure_code"));
        return stadium;
		};

    public StadiumDomain load(Integer id){
        String sql = "SELECT id,name,prefecure_code FROM stadiums WHERE id=:id";
        SqlParameterSource param = new MapSqlParameterSource().addValue("id",id);
        StadiumDomain stadium = template.queryForObject(sql, param, stadiumDomainRowMapper);
        return stadium;
    }
    

}
