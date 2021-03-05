package com.testetecnicomuxi.teste.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Objects;

@Document
public class Application implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private long id;
    private Integer logic;
    private String serial;
    private String model;
    private Integer sam;
    private String ptid;
    private Integer plat;
    private String version;
    private Integer mxr;
    private Integer mxf;
    private String verfm;

    public Application() {

    }

    public Application(long id, Integer logic, String serial, String model, Integer sam, String ptid, Integer plat, String version, Integer mxr, Integer mxf, String verfm) {
        this.id = id;
        this.logic = logic;
        this.serial = serial;
        this.model = model;
        this.sam = sam;
        this.ptid = ptid;
        this.plat = plat;
        this.version = version;
        this.mxr = mxr;
        this.mxf = mxf;
        this.verfm = verfm;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getLogic() {
        return logic;
    }

    public void setLogic(Integer logic) {
        this.logic = logic;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getSam() {
        return sam;
    }

    public void setSam(Integer sam) {
        this.sam = sam;
    }

    public String getPtid() {
        return ptid;
    }

    public void setPtid(String ptid) {
        this.ptid = ptid;
    }

    public Integer getPlat() {
        return plat;
    }

    public void setPlat(Integer plat) {
        this.plat = plat;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getMxr() {
        return mxr;
    }

    public void setMxr(Integer mxr) {
        this.mxr = mxr;
    }

    public Integer getMxf() {
        return mxf;
    }

    public void setMxf(Integer mxf) {
        this.mxf = mxf;
    }

    public String getVerfm() {
        return verfm;
    }

    public void setVerfm(String verfm) {
        this.verfm = verfm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Application that = (Application) o;
        return id == that.id && Objects.equals(logic, that.logic) && Objects.equals(serial, that.serial) && Objects.equals(model, that.model) && Objects.equals(sam, that.sam) && Objects.equals(ptid, that.ptid) && Objects.equals(plat, that.plat) && Objects.equals(version, that.version) && Objects.equals(mxr, that.mxr) && Objects.equals(mxf, that.mxf) && Objects.equals(verfm, that.verfm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, logic, serial, model, sam, ptid, plat, version, mxr, mxf, verfm);
    }

    @Override
    public String toString() {
        return "Application{" +
                "id=" + id +
                ", logic=" + logic +
                ", serial='" + serial + '\'' +
                ", model='" + model + '\'' +
                ", sam=" + sam +
                ", ptid='" + ptid + '\'' +
                ", plat=" + plat +
                ", version='" + version + '\'' +
                ", mxr=" + mxr +
                ", mxf=" + mxf +
                ", verfm='" + verfm + '\'' +
                '}';
    }
}