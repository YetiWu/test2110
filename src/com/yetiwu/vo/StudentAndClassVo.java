package com.yetiwu.vo;

public class StudentAndClassVo {
    // 学生信息
    private String sid;
    private String sname;
    private Integer sage;
    private String sclassroomid;

    // 班级信息
    private String cid;
    private String cname;

    @Override
    public String toString() {
        return "StudentAndClassVo{" +
                "sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                ", sage=" + sage +
                ", sclassroomid='" + sclassroomid + '\'' +
                ", cid='" + cid + '\'' +
                ", cname='" + cname + '\'' +
                '}';
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public String getSclassroomid() {
        return sclassroomid;
    }

    public void setSclassroomid(String sclassroomid) {
        this.sclassroomid = sclassroomid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
