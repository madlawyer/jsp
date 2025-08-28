package pds;

public class PdsVO {
	private int idx;
	private String mid;
	private String nickName;
	private String fName;
	private String fSName;
	private String fSize;
	private String part;
	private String title;
	private String content;
	private String openSw;
	private String pwd;
	private String hostIp;
	private String fDate;
	private String dowunNum;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getfSName() {
		return fSName;
	}
	public void setfSName(String fSName) {
		this.fSName = fSName;
	}
	public String getfSize() {
		return fSize;
	}
	public void setfSize(String fSize) {
		this.fSize = fSize;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getOpenSw() {
		return openSw;
	}
	public void setOpenSw(String openSw) {
		this.openSw = openSw;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getHostIp() {
		return hostIp;
	}
	public void setHostIp(String hostIp) {
		this.hostIp = hostIp;
	}
	public String getfDate() {
		return fDate;
	}
	public void setfDate(String fDate) {
		this.fDate = fDate;
	}
	public String getDowunNum() {
		return dowunNum;
	}
	public void setDowunNum(String dowunNum) {
		this.dowunNum = dowunNum;
	}
	
	@Override
	public String toString() {
		return "PdsVO [idx=" + idx + ", mid=" + mid + ", nickName=" + nickName + ", fName=" + fName + ", fSName=" + fSName
				+ ", fSize=" + fSize + ", part=" + part + ", title=" + title + ", content=" + content + ", openSw=" + openSw
				+ ", pwd=" + pwd + ", hostIp=" + hostIp + ", fDate=" + fDate + ", dowunNum=" + dowunNum + "]";
	}
}
