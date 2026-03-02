package com.example.q8;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StadiumService {

    @Autowired
    private StadiumRepository repository;

    	public List<String> findStadium(List<BaseballDomain> baseballList){
		
            List<String> stadiumList = new ArrayList<>();

            for(BaseballDomain team : baseballList) {
                Integer stadiumId = team.getStadiumId();
                StadiumDomain stadium = repository.load(stadiumId);
                stadiumList.add(stadium.getName());
            }
            return stadiumList;
        }

}
