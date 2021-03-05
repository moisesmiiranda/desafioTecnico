<<<<<<< HEAD
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
=======
package com.testetecnicomuxi.teste.dto;

import java.io.Serializable;

<<<<<<< HEAD:src/main/java/com/testetecnicomuxi/teste/dto/ApplicationDTO.java
public class ApplicationDTO implements Serializable {

    private long id;

=======
public class Application implements Serializable {
    private static final long serialVersionUID = 1L;
>>>>>>> 264aec533a0a8adcaeca3d53442dfb0743ee0e16:src/main/java/com/testetecnicomuxi/teste/domain/Application.java
>>>>>>> 264aec533a0a8adcaeca3d53442dfb0743ee0e16
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

<<<<<<< HEAD
    public Application() {

    }

    public Application(long id, Integer logic, String serial, String model, Integer sam, String ptid, Integer plat, String version, Integer mxr, Integer mxf, String verfm) {
        this.id = id;
=======
<<<<<<< HEAD:src/main/java/com/testetecnicomuxi/teste/dto/ApplicationDTO.java
    public ApplicationDTO(){

    }

    public ApplicationDTO(long id, Integer logic, String serial, String model, Integer sam, String ptid, Integer plat, String version, Integer mxr, Integer mxf, String verfm) {
        this.id = id;
=======
    public Application(){

    }

    public Application(Integer logic, String serial, String model, Integer sam, String ptid, Integer plat, String version, Integer mxr, Integer mxf, String verfm) {
>>>>>>> 264aec533a0a8adcaeca3d53442dfb0743ee0e16:src/main/java/com/testetecnicomuxi/teste/domain/Application.java
>>>>>>> 264aec533a0a8adcaeca3d53442dfb0743ee0e16
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
<<<<<<< HEAD
=======
<<<<<<< HEAD:src/main/java/com/testetecnicomuxi/teste/dto/ApplicationDTO.java
=======
>>>>>>> 264aec533a0a8adcaeca3d53442dfb0743ee0e16

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
<<<<<<< HEAD
        Application that = (Application) o;
        return id == that.id && Objects.equals(logic, that.logic) && Objects.equals(serial, that.serial) && Objects.equals(model, that.model) && Objects.equals(sam, that.sam) && Objects.equals(ptid, that.ptid) && Objects.equals(plat, that.plat) && Objects.equals(version, that.version) && Objects.equals(mxr, that.mxr) && Objects.equals(mxf, that.mxf) && Objects.equals(verfm, that.verfm);
=======
        Application application = (Application) o;
        return Objects.equals(logic, application.logic) && Objects.equals(serial, application.serial) && Objects.equals(model, application.model) && Objects.equals(sam, application.sam) && Objects.equals(ptid, application.ptid) && Objects.equals(plat, application.plat) && Objects.equals(version, application.version) && Objects.equals(mxr, application.mxr) && Objects.equals(mxf, application.mxf) && Objects.equals(verfm, application.verfm);
>>>>>>> 264aec533a0a8adcaeca3d53442dfb0743ee0e16
    }

    @Override
    public int hashCode() {
<<<<<<< HEAD
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
=======
        return Objects.hash(logic, serial, model, sam, ptid, plat, version, mxr, mxf, verfm);
    }
>>>>>>> 264aec533a0a8adcaeca3d53442dfb0743ee0e16:src/main/java/com/testetecnicomuxi/teste/domain/Application.java
}
>>>>>>> 264aec533a0a8adcaeca3d53442dfb0743ee0e16
