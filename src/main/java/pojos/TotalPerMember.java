package pojos;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"status",
"disableAt",
"warnAt"
})
@Generated("jsonschema2pojo")
public class TotalPerMember {

@JsonProperty("status")
private String status;
@JsonProperty("disableAt")
private Integer disableAt;
@JsonProperty("warnAt")
private Integer warnAt;
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

@JsonProperty("status")
public String getStatus() {
return status;
}

@JsonProperty("status")
public void setStatus(String status) {
this.status = status;
}

@JsonProperty("disableAt")
public Integer getDisableAt() {
return disableAt;
}

@JsonProperty("disableAt")
public void setDisableAt(Integer disableAt) {
this.disableAt = disableAt;
}

@JsonProperty("warnAt")
public Integer getWarnAt() {
return warnAt;
}

@JsonProperty("warnAt")
public void setWarnAt(Integer warnAt) {
this.warnAt = warnAt;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}