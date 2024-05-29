package com.archimedes.main.apirest.users.adapters;

import com.archimedes.main.apirest.users.mappers.MembersModelMapper;
import com.archimedes.main.apirest.users.models.MembersModel;
import com.archimedes.main.application.users.ports.input.MemberService;
import com.archimedes.main.domain.users.dtos.Members;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class MemberControllerTests {

    @Mock
    private MemberService memberService;
    @Mock
    private MembersModelMapper modelMapper;
    @InjectMocks
    private MemberController memberController;

    @Test
    @DisplayName("Given a Member should add it OK")
    void shouldAddAMemberOK(){
        //Given
        var membersModel = mock(MembersModel.class);
        var memberDto = mock(Members.class);
        doReturn(memberDto).when(modelMapper).toDto(membersModel);
        //When
        var result = memberController.addMembership(membersModel);
        //Then
        verify(modelMapper,times(1)).toDto(membersModel);
        verify(memberService,times(1)).add(memberDto);
        assertThat("", result.toString(), equalTo("<200 OK OK,[]>"));
    }

    @Test
    @DisplayName("Given a valid email should add it OK")
    void shouldRevokeAMemberOK(){
        //Given
        String email = "test-flight@gmail.com";
        //When
        var result = memberController.revokeMembership(email);
        //Then
        verify(memberService,times(1)).revoke(email);
        assertThat("", result.toString(), equalTo("<200 OK OK,[]>"));
    }


    @Test
    @DisplayName("Given a Member should update it OK")
    void shouldUpdateMemberOK(){
        //Given
        var membersModel = mock(MembersModel.class);
        var memberDto = mock(Members.class);
        doReturn(memberDto).when(modelMapper).toDto(membersModel);
        //When
        var result = memberController.updateMembership(membersModel);
        //Then
        verify(modelMapper,times(1)).toDto(membersModel);
        verify(memberService,times(1)).update(memberDto);
        assertThat("", result.toString(), equalTo("<200 OK OK,[]>"));
    }

    @Test
    @DisplayName("Given a valid recurrency should add it OK")
    void shouldUpdatedARecurrentMemberOK(){
        //Given
        String recurringType = "weekly";
        var membersModel = mock(MembersModel.class);
        var memberDto = mock(Members.class);
        doReturn(memberDto).when(modelMapper).toDto(membersModel);
        //When
        var result = memberController.recurrentBilling(recurringType);
        //Then
        verify(memberService,times(1)).recurrentUpdate(recurringType);
        verify(modelMapper,times(1)).toDto(membersModel);
        assertThat("", result.toString(), equalTo("<200 OK OK,[]>"));
    }



}
