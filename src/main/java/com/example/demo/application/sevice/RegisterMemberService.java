package com.example.demo.application.sevice;

import com.example.demo.domain.model.Member;
import com.example.demo.domain.port.in.RegisterMemberUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class RegisterMemberService implements RegisterMemberUseCase {
    private final MemberPort memberPort;

    @Override
    public Member registerMember(RegisterMemberCommand command){

    }
}
