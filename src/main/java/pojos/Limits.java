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
"boards",
"orgs"
})
@Generated("jsonschema2pojo")
public class Limits {

@JsonProperty("boards")
private Boards boards;
@JsonProperty("orgs")
private Orgs orgs;
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

@JsonProperty("boards")
public Boards getBoards() {
return boards;
}

@JsonProperty("boards")
public void setBoards(Boards boards) {
this.boards = boards;
}

@JsonProperty("orgs")
public Orgs getOrgs() {
return orgs;
}

@JsonProperty("orgs")
public void setOrgs(Orgs orgs) {
this.orgs = orgs;
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