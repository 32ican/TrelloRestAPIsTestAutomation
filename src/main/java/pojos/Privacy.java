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
"fullName",
"avatar"
})
@Generated("jsonschema2pojo")
public class Privacy {

@JsonProperty("fullName")
private String fullName;
@JsonProperty("avatar")
private String avatar;
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

@JsonProperty("fullName")
public String getFullName() {
return fullName;
}

@JsonProperty("fullName")
public void setFullName(String fullName) {
this.fullName = fullName;
}

@JsonProperty("avatar")
public String getAvatar() {
return avatar;
}

@JsonProperty("avatar")
public void setAvatar(String avatar) {
this.avatar = avatar;
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