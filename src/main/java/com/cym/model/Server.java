package com.cym.model;

import cn.craccd.sqlHelper.bean.BaseModel;
import cn.craccd.sqlHelper.config.InitValue;
import cn.craccd.sqlHelper.config.Table;

@Table
public class Server extends BaseModel {
	String serverName;
	String listen;
	Integer rewrite; // 0否 1是
	Integer ssl; // 0 否 1是
	Integer http2; // 0否 1是
	String pem;
	String key;
	// 代理类型
	@InitValue("0")
	Integer proxyType; //  0 http 1 tcp
	String proxyUpstreamId;
	
	String pemStr;
	String keyStr;
	
	@InitValue("true")
	Boolean enable; // 是否启用
	
	
	public Boolean getEnable() {
		return enable;
	}
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}
	public Integer getHttp2() {
		return http2;
	}
	public void setHttp2(Integer http2) {
		this.http2 = http2;
	}
	public String getPemStr() {
		return pemStr;
	}
	public void setPemStr(String pemStr) {
		this.pemStr = pemStr;
	}
	public String getKeyStr() {
		return keyStr;
	}
	public void setKeyStr(String keyStr) {
		this.keyStr = keyStr;
	}
	public String getProxyUpstreamId() {
		return proxyUpstreamId;
	}
	public void setProxyUpstreamId(String proxyUpstreamId) {
		this.proxyUpstreamId = proxyUpstreamId;
	}
	public Integer getProxyType() {
		return proxyType;
	}
	public void setProxyType(Integer proxyType) {
		this.proxyType = proxyType;
	}
	public Integer getSsl() {
		return ssl;
	}
	public void setSsl(Integer ssl) {
		this.ssl = ssl;
	}
	public String getPem() {
		return pem;
	}
	public void setPem(String pem) {
		this.pem = pem;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getServerName() {
		return serverName;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	public String getListen() {
		return listen;
	}
	public void setListen(String listen) {
		this.listen = listen;
	}

	public Integer getRewrite() {
		return rewrite;
	}

	public void setRewrite(Integer rewrite) {
		this.rewrite = rewrite;
	}

	

}
