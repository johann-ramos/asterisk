/**
 * ServiceProviders.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package UtilsClass;

public class ServiceProviders  implements java.io.Serializable {
    private int TIMEOUT;

    private long MAXANSWERINGTIME;

    private long CALLS;

    private long NUMTIMEOUTS;

    private long CALLSOK;

    private java.lang.String USER;

    private java.lang.Object callingSuccess;

    private cantv.arquitectura.asc.contratos.exceptions.SystemException callingFailure;

    private long HISTNUMTIMEOUTS;

    private java.lang.String TEXTERROR;

    private long FAULTS;

    private long MINANSWERINGTIME;

    private java.lang.String NAME;

    private long HISTCALLS;

    private java.util.Calendar LASTGOODANSWERINGTIME;

    private java.lang.String PASSWORD;

    private long NUMFAILURESFORERROR;

    private long HISTMINANSWERINGTIME;

    private long CONTINUOUSFAILURES;

    private java.util.Calendar LASTGOODCALLINGTIME;

    private long STATUS;

    private long HISTFAULTS;

    private long HISTMAXANSWERINGTIME;

    private java.lang.String ENDPOINT;

    public ServiceProviders() {
    }

    public ServiceProviders(
           int TIMEOUT,
           long MAXANSWERINGTIME,
           long CALLS,
           long NUMTIMEOUTS,
           long CALLSOK,
           java.lang.String USER,
           java.lang.Object callingSuccess,
           cantv.arquitectura.asc.contratos.exceptions.SystemException callingFailure,
           long HISTNUMTIMEOUTS,
           java.lang.String TEXTERROR,
           long FAULTS,
           long MINANSWERINGTIME,
           java.lang.String NAME,
           long HISTCALLS,
           java.util.Calendar LASTGOODANSWERINGTIME,
           java.lang.String PASSWORD,
           long NUMFAILURESFORERROR,
           long HISTMINANSWERINGTIME,
           long CONTINUOUSFAILURES,
           java.util.Calendar LASTGOODCALLINGTIME,
           long STATUS,
           long HISTFAULTS,
           long HISTMAXANSWERINGTIME,
           java.lang.String ENDPOINT) {
           this.TIMEOUT = TIMEOUT;
           this.MAXANSWERINGTIME = MAXANSWERINGTIME;
           this.CALLS = CALLS;
           this.NUMTIMEOUTS = NUMTIMEOUTS;
           this.CALLSOK = CALLSOK;
           this.USER = USER;
           this.callingSuccess = callingSuccess;
           this.callingFailure = callingFailure;
           this.HISTNUMTIMEOUTS = HISTNUMTIMEOUTS;
           this.TEXTERROR = TEXTERROR;
           this.FAULTS = FAULTS;
           this.MINANSWERINGTIME = MINANSWERINGTIME;
           this.NAME = NAME;
           this.HISTCALLS = HISTCALLS;
           this.LASTGOODANSWERINGTIME = LASTGOODANSWERINGTIME;
           this.PASSWORD = PASSWORD;
           this.NUMFAILURESFORERROR = NUMFAILURESFORERROR;
           this.HISTMINANSWERINGTIME = HISTMINANSWERINGTIME;
           this.CONTINUOUSFAILURES = CONTINUOUSFAILURES;
           this.LASTGOODCALLINGTIME = LASTGOODCALLINGTIME;
           this.STATUS = STATUS;
           this.HISTFAULTS = HISTFAULTS;
           this.HISTMAXANSWERINGTIME = HISTMAXANSWERINGTIME;
           this.ENDPOINT = ENDPOINT;
    }


    /**
     * Gets the TIMEOUT value for this ServiceProviders.
     * 
     * @return TIMEOUT
     */
    public int getTIMEOUT() {
        return TIMEOUT;
    }


    /**
     * Sets the TIMEOUT value for this ServiceProviders.
     * 
     * @param TIMEOUT
     */
    public void setTIMEOUT(int TIMEOUT) {
        this.TIMEOUT = TIMEOUT;
    }


    /**
     * Gets the MAXANSWERINGTIME value for this ServiceProviders.
     * 
     * @return MAXANSWERINGTIME
     */
    public long getMAXANSWERINGTIME() {
        return MAXANSWERINGTIME;
    }


    /**
     * Sets the MAXANSWERINGTIME value for this ServiceProviders.
     * 
     * @param MAXANSWERINGTIME
     */
    public void setMAXANSWERINGTIME(long MAXANSWERINGTIME) {
        this.MAXANSWERINGTIME = MAXANSWERINGTIME;
    }


    /**
     * Gets the CALLS value for this ServiceProviders.
     * 
     * @return CALLS
     */
    public long getCALLS() {
        return CALLS;
    }


    /**
     * Sets the CALLS value for this ServiceProviders.
     * 
     * @param CALLS
     */
    public void setCALLS(long CALLS) {
        this.CALLS = CALLS;
    }


    /**
     * Gets the NUMTIMEOUTS value for this ServiceProviders.
     * 
     * @return NUMTIMEOUTS
     */
    public long getNUMTIMEOUTS() {
        return NUMTIMEOUTS;
    }


    /**
     * Sets the NUMTIMEOUTS value for this ServiceProviders.
     * 
     * @param NUMTIMEOUTS
     */
    public void setNUMTIMEOUTS(long NUMTIMEOUTS) {
        this.NUMTIMEOUTS = NUMTIMEOUTS;
    }


    /**
     * Gets the CALLSOK value for this ServiceProviders.
     * 
     * @return CALLSOK
     */
    public long getCALLSOK() {
        return CALLSOK;
    }


    /**
     * Sets the CALLSOK value for this ServiceProviders.
     * 
     * @param CALLSOK
     */
    public void setCALLSOK(long CALLSOK) {
        this.CALLSOK = CALLSOK;
    }


    /**
     * Gets the USER value for this ServiceProviders.
     * 
     * @return USER
     */
    public java.lang.String getUSER() {
        return USER;
    }


    /**
     * Sets the USER value for this ServiceProviders.
     * 
     * @param USER
     */
    public void setUSER(java.lang.String USER) {
        this.USER = USER;
    }


    /**
     * Gets the callingSuccess value for this ServiceProviders.
     * 
     * @return callingSuccess
     */
    public java.lang.Object getCallingSuccess() {
        return callingSuccess;
    }


    /**
     * Sets the callingSuccess value for this ServiceProviders.
     * 
     * @param callingSuccess
     */
    public void setCallingSuccess(java.lang.Object callingSuccess) {
        this.callingSuccess = callingSuccess;
    }


    /**
     * Gets the callingFailure value for this ServiceProviders.
     * 
     * @return callingFailure
     */
    public cantv.arquitectura.asc.contratos.exceptions.SystemException getCallingFailure() {
        return callingFailure;
    }


    /**
     * Sets the callingFailure value for this ServiceProviders.
     * 
     * @param callingFailure
     */
    public void setCallingFailure(cantv.arquitectura.asc.contratos.exceptions.SystemException callingFailure) {
        this.callingFailure = callingFailure;
    }


    /**
     * Gets the HISTNUMTIMEOUTS value for this ServiceProviders.
     * 
     * @return HISTNUMTIMEOUTS
     */
    public long getHISTNUMTIMEOUTS() {
        return HISTNUMTIMEOUTS;
    }


    /**
     * Sets the HISTNUMTIMEOUTS value for this ServiceProviders.
     * 
     * @param HISTNUMTIMEOUTS
     */
    public void setHISTNUMTIMEOUTS(long HISTNUMTIMEOUTS) {
        this.HISTNUMTIMEOUTS = HISTNUMTIMEOUTS;
    }


    /**
     * Gets the TEXTERROR value for this ServiceProviders.
     * 
     * @return TEXTERROR
     */
    public java.lang.String getTEXTERROR() {
        return TEXTERROR;
    }


    /**
     * Sets the TEXTERROR value for this ServiceProviders.
     * 
     * @param TEXTERROR
     */
    public void setTEXTERROR(java.lang.String TEXTERROR) {
        this.TEXTERROR = TEXTERROR;
    }


    /**
     * Gets the FAULTS value for this ServiceProviders.
     * 
     * @return FAULTS
     */
    public long getFAULTS() {
        return FAULTS;
    }


    /**
     * Sets the FAULTS value for this ServiceProviders.
     * 
     * @param FAULTS
     */
    public void setFAULTS(long FAULTS) {
        this.FAULTS = FAULTS;
    }


    /**
     * Gets the MINANSWERINGTIME value for this ServiceProviders.
     * 
     * @return MINANSWERINGTIME
     */
    public long getMINANSWERINGTIME() {
        return MINANSWERINGTIME;
    }


    /**
     * Sets the MINANSWERINGTIME value for this ServiceProviders.
     * 
     * @param MINANSWERINGTIME
     */
    public void setMINANSWERINGTIME(long MINANSWERINGTIME) {
        this.MINANSWERINGTIME = MINANSWERINGTIME;
    }


    /**
     * Gets the NAME value for this ServiceProviders.
     * 
     * @return NAME
     */
    public java.lang.String getNAME() {
        return NAME;
    }


    /**
     * Sets the NAME value for this ServiceProviders.
     * 
     * @param NAME
     */
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }


    /**
     * Gets the HISTCALLS value for this ServiceProviders.
     * 
     * @return HISTCALLS
     */
    public long getHISTCALLS() {
        return HISTCALLS;
    }


    /**
     * Sets the HISTCALLS value for this ServiceProviders.
     * 
     * @param HISTCALLS
     */
    public void setHISTCALLS(long HISTCALLS) {
        this.HISTCALLS = HISTCALLS;
    }


    /**
     * Gets the LASTGOODANSWERINGTIME value for this ServiceProviders.
     * 
     * @return LASTGOODANSWERINGTIME
     */
    public java.util.Calendar getLASTGOODANSWERINGTIME() {
        return LASTGOODANSWERINGTIME;
    }


    /**
     * Sets the LASTGOODANSWERINGTIME value for this ServiceProviders.
     * 
     * @param LASTGOODANSWERINGTIME
     */
    public void setLASTGOODANSWERINGTIME(java.util.Calendar LASTGOODANSWERINGTIME) {
        this.LASTGOODANSWERINGTIME = LASTGOODANSWERINGTIME;
    }


    /**
     * Gets the PASSWORD value for this ServiceProviders.
     * 
     * @return PASSWORD
     */
    public java.lang.String getPASSWORD() {
        return PASSWORD;
    }


    /**
     * Sets the PASSWORD value for this ServiceProviders.
     * 
     * @param PASSWORD
     */
    public void setPASSWORD(java.lang.String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }


    /**
     * Gets the NUMFAILURESFORERROR value for this ServiceProviders.
     * 
     * @return NUMFAILURESFORERROR
     */
    public long getNUMFAILURESFORERROR() {
        return NUMFAILURESFORERROR;
    }


    /**
     * Sets the NUMFAILURESFORERROR value for this ServiceProviders.
     * 
     * @param NUMFAILURESFORERROR
     */
    public void setNUMFAILURESFORERROR(long NUMFAILURESFORERROR) {
        this.NUMFAILURESFORERROR = NUMFAILURESFORERROR;
    }


    /**
     * Gets the HISTMINANSWERINGTIME value for this ServiceProviders.
     * 
     * @return HISTMINANSWERINGTIME
     */
    public long getHISTMINANSWERINGTIME() {
        return HISTMINANSWERINGTIME;
    }


    /**
     * Sets the HISTMINANSWERINGTIME value for this ServiceProviders.
     * 
     * @param HISTMINANSWERINGTIME
     */
    public void setHISTMINANSWERINGTIME(long HISTMINANSWERINGTIME) {
        this.HISTMINANSWERINGTIME = HISTMINANSWERINGTIME;
    }


    /**
     * Gets the CONTINUOUSFAILURES value for this ServiceProviders.
     * 
     * @return CONTINUOUSFAILURES
     */
    public long getCONTINUOUSFAILURES() {
        return CONTINUOUSFAILURES;
    }


    /**
     * Sets the CONTINUOUSFAILURES value for this ServiceProviders.
     * 
     * @param CONTINUOUSFAILURES
     */
    public void setCONTINUOUSFAILURES(long CONTINUOUSFAILURES) {
        this.CONTINUOUSFAILURES = CONTINUOUSFAILURES;
    }


    /**
     * Gets the LASTGOODCALLINGTIME value for this ServiceProviders.
     * 
     * @return LASTGOODCALLINGTIME
     */
    public java.util.Calendar getLASTGOODCALLINGTIME() {
        return LASTGOODCALLINGTIME;
    }


    /**
     * Sets the LASTGOODCALLINGTIME value for this ServiceProviders.
     * 
     * @param LASTGOODCALLINGTIME
     */
    public void setLASTGOODCALLINGTIME(java.util.Calendar LASTGOODCALLINGTIME) {
        this.LASTGOODCALLINGTIME = LASTGOODCALLINGTIME;
    }


    /**
     * Gets the STATUS value for this ServiceProviders.
     * 
     * @return STATUS
     */
    public long getSTATUS() {
        return STATUS;
    }


    /**
     * Sets the STATUS value for this ServiceProviders.
     * 
     * @param STATUS
     */
    public void setSTATUS(long STATUS) {
        this.STATUS = STATUS;
    }


    /**
     * Gets the HISTFAULTS value for this ServiceProviders.
     * 
     * @return HISTFAULTS
     */
    public long getHISTFAULTS() {
        return HISTFAULTS;
    }


    /**
     * Sets the HISTFAULTS value for this ServiceProviders.
     * 
     * @param HISTFAULTS
     */
    public void setHISTFAULTS(long HISTFAULTS) {
        this.HISTFAULTS = HISTFAULTS;
    }


    /**
     * Gets the HISTMAXANSWERINGTIME value for this ServiceProviders.
     * 
     * @return HISTMAXANSWERINGTIME
     */
    public long getHISTMAXANSWERINGTIME() {
        return HISTMAXANSWERINGTIME;
    }


    /**
     * Sets the HISTMAXANSWERINGTIME value for this ServiceProviders.
     * 
     * @param HISTMAXANSWERINGTIME
     */
    public void setHISTMAXANSWERINGTIME(long HISTMAXANSWERINGTIME) {
        this.HISTMAXANSWERINGTIME = HISTMAXANSWERINGTIME;
    }


    /**
     * Gets the ENDPOINT value for this ServiceProviders.
     * 
     * @return ENDPOINT
     */
    public java.lang.String getENDPOINT() {
        return ENDPOINT;
    }


    /**
     * Sets the ENDPOINT value for this ServiceProviders.
     * 
     * @param ENDPOINT
     */
    public void setENDPOINT(java.lang.String ENDPOINT) {
        this.ENDPOINT = ENDPOINT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceProviders)) return false;
        ServiceProviders other = (ServiceProviders) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.TIMEOUT == other.getTIMEOUT() &&
            this.MAXANSWERINGTIME == other.getMAXANSWERINGTIME() &&
            this.CALLS == other.getCALLS() &&
            this.NUMTIMEOUTS == other.getNUMTIMEOUTS() &&
            this.CALLSOK == other.getCALLSOK() &&
            ((this.USER==null && other.getUSER()==null) || 
             (this.USER!=null &&
              this.USER.equals(other.getUSER()))) &&
            ((this.callingSuccess==null && other.getCallingSuccess()==null) || 
             (this.callingSuccess!=null &&
              this.callingSuccess.equals(other.getCallingSuccess()))) &&
            ((this.callingFailure==null && other.getCallingFailure()==null) || 
             (this.callingFailure!=null &&
              this.callingFailure.equals(other.getCallingFailure()))) &&
            this.HISTNUMTIMEOUTS == other.getHISTNUMTIMEOUTS() &&
            ((this.TEXTERROR==null && other.getTEXTERROR()==null) || 
             (this.TEXTERROR!=null &&
              this.TEXTERROR.equals(other.getTEXTERROR()))) &&
            this.FAULTS == other.getFAULTS() &&
            this.MINANSWERINGTIME == other.getMINANSWERINGTIME() &&
            ((this.NAME==null && other.getNAME()==null) || 
             (this.NAME!=null &&
              this.NAME.equals(other.getNAME()))) &&
            this.HISTCALLS == other.getHISTCALLS() &&
            ((this.LASTGOODANSWERINGTIME==null && other.getLASTGOODANSWERINGTIME()==null) || 
             (this.LASTGOODANSWERINGTIME!=null &&
              this.LASTGOODANSWERINGTIME.equals(other.getLASTGOODANSWERINGTIME()))) &&
            ((this.PASSWORD==null && other.getPASSWORD()==null) || 
             (this.PASSWORD!=null &&
              this.PASSWORD.equals(other.getPASSWORD()))) &&
            this.NUMFAILURESFORERROR == other.getNUMFAILURESFORERROR() &&
            this.HISTMINANSWERINGTIME == other.getHISTMINANSWERINGTIME() &&
            this.CONTINUOUSFAILURES == other.getCONTINUOUSFAILURES() &&
            ((this.LASTGOODCALLINGTIME==null && other.getLASTGOODCALLINGTIME()==null) || 
             (this.LASTGOODCALLINGTIME!=null &&
              this.LASTGOODCALLINGTIME.equals(other.getLASTGOODCALLINGTIME()))) &&
            this.STATUS == other.getSTATUS() &&
            this.HISTFAULTS == other.getHISTFAULTS() &&
            this.HISTMAXANSWERINGTIME == other.getHISTMAXANSWERINGTIME() &&
            ((this.ENDPOINT==null && other.getENDPOINT()==null) || 
             (this.ENDPOINT!=null &&
              this.ENDPOINT.equals(other.getENDPOINT())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getTIMEOUT();
        _hashCode += new Long(getMAXANSWERINGTIME()).hashCode();
        _hashCode += new Long(getCALLS()).hashCode();
        _hashCode += new Long(getNUMTIMEOUTS()).hashCode();
        _hashCode += new Long(getCALLSOK()).hashCode();
        if (getUSER() != null) {
            _hashCode += getUSER().hashCode();
        }
        if (getCallingSuccess() != null) {
            _hashCode += getCallingSuccess().hashCode();
        }
        if (getCallingFailure() != null) {
            _hashCode += getCallingFailure().hashCode();
        }
        _hashCode += new Long(getHISTNUMTIMEOUTS()).hashCode();
        if (getTEXTERROR() != null) {
            _hashCode += getTEXTERROR().hashCode();
        }
        _hashCode += new Long(getFAULTS()).hashCode();
        _hashCode += new Long(getMINANSWERINGTIME()).hashCode();
        if (getNAME() != null) {
            _hashCode += getNAME().hashCode();
        }
        _hashCode += new Long(getHISTCALLS()).hashCode();
        if (getLASTGOODANSWERINGTIME() != null) {
            _hashCode += getLASTGOODANSWERINGTIME().hashCode();
        }
        if (getPASSWORD() != null) {
            _hashCode += getPASSWORD().hashCode();
        }
        _hashCode += new Long(getNUMFAILURESFORERROR()).hashCode();
        _hashCode += new Long(getHISTMINANSWERINGTIME()).hashCode();
        _hashCode += new Long(getCONTINUOUSFAILURES()).hashCode();
        if (getLASTGOODCALLINGTIME() != null) {
            _hashCode += getLASTGOODCALLINGTIME().hashCode();
        }
        _hashCode += new Long(getSTATUS()).hashCode();
        _hashCode += new Long(getHISTFAULTS()).hashCode();
        _hashCode += new Long(getHISTMAXANSWERINGTIME()).hashCode();
        if (getENDPOINT() != null) {
            _hashCode += getENDPOINT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceProviders.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://UtilsClass", "ServiceProviders"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TIMEOUT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "TIMEOUT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MAXANSWERINGTIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "MAXANSWERINGTIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CALLS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "CALLS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NUMTIMEOUTS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "NUMTIMEOUTS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CALLSOK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "CALLSOK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("USER");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "USER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingSuccess");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "callingSuccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingFailure");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "callingFailure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://exceptions.contratos.asc.arquitectura.cantv", "SystemException"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HISTNUMTIMEOUTS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "HISTNUMTIMEOUTS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TEXTERROR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "TEXTERROR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FAULTS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "FAULTS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MINANSWERINGTIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "MINANSWERINGTIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HISTCALLS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "HISTCALLS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LASTGOODANSWERINGTIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "LASTGOODANSWERINGTIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PASSWORD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "PASSWORD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NUMFAILURESFORERROR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "NUMFAILURESFORERROR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HISTMINANSWERINGTIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "HISTMINANSWERINGTIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONTINUOUSFAILURES");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "CONTINUOUSFAILURES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LASTGOODCALLINGTIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "LASTGOODCALLINGTIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STATUS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "STATUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HISTFAULTS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "HISTFAULTS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HISTMAXANSWERINGTIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "HISTMAXANSWERINGTIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ENDPOINT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "ENDPOINT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
