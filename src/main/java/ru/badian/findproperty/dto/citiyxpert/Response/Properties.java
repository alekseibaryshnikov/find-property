package ru.badian.findproperty.dto.citiyxpert.Response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.OffsetDateTime;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Properties(
    double pricePerSize,
    List<String> polygons,
    List<Long> parkingArray,
    long propId,
    String municipality,
    long yearOfConstruction,
    long cityId,
    long ptId,
    OffsetDateTime availableFrom,
    String caseType,
    List<Object> furnishingArray,
    List<Object> otherArray,
    long furnished,
    String street,
    long price,
    List<Long> heatingArray,
    long caseId,
    List<Long> joineryArray,
    String floor,
    String uniqueID,
    long ceiling,
    List<Object> petsArray,
    long filed,
    String rentOrSale,
    String coverPhoto,
    OffsetDateTime firstPublished,
    String structure,
    long statusId,
    long size,
    List<Object> bldgOptsArray,
    String location,
    boolean underConstruction
) {}
