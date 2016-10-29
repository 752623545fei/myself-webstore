package org.webstore.entity;

public class Area {

    private Integer id;
    private Integer areaNo;
    private String areaName;
    private Integer parentNo;
    private String areaCode;
    private Integer areaLevel;
    private String typeName;

    public Area(Integer id, Integer areaNo, String areaName, Integer parentNo, String areaCode, Integer areaLevel,
                String typeName) {
        super();
        this.id = id;
        this.areaNo = areaNo;
        this.areaName = areaName;
        this.parentNo = parentNo;
        this.areaCode = areaCode;
        this.areaLevel = areaLevel;
        this.typeName = typeName;
    }

    public Area() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAreaNo() {
        return areaNo;
    }

    public void setAreaNo(Integer areaNo) {
        this.areaNo = areaNo;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getParentNo() {
        return parentNo;
    }

    public void setParentNo(Integer parentNo) {
        this.parentNo = parentNo;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public Integer getAreaLevel() {
        return areaLevel;
    }

    public void setAreaLevel(Integer areaLevel) {
        this.areaLevel = areaLevel;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "Area [id=" + id + ", areaNo=" + areaNo + ", areaName=" + areaName + ", parentNo=" + parentNo
                + ", areaCode=" + areaCode + ", areaLevel=" + areaLevel + ", typeName=" + typeName + "]";
    }

}
