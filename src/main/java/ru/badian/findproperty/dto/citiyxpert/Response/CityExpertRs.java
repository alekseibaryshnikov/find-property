package ru.badian.findproperty.dto.citiyxpert.Response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CityExpertRs(
    ResultInfo info,
    List<Properties> result
){}
