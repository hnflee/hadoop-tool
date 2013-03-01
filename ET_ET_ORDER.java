// ORM class for ET.ET_ORDER
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

public class ET_ET_ORDER extends SqoopRecord  implements DBWritable, Writable {
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
  public ET_ET_ORDER with_ID(java.math.BigDecimal ID) {
    this.ID = ID;
    return this;
  }
  private String ORDER_NO;
  public String get_ORDER_NO() {
    return ORDER_NO;
  }
  public void set_ORDER_NO(String ORDER_NO) {
    this.ORDER_NO = ORDER_NO;
  }
  public ET_ET_ORDER with_ORDER_NO(String ORDER_NO) {
    this.ORDER_NO = ORDER_NO;
    return this;
  }
  private String TICKET_TYPE;
  public String get_TICKET_TYPE() {
    return TICKET_TYPE;
  }
  public void set_TICKET_TYPE(String TICKET_TYPE) {
    this.TICKET_TYPE = TICKET_TYPE;
  }
  public ET_ET_ORDER with_TICKET_TYPE(String TICKET_TYPE) {
    this.TICKET_TYPE = TICKET_TYPE;
    return this;
  }
  private java.sql.Timestamp CREATE_TIME;
  public java.sql.Timestamp get_CREATE_TIME() {
    return CREATE_TIME;
  }
  public void set_CREATE_TIME(java.sql.Timestamp CREATE_TIME) {
    this.CREATE_TIME = CREATE_TIME;
  }
  public ET_ET_ORDER with_CREATE_TIME(java.sql.Timestamp CREATE_TIME) {
    this.CREATE_TIME = CREATE_TIME;
    return this;
  }
  private java.math.BigDecimal USER_ID;
  public java.math.BigDecimal get_USER_ID() {
    return USER_ID;
  }
  public void set_USER_ID(java.math.BigDecimal USER_ID) {
    this.USER_ID = USER_ID;
  }
  public ET_ET_ORDER with_USER_ID(java.math.BigDecimal USER_ID) {
    this.USER_ID = USER_ID;
    return this;
  }
  private String OFFICE_NO;
  public String get_OFFICE_NO() {
    return OFFICE_NO;
  }
  public void set_OFFICE_NO(String OFFICE_NO) {
    this.OFFICE_NO = OFFICE_NO;
  }
  public ET_ET_ORDER with_OFFICE_NO(String OFFICE_NO) {
    this.OFFICE_NO = OFFICE_NO;
    return this;
  }
  private String STATUS;
  public String get_STATUS() {
    return STATUS;
  }
  public void set_STATUS(String STATUS) {
    this.STATUS = STATUS;
  }
  public ET_ET_ORDER with_STATUS(String STATUS) {
    this.STATUS = STATUS;
    return this;
  }
  private String CONTACT_NAME;
  public String get_CONTACT_NAME() {
    return CONTACT_NAME;
  }
  public void set_CONTACT_NAME(String CONTACT_NAME) {
    this.CONTACT_NAME = CONTACT_NAME;
  }
  public ET_ET_ORDER with_CONTACT_NAME(String CONTACT_NAME) {
    this.CONTACT_NAME = CONTACT_NAME;
    return this;
  }
  private String CONTACT_TEL;
  public String get_CONTACT_TEL() {
    return CONTACT_TEL;
  }
  public void set_CONTACT_TEL(String CONTACT_TEL) {
    this.CONTACT_TEL = CONTACT_TEL;
  }
  public ET_ET_ORDER with_CONTACT_TEL(String CONTACT_TEL) {
    this.CONTACT_TEL = CONTACT_TEL;
    return this;
  }
  private String CONTACT_MOBILE;
  public String get_CONTACT_MOBILE() {
    return CONTACT_MOBILE;
  }
  public void set_CONTACT_MOBILE(String CONTACT_MOBILE) {
    this.CONTACT_MOBILE = CONTACT_MOBILE;
  }
  public ET_ET_ORDER with_CONTACT_MOBILE(String CONTACT_MOBILE) {
    this.CONTACT_MOBILE = CONTACT_MOBILE;
    return this;
  }
  private String CONTACT_EMAIL;
  public String get_CONTACT_EMAIL() {
    return CONTACT_EMAIL;
  }
  public void set_CONTACT_EMAIL(String CONTACT_EMAIL) {
    this.CONTACT_EMAIL = CONTACT_EMAIL;
  }
  public ET_ET_ORDER with_CONTACT_EMAIL(String CONTACT_EMAIL) {
    this.CONTACT_EMAIL = CONTACT_EMAIL;
    return this;
  }
  private String CONTACT_ADDRESS;
  public String get_CONTACT_ADDRESS() {
    return CONTACT_ADDRESS;
  }
  public void set_CONTACT_ADDRESS(String CONTACT_ADDRESS) {
    this.CONTACT_ADDRESS = CONTACT_ADDRESS;
  }
  public ET_ET_ORDER with_CONTACT_ADDRESS(String CONTACT_ADDRESS) {
    this.CONTACT_ADDRESS = CONTACT_ADDRESS;
    return this;
  }
  private String CURRENCY;
  public String get_CURRENCY() {
    return CURRENCY;
  }
  public void set_CURRENCY(String CURRENCY) {
    this.CURRENCY = CURRENCY;
  }
  public ET_ET_ORDER with_CURRENCY(String CURRENCY) {
    this.CURRENCY = CURRENCY;
    return this;
  }
  private java.sql.Timestamp TIME_LIMIT;
  public java.sql.Timestamp get_TIME_LIMIT() {
    return TIME_LIMIT;
  }
  public void set_TIME_LIMIT(java.sql.Timestamp TIME_LIMIT) {
    this.TIME_LIMIT = TIME_LIMIT;
  }
  public ET_ET_ORDER with_TIME_LIMIT(java.sql.Timestamp TIME_LIMIT) {
    this.TIME_LIMIT = TIME_LIMIT;
    return this;
  }
  private String AIRLINE_CODE;
  public String get_AIRLINE_CODE() {
    return AIRLINE_CODE;
  }
  public void set_AIRLINE_CODE(String AIRLINE_CODE) {
    this.AIRLINE_CODE = AIRLINE_CODE;
  }
  public ET_ET_ORDER with_AIRLINE_CODE(String AIRLINE_CODE) {
    this.AIRLINE_CODE = AIRLINE_CODE;
    return this;
  }
  private String PNR_IMPORT;
  public String get_PNR_IMPORT() {
    return PNR_IMPORT;
  }
  public void set_PNR_IMPORT(String PNR_IMPORT) {
    this.PNR_IMPORT = PNR_IMPORT;
  }
  public ET_ET_ORDER with_PNR_IMPORT(String PNR_IMPORT) {
    this.PNR_IMPORT = PNR_IMPORT;
    return this;
  }
  private java.math.BigDecimal MAIL_FEE;
  public java.math.BigDecimal get_MAIL_FEE() {
    return MAIL_FEE;
  }
  public void set_MAIL_FEE(java.math.BigDecimal MAIL_FEE) {
    this.MAIL_FEE = MAIL_FEE;
  }
  public ET_ET_ORDER with_MAIL_FEE(java.math.BigDecimal MAIL_FEE) {
    this.MAIL_FEE = MAIL_FEE;
    return this;
  }
  private String IP_ADDRESS;
  public String get_IP_ADDRESS() {
    return IP_ADDRESS;
  }
  public void set_IP_ADDRESS(String IP_ADDRESS) {
    this.IP_ADDRESS = IP_ADDRESS;
  }
  public ET_ET_ORDER with_IP_ADDRESS(String IP_ADDRESS) {
    this.IP_ADDRESS = IP_ADDRESS;
    return this;
  }
  private java.math.BigDecimal INTERNATIONAL;
  public java.math.BigDecimal get_INTERNATIONAL() {
    return INTERNATIONAL;
  }
  public void set_INTERNATIONAL(java.math.BigDecimal INTERNATIONAL) {
    this.INTERNATIONAL = INTERNATIONAL;
  }
  public ET_ET_ORDER with_INTERNATIONAL(java.math.BigDecimal INTERNATIONAL) {
    this.INTERNATIONAL = INTERNATIONAL;
    return this;
  }
  private String SOURCE;
  public String get_SOURCE() {
    return SOURCE;
  }
  public void set_SOURCE(String SOURCE) {
    this.SOURCE = SOURCE;
  }
  public ET_ET_ORDER with_SOURCE(String SOURCE) {
    this.SOURCE = SOURCE;
    return this;
  }
  private java.math.BigDecimal ON_SALE_AMOUNT;
  public java.math.BigDecimal get_ON_SALE_AMOUNT() {
    return ON_SALE_AMOUNT;
  }
  public void set_ON_SALE_AMOUNT(java.math.BigDecimal ON_SALE_AMOUNT) {
    this.ON_SALE_AMOUNT = ON_SALE_AMOUNT;
  }
  public ET_ET_ORDER with_ON_SALE_AMOUNT(java.math.BigDecimal ON_SALE_AMOUNT) {
    this.ON_SALE_AMOUNT = ON_SALE_AMOUNT;
    return this;
  }
  private java.math.BigDecimal QUOTA_VALUE;
  public java.math.BigDecimal get_QUOTA_VALUE() {
    return QUOTA_VALUE;
  }
  public void set_QUOTA_VALUE(java.math.BigDecimal QUOTA_VALUE) {
    this.QUOTA_VALUE = QUOTA_VALUE;
  }
  public ET_ET_ORDER with_QUOTA_VALUE(java.math.BigDecimal QUOTA_VALUE) {
    this.QUOTA_VALUE = QUOTA_VALUE;
    return this;
  }
  private String COUPON_NO;
  public String get_COUPON_NO() {
    return COUPON_NO;
  }
  public void set_COUPON_NO(String COUPON_NO) {
    this.COUPON_NO = COUPON_NO;
  }
  public ET_ET_ORDER with_COUPON_NO(String COUPON_NO) {
    this.COUPON_NO = COUPON_NO;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ET_ET_ORDER)) {
      return false;
    }
    ET_ET_ORDER that = (ET_ET_ORDER) o;
    boolean equal = true;
    equal = equal && (this.ID == null ? that.ID == null : this.ID.equals(that.ID));
    equal = equal && (this.ORDER_NO == null ? that.ORDER_NO == null : this.ORDER_NO.equals(that.ORDER_NO));
    equal = equal && (this.TICKET_TYPE == null ? that.TICKET_TYPE == null : this.TICKET_TYPE.equals(that.TICKET_TYPE));
    equal = equal && (this.CREATE_TIME == null ? that.CREATE_TIME == null : this.CREATE_TIME.equals(that.CREATE_TIME));
    equal = equal && (this.USER_ID == null ? that.USER_ID == null : this.USER_ID.equals(that.USER_ID));
    equal = equal && (this.OFFICE_NO == null ? that.OFFICE_NO == null : this.OFFICE_NO.equals(that.OFFICE_NO));
    equal = equal && (this.STATUS == null ? that.STATUS == null : this.STATUS.equals(that.STATUS));
    equal = equal && (this.CONTACT_NAME == null ? that.CONTACT_NAME == null : this.CONTACT_NAME.equals(that.CONTACT_NAME));
    equal = equal && (this.CONTACT_TEL == null ? that.CONTACT_TEL == null : this.CONTACT_TEL.equals(that.CONTACT_TEL));
    equal = equal && (this.CONTACT_MOBILE == null ? that.CONTACT_MOBILE == null : this.CONTACT_MOBILE.equals(that.CONTACT_MOBILE));
    equal = equal && (this.CONTACT_EMAIL == null ? that.CONTACT_EMAIL == null : this.CONTACT_EMAIL.equals(that.CONTACT_EMAIL));
    equal = equal && (this.CONTACT_ADDRESS == null ? that.CONTACT_ADDRESS == null : this.CONTACT_ADDRESS.equals(that.CONTACT_ADDRESS));
    equal = equal && (this.CURRENCY == null ? that.CURRENCY == null : this.CURRENCY.equals(that.CURRENCY));
    equal = equal && (this.TIME_LIMIT == null ? that.TIME_LIMIT == null : this.TIME_LIMIT.equals(that.TIME_LIMIT));
    equal = equal && (this.AIRLINE_CODE == null ? that.AIRLINE_CODE == null : this.AIRLINE_CODE.equals(that.AIRLINE_CODE));
    equal = equal && (this.PNR_IMPORT == null ? that.PNR_IMPORT == null : this.PNR_IMPORT.equals(that.PNR_IMPORT));
    equal = equal && (this.MAIL_FEE == null ? that.MAIL_FEE == null : this.MAIL_FEE.equals(that.MAIL_FEE));
    equal = equal && (this.IP_ADDRESS == null ? that.IP_ADDRESS == null : this.IP_ADDRESS.equals(that.IP_ADDRESS));
    equal = equal && (this.INTERNATIONAL == null ? that.INTERNATIONAL == null : this.INTERNATIONAL.equals(that.INTERNATIONAL));
    equal = equal && (this.SOURCE == null ? that.SOURCE == null : this.SOURCE.equals(that.SOURCE));
    equal = equal && (this.ON_SALE_AMOUNT == null ? that.ON_SALE_AMOUNT == null : this.ON_SALE_AMOUNT.equals(that.ON_SALE_AMOUNT));
    equal = equal && (this.QUOTA_VALUE == null ? that.QUOTA_VALUE == null : this.QUOTA_VALUE.equals(that.QUOTA_VALUE));
    equal = equal && (this.COUPON_NO == null ? that.COUPON_NO == null : this.COUPON_NO.equals(that.COUPON_NO));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.ORDER_NO = JdbcWritableBridge.readString(2, __dbResults);
    this.TICKET_TYPE = JdbcWritableBridge.readString(3, __dbResults);
    this.CREATE_TIME = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.USER_ID = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.OFFICE_NO = JdbcWritableBridge.readString(6, __dbResults);
    this.STATUS = JdbcWritableBridge.readString(7, __dbResults);
    this.CONTACT_NAME = JdbcWritableBridge.readString(8, __dbResults);
    this.CONTACT_TEL = JdbcWritableBridge.readString(9, __dbResults);
    this.CONTACT_MOBILE = JdbcWritableBridge.readString(10, __dbResults);
    this.CONTACT_EMAIL = JdbcWritableBridge.readString(11, __dbResults);
    this.CONTACT_ADDRESS = JdbcWritableBridge.readString(12, __dbResults);
    this.CURRENCY = JdbcWritableBridge.readString(13, __dbResults);
    this.TIME_LIMIT = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.AIRLINE_CODE = JdbcWritableBridge.readString(15, __dbResults);
    this.PNR_IMPORT = JdbcWritableBridge.readString(16, __dbResults);
    this.MAIL_FEE = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.IP_ADDRESS = JdbcWritableBridge.readString(18, __dbResults);
    this.INTERNATIONAL = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.SOURCE = JdbcWritableBridge.readString(20, __dbResults);
    this.ON_SALE_AMOUNT = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.QUOTA_VALUE = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.COUPON_NO = JdbcWritableBridge.readString(23, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(ORDER_NO, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TICKET_TYPE, 3 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CREATE_TIME, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(USER_ID, 5 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(OFFICE_NO, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STATUS, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CONTACT_NAME, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CONTACT_TEL, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CONTACT_MOBILE, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CONTACT_EMAIL, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CONTACT_ADDRESS, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CURRENCY, 13 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TIME_LIMIT, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(AIRLINE_CODE, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PNR_IMPORT, 16 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MAIL_FEE, 17 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(IP_ADDRESS, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(INTERNATIONAL, 19 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(SOURCE, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ON_SALE_AMOUNT, 21 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(QUOTA_VALUE, 22 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(COUPON_NO, 23 + __off, 12, __dbStmt);
    return 23;
  }
  public void readFields(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.ID = null;
    } else {
    this.ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ORDER_NO = null;
    } else {
    this.ORDER_NO = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TICKET_TYPE = null;
    } else {
    this.TICKET_TYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CREATE_TIME = null;
    } else {
    this.CREATE_TIME = new Timestamp(__dataIn.readLong());
    this.CREATE_TIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.USER_ID = null;
    } else {
    this.USER_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OFFICE_NO = null;
    } else {
    this.OFFICE_NO = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.STATUS = null;
    } else {
    this.STATUS = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CONTACT_NAME = null;
    } else {
    this.CONTACT_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CONTACT_TEL = null;
    } else {
    this.CONTACT_TEL = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CONTACT_MOBILE = null;
    } else {
    this.CONTACT_MOBILE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CONTACT_EMAIL = null;
    } else {
    this.CONTACT_EMAIL = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CONTACT_ADDRESS = null;
    } else {
    this.CONTACT_ADDRESS = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CURRENCY = null;
    } else {
    this.CURRENCY = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TIME_LIMIT = null;
    } else {
    this.TIME_LIMIT = new Timestamp(__dataIn.readLong());
    this.TIME_LIMIT.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.AIRLINE_CODE = null;
    } else {
    this.AIRLINE_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PNR_IMPORT = null;
    } else {
    this.PNR_IMPORT = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAIL_FEE = null;
    } else {
    this.MAIL_FEE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.IP_ADDRESS = null;
    } else {
    this.IP_ADDRESS = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.INTERNATIONAL = null;
    } else {
    this.INTERNATIONAL = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SOURCE = null;
    } else {
    this.SOURCE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ON_SALE_AMOUNT = null;
    } else {
    this.ON_SALE_AMOUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.QUOTA_VALUE = null;
    } else {
    this.QUOTA_VALUE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.COUPON_NO = null;
    } else {
    this.COUPON_NO = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ID, __dataOut);
    }
    if (null == this.ORDER_NO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ORDER_NO);
    }
    if (null == this.TICKET_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TICKET_TYPE);
    }
    if (null == this.CREATE_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CREATE_TIME.getTime());
    __dataOut.writeInt(this.CREATE_TIME.getNanos());
    }
    if (null == this.USER_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.USER_ID, __dataOut);
    }
    if (null == this.OFFICE_NO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OFFICE_NO);
    }
    if (null == this.STATUS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STATUS);
    }
    if (null == this.CONTACT_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CONTACT_NAME);
    }
    if (null == this.CONTACT_TEL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CONTACT_TEL);
    }
    if (null == this.CONTACT_MOBILE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CONTACT_MOBILE);
    }
    if (null == this.CONTACT_EMAIL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CONTACT_EMAIL);
    }
    if (null == this.CONTACT_ADDRESS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CONTACT_ADDRESS);
    }
    if (null == this.CURRENCY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CURRENCY);
    }
    if (null == this.TIME_LIMIT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TIME_LIMIT.getTime());
    __dataOut.writeInt(this.TIME_LIMIT.getNanos());
    }
    if (null == this.AIRLINE_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, AIRLINE_CODE);
    }
    if (null == this.PNR_IMPORT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PNR_IMPORT);
    }
    if (null == this.MAIL_FEE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MAIL_FEE, __dataOut);
    }
    if (null == this.IP_ADDRESS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, IP_ADDRESS);
    }
    if (null == this.INTERNATIONAL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.INTERNATIONAL, __dataOut);
    }
    if (null == this.SOURCE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SOURCE);
    }
    if (null == this.ON_SALE_AMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ON_SALE_AMOUNT, __dataOut);
    }
    if (null == this.QUOTA_VALUE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.QUOTA_VALUE, __dataOut);
    }
    if (null == this.COUPON_NO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COUPON_NO);
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
    __sb.append(FieldFormatter.escapeAndEnclose(ORDER_NO==null?"null":ORDER_NO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TICKET_TYPE==null?"null":TICKET_TYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CREATE_TIME==null?"null":"" + CREATE_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(USER_ID==null?"null":"" + USER_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OFFICE_NO==null?"null":OFFICE_NO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STATUS==null?"null":STATUS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CONTACT_NAME==null?"null":CONTACT_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CONTACT_TEL==null?"null":CONTACT_TEL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CONTACT_MOBILE==null?"null":CONTACT_MOBILE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CONTACT_EMAIL==null?"null":CONTACT_EMAIL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CONTACT_ADDRESS==null?"null":CONTACT_ADDRESS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CURRENCY==null?"null":CURRENCY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TIME_LIMIT==null?"null":"" + TIME_LIMIT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AIRLINE_CODE==null?"null":AIRLINE_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PNR_IMPORT==null?"null":PNR_IMPORT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MAIL_FEE==null?"null":"" + MAIL_FEE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(IP_ADDRESS==null?"null":IP_ADDRESS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INTERNATIONAL==null?"null":"" + INTERNATIONAL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SOURCE==null?"null":SOURCE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ON_SALE_AMOUNT==null?"null":"" + ON_SALE_AMOUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(QUOTA_VALUE==null?"null":"" + QUOTA_VALUE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COUPON_NO==null?"null":COUPON_NO, delimiters));
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
    if (__cur_str.equals("null")) { this.ORDER_NO = null; } else {
      this.ORDER_NO = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TICKET_TYPE = null; } else {
      this.TICKET_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CREATE_TIME = null; } else {
      this.CREATE_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.USER_ID = null; } else {
      this.USER_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.OFFICE_NO = null; } else {
      this.OFFICE_NO = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.STATUS = null; } else {
      this.STATUS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CONTACT_NAME = null; } else {
      this.CONTACT_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CONTACT_TEL = null; } else {
      this.CONTACT_TEL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CONTACT_MOBILE = null; } else {
      this.CONTACT_MOBILE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CONTACT_EMAIL = null; } else {
      this.CONTACT_EMAIL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CONTACT_ADDRESS = null; } else {
      this.CONTACT_ADDRESS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CURRENCY = null; } else {
      this.CURRENCY = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TIME_LIMIT = null; } else {
      this.TIME_LIMIT = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.AIRLINE_CODE = null; } else {
      this.AIRLINE_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PNR_IMPORT = null; } else {
      this.PNR_IMPORT = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.MAIL_FEE = null; } else {
      this.MAIL_FEE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.IP_ADDRESS = null; } else {
      this.IP_ADDRESS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.INTERNATIONAL = null; } else {
      this.INTERNATIONAL = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SOURCE = null; } else {
      this.SOURCE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ON_SALE_AMOUNT = null; } else {
      this.ON_SALE_AMOUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.QUOTA_VALUE = null; } else {
      this.QUOTA_VALUE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.COUPON_NO = null; } else {
      this.COUPON_NO = __cur_str;
    }

  }

  public Object clone() throws CloneNotSupportedException {
    ET_ET_ORDER o = (ET_ET_ORDER) super.clone();
    o.CREATE_TIME = (o.CREATE_TIME != null) ? (java.sql.Timestamp) o.CREATE_TIME.clone() : null;
    o.TIME_LIMIT = (o.TIME_LIMIT != null) ? (java.sql.Timestamp) o.TIME_LIMIT.clone() : null;
    return o;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("ID", this.ID);
    __sqoop$field_map.put("ORDER_NO", this.ORDER_NO);
    __sqoop$field_map.put("TICKET_TYPE", this.TICKET_TYPE);
    __sqoop$field_map.put("CREATE_TIME", this.CREATE_TIME);
    __sqoop$field_map.put("USER_ID", this.USER_ID);
    __sqoop$field_map.put("OFFICE_NO", this.OFFICE_NO);
    __sqoop$field_map.put("STATUS", this.STATUS);
    __sqoop$field_map.put("CONTACT_NAME", this.CONTACT_NAME);
    __sqoop$field_map.put("CONTACT_TEL", this.CONTACT_TEL);
    __sqoop$field_map.put("CONTACT_MOBILE", this.CONTACT_MOBILE);
    __sqoop$field_map.put("CONTACT_EMAIL", this.CONTACT_EMAIL);
    __sqoop$field_map.put("CONTACT_ADDRESS", this.CONTACT_ADDRESS);
    __sqoop$field_map.put("CURRENCY", this.CURRENCY);
    __sqoop$field_map.put("TIME_LIMIT", this.TIME_LIMIT);
    __sqoop$field_map.put("AIRLINE_CODE", this.AIRLINE_CODE);
    __sqoop$field_map.put("PNR_IMPORT", this.PNR_IMPORT);
    __sqoop$field_map.put("MAIL_FEE", this.MAIL_FEE);
    __sqoop$field_map.put("IP_ADDRESS", this.IP_ADDRESS);
    __sqoop$field_map.put("INTERNATIONAL", this.INTERNATIONAL);
    __sqoop$field_map.put("SOURCE", this.SOURCE);
    __sqoop$field_map.put("ON_SALE_AMOUNT", this.ON_SALE_AMOUNT);
    __sqoop$field_map.put("QUOTA_VALUE", this.QUOTA_VALUE);
    __sqoop$field_map.put("COUPON_NO", this.COUPON_NO);
    return __sqoop$field_map;
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("ID".equals(__fieldName)) {
      this.ID = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("ORDER_NO".equals(__fieldName)) {
      this.ORDER_NO = (String) __fieldVal;
    }
    else    if ("TICKET_TYPE".equals(__fieldName)) {
      this.TICKET_TYPE = (String) __fieldVal;
    }
    else    if ("CREATE_TIME".equals(__fieldName)) {
      this.CREATE_TIME = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("USER_ID".equals(__fieldName)) {
      this.USER_ID = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("OFFICE_NO".equals(__fieldName)) {
      this.OFFICE_NO = (String) __fieldVal;
    }
    else    if ("STATUS".equals(__fieldName)) {
      this.STATUS = (String) __fieldVal;
    }
    else    if ("CONTACT_NAME".equals(__fieldName)) {
      this.CONTACT_NAME = (String) __fieldVal;
    }
    else    if ("CONTACT_TEL".equals(__fieldName)) {
      this.CONTACT_TEL = (String) __fieldVal;
    }
    else    if ("CONTACT_MOBILE".equals(__fieldName)) {
      this.CONTACT_MOBILE = (String) __fieldVal;
    }
    else    if ("CONTACT_EMAIL".equals(__fieldName)) {
      this.CONTACT_EMAIL = (String) __fieldVal;
    }
    else    if ("CONTACT_ADDRESS".equals(__fieldName)) {
      this.CONTACT_ADDRESS = (String) __fieldVal;
    }
    else    if ("CURRENCY".equals(__fieldName)) {
      this.CURRENCY = (String) __fieldVal;
    }
    else    if ("TIME_LIMIT".equals(__fieldName)) {
      this.TIME_LIMIT = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("AIRLINE_CODE".equals(__fieldName)) {
      this.AIRLINE_CODE = (String) __fieldVal;
    }
    else    if ("PNR_IMPORT".equals(__fieldName)) {
      this.PNR_IMPORT = (String) __fieldVal;
    }
    else    if ("MAIL_FEE".equals(__fieldName)) {
      this.MAIL_FEE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("IP_ADDRESS".equals(__fieldName)) {
      this.IP_ADDRESS = (String) __fieldVal;
    }
    else    if ("INTERNATIONAL".equals(__fieldName)) {
      this.INTERNATIONAL = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("SOURCE".equals(__fieldName)) {
      this.SOURCE = (String) __fieldVal;
    }
    else    if ("ON_SALE_AMOUNT".equals(__fieldName)) {
      this.ON_SALE_AMOUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("QUOTA_VALUE".equals(__fieldName)) {
      this.QUOTA_VALUE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("COUPON_NO".equals(__fieldName)) {
      this.COUPON_NO = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
}
