// ORM class for FLIGHT.SNIFFERCABINS
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FLIGHT_SNIFFERCABINS extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private java.math.BigDecimal ID;
  public java.math.BigDecimal get_ID() {
    return ID;
  }
  public void set_ID(java.math.BigDecimal ID) {
    this.ID = ID;
  }
  public FLIGHT_SNIFFERCABINS with_ID(java.math.BigDecimal ID) {
    this.ID = ID;
    return this;
  }
  private String FLIGHT_NO;
  public String get_FLIGHT_NO() {
    return FLIGHT_NO;
  }
  public void set_FLIGHT_NO(String FLIGHT_NO) {
    this.FLIGHT_NO = FLIGHT_NO;
  }
  public FLIGHT_SNIFFERCABINS with_FLIGHT_NO(String FLIGHT_NO) {
    this.FLIGHT_NO = FLIGHT_NO;
    return this;
  }
  private String DEPDATE;
  public String get_DEPDATE() {
    return DEPDATE;
  }
  public void set_DEPDATE(String DEPDATE) {
    this.DEPDATE = DEPDATE;
  }
  public FLIGHT_SNIFFERCABINS with_DEPDATE(String DEPDATE) {
    this.DEPDATE = DEPDATE;
    return this;
  }
  private java.math.BigDecimal SUBMITTOFLIGHT;
  public java.math.BigDecimal get_SUBMITTOFLIGHT() {
    return SUBMITTOFLIGHT;
  }
  public void set_SUBMITTOFLIGHT(java.math.BigDecimal SUBMITTOFLIGHT) {
    this.SUBMITTOFLIGHT = SUBMITTOFLIGHT;
  }
  public FLIGHT_SNIFFERCABINS with_SUBMITTOFLIGHT(java.math.BigDecimal SUBMITTOFLIGHT) {
    this.SUBMITTOFLIGHT = SUBMITTOFLIGHT;
    return this;
  }
  private String SUBSEGMENTS;
  public String get_SUBSEGMENTS() {
    return SUBSEGMENTS;
  }
  public void set_SUBSEGMENTS(String SUBSEGMENTS) {
    this.SUBSEGMENTS = SUBSEGMENTS;
  }
  public FLIGHT_SNIFFERCABINS with_SUBSEGMENTS(String SUBSEGMENTS) {
    this.SUBSEGMENTS = SUBSEGMENTS;
    return this;
  }
  private String CABINVALUE;
  public String get_CABINVALUE() {
    return CABINVALUE;
  }
  public void set_CABINVALUE(String CABINVALUE) {
    this.CABINVALUE = CABINVALUE;
  }
  public FLIGHT_SNIFFERCABINS with_CABINVALUE(String CABINVALUE) {
    this.CABINVALUE = CABINVALUE;
    return this;
  }
  private String CABINSTATUS;
  public String get_CABINSTATUS() {
    return CABINSTATUS;
  }
  public void set_CABINSTATUS(String CABINSTATUS) {
    this.CABINSTATUS = CABINSTATUS;
  }
  public FLIGHT_SNIFFERCABINS with_CABINSTATUS(String CABINSTATUS) {
    this.CABINSTATUS = CABINSTATUS;
    return this;
  }
  private String CABINSTATUS_CA;
  public String get_CABINSTATUS_CA() {
    return CABINSTATUS_CA;
  }
  public void set_CABINSTATUS_CA(String CABINSTATUS_CA) {
    this.CABINSTATUS_CA = CABINSTATUS_CA;
  }
  public FLIGHT_SNIFFERCABINS with_CABINSTATUS_CA(String CABINSTATUS_CA) {
    this.CABINSTATUS_CA = CABINSTATUS_CA;
    return this;
  }
  private String CABINSTATUS_CZ;
  public String get_CABINSTATUS_CZ() {
    return CABINSTATUS_CZ;
  }
  public void set_CABINSTATUS_CZ(String CABINSTATUS_CZ) {
    this.CABINSTATUS_CZ = CABINSTATUS_CZ;
  }
  public FLIGHT_SNIFFERCABINS with_CABINSTATUS_CZ(String CABINSTATUS_CZ) {
    this.CABINSTATUS_CZ = CABINSTATUS_CZ;
    return this;
  }
  private java.math.BigDecimal CABINOPENSIZE;
  public java.math.BigDecimal get_CABINOPENSIZE() {
    return CABINOPENSIZE;
  }
  public void set_CABINOPENSIZE(java.math.BigDecimal CABINOPENSIZE) {
    this.CABINOPENSIZE = CABINOPENSIZE;
  }
  public FLIGHT_SNIFFERCABINS with_CABINOPENSIZE(java.math.BigDecimal CABINOPENSIZE) {
    this.CABINOPENSIZE = CABINOPENSIZE;
    return this;
  }
  private java.math.BigDecimal CABINBOOKSIZE;
  public java.math.BigDecimal get_CABINBOOKSIZE() {
    return CABINBOOKSIZE;
  }
  public void set_CABINBOOKSIZE(java.math.BigDecimal CABINBOOKSIZE) {
    this.CABINBOOKSIZE = CABINBOOKSIZE;
  }
  public FLIGHT_SNIFFERCABINS with_CABINBOOKSIZE(java.math.BigDecimal CABINBOOKSIZE) {
    this.CABINBOOKSIZE = CABINBOOKSIZE;
    return this;
  }
  private java.math.BigDecimal OPENSIZEMAX;
  public java.math.BigDecimal get_OPENSIZEMAX() {
    return OPENSIZEMAX;
  }
  public void set_OPENSIZEMAX(java.math.BigDecimal OPENSIZEMAX) {
    this.OPENSIZEMAX = OPENSIZEMAX;
  }
  public FLIGHT_SNIFFERCABINS with_OPENSIZEMAX(java.math.BigDecimal OPENSIZEMAX) {
    this.OPENSIZEMAX = OPENSIZEMAX;
    return this;
  }
  private java.math.BigDecimal BOOKSIZEMAX;
  public java.math.BigDecimal get_BOOKSIZEMAX() {
    return BOOKSIZEMAX;
  }
  public void set_BOOKSIZEMAX(java.math.BigDecimal BOOKSIZEMAX) {
    this.BOOKSIZEMAX = BOOKSIZEMAX;
  }
  public FLIGHT_SNIFFERCABINS with_BOOKSIZEMAX(java.math.BigDecimal BOOKSIZEMAX) {
    this.BOOKSIZEMAX = BOOKSIZEMAX;
    return this;
  }
  private String SUPRISEDATEVALUE;
  public String get_SUPRISEDATEVALUE() {
    return SUPRISEDATEVALUE;
  }
  public void set_SUPRISEDATEVALUE(String SUPRISEDATEVALUE) {
    this.SUPRISEDATEVALUE = SUPRISEDATEVALUE;
  }
  public FLIGHT_SNIFFERCABINS with_SUPRISEDATEVALUE(String SUPRISEDATEVALUE) {
    this.SUPRISEDATEVALUE = SUPRISEDATEVALUE;
    return this;
  }
  private String NORMALDATEVALUE;
  public String get_NORMALDATEVALUE() {
    return NORMALDATEVALUE;
  }
  public void set_NORMALDATEVALUE(String NORMALDATEVALUE) {
    this.NORMALDATEVALUE = NORMALDATEVALUE;
  }
  public FLIGHT_SNIFFERCABINS with_NORMALDATEVALUE(String NORMALDATEVALUE) {
    this.NORMALDATEVALUE = NORMALDATEVALUE;
    return this;
  }
  private java.math.BigDecimal CABIN_CA_OPENSIZE;
  public java.math.BigDecimal get_CABIN_CA_OPENSIZE() {
    return CABIN_CA_OPENSIZE;
  }
  public void set_CABIN_CA_OPENSIZE(java.math.BigDecimal CABIN_CA_OPENSIZE) {
    this.CABIN_CA_OPENSIZE = CABIN_CA_OPENSIZE;
  }
  public FLIGHT_SNIFFERCABINS with_CABIN_CA_OPENSIZE(java.math.BigDecimal CABIN_CA_OPENSIZE) {
    this.CABIN_CA_OPENSIZE = CABIN_CA_OPENSIZE;
    return this;
  }
  private java.math.BigDecimal CABIN_CZ_OPENSIZE;
  public java.math.BigDecimal get_CABIN_CZ_OPENSIZE() {
    return CABIN_CZ_OPENSIZE;
  }
  public void set_CABIN_CZ_OPENSIZE(java.math.BigDecimal CABIN_CZ_OPENSIZE) {
    this.CABIN_CZ_OPENSIZE = CABIN_CZ_OPENSIZE;
  }
  public FLIGHT_SNIFFERCABINS with_CABIN_CZ_OPENSIZE(java.math.BigDecimal CABIN_CZ_OPENSIZE) {
    this.CABIN_CZ_OPENSIZE = CABIN_CZ_OPENSIZE;
    return this;
  }
  private String INSERTTIME;
  public String get_INSERTTIME() {
    return INSERTTIME;
  }
  public void set_INSERTTIME(String INSERTTIME) {
    this.INSERTTIME = INSERTTIME;
  }
  public FLIGHT_SNIFFERCABINS with_INSERTTIME(String INSERTTIME) {
    this.INSERTTIME = INSERTTIME;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof FLIGHT_SNIFFERCABINS)) {
      return false;
    }
    FLIGHT_SNIFFERCABINS that = (FLIGHT_SNIFFERCABINS) o;
    boolean equal = true;
    equal = equal && (this.ID == null ? that.ID == null : this.ID.equals(that.ID));
    equal = equal && (this.FLIGHT_NO == null ? that.FLIGHT_NO == null : this.FLIGHT_NO.equals(that.FLIGHT_NO));
    equal = equal && (this.DEPDATE == null ? that.DEPDATE == null : this.DEPDATE.equals(that.DEPDATE));
    equal = equal && (this.SUBMITTOFLIGHT == null ? that.SUBMITTOFLIGHT == null : this.SUBMITTOFLIGHT.equals(that.SUBMITTOFLIGHT));
    equal = equal && (this.SUBSEGMENTS == null ? that.SUBSEGMENTS == null : this.SUBSEGMENTS.equals(that.SUBSEGMENTS));
    equal = equal && (this.CABINVALUE == null ? that.CABINVALUE == null : this.CABINVALUE.equals(that.CABINVALUE));
    equal = equal && (this.CABINSTATUS == null ? that.CABINSTATUS == null : this.CABINSTATUS.equals(that.CABINSTATUS));
    equal = equal && (this.CABINSTATUS_CA == null ? that.CABINSTATUS_CA == null : this.CABINSTATUS_CA.equals(that.CABINSTATUS_CA));
    equal = equal && (this.CABINSTATUS_CZ == null ? that.CABINSTATUS_CZ == null : this.CABINSTATUS_CZ.equals(that.CABINSTATUS_CZ));
    equal = equal && (this.CABINOPENSIZE == null ? that.CABINOPENSIZE == null : this.CABINOPENSIZE.equals(that.CABINOPENSIZE));
    equal = equal && (this.CABINBOOKSIZE == null ? that.CABINBOOKSIZE == null : this.CABINBOOKSIZE.equals(that.CABINBOOKSIZE));
    equal = equal && (this.OPENSIZEMAX == null ? that.OPENSIZEMAX == null : this.OPENSIZEMAX.equals(that.OPENSIZEMAX));
    equal = equal && (this.BOOKSIZEMAX == null ? that.BOOKSIZEMAX == null : this.BOOKSIZEMAX.equals(that.BOOKSIZEMAX));
    equal = equal && (this.SUPRISEDATEVALUE == null ? that.SUPRISEDATEVALUE == null : this.SUPRISEDATEVALUE.equals(that.SUPRISEDATEVALUE));
    equal = equal && (this.NORMALDATEVALUE == null ? that.NORMALDATEVALUE == null : this.NORMALDATEVALUE.equals(that.NORMALDATEVALUE));
    equal = equal && (this.CABIN_CA_OPENSIZE == null ? that.CABIN_CA_OPENSIZE == null : this.CABIN_CA_OPENSIZE.equals(that.CABIN_CA_OPENSIZE));
    equal = equal && (this.CABIN_CZ_OPENSIZE == null ? that.CABIN_CZ_OPENSIZE == null : this.CABIN_CZ_OPENSIZE.equals(that.CABIN_CZ_OPENSIZE));
    equal = equal && (this.INSERTTIME == null ? that.INSERTTIME == null : this.INSERTTIME.equals(that.INSERTTIME));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.FLIGHT_NO = JdbcWritableBridge.readString(2, __dbResults);
    this.DEPDATE = JdbcWritableBridge.readString(3, __dbResults);
    this.SUBMITTOFLIGHT = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.SUBSEGMENTS = JdbcWritableBridge.readString(5, __dbResults);
    this.CABINVALUE = JdbcWritableBridge.readString(6, __dbResults);
    this.CABINSTATUS = JdbcWritableBridge.readString(7, __dbResults);
    this.CABINSTATUS_CA = JdbcWritableBridge.readString(8, __dbResults);
    this.CABINSTATUS_CZ = JdbcWritableBridge.readString(9, __dbResults);
    this.CABINOPENSIZE = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.CABINBOOKSIZE = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.OPENSIZEMAX = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.BOOKSIZEMAX = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.SUPRISEDATEVALUE = JdbcWritableBridge.readString(14, __dbResults);
    this.NORMALDATEVALUE = JdbcWritableBridge.readString(15, __dbResults);
    this.CABIN_CA_OPENSIZE = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.CABIN_CZ_OPENSIZE = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.INSERTTIME = JdbcWritableBridge.readString(18, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(FLIGHT_NO, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DEPDATE, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SUBMITTOFLIGHT, 4 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(SUBSEGMENTS, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CABINVALUE, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CABINSTATUS, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CABINSTATUS_CA, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CABINSTATUS_CZ, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CABINOPENSIZE, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CABINBOOKSIZE, 11 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(OPENSIZEMAX, 12 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BOOKSIZEMAX, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(SUPRISEDATEVALUE, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(NORMALDATEVALUE, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CABIN_CA_OPENSIZE, 16 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CABIN_CZ_OPENSIZE, 17 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(INSERTTIME, 18 + __off, 12, __dbStmt);
    return 18;
  }
  public void readFields(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.ID = null;
    } else {
    this.ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FLIGHT_NO = null;
    } else {
    this.FLIGHT_NO = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DEPDATE = null;
    } else {
    this.DEPDATE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SUBMITTOFLIGHT = null;
    } else {
    this.SUBMITTOFLIGHT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SUBSEGMENTS = null;
    } else {
    this.SUBSEGMENTS = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CABINVALUE = null;
    } else {
    this.CABINVALUE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CABINSTATUS = null;
    } else {
    this.CABINSTATUS = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CABINSTATUS_CA = null;
    } else {
    this.CABINSTATUS_CA = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CABINSTATUS_CZ = null;
    } else {
    this.CABINSTATUS_CZ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CABINOPENSIZE = null;
    } else {
    this.CABINOPENSIZE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CABINBOOKSIZE = null;
    } else {
    this.CABINBOOKSIZE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OPENSIZEMAX = null;
    } else {
    this.OPENSIZEMAX = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BOOKSIZEMAX = null;
    } else {
    this.BOOKSIZEMAX = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SUPRISEDATEVALUE = null;
    } else {
    this.SUPRISEDATEVALUE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NORMALDATEVALUE = null;
    } else {
    this.NORMALDATEVALUE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CABIN_CA_OPENSIZE = null;
    } else {
    this.CABIN_CA_OPENSIZE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CABIN_CZ_OPENSIZE = null;
    } else {
    this.CABIN_CZ_OPENSIZE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.INSERTTIME = null;
    } else {
    this.INSERTTIME = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ID, __dataOut);
    }
    if (null == this.FLIGHT_NO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FLIGHT_NO);
    }
    if (null == this.DEPDATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DEPDATE);
    }
    if (null == this.SUBMITTOFLIGHT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SUBMITTOFLIGHT, __dataOut);
    }
    if (null == this.SUBSEGMENTS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SUBSEGMENTS);
    }
    if (null == this.CABINVALUE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CABINVALUE);
    }
    if (null == this.CABINSTATUS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CABINSTATUS);
    }
    if (null == this.CABINSTATUS_CA) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CABINSTATUS_CA);
    }
    if (null == this.CABINSTATUS_CZ) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CABINSTATUS_CZ);
    }
    if (null == this.CABINOPENSIZE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CABINOPENSIZE, __dataOut);
    }
    if (null == this.CABINBOOKSIZE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CABINBOOKSIZE, __dataOut);
    }
    if (null == this.OPENSIZEMAX) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.OPENSIZEMAX, __dataOut);
    }
    if (null == this.BOOKSIZEMAX) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BOOKSIZEMAX, __dataOut);
    }
    if (null == this.SUPRISEDATEVALUE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SUPRISEDATEVALUE);
    }
    if (null == this.NORMALDATEVALUE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, NORMALDATEVALUE);
    }
    if (null == this.CABIN_CA_OPENSIZE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CABIN_CA_OPENSIZE, __dataOut);
    }
    if (null == this.CABIN_CZ_OPENSIZE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CABIN_CZ_OPENSIZE, __dataOut);
    }
    if (null == this.INSERTTIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, INSERTTIME);
    }
  }
  private final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(ID==null?"null":"" + ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLIGHT_NO==null?"null":FLIGHT_NO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DEPDATE==null?"null":DEPDATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SUBMITTOFLIGHT==null?"null":"" + SUBMITTOFLIGHT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SUBSEGMENTS==null?"null":SUBSEGMENTS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CABINVALUE==null?"null":CABINVALUE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CABINSTATUS==null?"null":CABINSTATUS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CABINSTATUS_CA==null?"null":CABINSTATUS_CA, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CABINSTATUS_CZ==null?"null":CABINSTATUS_CZ, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CABINOPENSIZE==null?"null":"" + CABINOPENSIZE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CABINBOOKSIZE==null?"null":"" + CABINBOOKSIZE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPENSIZEMAX==null?"null":"" + OPENSIZEMAX, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BOOKSIZEMAX==null?"null":"" + BOOKSIZEMAX, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SUPRISEDATEVALUE==null?"null":SUPRISEDATEVALUE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NORMALDATEVALUE==null?"null":NORMALDATEVALUE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CABIN_CA_OPENSIZE==null?"null":"" + CABIN_CA_OPENSIZE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CABIN_CZ_OPENSIZE==null?"null":"" + CABIN_CZ_OPENSIZE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INSERTTIME==null?"null":INSERTTIME, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  private final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str;
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ID = null; } else {
      this.ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FLIGHT_NO = null; } else {
      this.FLIGHT_NO = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DEPDATE = null; } else {
      this.DEPDATE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SUBMITTOFLIGHT = null; } else {
      this.SUBMITTOFLIGHT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SUBSEGMENTS = null; } else {
      this.SUBSEGMENTS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CABINVALUE = null; } else {
      this.CABINVALUE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CABINSTATUS = null; } else {
      this.CABINSTATUS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CABINSTATUS_CA = null; } else {
      this.CABINSTATUS_CA = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CABINSTATUS_CZ = null; } else {
      this.CABINSTATUS_CZ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CABINOPENSIZE = null; } else {
      this.CABINOPENSIZE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CABINBOOKSIZE = null; } else {
      this.CABINBOOKSIZE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OPENSIZEMAX = null; } else {
      this.OPENSIZEMAX = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BOOKSIZEMAX = null; } else {
      this.BOOKSIZEMAX = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SUPRISEDATEVALUE = null; } else {
      this.SUPRISEDATEVALUE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.NORMALDATEVALUE = null; } else {
      this.NORMALDATEVALUE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CABIN_CA_OPENSIZE = null; } else {
      this.CABIN_CA_OPENSIZE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CABIN_CZ_OPENSIZE = null; } else {
      this.CABIN_CZ_OPENSIZE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.INSERTTIME = null; } else {
      this.INSERTTIME = __cur_str;
    }

  }

  public Object clone() throws CloneNotSupportedException {
    FLIGHT_SNIFFERCABINS o = (FLIGHT_SNIFFERCABINS) super.clone();
    return o;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("ID", this.ID);
    __sqoop$field_map.put("FLIGHT_NO", this.FLIGHT_NO);
    __sqoop$field_map.put("DEPDATE", this.DEPDATE);
    __sqoop$field_map.put("SUBMITTOFLIGHT", this.SUBMITTOFLIGHT);
    __sqoop$field_map.put("SUBSEGMENTS", this.SUBSEGMENTS);
    __sqoop$field_map.put("CABINVALUE", this.CABINVALUE);
    __sqoop$field_map.put("CABINSTATUS", this.CABINSTATUS);
    __sqoop$field_map.put("CABINSTATUS_CA", this.CABINSTATUS_CA);
    __sqoop$field_map.put("CABINSTATUS_CZ", this.CABINSTATUS_CZ);
    __sqoop$field_map.put("CABINOPENSIZE", this.CABINOPENSIZE);
    __sqoop$field_map.put("CABINBOOKSIZE", this.CABINBOOKSIZE);
    __sqoop$field_map.put("OPENSIZEMAX", this.OPENSIZEMAX);
    __sqoop$field_map.put("BOOKSIZEMAX", this.BOOKSIZEMAX);
    __sqoop$field_map.put("SUPRISEDATEVALUE", this.SUPRISEDATEVALUE);
    __sqoop$field_map.put("NORMALDATEVALUE", this.NORMALDATEVALUE);
    __sqoop$field_map.put("CABIN_CA_OPENSIZE", this.CABIN_CA_OPENSIZE);
    __sqoop$field_map.put("CABIN_CZ_OPENSIZE", this.CABIN_CZ_OPENSIZE);
    __sqoop$field_map.put("INSERTTIME", this.INSERTTIME);
    return __sqoop$field_map;
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("ID".equals(__fieldName)) {
      this.ID = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("FLIGHT_NO".equals(__fieldName)) {
      this.FLIGHT_NO = (String) __fieldVal;
    }
    else    if ("DEPDATE".equals(__fieldName)) {
      this.DEPDATE = (String) __fieldVal;
    }
    else    if ("SUBMITTOFLIGHT".equals(__fieldName)) {
      this.SUBMITTOFLIGHT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("SUBSEGMENTS".equals(__fieldName)) {
      this.SUBSEGMENTS = (String) __fieldVal;
    }
    else    if ("CABINVALUE".equals(__fieldName)) {
      this.CABINVALUE = (String) __fieldVal;
    }
    else    if ("CABINSTATUS".equals(__fieldName)) {
      this.CABINSTATUS = (String) __fieldVal;
    }
    else    if ("CABINSTATUS_CA".equals(__fieldName)) {
      this.CABINSTATUS_CA = (String) __fieldVal;
    }
    else    if ("CABINSTATUS_CZ".equals(__fieldName)) {
      this.CABINSTATUS_CZ = (String) __fieldVal;
    }
    else    if ("CABINOPENSIZE".equals(__fieldName)) {
      this.CABINOPENSIZE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CABINBOOKSIZE".equals(__fieldName)) {
      this.CABINBOOKSIZE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("OPENSIZEMAX".equals(__fieldName)) {
      this.OPENSIZEMAX = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("BOOKSIZEMAX".equals(__fieldName)) {
      this.BOOKSIZEMAX = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("SUPRISEDATEVALUE".equals(__fieldName)) {
      this.SUPRISEDATEVALUE = (String) __fieldVal;
    }
    else    if ("NORMALDATEVALUE".equals(__fieldName)) {
      this.NORMALDATEVALUE = (String) __fieldVal;
    }
    else    if ("CABIN_CA_OPENSIZE".equals(__fieldName)) {
      this.CABIN_CA_OPENSIZE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CABIN_CZ_OPENSIZE".equals(__fieldName)) {
      this.CABIN_CZ_OPENSIZE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("INSERTTIME".equals(__fieldName)) {
      this.INSERTTIME = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
}
