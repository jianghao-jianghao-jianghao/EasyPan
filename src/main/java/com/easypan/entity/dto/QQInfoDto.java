package com.easypan.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QQInfoDto {
    private Integer ret;
    private String msg;
    private String nickname;
    private String figureurl_qq_1;
    private String figureurl_qq_2;
    private String gender;
}
