package com.example.BackendTask.rest.dto.common;

import java.util.List;

import lombok.Data;
@Data
public class PaginatedResultDto<T> {
    private List<T> data;
    private PaginationDto pagination;

}
