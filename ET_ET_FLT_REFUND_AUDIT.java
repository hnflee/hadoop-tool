// ORM class for ET.ET_FLT_REFUND_AUDIT
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

public class ET_ET_FLT_REFUND_AUDIT extends SqoopRecord  implements DBWritable, Writable {
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
  public ET_ET_FLT_REFUND_AUDIT with_ID(java.math.BigDecimal ID) {
    this.ID = ID;
    return this;
  }
  private java.math.BigDecimal REFUND_ID;
  public java.math.BigDecimal get_REFUND_ID() {
    return REFUND_ID;
  }
  public void set_REFUND_ID(java.math.BigDecimal REFUND_ID) {
    this.REFUND_ID = REFUND_ID;
  }
  public ET_ET_FLT_REFUND_AUDIT with_REFUND_ID(java.math.BigDecimal REFUND_ID) {
    this.REFUND_ID = REFUND_ID;
    return this;
  }
  private String SUBMMIT_USERNAME;
  public String get_SUBMMIT_USERNAME() {
    return SUBMMIT_USERNAME;
  }
  public void set_SUBMMIT_USERNAME(String SUBMMIT_USERNAME) {
    this.SUBMMIT_USERNAME = SUBMMIT_USERNAME;
  }
  public ET_ET_FLT_REFUND_AUDIT with_SUBMMIT_USERNAME(String SUBMMIT_USERNAME) {
    this.SUBMMIT_USERNAME = SUBMMIT_USERNAME;
    return this;
  }
  private java.sql.Timestamp SUBMMIT_TIME;
  public java.sql.Timestamp get_SUBMMIT_TIME() {
    return SUBMMIT_TIME;
  }
  public void set_SUBMMIT_TIME(java.sql.Timestamp SUBMMIT_TIME) {
    this.SUBMMIT_TIME = SUBMMIT_TIME;
  }
  public ET_ET_FLT_REFUND_AUDIT with_SUBMMIT_TIME(java.sql.Timestamp SUBMMIT_TIME) {
    this.SUBMMIT_TIME = SUBMMIT_TIME;
    return this;
  }
  private String AUDIT_USERNAME;
  public String get_AUDIT_USERNAME() {
    return AUDIT_USERNAME;
  }
  public void set_AUDIT_USERNAME(String AUDIT_USERNAME) {
    this.AUDIT_USERNAME = AUDIT_USERNAME;
  }
  public ET_ET_FLT_REFUND_AUDIT with_AUDIT_USERNAME(String AUDIT_USERNAME) {
    this.AUDIT_USERNAME = AUDIT_USERNAME;
    return this;
  }
  private java.sql.Timestamp AUDIT_TIME;
  public java.sql.Timestamp get_AUDIT_TIME() {
    return AUDIT_TIME;
  }
  public void set_AUDIT_TIME(java.sql.Timestamp AUDIT_TIME) {
    this.AUDIT_TIME = AUDIT_TIME;
  }
  public ET_ET_FLT_REFUND_AUDIT with_AUDIT_TIME(java.sql.Timestamp AUDIT_TIME) {
    this.AUDIT_TIME = AUDIT_TIME;
    return this;
  }
  private String ACTION;
  public String get_ACTION() {
    return ACTION;
  }
  public void set_ACTION(String ACTION) {
    this.ACTION = ACTION;
  }
  public ET_ET_FLT_REFUND_AUDIT with_ACTION(String ACTION) {
    this.ACTION = ACTION;
    return this;
  }
  private String NOTION;
  public String get_NOTION() {
    return NOTION;
  }
  public void set_NOTION(String NOTION) {
    this.NOTION = NOTION;
  }
  public ET_ET_FLT_REFUND_AUDIT with_NOTION(String NOTION) {
    this.NOTION = NOTION;
    return this;
  }
  private String AMOUNTSTR;
  public String get_AMOUNTSTR() {
    return AMOUNTSTR;
  }
  public void set_AMOUNTSTR(String AMOUNTSTR) {
    this.AMOUNTSTR = AMOUNTSTR;
  }
  public ET_ET_FLT_REFUND_AUDIT with_AMOUNTSTR(String AMOUNTSTR) {
    this.AMOUNTSTR = AMOUNTSTR;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ET_ET_FLT_REFUND_AUDIT)) {
      return false;
    }
    ET_ET_FLT_REFUND_AUDIT that = (ET_ET_FLT_REFUND_AUDIT) o;
    boolean equal = true;
    equal = equal && (this.ID == null ? that.ID == null : this.ID.equals(that.ID));
    equal = equal && (this.REFUND_ID == null ? that.REFUND_ID == null : this.REFUND_ID.equals(that.REFUND_ID));
    equal = equal && (this.SUBMMIT_USERNAME == null ? that.SUBMMIT_USERNAME == null : this.SUBMMIT_USERNAME.equals(that.SUBMMIT_USERNAME));
    equal = equal && (this.SUBMMIT_TIME == null ? that.SUBMMIT_TIME == null : this.SUBMMIT_TIME.equals(that.SUBMMIT_TIME));
    equal = equal && (this.AUDIT_USERNAME == null ? that.AUDIT_USERNAME == null : this.AUDIT_USERNAME.equals(that.AUDIT_USERNAME));
    equal = equal && (this.AUDIT_TIME == null ? that.AUDIT_TIME == null : this.AUDIT_TIME.equals(that.AUDIT_TIME));
    equal = equal && (this.ACTION == null ? that.ACTION == null : this.ACTION.equals(that.ACTION));
    equal = equal && (this.NOTION == null ? that.NOTION == null : this.NOTION.equals(that.NOTION));
    equal = equal && (this.AMOUNTSTR == null ? that.AMOUNTSTR == null : this.AMOUNTSTR.equals(that.AMOUNTSTR));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.REFUND_ID = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.SUBMMIT_USERNAME = JdbcWritableBridge.readString(3, __dbResults);
    this.SUBMMIT_TIME = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.AUDIT_USERNAME = JdbcWritableBridge.readString(5, __dbResults);
    this.AUDIT_TIME = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.ACTION = JdbcWritableBridge.readString(7, __dbResults);
    this.NOTION = JdbcWritableBridge.readString(8, __dbResults);
    this.AMOUNTSTR = JdbcWritableBridge.readString(9, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(REFUND_ID, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(SUBMMIT_USERNAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(SUBMMIT_TIME, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(AUDIT_USERNAME, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(AUDIT_TIME, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(ACTION, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(NOTION, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(AMOUNTSTR, 9 + __off, 12, __dbStmt);
    return 9;
  }
  public void readFields(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.ID = null;
    } else {
    this.ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.REFUND_ID = null;
    } else {
    this.REFUND_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SUBMMIT_USERNAME = null;
    } else {
    this.SUBMMIT_USERNAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SUBMMIT_TIME = null;
    } else {
    this.SUBMMIT_TIME = new Timestamp(__dataIn.readLong());
    this.SUBMMIT_TIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.AUDIT_USERNAME = null;
    } else {
    this.AUDIT_USERNAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AUDIT_TIME = null;
    } else {
    this.AUDIT_TIME = new Timestamp(__dataIn.readLong());
    this.AUDIT_TIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ACTION = null;
    } else {
    this.ACTION = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NOTION = null;
    } else {
    this.NOTION = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AMOUNTSTR = null;
    } else {
    this.AMOUNTSTR = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ID, __dataOut);
    }
    if (null == this.REFUND_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.REFUND_ID, __dataOut);
    }
    if (null == this.SUBMMIT_USERNAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SUBMMIT_USERNAME);
    }
    if (null == this.SUBMMIT_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.SUBMMIT_TIME.getTime());
    __dataOut.writeInt(this.SUBMMIT_TIME.getNanos());
    }
    if (null == this.AUDIT_USERNAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, AUDIT_USERNAME);
    }
    if (null == this.AUDIT_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.AUDIT_TIME.getTime());
    __dataOut.writeInt(this.AUDIT_TIME.getNanos());
    }
    if (null == this.ACTION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ACTION);
    }
    if (null == this.NOTION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, NOTION);
    }
    if (null == this.AMOUNTSTR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, AMOUNTSTR);
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
    __sb.append(FieldFormatter.escapeAndEnclose(REFUND_ID==null?"null":"" + REFUND_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SUBMMIT_USERNAME==null?"null":SUBMMIT_USERNAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SUBMMIT_TIME==null?"null":"" + SUBMMIT_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AUDIT_USERNAME==null?"null":AUDIT_USERNAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AUDIT_TIME==null?"null":"" + AUDIT_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACTION==null?"null":ACTION, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NOTION==null?"null":NOTION, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AMOUNTSTR==null?"null":AMOUNTSTR, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.REFUND_ID = null; } else {
      this.REFUND_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SUBMMIT_USERNAME = null; } else {
      this.SUBMMIT_USERNAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SUBMMIT_TIME = null; } else {
      this.SUBMMIT_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.AUDIT_USERNAME = null; } else {
      this.AUDIT_USERNAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.AUDIT_TIME = null; } else {
      this.AUDIT_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ACTION = null; } else {
      this.ACTION = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.NOTION = null; } else {
      this.NOTION = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.AMOUNTSTR = null; } else {
      this.AMOUNTSTR = __cur_str;
    }

  }

  public Object clone() throws CloneNotSupportedException {
    ET_ET_FLT_REFUND_AUDIT o = (ET_ET_FLT_REFUND_AUDIT) super.clone();
    o.SUBMMIT_TIME = (o.SUBMMIT_TIME != null) ? (java.sql.Timestamp) o.SUBMMIT_TIME.clone() : null;
    o.AUDIT_TIME = (o.AUDIT_TIME != null) ? (java.sql.Timestamp) o.AUDIT_TIME.clone() : null;
    return o;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("ID", this.ID);
    __sqoop$field_map.put("REFUND_ID", this.REFUND_ID);
    __sqoop$field_map.put("SUBMMIT_USERNAME", this.SUBMMIT_USERNAME);
    __sqoop$field_map.put("SUBMMIT_TIME", this.SUBMMIT_TIME);
    __sqoop$field_map.put("AUDIT_USERNAME", this.AUDIT_USERNAME);
    __sqoop$field_map.put("AUDIT_TIME", this.AUDIT_TIME);
    __sqoop$field_map.put("ACTION", this.ACTION);
    __sqoop$field_map.put("NOTION", this.NOTION);
    __sqoop$field_map.put("AMOUNTSTR", this.AMOUNTSTR);
    return __sqoop$field_map;
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("ID".equals(__fieldName)) {
      this.ID = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("REFUND_ID".equals(__fieldName)) {
      this.REFUND_ID = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("SUBMMIT_USERNAME".equals(__fieldName)) {
      this.SUBMMIT_USERNAME = (String) __fieldVal;
    }
    else    if ("SUBMMIT_TIME".equals(__fieldName)) {
      this.SUBMMIT_TIME = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("AUDIT_USERNAME".equals(__fieldName)) {
      this.AUDIT_USERNAME = (String) __fieldVal;
    }
    else    if ("AUDIT_TIME".equals(__fieldName)) {
      this.AUDIT_TIME = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("ACTION".equals(__fieldName)) {
      this.ACTION = (String) __fieldVal;
    }
    else    if ("NOTION".equals(__fieldName)) {
      this.NOTION = (String) __fieldVal;
    }
    else    if ("AMOUNTSTR".equals(__fieldName)) {
      this.AMOUNTSTR = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
}
