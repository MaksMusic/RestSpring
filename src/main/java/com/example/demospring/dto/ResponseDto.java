package com.example.demospring.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//шаблон Builder
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ResponseDto {
    String answer;
}
