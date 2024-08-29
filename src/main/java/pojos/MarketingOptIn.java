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
"optedIn",
"date"
})
@Generated("jsonschema2pojo")
public class MarketingOptIn {

@JsonProperty("optedIn")
private Boolean optedIn;
@JsonProperty("date")
private String date;
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

@JsonProperty("optedIn")
public Boolean getOptedIn() {
return optedIn;
}

@JsonProperty("optedIn")
public void setOptedIn(Boolean optedIn) {
this.optedIn = optedIn;
}

@JsonProperty("date")
public String getDate() {
return date;
}

@JsonProperty("date")
public void setDate(String date) {
this.date = date;
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