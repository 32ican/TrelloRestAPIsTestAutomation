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
"totalPerMember"
})
@Generated("jsonschema2pojo")
public class Orgs {

@JsonProperty("totalPerMember")
private TotalPerMember__1 totalPerMember;
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

@JsonProperty("totalPerMember")
public TotalPerMember__1 getTotalPerMember() {
return totalPerMember;
}

@JsonProperty("totalPerMember")
public void setTotalPerMember(TotalPerMember__1 totalPerMember) {
this.totalPerMember = totalPerMember;
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