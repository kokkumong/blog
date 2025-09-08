package com.example.demo.adapter.out.persistence;

import com.example.demo.domain.model.Member;
import org.springframework.stereotype.Controller;

@Controller
public class MemberMapper {
    public Member toDomain(MemberPersistenceEntity entity){
        return Member.builder()
                .id(entity.getId())
                .email(entity.getEmail())
                .password(entity.getPassword())
                .userName(entity.getUserName())
                .build();
    }

    public MemberPersistenceEntity toEntity(Member domain) {
        return MemberPersistenceEntity.builder()
                .id(domain.getId())
                .email(domain.getEmail())
                .password(domain.getPassword())
                .userName(domain.getUserName())
                .build();
    }
}
