package com.example.demo.adapter.in.web;

import com.example.demo.adapter.in.web.dto.RegisterMemberRequest;
import com.example.demo.domain.model.Member;
import com.example.demo.domain.port.in.RegisterMemberUseCase;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/members")
@RequiredArgsConstructor
public class MemberController {
    private final RegisterMemberUseCase registerMemberUseCase;
    @PostMapping("/register")
    public ResponseEntity<String> registerMember(
            @Valid
            @RequestBody
            RegisterMemberRequest request
    ) {
        RegisterMemberUseCase.RegisterMemberCommand command = request.toCommand();
        Member newMember = registerMemberUseCase.registerMember(command);
        return ResponseEntity.ok("email : " + newMember.getEmail() + "\n" + "password : " + newMember.getPassword());
    }
}
