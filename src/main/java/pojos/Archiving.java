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
"id",
"name",
"closed",
"color",
"idBoard",
"pos",
"type",
"datasource"
})
@Generated("jsonschema2pojo")
public class Archiving {

@JsonProperty("id")
private String id;
@JsonProperty("name")
private String name;
@JsonProperty("closed")
private Boolean closed;
@JsonProperty("color")
private Object color;
@JsonProperty("idBoard")
private String idBoard;
@JsonProperty("pos")
private Integer pos;
@JsonProperty("type")
private Object type;
@JsonProperty("datasource")
private Datasource datasource;
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

@JsonProperty("id")
public String getId() {
return id;
}

@JsonProperty("id")
public void setId(String id) {
this.id = id;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("closed")
public Boolean getClosed() {
return closed;
}

@JsonProperty("closed")
public void setClosed(Boolean closed) {
this.closed = closed;
}

@JsonProperty("color")
public Object getColor() {
return color;
}

@JsonProperty("color")
public void setColor(Object color) {
this.color = color;
}

@JsonProperty("idBoard")
public String getIdBoard() {
return idBoard;
}

@JsonProperty("idBoard")
public void setIdBoard(String idBoard) {
this.idBoard = idBoard;
}

@JsonProperty("pos")
public Integer getPos() {
return pos;
}

@JsonProperty("pos")
public void setPos(Integer pos) {
this.pos = pos;
}

@JsonProperty("type")
public Object getType() {
return type;
}

@JsonProperty("type")
public void setType(Object type) {
this.type = type;
}

@JsonProperty("datasource")
public Datasource getDatasource() {
return datasource;
}

@JsonProperty("datasource")
public void setDatasource(Datasource datasource) {
this.datasource = datasource;
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