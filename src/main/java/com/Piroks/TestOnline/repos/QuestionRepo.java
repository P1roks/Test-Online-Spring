package com.Piroks.TestOnline.repos;

import com.Piroks.TestOnline.database.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepo extends JpaRepository<Question,Integer> {
}
