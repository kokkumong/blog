package com.example.demo.adapter.out.persistence;

import com.example.demo.domain.model.Member;
import com.example.demo.domain.port.out.MemberPort;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberPersistenceAdapter implements MemberPort {

    private final MemberJpaRepository memberJpaRepository;
    private final MemberMapper memberMapper;

    @Override
    public Optional<Member> findByEmail(String email) {
        return memberJpaRepository.findByEmail(email)
                .map(memberMapper :: toDomain);
    }
    @Override
    public Member save(Member member) {
        MemberPersistenceEntity entity = memberMapper.toEntity(member);
        MemberPersistenceEntity savedEntity = memberJpaRepository.save(entity);
        return memberMapper.toDomain(savedEntity);
    }
}
