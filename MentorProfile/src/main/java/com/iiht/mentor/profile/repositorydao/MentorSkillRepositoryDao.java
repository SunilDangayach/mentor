package com.iiht.mentor.profile.repositorydao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iiht.mentor.profile.model.MentorSkill;


@Repository
public interface MentorSkillRepositoryDao extends JpaRepository<MentorSkill, Integer>{
	public List<MentorSkill> findBySid(int sid);

}
