/**
 * ServiceControlReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package UtilsClass;

public class ServiceControlReturn  implements java.io.Serializable {
    private long MAXANSWERINGTIME;

    private long CALLS;

    private java.util.Calendar CALLINGTIME;

    private java.lang.String SUBGROUP;

    private long HISTMAXCONCURRENTTHREADS;

    private java.lang.String TEXTERROR;

    private long FAULTS;

    private long MINANSWERINGTIME;

    private java.lang.String GROUP;

    private long HISTCALLS;

    private java.util.Calendar RESETTIME;

    private java.util.Calendar RUNTIME;

    private java.lang.String VERSION;

    private long HISTMINANSWERINGTIME;

    private long MAXCONCURRENTTHREADS;

    private long LASTANSWERINGTIME;

    private java.lang.String SERVICENAME;

    private UtilsClass.ServiceProviders[] PROVIDERS;

    private long STATUS;

    private java.util.Calendar LOGCHANGETIME;

    private boolean LOG;

    private long CONCURRENTTHREADS;

    private java.util.Calendar ANSWERINGTIME;

    private long HISTFAULTS;

    private long HISTMAXANSWERINGTIME;

    public ServiceControlReturn() {
    }

    public ServiceControlReturn(
           long MAXANSWERINGTIME,
           long CALLS,
           java.util.Calendar CALLINGTIME,
           java.lang.String SUBGROUP,
           long HISTMAXCONCURRENTTHREADS,
           java.lang.String TEXTERROR,
           long FAULTS,
           long MINANSWERINGTIME,
           java.lang.String GROUP,
           long HISTCALLS,
           java.util.Calendar RESETTIME,
           java.util.Calendar RUNTIME,
           java.lang.String VERSION,
           long HISTMINANSWERINGTIME,
           long MAXCONCURRENTTHREADS,
           long LASTANSWERINGTIME,
           java.lang.String SERVICENAME,
           UtilsClass.ServiceProviders[] PROVIDERS,
           long STATUS,
           java.util.Calendar LOGCHANGETIME,
           boolean LOG,
           long CONCURRENTTHREADS,
           java.util.Calendar ANSWERINGTIME,
           long HISTFAULTS,
           long HISTMAXANSWERINGTIME) {
           this.MAXANSWERINGTIME = MAXANSWERINGTIME;
           this.CALLS = CALLS;
           this.CALLINGTIME = CALLINGTIME;
           this.SUBGROUP = SUBGROUP;
           this.HISTMAXCONCURRENTTHREADS = HISTMAXCONCURRENTTHREADS;
           this.TEXTERROR = TEXTERROR;
           this.FAULTS = FAULTS;
           this.MINANSWERINGTIME = MINANSWERINGTIME;
           this.GROUP = GROUP;
           this.HISTCALLS = HISTCALLS;
           this.RESETTIME = RESETTIME;
           this.RUNTIME = RUNTIME;
           this.VERSION = VERSION;
           this.HISTMINANSWERINGTIME = HISTMINANSWERINGTIME;
           this.MAXCONCURRENTTHREADS = MAXCONCURRENTTHREADS;
           this.LASTANSWERINGTIME = LASTANSWERINGTIME;
           this.SERVICENAME = SERVICENAME;
           this.PROVIDERS = PROVIDERS;
           this.STATUS = STATUS;
           this.LOGCHANGETIME = LOGCHANGETIME;
           this.LOG = LOG;
           this.CONCURRENTTHREADS = CONCURRENTTHREADS;
           this.ANSWERINGTIME = ANSWERINGTIME;
           this.HISTFAULTS = HISTFAULTS;
           this.HISTMAXANSWERINGTIME = HISTMAXANSWERINGTIME;
    }


    /**
     * Gets the MAXANSWERINGTIME value for this ServiceControlReturn.
     * 
     * @return MAXANSWERINGTIME
     */
    public long getMAXANSWERINGTIME() {
        return MAXANSWERINGTIME;
    }


    /**
     * Sets the MAXANSWERINGTIME value for this ServiceControlReturn.
     * 
     * @param MAXANSWERINGTIME
     */
    public void setMAXANSWERINGTIME(long MAXANSWERINGTIME) {
        this.MAXANSWERINGTIME = MAXANSWERINGTIME;
    }


    /**
     * Gets the CALLS value for this ServiceControlReturn.
     * 
     * @return CALLS
     */
    public long getCALLS() {
        return CALLS;
    }


    /**
     * Sets the CALLS value for this ServiceControlReturn.
     * 
     * @param CALLS
     */
    public void setCALLS(long CALLS) {
        this.CALLS = CALLS;
    }


    /**
     * Gets the CALLINGTIME value for this ServiceControlReturn.
     * 
     * @return CALLINGTIME
     */
    public java.util.Calendar getCALLINGTIME() {
        return CALLINGTIME;
    }


    /**
     * Sets the CALLINGTIME value for this ServiceControlReturn.
     * 
     * @param CALLINGTIME
     */
    public void setCALLINGTIME(java.util.Calendar CALLINGTIME) {
        this.CALLINGTIME = CALLINGTIME;
    }


    /**
     * Gets the SUBGROUP value for this ServiceControlReturn.
     * 
     * @return SUBGROUP
     */
    public java.lang.String getSUBGROUP() {
        return SUBGROUP;
    }


    /**
     * Sets the SUBGROUP value for this ServiceControlReturn.
     * 
     * @param SUBGROUP
     */
    public void setSUBGROUP(java.lang.String SUBGROUP) {
        this.SUBGROUP = SUBGROUP;
    }


    /**
     * Gets the HISTMAXCONCURRENTTHREADS value for this ServiceControlReturn.
     * 
     * @return HISTMAXCONCURRENTTHREADS
     */
    public long getHISTMAXCONCURRENTTHREADS() {
        return HISTMAXCONCURRENTTHREADS;
    }


    /**
     * Sets the HISTMAXCONCURRENTTHREADS value for this ServiceControlReturn.
     * 
     * @param HISTMAXCONCURRENTTHREADS
     */
    public void setHISTMAXCONCURRENTTHREADS(long HISTMAXCONCURRENTTHREADS) {
        this.HISTMAXCONCURRENTTHREADS = HISTMAXCONCURRENTTHREADS;
    }


    /**
     * Gets the TEXTERROR value for this ServiceControlReturn.
     * 
     * @return TEXTERROR
     */
    public java.lang.String getTEXTERROR() {
        return TEXTERROR;
    }


    /**
     * Sets the TEXTERROR value for this ServiceControlReturn.
     * 
     * @param TEXTERROR
     */
    public void setTEXTERROR(java.lang.String TEXTERROR) {
        this.TEXTERROR = TEXTERROR;
    }


    /**
     * Gets the FAULTS value for this ServiceControlReturn.
     * 
     * @return FAULTS
     */
    public long getFAULTS() {
        return FAULTS;
    }


    /**
     * Sets the FAULTS value for this ServiceControlReturn.
     * 
     * @param FAULTS
     */
    public void setFAULTS(long FAULTS) {
        this.FAULTS = FAULTS;
    }


    /**
     * Gets the MINANSWERINGTIME value for this ServiceControlReturn.
     * 
     * @return MINANSWERINGTIME
     */
    public long getMINANSWERINGTIME() {
        return MINANSWERINGTIME;
    }


    /**
     * Sets the MINANSWERINGTIME value for this ServiceControlReturn.
     * 
     * @param MINANSWERINGTIME
     */
    public void setMINANSWERINGTIME(long MINANSWERINGTIME) {
        this.MINANSWERINGTIME = MINANSWERINGTIME;
    }


    /**
     * Gets the GROUP value for this ServiceControlReturn.
     * 
     * @return GROUP
     */
    public java.lang.String getGROUP() {
        return GROUP;
    }


    /**
     * Sets the GROUP value for this ServiceControlReturn.
     * 
     * @param GROUP
     */
    public void setGROUP(java.lang.String GROUP) {
        this.GROUP = GROUP;
    }


    /**
     * Gets the HISTCALLS value for this ServiceControlReturn.
     * 
     * @return HISTCALLS
     */
    public long getHISTCALLS() {
        return HISTCALLS;
    }


    /**
     * Sets the HISTCALLS value for this ServiceControlReturn.
     * 
     * @param HISTCALLS
     */
    public void setHISTCALLS(long HISTCALLS) {
        this.HISTCALLS = HISTCALLS;
    }


    /**
     * Gets the RESETTIME value for this ServiceControlReturn.
     * 
     * @return RESETTIME
     */
    public java.util.Calendar getRESETTIME() {
        return RESETTIME;
    }


    /**
     * Sets the RESETTIME value for this ServiceControlReturn.
     * 
     * @param RESETTIME
     */
    public void setRESETTIME(java.util.Calendar RESETTIME) {
        this.RESETTIME = RESETTIME;
    }


    /**
     * Gets the RUNTIME value for this ServiceControlReturn.
     * 
     * @return RUNTIME
     */
    public java.util.Calendar getRUNTIME() {
        return RUNTIME;
    }


    /**
     * Sets the RUNTIME value for this ServiceControlReturn.
     * 
     * @param RUNTIME
     */
    public void setRUNTIME(java.util.Calendar RUNTIME) {
        this.RUNTIME = RUNTIME;
    }


    /**
     * Gets the VERSION value for this ServiceControlReturn.
     * 
     * @return VERSION
     */
    public java.lang.String getVERSION() {
        return VERSION;
    }


    /**
     * Sets the VERSION value for this ServiceControlReturn.
     * 
     * @param VERSION
     */
    public void setVERSION(java.lang.String VERSION) {
        this.VERSION = VERSION;
    }


    /**
     * Gets the HISTMINANSWERINGTIME value for this ServiceControlReturn.
     * 
     * @return HISTMINANSWERINGTIME
     */
    public long getHISTMINANSWERINGTIME() {
        return HISTMINANSWERINGTIME;
    }


    /**
     * Sets the HISTMINANSWERINGTIME value for this ServiceControlReturn.
     * 
     * @param HISTMINANSWERINGTIME
     */
    public void setHISTMINANSWERINGTIME(long HISTMINANSWERINGTIME) {
        this.HISTMINANSWERINGTIME = HISTMINANSWERINGTIME;
    }


    /**
     * Gets the MAXCONCURRENTTHREADS value for this ServiceControlReturn.
     * 
     * @return MAXCONCURRENTTHREADS
     */
    public long getMAXCONCURRENTTHREADS() {
        return MAXCONCURRENTTHREADS;
    }


    /**
     * Sets the MAXCONCURRENTTHREADS value for this ServiceControlReturn.
     * 
     * @param MAXCONCURRENTTHREADS
     */
    public void setMAXCONCURRENTTHREADS(long MAXCONCURRENTTHREADS) {
        this.MAXCONCURRENTTHREADS = MAXCONCURRENTTHREADS;
    }


    /**
     * Gets the LASTANSWERINGTIME value for this ServiceControlReturn.
     * 
     * @return LASTANSWERINGTIME
     */
    public long getLASTANSWERINGTIME() {
        return LASTANSWERINGTIME;
    }


    /**
     * Sets the LASTANSWERINGTIME value for this ServiceControlReturn.
     * 
     * @param LASTANSWERINGTIME
     */
    public void setLASTANSWERINGTIME(long LASTANSWERINGTIME) {
        this.LASTANSWERINGTIME = LASTANSWERINGTIME;
    }


    /**
     * Gets the SERVICENAME value for this ServiceControlReturn.
     * 
     * @return SERVICENAME
     */
    public java.lang.String getSERVICENAME() {
        return SERVICENAME;
    }


    /**
     * Sets the SERVICENAME value for this ServiceControlReturn.
     * 
     * @param SERVICENAME
     */
    public void setSERVICENAME(java.lang.String SERVICENAME) {
        this.SERVICENAME = SERVICENAME;
    }


    /**
     * Gets the PROVIDERS value for this ServiceControlReturn.
     * 
     * @return PROVIDERS
     */
    public UtilsClass.ServiceProviders[] getPROVIDERS() {
        return PROVIDERS;
    }


    /**
     * Sets the PROVIDERS value for this ServiceControlReturn.
     * 
     * @param PROVIDERS
     */
    public void setPROVIDERS(UtilsClass.ServiceProviders[] PROVIDERS) {
        this.PROVIDERS = PROVIDERS;
    }


    /**
     * Gets the STATUS value for this ServiceControlReturn.
     * 
     * @return STATUS
     */
    public long getSTATUS() {
        return STATUS;
    }


    /**
     * Sets the STATUS value for this ServiceControlReturn.
     * 
     * @param STATUS
     */
    public void setSTATUS(long STATUS) {
        this.STATUS = STATUS;
    }


    /**
     * Gets the LOGCHANGETIME value for this ServiceControlReturn.
     * 
     * @return LOGCHANGETIME
     */
    public java.util.Calendar getLOGCHANGETIME() {
        return LOGCHANGETIME;
    }


    /**
     * Sets the LOGCHANGETIME value for this ServiceControlReturn.
     * 
     * @param LOGCHANGETIME
     */
    public void setLOGCHANGETIME(java.util.Calendar LOGCHANGETIME) {
        this.LOGCHANGETIME = LOGCHANGETIME;
    }


    /**
     * Gets the LOG value for this ServiceControlReturn.
     * 
     * @return LOG
     */
    public boolean isLOG() {
        return LOG;
    }


    /**
     * Sets the LOG value for this ServiceControlReturn.
     * 
     * @param LOG
     */
    public void setLOG(boolean LOG) {
        this.LOG = LOG;
    }


    /**
     * Gets the CONCURRENTTHREADS value for this ServiceControlReturn.
     * 
     * @return CONCURRENTTHREADS
     */
    public long getCONCURRENTTHREADS() {
        return CONCURRENTTHREADS;
    }


    /**
     * Sets the CONCURRENTTHREADS value for this ServiceControlReturn.
     * 
     * @param CONCURRENTTHREADS
     */
    public void setCONCURRENTTHREADS(long CONCURRENTTHREADS) {
        this.CONCURRENTTHREADS = CONCURRENTTHREADS;
    }


    /**
     * Gets the ANSWERINGTIME value for this ServiceControlReturn.
     * 
     * @return ANSWERINGTIME
     */
    public java.util.Calendar getANSWERINGTIME() {
        return ANSWERINGTIME;
    }


    /**
     * Sets the ANSWERINGTIME value for this ServiceControlReturn.
     * 
     * @param ANSWERINGTIME
     */
    public void setANSWERINGTIME(java.util.Calendar ANSWERINGTIME) {
        this.ANSWERINGTIME = ANSWERINGTIME;
    }


    /**
     * Gets the HISTFAULTS value for this ServiceControlReturn.
     * 
     * @return HISTFAULTS
     */
    public long getHISTFAULTS() {
        return HISTFAULTS;
    }


    /**
     * Sets the HISTFAULTS value for this ServiceControlReturn.
     * 
     * @param HISTFAULTS
     */
    public void setHISTFAULTS(long HISTFAULTS) {
        this.HISTFAULTS = HISTFAULTS;
    }


    /**
     * Gets the HISTMAXANSWERINGTIME value for this ServiceControlReturn.
     * 
     * @return HISTMAXANSWERINGTIME
     */
    public long getHISTMAXANSWERINGTIME() {
        return HISTMAXANSWERINGTIME;
    }


    /**
     * Sets the HISTMAXANSWERINGTIME value for this ServiceControlReturn.
     * 
     * @param HISTMAXANSWERINGTIME
     */
    public void setHISTMAXANSWERINGTIME(long HISTMAXANSWERINGTIME) {
        this.HISTMAXANSWERINGTIME = HISTMAXANSWERINGTIME;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceControlReturn)) return false;
        ServiceControlReturn other = (ServiceControlReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.MAXANSWERINGTIME == other.getMAXANSWERINGTIME() &&
            this.CALLS == other.getCALLS() &&
            ((this.CALLINGTIME==null && other.getCALLINGTIME()==null) || 
             (this.CALLINGTIME!=null &&
              this.CALLINGTIME.equals(other.getCALLINGTIME()))) &&
            ((this.SUBGROUP==null && other.getSUBGROUP()==null) || 
             (this.SUBGROUP!=null &&
              this.SUBGROUP.equals(other.getSUBGROUP()))) &&
            this.HISTMAXCONCURRENTTHREADS == other.getHISTMAXCONCURRENTTHREADS() &&
            ((this.TEXTERROR==null && other.getTEXTERROR()==null) || 
             (this.TEXTERROR!=null &&
              this.TEXTERROR.equals(other.getTEXTERROR()))) &&
            this.FAULTS == other.getFAULTS() &&
            this.MINANSWERINGTIME == other.getMINANSWERINGTIME() &&
            ((this.GROUP==null && other.getGROUP()==null) || 
             (this.GROUP!=null &&
              this.GROUP.equals(other.getGROUP()))) &&
            this.HISTCALLS == other.getHISTCALLS() &&
            ((this.RESETTIME==null && other.getRESETTIME()==null) || 
             (this.RESETTIME!=null &&
              this.RESETTIME.equals(other.getRESETTIME()))) &&
            ((this.RUNTIME==null && other.getRUNTIME()==null) || 
             (this.RUNTIME!=null &&
              this.RUNTIME.equals(other.getRUNTIME()))) &&
            ((this.VERSION==null && other.getVERSION()==null) || 
             (this.VERSION!=null &&
              this.VERSION.equals(other.getVERSION()))) &&
            this.HISTMINANSWERINGTIME == other.getHISTMINANSWERINGTIME() &&
            this.MAXCONCURRENTTHREADS == other.getMAXCONCURRENTTHREADS() &&
            this.LASTANSWERINGTIME == other.getLASTANSWERINGTIME() &&
            ((this.SERVICENAME==null && other.getSERVICENAME()==null) || 
             (this.SERVICENAME!=null &&
              this.SERVICENAME.equals(other.getSERVICENAME()))) &&
            ((this.PROVIDERS==null && other.getPROVIDERS()==null) || 
             (this.PROVIDERS!=null &&
              java.util.Arrays.equals(this.PROVIDERS, other.getPROVIDERS()))) &&
            this.STATUS == other.getSTATUS() &&
            ((this.LOGCHANGETIME==null && other.getLOGCHANGETIME()==null) || 
             (this.LOGCHANGETIME!=null &&
              this.LOGCHANGETIME.equals(other.getLOGCHANGETIME()))) &&
            this.LOG == other.isLOG() &&
            this.CONCURRENTTHREADS == other.getCONCURRENTTHREADS() &&
            ((this.ANSWERINGTIME==null && other.getANSWERINGTIME()==null) || 
             (this.ANSWERINGTIME!=null &&
              this.ANSWERINGTIME.equals(other.getANSWERINGTIME()))) &&
            this.HISTFAULTS == other.getHISTFAULTS() &&
            this.HISTMAXANSWERINGTIME == other.getHISTMAXANSWERINGTIME();
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
        _hashCode += new Long(getMAXANSWERINGTIME()).hashCode();
        _hashCode += new Long(getCALLS()).hashCode();
        if (getCALLINGTIME() != null) {
            _hashCode += getCALLINGTIME().hashCode();
        }
        if (getSUBGROUP() != null) {
            _hashCode += getSUBGROUP().hashCode();
        }
        _hashCode += new Long(getHISTMAXCONCURRENTTHREADS()).hashCode();
        if (getTEXTERROR() != null) {
            _hashCode += getTEXTERROR().hashCode();
        }
        _hashCode += new Long(getFAULTS()).hashCode();
        _hashCode += new Long(getMINANSWERINGTIME()).hashCode();
        if (getGROUP() != null) {
            _hashCode += getGROUP().hashCode();
        }
        _hashCode += new Long(getHISTCALLS()).hashCode();
        if (getRESETTIME() != null) {
            _hashCode += getRESETTIME().hashCode();
        }
        if (getRUNTIME() != null) {
            _hashCode += getRUNTIME().hashCode();
        }
        if (getVERSION() != null) {
            _hashCode += getVERSION().hashCode();
        }
        _hashCode += new Long(getHISTMINANSWERINGTIME()).hashCode();
        _hashCode += new Long(getMAXCONCURRENTTHREADS()).hashCode();
        _hashCode += new Long(getLASTANSWERINGTIME()).hashCode();
        if (getSERVICENAME() != null) {
            _hashCode += getSERVICENAME().hashCode();
        }
        if (getPROVIDERS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPROVIDERS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPROVIDERS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getSTATUS()).hashCode();
        if (getLOGCHANGETIME() != null) {
            _hashCode += getLOGCHANGETIME().hashCode();
        }
        _hashCode += (isLOG() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getCONCURRENTTHREADS()).hashCode();
        if (getANSWERINGTIME() != null) {
            _hashCode += getANSWERINGTIME().hashCode();
        }
        _hashCode += new Long(getHISTFAULTS()).hashCode();
        _hashCode += new Long(getHISTMAXANSWERINGTIME()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceControlReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://UtilsClass", "ServiceControlReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("CALLINGTIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "CALLINGTIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SUBGROUP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "SUBGROUP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HISTMAXCONCURRENTTHREADS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "HISTMAXCONCURRENTTHREADS"));
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
        elemField.setFieldName("GROUP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "GROUP"));
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
        elemField.setFieldName("RESETTIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "RESETTIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RUNTIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "RUNTIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VERSION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "VERSION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HISTMINANSWERINGTIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "HISTMINANSWERINGTIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MAXCONCURRENTTHREADS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "MAXCONCURRENTTHREADS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LASTANSWERINGTIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "LASTANSWERINGTIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SERVICENAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "SERVICENAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PROVIDERS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "PROVIDERS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://UtilsClass", "ServiceProviders"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ObtenerTipoTarifa", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STATUS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "STATUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOGCHANGETIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "LOGCHANGETIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "LOG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONCURRENTTHREADS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "CONCURRENTTHREADS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ANSWERINGTIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://UtilsClass", "ANSWERINGTIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
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
