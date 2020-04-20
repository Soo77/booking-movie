package com.kcc.soo.domain;

import java.io.Serializable;
import java.sql.Timestamp;

//공통코드그룹 
public class CommCodeGroup implements Serializable {

	private static final long serialVersionUID = 1L;

// 그룹코드 ID 
 private String groupcodeId;

 // 그룹코드값 
 private String groupcodeName;
 
 // 수정가능여부
 private String editableYn;
 
 // 비고
 private String remark;

 // 등록자 ID 
 private String regId;

 // 등록일시 
 private Timestamp regDt;

 // 등록 IP 
 private String regIp;

 // 수정자 ID 
 private String modId;

 // 수정일시 
 private Timestamp modDt;

 // 수정 IP 
 private String modIp;

 public String getGroupcodeId() {
     return groupcodeId;
 }

 public void setGroupcodeId(String groupcodeId) {
     this.groupcodeId = groupcodeId;
 }

 public String getGroupcodeName() {
     return groupcodeName;
 }

 public void setGroupcodeName(String groupcodeName) {
     this.groupcodeName = groupcodeName;
 }

 public String getRegId() {
     return regId;
 }

 public void setRegId(String regId) {
     this.regId = regId;
 }

 public Timestamp getRegDt() {
     return regDt;
 }

 public void setRegDt(Timestamp regDt) {
     this.regDt = regDt;
 }

 public String getRegIp() {
     return regIp;
 }

 public void setRegIp(String regIp) {
     this.regIp = regIp;
 }

 public String getModId() {
     return modId;
 }

 public void setModId(String modId) {
     this.modId = modId;
 }

 public Timestamp getModDt() {
     return modDt;
 }

 public void setModDt(Timestamp modDt) {
     this.modDt = modDt;
 }

 public String getModIp() {
     return modIp;
 }

 public void setModIp(String modIp) {
     this.modIp = modIp;
 }
 
 public String getEditableYn() {
  return editableYn;
}

public void setEditableYn(String editableYn) {
  this.editableYn = editableYn;
}

public String getRemark() {
  return remark;
}

public void setRemark(String remark) {
  this.remark = remark;
}



@Override
public String toString() {
  return "CommCodeGroup [groupcodeId=" + groupcodeId + ", groupcodeName=" + groupcodeName
      + ", editableYn=" + editableYn + ", remark=" + remark + ", regId=" + regId + ", regDt="
      + regDt + ", regIp=" + regIp + ", modId=" + modId + ", modDt=" + modDt + ", modIp=" + modIp
      + "]";
}


}