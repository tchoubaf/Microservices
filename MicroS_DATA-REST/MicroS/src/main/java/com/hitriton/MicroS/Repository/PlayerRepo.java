package com.hitriton.MicroS.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.hitriton.MicroS.domain.Players;
import com.hitriton.MicroS.domain.Team;

//in data-rest with @ResResource you do not need a controller anymore
@RestResource(path="players", rel="player") // the past replaces @RequestMapping, and rel = creates a hyperlink
public interface PlayerRepo extends CrudRepository<Players,Long> {
	

}
