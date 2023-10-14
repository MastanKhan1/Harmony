package com.najaf.harmony.harmony_repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.najaf.harmony.entity.Member;


@Repository
public interface HarmonyRepository extends JpaRepository<Member, Integer> {

	public List<Member> findById(int id);
}
