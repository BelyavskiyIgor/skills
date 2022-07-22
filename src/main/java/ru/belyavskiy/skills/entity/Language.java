package ru.belyavskiy.skills.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.*;

import java.util.List;

@Table("languages")
@UserDefinedType("languages")
@AllArgsConstructor
public class Language {

    @Id
    @PrimaryKeyColumn(
            name = "id",
            ordinal =  2,
            type = PrimaryKeyType.PARTITIONED,
            ordering =  Ordering.DESCENDING
    )
    @Getter
    @Setter
    private Long id;

    @Column
    @Getter
    @Setter
    private String title;

//    @CassandraType(type = CassandraType.Name.LIST, typeArguments = {CassandraType.Name.UDT}, userTypeName = "languages")
//    @Getter
//    @Setter
//    private String discription;

    @CassandraType(type = CassandraType.Name.LIST, typeArguments = {CassandraType.Name.UDT}, userTypeName = "skills")
    @Getter
    @Setter
    private List<Skill> skillList;
}
