package ru.belyavskiy.skills.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;
import ru.belyavskiy.skills.entity.Question;
import ru.belyavskiy.skills.entity.Skill;

import java.util.Optional;

@Repository
public interface QuestionRepository extends CassandraRepository<Question, Long> {
//    @Query("select * from belyavskiy.skills where title = ?0 ALLOW FILTERING")
//    Optional<Skill> findByTitle(String title);
}
