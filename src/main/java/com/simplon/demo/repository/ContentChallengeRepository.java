package com.simplon.demo.repository;

import com.simplon.demo.model.ContentChallenge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContentChallengeRepository extends JpaRepository <ContentChallenge, Long>{

 // Liste du contenu d'un challenge (modif du 30/08 => List au lieu de optional)
 public List<ContentChallenge> findContentChallengeByChallengeId(Long challengeId);


/** => NB du 30/08: inutile de créer les méthodes find delete et update un content = déjà dans l'interface JPArepository par défaut*/
}