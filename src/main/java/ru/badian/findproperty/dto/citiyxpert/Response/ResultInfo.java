package ru.badian.findproperty.dto.citiyxpert.Response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public record ResultInfo(
    long documentCount,
    long pageCount,
    long pageNumber,
    long documentsOnPage,
    boolean hasNextPage,
    boolean isLastPage,
    long pageSize,
    boolean hasPreviousPage,
    boolean isFirstPage
){}
