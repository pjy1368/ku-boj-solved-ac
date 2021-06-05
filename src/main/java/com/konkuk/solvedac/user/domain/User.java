package com.konkuk.solvedac.user.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class User {

    private Long id;
    @NonNull
    private Long groupId;
    @NonNull
    private String nickname;
}
