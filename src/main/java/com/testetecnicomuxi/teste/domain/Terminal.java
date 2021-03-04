package com.testetecnicomuxi.teste.domain;

import java.io.Serializable;
import java.util.Objects;

public class Terminal implements Serializable {
    private static final long serialVersionUID = 1L;
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

    public Terminal(){

    }

    public Terminal(Integer logic, String serial, String model, Integer sam, String ptid, Integer plat, String version, Integer mxr, Integer mxf, String verfm) {
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
        Terminal terminal = (Terminal) o;
        return Objects.equals(logic, terminal.logic) && Objects.equals(serial, terminal.serial) && Objects.equals(model, terminal.model) && Objects.equals(sam, terminal.sam) && Objects.equals(ptid, terminal.ptid) && Objects.equals(plat, terminal.plat) && Objects.equals(version, terminal.version) && Objects.equals(mxr, terminal.mxr) && Objects.equals(mxf, terminal.mxf) && Objects.equals(verfm, terminal.verfm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logic, serial, model, sam, ptid, plat, version, mxr, mxf, verfm);
    }
}
