//YApi QuickType插件生成，具体参考文档:https://github.com/RmondJone/YapiQuickType

package ru.badian.findproperty.dto.citiyxpert.Request;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class CityExpertRq {
    private List<Object> parkingArray = new ArrayList<>();
    private String searchSource = "regular";
    private List<Object> propIds = new ArrayList<>();
    private List<Object> yearOfConstruction = new ArrayList<>();
    private List<String> polygonsArray = new ArrayList<>();
    private List<Long> ptId = new ArrayList<>();
    private long cityId = 1;
    private List<Object> furnishingArray = new ArrayList<>();
    private List<Object> otherArray = new ArrayList<>();
    private long resultsPerPage = 10;
    private List<Object> furnished = new ArrayList<>();
    private List<Object> heatingArray = new ArrayList<>();
    private List<Object> joineryArray = new ArrayList<>();
    private boolean avFrom = false;
    private List<Object> floor = new ArrayList<>();
    private List<Object> ceiling = new ArrayList<>();
    private List<Object> petsArray = new ArrayList<>();
    private List<Object> filed = new ArrayList<>();
    private String rentOrSale = "r";
    private String sort = "datedsc";
    private List<Object> structure = new ArrayList<>();
    private List<Object> bldgOptsArray = new ArrayList<>();
    private long minPrice = 0;
    private boolean underConstruction = false;
    private long maxPrice = Integer.MAX_VALUE;
    private long currentPage = 1;
}
