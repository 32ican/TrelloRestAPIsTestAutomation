package pojos;

public class Board {
	private String id;
	private String name;
	private String desc;
	private String descData;
	private boolean closed;
	private String idOrganization;
	private String idEnterprise;
	private boolean pinned;
	private String url;
	private String shortUrl;
	private Pref prefs;
	private LabelName labelNames;
	private Limit limits;
	public String getId() {
		return id;
	}
	
	
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDescData() {
		return descData;
	}
	public void setDescData(String descData) {
		this.descData = descData;
	}
	public boolean isClosed() {
		return closed;
	}
	public void setClosed(boolean closed) {
		this.closed = closed;
	}
	public String getIdOrganization() {
		return idOrganization;
	}
	public void setIdOrganization(String idOrganization) {
		this.idOrganization = idOrganization;
	}
	public String getIdEnterprise() {
		return idEnterprise;
	}
	public void setIdEnterprise(String idEnterprise) {
		this.idEnterprise = idEnterprise;
	}
	public boolean isPinned() {
		return pinned;
	}
	public void setPinned(boolean pinned) {
		this.pinned = pinned;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getShortUrl() {
		return shortUrl;
	}
	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}
	public Pref getPrefs() {
		return prefs;
	}
	public void setPrefs(Pref prefs) {
		this.prefs = prefs;
	}
	public LabelName getLabelNames() {
		return labelNames;
	}
	public void setLabelNames(LabelName labelNames) {
		this.labelNames = labelNames;
	}
	public Limit getLimits() {
		return limits;
	}
	public void setLimits(Limit limits) {
		this.limits = limits;
	}
	
	
	
}