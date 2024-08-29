package pojos;

import java.util.LinkedHashMap;
import java.util.List;
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
"aaId",
"activityBlocked",
"avatarHash",
"avatarUrl",
"bio",
"bioData",
"confirmed",
"fullName",
"idEnterprise",
"idEnterprisesDeactivated",
"idMemberReferrer",
"idPremOrgsAdmin",
"initials",
"memberType",
"nonPublic",
"nonPublicAvailable",
"products",
"url",
"username",
"status",
"aaBlockSyncUntil",
"aaEmail",
"aaEnrolledDate",
"avatarSource",
"credentialsRemovedCount",
"dateLastImpression",
"dateLastActive",
"domainClaimed",
"email",
"gravatarHash",
"idBoards",
"idOrganizations",
"idEnterprisesAdmin",
"limits",
"loginTypes",
"marketingOptIn",
"messagesDismissed",
"nodeId",
"oneTimeMessagesDismissed",
"sessionType",
"prefs",
"trophies",
"uploadedAvatarHash",
"uploadedAvatarUrl",
"premiumFeatures",
"isAaMastered",
"ixUpdate"
})
@Generated("jsonschema2pojo")
public class ExistingBoards {

@JsonProperty("id")
private String id;
@JsonProperty("aaId")
private String aaId;
@JsonProperty("activityBlocked")
private Boolean activityBlocked;
@JsonProperty("avatarHash")
private String avatarHash;
@JsonProperty("avatarUrl")
private String avatarUrl;
@JsonProperty("bio")
private String bio;
@JsonProperty("bioData")
private Object bioData;
@JsonProperty("confirmed")
private Boolean confirmed;
@JsonProperty("fullName")
private String fullName;
@JsonProperty("idEnterprise")
private Object idEnterprise;
@JsonProperty("idEnterprisesDeactivated")
private List<Object> idEnterprisesDeactivated;
@JsonProperty("idMemberReferrer")
private Object idMemberReferrer;
@JsonProperty("idPremOrgsAdmin")
private List<Object> idPremOrgsAdmin;
@JsonProperty("initials")
private String initials;
@JsonProperty("memberType")
private String memberType;
@JsonProperty("nonPublic")
private NonPublic nonPublic;
@JsonProperty("nonPublicAvailable")
private Boolean nonPublicAvailable;
@JsonProperty("products")
private List<Object> products;
@JsonProperty("url")
private String url;
@JsonProperty("username")
private String username;
@JsonProperty("status")
private String status;
@JsonProperty("aaBlockSyncUntil")
private Object aaBlockSyncUntil;
@JsonProperty("aaEmail")
private Object aaEmail;
@JsonProperty("aaEnrolledDate")
private Object aaEnrolledDate;
@JsonProperty("avatarSource")
private String avatarSource;
@JsonProperty("credentialsRemovedCount")
private Integer credentialsRemovedCount;
@JsonProperty("dateLastImpression")
private String dateLastImpression;
@JsonProperty("dateLastActive")
private String dateLastActive;
@JsonProperty("domainClaimed")
private Object domainClaimed;
@JsonProperty("email")
private String email;
@JsonProperty("gravatarHash")
private String gravatarHash;
@JsonProperty("idBoards")
private List<String> idBoards;
@JsonProperty("idOrganizations")
private List<String> idOrganizations;
@JsonProperty("idEnterprisesAdmin")
private List<Object> idEnterprisesAdmin;
@JsonProperty("limits")
private Limits limits;
@JsonProperty("loginTypes")
private List<String> loginTypes;
@JsonProperty("marketingOptIn")
private MarketingOptIn marketingOptIn;
@JsonProperty("messagesDismissed")
private List<MessagesDismissed> messagesDismissed;
@JsonProperty("nodeId")
private String nodeId;
@JsonProperty("oneTimeMessagesDismissed")
private List<String> oneTimeMessagesDismissed;
@JsonProperty("sessionType")
private Object sessionType;
@JsonProperty("prefs")
private Pref prefs;
@JsonProperty("trophies")
private List<Object> trophies;
@JsonProperty("uploadedAvatarHash")
private Object uploadedAvatarHash;
@JsonProperty("uploadedAvatarUrl")
private Object uploadedAvatarUrl;
@JsonProperty("premiumFeatures")
private List<Object> premiumFeatures;
@JsonProperty("isAaMastered")
private Boolean isAaMastered;
@JsonProperty("ixUpdate")
private String ixUpdate;
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

@JsonProperty("aaId")
public String getAaId() {
return aaId;
}

@JsonProperty("aaId")
public void setAaId(String aaId) {
this.aaId = aaId;
}

@JsonProperty("activityBlocked")
public Boolean getActivityBlocked() {
return activityBlocked;
}

@JsonProperty("activityBlocked")
public void setActivityBlocked(Boolean activityBlocked) {
this.activityBlocked = activityBlocked;
}

@JsonProperty("avatarHash")
public String getAvatarHash() {
return avatarHash;
}

@JsonProperty("avatarHash")
public void setAvatarHash(String avatarHash) {
this.avatarHash = avatarHash;
}

@JsonProperty("avatarUrl")
public String getAvatarUrl() {
return avatarUrl;
}

@JsonProperty("avatarUrl")
public void setAvatarUrl(String avatarUrl) {
this.avatarUrl = avatarUrl;
}

@JsonProperty("bio")
public String getBio() {
return bio;
}

@JsonProperty("bio")
public void setBio(String bio) {
this.bio = bio;
}

@JsonProperty("bioData")
public Object getBioData() {
return bioData;
}

@JsonProperty("bioData")
public void setBioData(Object bioData) {
this.bioData = bioData;
}

@JsonProperty("confirmed")
public Boolean getConfirmed() {
return confirmed;
}

@JsonProperty("confirmed")
public void setConfirmed(Boolean confirmed) {
this.confirmed = confirmed;
}

@JsonProperty("fullName")
public String getFullName() {
return fullName;
}

@JsonProperty("fullName")
public void setFullName(String fullName) {
this.fullName = fullName;
}

@JsonProperty("idEnterprise")
public Object getIdEnterprise() {
return idEnterprise;
}

@JsonProperty("idEnterprise")
public void setIdEnterprise(Object idEnterprise) {
this.idEnterprise = idEnterprise;
}

@JsonProperty("idEnterprisesDeactivated")
public List<Object> getIdEnterprisesDeactivated() {
return idEnterprisesDeactivated;
}

@JsonProperty("idEnterprisesDeactivated")
public void setIdEnterprisesDeactivated(List<Object> idEnterprisesDeactivated) {
this.idEnterprisesDeactivated = idEnterprisesDeactivated;
}

@JsonProperty("idMemberReferrer")
public Object getIdMemberReferrer() {
return idMemberReferrer;
}

@JsonProperty("idMemberReferrer")
public void setIdMemberReferrer(Object idMemberReferrer) {
this.idMemberReferrer = idMemberReferrer;
}

@JsonProperty("idPremOrgsAdmin")
public List<Object> getIdPremOrgsAdmin() {
return idPremOrgsAdmin;
}

@JsonProperty("idPremOrgsAdmin")
public void setIdPremOrgsAdmin(List<Object> idPremOrgsAdmin) {
this.idPremOrgsAdmin = idPremOrgsAdmin;
}

@JsonProperty("initials")
public String getInitials() {
return initials;
}

@JsonProperty("initials")
public void setInitials(String initials) {
this.initials = initials;
}

@JsonProperty("memberType")
public String getMemberType() {
return memberType;
}

@JsonProperty("memberType")
public void setMemberType(String memberType) {
this.memberType = memberType;
}

@JsonProperty("nonPublic")
public NonPublic getNonPublic() {
return nonPublic;
}

@JsonProperty("nonPublic")
public void setNonPublic(NonPublic nonPublic) {
this.nonPublic = nonPublic;
}

@JsonProperty("nonPublicAvailable")
public Boolean getNonPublicAvailable() {
return nonPublicAvailable;
}

@JsonProperty("nonPublicAvailable")
public void setNonPublicAvailable(Boolean nonPublicAvailable) {
this.nonPublicAvailable = nonPublicAvailable;
}

@JsonProperty("products")
public List<Object> getProducts() {
return products;
}

@JsonProperty("products")
public void setProducts(List<Object> products) {
this.products = products;
}

@JsonProperty("url")
public String getUrl() {
return url;
}

@JsonProperty("url")
public void setUrl(String url) {
this.url = url;
}

@JsonProperty("username")
public String getUsername() {
return username;
}

@JsonProperty("username")
public void setUsername(String username) {
this.username = username;
}

@JsonProperty("status")
public String getStatus() {
return status;
}

@JsonProperty("status")
public void setStatus(String status) {
this.status = status;
}

@JsonProperty("aaBlockSyncUntil")
public Object getAaBlockSyncUntil() {
return aaBlockSyncUntil;
}

@JsonProperty("aaBlockSyncUntil")
public void setAaBlockSyncUntil(Object aaBlockSyncUntil) {
this.aaBlockSyncUntil = aaBlockSyncUntil;
}

@JsonProperty("aaEmail")
public Object getAaEmail() {
return aaEmail;
}

@JsonProperty("aaEmail")
public void setAaEmail(Object aaEmail) {
this.aaEmail = aaEmail;
}

@JsonProperty("aaEnrolledDate")
public Object getAaEnrolledDate() {
return aaEnrolledDate;
}

@JsonProperty("aaEnrolledDate")
public void setAaEnrolledDate(Object aaEnrolledDate) {
this.aaEnrolledDate = aaEnrolledDate;
}

@JsonProperty("avatarSource")
public String getAvatarSource() {
return avatarSource;
}

@JsonProperty("avatarSource")
public void setAvatarSource(String avatarSource) {
this.avatarSource = avatarSource;
}

@JsonProperty("credentialsRemovedCount")
public Integer getCredentialsRemovedCount() {
return credentialsRemovedCount;
}

@JsonProperty("credentialsRemovedCount")
public void setCredentialsRemovedCount(Integer credentialsRemovedCount) {
this.credentialsRemovedCount = credentialsRemovedCount;
}

@JsonProperty("dateLastImpression")
public String getDateLastImpression() {
return dateLastImpression;
}

@JsonProperty("dateLastImpression")
public void setDateLastImpression(String dateLastImpression) {
this.dateLastImpression = dateLastImpression;
}

@JsonProperty("dateLastActive")
public String getDateLastActive() {
return dateLastActive;
}

@JsonProperty("dateLastActive")
public void setDateLastActive(String dateLastActive) {
this.dateLastActive = dateLastActive;
}

@JsonProperty("domainClaimed")
public Object getDomainClaimed() {
return domainClaimed;
}

@JsonProperty("domainClaimed")
public void setDomainClaimed(Object domainClaimed) {
this.domainClaimed = domainClaimed;
}

@JsonProperty("email")
public String getEmail() {
return email;
}

@JsonProperty("email")
public void setEmail(String email) {
this.email = email;
}

@JsonProperty("gravatarHash")
public String getGravatarHash() {
return gravatarHash;
}

@JsonProperty("gravatarHash")
public void setGravatarHash(String gravatarHash) {
this.gravatarHash = gravatarHash;
}

@JsonProperty("idBoards")
public List<String> getIdBoards() {
return idBoards;
}

@JsonProperty("idBoards")
public void setIdBoards(List<String> idBoards) {
this.idBoards = idBoards;
}

@JsonProperty("idOrganizations")
public List<String> getIdOrganizations() {
return idOrganizations;
}

@JsonProperty("idOrganizations")
public void setIdOrganizations(List<String> idOrganizations) {
this.idOrganizations = idOrganizations;
}

@JsonProperty("idEnterprisesAdmin")
public List<Object> getIdEnterprisesAdmin() {
return idEnterprisesAdmin;
}

@JsonProperty("idEnterprisesAdmin")
public void setIdEnterprisesAdmin(List<Object> idEnterprisesAdmin) {
this.idEnterprisesAdmin = idEnterprisesAdmin;
}

@JsonProperty("limits")
public Limits getLimits() {
return limits;
}

@JsonProperty("limits")
public void setLimits(Limits limits) {
this.limits = limits;
}

@JsonProperty("loginTypes")
public List<String> getLoginTypes() {
return loginTypes;
}

@JsonProperty("loginTypes")
public void setLoginTypes(List<String> loginTypes) {
this.loginTypes = loginTypes;
}

@JsonProperty("marketingOptIn")
public MarketingOptIn getMarketingOptIn() {
return marketingOptIn;
}

@JsonProperty("marketingOptIn")
public void setMarketingOptIn(MarketingOptIn marketingOptIn) {
this.marketingOptIn = marketingOptIn;
}

@JsonProperty("messagesDismissed")
public List<MessagesDismissed> getMessagesDismissed() {
return messagesDismissed;
}

@JsonProperty("messagesDismissed")
public void setMessagesDismissed(List<MessagesDismissed> messagesDismissed) {
this.messagesDismissed = messagesDismissed;
}

@JsonProperty("nodeId")
public String getNodeId() {
return nodeId;
}

@JsonProperty("nodeId")
public void setNodeId(String nodeId) {
this.nodeId = nodeId;
}

@JsonProperty("oneTimeMessagesDismissed")
public List<String> getOneTimeMessagesDismissed() {
return oneTimeMessagesDismissed;
}

@JsonProperty("oneTimeMessagesDismissed")
public void setOneTimeMessagesDismissed(List<String> oneTimeMessagesDismissed) {
this.oneTimeMessagesDismissed = oneTimeMessagesDismissed;
}

@JsonProperty("sessionType")
public Object getSessionType() {
return sessionType;
}

@JsonProperty("sessionType")
public void setSessionType(Object sessionType) {
this.sessionType = sessionType;
}

@JsonProperty("prefs")
public Pref getPrefs() {
return prefs;
}

@JsonProperty("prefs")
public void setPrefs(Pref prefs) {
this.prefs = prefs;
}

@JsonProperty("trophies")
public List<Object> getTrophies() {
return trophies;
}

@JsonProperty("trophies")
public void setTrophies(List<Object> trophies) {
this.trophies = trophies;
}

@JsonProperty("uploadedAvatarHash")
public Object getUploadedAvatarHash() {
return uploadedAvatarHash;
}

@JsonProperty("uploadedAvatarHash")
public void setUploadedAvatarHash(Object uploadedAvatarHash) {
this.uploadedAvatarHash = uploadedAvatarHash;
}

@JsonProperty("uploadedAvatarUrl")
public Object getUploadedAvatarUrl() {
return uploadedAvatarUrl;
}

@JsonProperty("uploadedAvatarUrl")
public void setUploadedAvatarUrl(Object uploadedAvatarUrl) {
this.uploadedAvatarUrl = uploadedAvatarUrl;
}

@JsonProperty("premiumFeatures")
public List<Object> getPremiumFeatures() {
return premiumFeatures;
}

@JsonProperty("premiumFeatures")
public void setPremiumFeatures(List<Object> premiumFeatures) {
this.premiumFeatures = premiumFeatures;
}

@JsonProperty("isAaMastered")
public Boolean getIsAaMastered() {
return isAaMastered;
}

@JsonProperty("isAaMastered")
public void setIsAaMastered(Boolean isAaMastered) {
this.isAaMastered = isAaMastered;
}

@JsonProperty("ixUpdate")
public String getIxUpdate() {
return ixUpdate;
}

@JsonProperty("ixUpdate")
public void setIxUpdate(String ixUpdate) {
this.ixUpdate = ixUpdate;
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
