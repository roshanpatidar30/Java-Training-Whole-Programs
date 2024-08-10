package com.pagination.dto;

import java.util.Objects;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaginationDTO {
private Integer pageNo= 0;
private Integer pageSize =10;

public Pageable  getPageable(PaginationDTO dto) {
	Integer page = Objects.nonNull(dto.getPageNo())? dto.getPageNo():this.pageNo;
		Integer size  = Objects.nonNull(dto.getPageSize())? dto.getPageSize(): this.pageSize;
		
		PageRequest request= PageRequest.of(page, size);
		return (Pageable) request;
}
}
