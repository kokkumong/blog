package com.example.demo.domain.port.out;

import com.example.demo.domain.model.Member;

import java.util.Optional;

public interface MemberPort {
    Optional<Member> findByEmail(String email);
    Member save(Member member);
}
