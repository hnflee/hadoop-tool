// ORM class for ET.RT_ET_SALES_REFUND_REPORT_VIEW
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

public class ET_RT_ET_SALES_REFUND_REPORT_VIEW extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private java.sql.Timestamp PAY_TIME;
  public java.sql.Timestamp get_PAY_TIME() {
    return PAY_TIME;
  }
  public void set_PAY_TIME(java.sql.Timestamp PAY_TIME) {
    this.PAY_TIME = PAY_TIME;
  }
  public ET_RT_ET_SALES_REFUND_REPORT_VIEW with_PAY_TIME(java.sql.Timestamp PAY_TIME) {
    this.PAY_TIME = PAY_TIME;
    return this;
  }
  private String FLIGHT_NM;
  public String get_FLIGHT_NM() {
    return FLIGHT_NM;
  }
  public void set_FLIGHT_NM(String FLIGHT_NM) {
    this.FLIGHT_NM = FLIGHT_NM;
  }
  public ET_RT_ET_SALES_REFUND_REPORT_VIEW with_FLIGHT_NM(String FLIGHT_NM) {
    this.FLIGHT_NM = FLIGHT_NM;
    return this;
  }
  private java.math.BigDecimal MARKET_FARE;
  public java.math.BigDecimal get_MARKET_FARE() {
    return MARKET_FARE;
  }
  public void set_MARKET_FARE(java.math.BigDecimal MARKET_FARE) {
    this.MARKET_FARE = MARKET_FARE;
  }
  public ET_RT_ET_SALES_REFUND_REPORT_VIEW with_MARKET_FARE(java.math.BigDecimal MARKET_FARE) {
    this.MARKET_FARE = MARKET_FARE;
    return this;
  }
  private java.math.BigDecimal NET_FARE;
  public java.math.BigDecimal get_NET_FARE() {
    return NET_FARE;
  }
  public void set_NET_FARE(java.math.BigDecimal NET_FARE) {
    this.NET_FARE = NET_FARE;
  }
  public ET_RT_ET_SALES_REFUND_REPORT_VIEW with_NET_FARE(java.math.BigDecimal NET_FARE) {
    this.NET_FARE = NET_FARE;
    return this;
  }
  private java.math.BigDecimal AIRPORT_TAX;
  public java.math.BigDecimal get_AIRPORT_TAX() {
    return AIRPORT_TAX;
  }
  public void set_AIRPORT_TAX(java.math.BigDecimal AIRPORT_TAX) {
    this.AIRPORT_TAX = AIRPORT_TAX;
  }
  public ET_RT_ET_SALES_REFUND_REPORT_VIEW with_AIRPORT_TAX(java.math.BigDecimal AIRPORT_TAX) {
    this.AIRPORT_TAX = AIRPORT_TAX;
    return this;
  }
  private java.math.BigDecimal FUEL_TAX;
  public java.math.BigDecimal get_FUEL_TAX() {
    return FUEL_TAX;
  }
  public void set_FUEL_TAX(java.math.BigDecimal FUEL_TAX) {
    this.FUEL_TAX = FUEL_TAX;
  }
  public ET_RT_ET_SALES_REFUND_REPORT_VIEW with_FUEL_TAX(java.math.BigDecimal FUEL_TAX) {
    this.FUEL_TAX = FUEL_TAX;
    return this;
  }
  private java.math.BigDecimal FARES;
  public java.math.BigDecimal get_FARES() {
    return FARES;
  }
  public void set_FARES(java.math.BigDecimal FARES) {
    this.FARES = FARES;
  }
  public ET_RT_ET_SALES_REFUND_REPORT_VIEW with_FARES(java.math.BigDecimal FARES) {
    this.FARES = FARES;
    return this;
  }
  private String ORDER_NO;
  public String get_ORDER_NO() {
    return ORDER_NO;
  }
  public void set_ORDER_NO(String ORDER_NO) {
    this.ORDER_NO = ORDER_NO;
  }
  public ET_RT_ET_SALES_REFUND_REPORT_VIEW with_ORDER_NO(String ORDER_NO) {
    this.ORDER_NO = ORDER_NO;
    return this;
  }
  private String PATNER_NAME;
  public String get_PATNER_NAME() {
    return PATNER_NAME;
  }
  public void set_PATNER_NAME(String PATNER_NAME) {
    this.PATNER_NAME = PATNER_NAME;
  }
  public ET_RT_ET_SALES_REFUND_REPORT_VIEW with_PATNER_NAME(String PATNER_NAME) {
    this.PATNER_NAME = PATNER_NAME;
    return this;
  }
  private String PAYMENT_NO;
  public String get_PAYMENT_NO() {
    return PAYMENT_NO;
  }
  public void set_PAYMENT_NO(String PAYMENT_NO) {
    this.PAYMENT_NO = PAYMENT_NO;
  }
  public ET_RT_ET_SALES_REFUND_REPORT_VIEW with_PAYMENT_NO(String PAYMENT_NO) {
    this.PAYMENT_NO = PAYMENT_NO;
    return this;
  }
  private String TKT_NM;
  public String get_TKT_NM() {
    return TKT_NM;
  }
  public void set_TKT_NM(String TKT_NM) {
    this.TKT_NM = TKT_NM;
  }
  public ET_RT_ET_SALES_REFUND_REPORT_VIEW with_TKT_NM(String TKT_NM) {
    this.TKT_NM = TKT_NM;
    return this;
  }
  private String CN;
  public String get_CN() {
    return CN;
  }
  public void set_CN(String CN) {
    this.CN = CN;
  }
  public ET_RT_ET_SALES_REFUND_REPORT_VIEW with_CN(String CN) {
    this.CN = CN;
    return this;
  }
  private java.math.BigDecimal REFUND_RATE;
  public java.math.BigDecimal get_REFUND_RATE() {
    return REFUND_RATE;
  }
  public void set_REFUND_RATE(java.math.BigDecimal REFUND_RATE) {
    this.REFUND_RATE = REFUND_RATE;
  }
  public ET_RT_ET_SALES_REFUND_REPORT_VIEW with_REFUND_RATE(java.math.BigDecimal REFUND_RATE) {
    this.REFUND_RATE = REFUND_RATE;
    return this;
  }
  private java.math.BigDecimal REFUND_FARE;
  public java.math.BigDecimal get_REFUND_FARE() {
    return REFUND_FARE;
  }
  public void set_REFUND_FARE(java.math.BigDecimal REFUND_FARE) {
    this.REFUND_FARE = REFUND_FARE;
  }
  public ET_RT_ET_SALES_REFUND_REPORT_VIEW with_REFUND_FARE(java.math.BigDecimal REFUND_FARE) {
    this.REFUND_FARE = REFUND_FARE;
    return this;
  }
  private java.math.BigDecimal RFND_ACTUAL_AMOUNT;
  public java.math.BigDecimal get_RFND_ACTUAL_AMOUNT() {
    return RFND_ACTUAL_AMOUNT;
  }
  public void set_RFND_ACTUAL_AMOUNT(java.math.BigDecimal RFND_ACTUAL_AMOUNT) {
    this.RFND_ACTUAL_AMOUNT = RFND_ACTUAL_AMOUNT;
  }
  public ET_RT_ET_SALES_REFUND_REPORT_VIEW with_RFND_ACTUAL_AMOUNT(java.math.BigDecimal RFND_ACTUAL_AMOUNT) {
    this.RFND_ACTUAL_AMOUNT = RFND_ACTUAL_AMOUNT;
    return this;
  }
  private String REFUNDINFO;
  public String get_REFUNDINFO() {
    return REFUNDINFO;
  }
  public void set_REFUNDINFO(String REFUNDINFO) {
    this.REFUNDINFO = REFUNDINFO;
  }
  public ET_RT_ET_SALES_REFUND_REPORT_VIEW with_REFUNDINFO(String REFUNDINFO) {
    this.REFUNDINFO = REFUNDINFO;
    return this;
  }
  private String ISSUE_DATE;
  public String get_ISSUE_DATE() {
    return ISSUE_DATE;
  }
  public void set_ISSUE_DATE(String ISSUE_DATE) {
    this.ISSUE_DATE = ISSUE_DATE;
  }
  public ET_RT_ET_SALES_REFUND_REPORT_VIEW with_ISSUE_DATE(String ISSUE_DATE) {
    this.ISSUE_DATE = ISSUE_DATE;
    return this;
  }
  private String PNR_NM;
  public String get_PNR_NM() {
    return PNR_NM;
  }
  public void set_PNR_NM(String PNR_NM) {
    this.PNR_NM = PNR_NM;
  }
  public ET_RT_ET_SALES_REFUND_REPORT_VIEW with_PNR_NM(String PNR_NM) {
    this.PNR_NM = PNR_NM;
    return this;
  }
  private String AIRPORT_ORI;
  public String get_AIRPORT_ORI() {
    return AIRPORT_ORI;
  }
  public void set_AIRPORT_ORI(String AIRPORT_ORI) {
    this.AIRPORT_ORI = AIRPORT_ORI;
  }
  public ET_RT_ET_SALES_REFUND_REPORT_VIEW with_AIRPORT_ORI(String AIRPORT_ORI) {
    this.AIRPORT_ORI = AIRPORT_ORI;
    return this;
  }
  private String AIRPORT_DST1;
  public String get_AIRPORT_DST1() {
    return AIRPORT_DST1;
  }
  public void set_AIRPORT_DST1(String AIRPORT_DST1) {
    this.AIRPORT_DST1 = AIRPORT_DST1;
  }
  public ET_RT_ET_SALES_REFUND_REPORT_VIEW with_AIRPORT_DST1(String AIRPORT_DST1) {
    this.AIRPORT_DST1 = AIRPORT_DST1;
    return this;
  }
  private String TKT_COUPON;
  public String get_TKT_COUPON() {
    return TKT_COUPON;
  }
  public void set_TKT_COUPON(String TKT_COUPON) {
    this.TKT_COUPON = TKT_COUPON;
  }
  public ET_RT_ET_SALES_REFUND_REPORT_VIEW with_TKT_COUPON(String TKT_COUPON) {
    this.TKT_COUPON = TKT_COUPON;
    return this;
  }
  private String CABIN_CODE;
  public String get_CABIN_CODE() {
    return CABIN_CODE;
  }
  public void set_CABIN_CODE(String CABIN_CODE) {
    this.CABIN_CODE = CABIN_CODE;
  }
  public ET_RT_ET_SALES_REFUND_REPORT_VIEW with_CABIN_CODE(String CABIN_CODE) {
    this.CABIN_CODE = CABIN_CODE;
    return this;
  }
  private String DN;
  public String get_DN() {
    return DN;
  }
  public void set_DN(String DN) {
    this.DN = DN;
  }
  public ET_RT_ET_SALES_REFUND_REPORT_VIEW with_DN(String DN) {
    this.DN = DN;
    return this;
  }
  private java.math.BigDecimal AGENT_FEE;
  public java.math.BigDecimal get_AGENT_FEE() {
    return AGENT_FEE;
  }
  public void set_AGENT_FEE(java.math.BigDecimal AGENT_FEE) {
    this.AGENT_FEE = AGENT_FEE;
  }
  public ET_RT_ET_SALES_REFUND_REPORT_VIEW with_AGENT_FEE(java.math.BigDecimal AGENT_FEE) {
    this.AGENT_FEE = AGENT_FEE;
    return this;
  }
  private java.math.BigDecimal SP_FEE;
  public java.math.BigDecimal get_SP_FEE() {
    return SP_FEE;
  }
  public void set_SP_FEE(java.math.BigDecimal SP_FEE) {
    this.SP_FEE = SP_FEE;
  }
  public ET_RT_ET_SALES_REFUND_REPORT_VIEW with_SP_FEE(java.math.BigDecimal SP_FEE) {
    this.SP_FEE = SP_FEE;
    return this;
  }
  private String BOOKING_OFFICE_INFO;
  public String get_BOOKING_OFFICE_INFO() {
    return BOOKING_OFFICE_INFO;
  }
  public void set_BOOKING_OFFICE_INFO(String BOOKING_OFFICE_INFO) {
    this.BOOKING_OFFICE_INFO = BOOKING_OFFICE_INFO;
  }
  public ET_RT_ET_SALES_REFUND_REPORT_VIEW with_BOOKING_OFFICE_INFO(String BOOKING_OFFICE_INFO) {
    this.BOOKING_OFFICE_INFO = BOOKING_OFFICE_INFO;
    return this;
  }
  private java.sql.Timestamp CRE_DATE;
  public java.sql.Timestamp get_CRE_DATE() {
    return CRE_DATE;
  }
  public void set_CRE_DATE(java.sql.Timestamp CRE_DATE) {
    this.CRE_DATE = CRE_DATE;
  }
  public ET_RT_ET_SALES_REFUND_REPORT_VIEW with_CRE_DATE(java.sql.Timestamp CRE_DATE) {
    this.CRE_DATE = CRE_DATE;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ET_RT_ET_SALES_REFUND_REPORT_VIEW)) {
      return false;
    }
    ET_RT_ET_SALES_REFUND_REPORT_VIEW that = (ET_RT_ET_SALES_REFUND_REPORT_VIEW) o;
    boolean equal = true;
    equal = equal && (this.PAY_TIME == null ? that.PAY_TIME == null : this.PAY_TIME.equals(that.PAY_TIME));
    equal = equal && (this.FLIGHT_NM == null ? that.FLIGHT_NM == null : this.FLIGHT_NM.equals(that.FLIGHT_NM));
    equal = equal && (this.MARKET_FARE == null ? that.MARKET_FARE == null : this.MARKET_FARE.equals(that.MARKET_FARE));
    equal = equal && (this.NET_FARE == null ? that.NET_FARE == null : this.NET_FARE.equals(that.NET_FARE));
    equal = equal && (this.AIRPORT_TAX == null ? that.AIRPORT_TAX == null : this.AIRPORT_TAX.equals(that.AIRPORT_TAX));
    equal = equal && (this.FUEL_TAX == null ? that.FUEL_TAX == null : this.FUEL_TAX.equals(that.FUEL_TAX));
    equal = equal && (this.FARES == null ? that.FARES == null : this.FARES.equals(that.FARES));
    equal = equal && (this.ORDER_NO == null ? that.ORDER_NO == null : this.ORDER_NO.equals(that.ORDER_NO));
    equal = equal && (this.PATNER_NAME == null ? that.PATNER_NAME == null : this.PATNER_NAME.equals(that.PATNER_NAME));
    equal = equal && (this.PAYMENT_NO == null ? that.PAYMENT_NO == null : this.PAYMENT_NO.equals(that.PAYMENT_NO));
    equal = equal && (this.TKT_NM == null ? that.TKT_NM == null : this.TKT_NM.equals(that.TKT_NM));
    equal = equal && (this.CN == null ? that.CN == null : this.CN.equals(that.CN));
    equal = equal && (this.REFUND_RATE == null ? that.REFUND_RATE == null : this.REFUND_RATE.equals(that.REFUND_RATE));
    equal = equal && (this.REFUND_FARE == null ? that.REFUND_FARE == null : this.REFUND_FARE.equals(that.REFUND_FARE));
    equal = equal && (this.RFND_ACTUAL_AMOUNT == null ? that.RFND_ACTUAL_AMOUNT == null : this.RFND_ACTUAL_AMOUNT.equals(that.RFND_ACTUAL_AMOUNT));
    equal = equal && (this.REFUNDINFO == null ? that.REFUNDINFO == null : this.REFUNDINFO.equals(that.REFUNDINFO));
    equal = equal && (this.ISSUE_DATE == null ? that.ISSUE_DATE == null : this.ISSUE_DATE.equals(that.ISSUE_DATE));
    equal = equal && (this.PNR_NM == null ? that.PNR_NM == null : this.PNR_NM.equals(that.PNR_NM));
    equal = equal && (this.AIRPORT_ORI == null ? that.AIRPORT_ORI == null : this.AIRPORT_ORI.equals(that.AIRPORT_ORI));
    equal = equal && (this.AIRPORT_DST1 == null ? that.AIRPORT_DST1 == null : this.AIRPORT_DST1.equals(that.AIRPORT_DST1));
    equal = equal && (this.TKT_COUPON == null ? that.TKT_COUPON == null : this.TKT_COUPON.equals(that.TKT_COUPON));
    equal = equal && (this.CABIN_CODE == null ? that.CABIN_CODE == null : this.CABIN_CODE.equals(that.CABIN_CODE));
    equal = equal && (this.DN == null ? that.DN == null : this.DN.equals(that.DN));
    equal = equal && (this.AGENT_FEE == null ? that.AGENT_FEE == null : this.AGENT_FEE.equals(that.AGENT_FEE));
    equal = equal && (this.SP_FEE == null ? that.SP_FEE == null : this.SP_FEE.equals(that.SP_FEE));
    equal = equal && (this.BOOKING_OFFICE_INFO == null ? that.BOOKING_OFFICE_INFO == null : this.BOOKING_OFFICE_INFO.equals(that.BOOKING_OFFICE_INFO));
    equal = equal && (this.CRE_DATE == null ? that.CRE_DATE == null : this.CRE_DATE.equals(that.CRE_DATE));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.PAY_TIME = JdbcWritableBridge.readTimestamp(1, __dbResults);
    this.FLIGHT_NM = JdbcWritableBridge.readString(2, __dbResults);
    this.MARKET_FARE = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.NET_FARE = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.AIRPORT_TAX = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.FUEL_TAX = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.FARES = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.ORDER_NO = JdbcWritableBridge.readString(8, __dbResults);
    this.PATNER_NAME = JdbcWritableBridge.readString(9, __dbResults);
    this.PAYMENT_NO = JdbcWritableBridge.readString(10, __dbResults);
    this.TKT_NM = JdbcWritableBridge.readString(11, __dbResults);
    this.CN = JdbcWritableBridge.readString(12, __dbResults);
    this.REFUND_RATE = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.REFUND_FARE = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.RFND_ACTUAL_AMOUNT = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.REFUNDINFO = JdbcWritableBridge.readString(16, __dbResults);
    this.ISSUE_DATE = JdbcWritableBridge.readString(17, __dbResults);
    this.PNR_NM = JdbcWritableBridge.readString(18, __dbResults);
    this.AIRPORT_ORI = JdbcWritableBridge.readString(19, __dbResults);
    this.AIRPORT_DST1 = JdbcWritableBridge.readString(20, __dbResults);
    this.TKT_COUPON = JdbcWritableBridge.readString(21, __dbResults);
    this.CABIN_CODE = JdbcWritableBridge.readString(22, __dbResults);
    this.DN = JdbcWritableBridge.readString(23, __dbResults);
    this.AGENT_FEE = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.SP_FEE = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.BOOKING_OFFICE_INFO = JdbcWritableBridge.readString(26, __dbResults);
    this.CRE_DATE = JdbcWritableBridge.readTimestamp(27, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeTimestamp(PAY_TIME, 1 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(FLIGHT_NM, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MARKET_FARE, 3 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NET_FARE, 4 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AIRPORT_TAX, 5 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FUEL_TAX, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(FARES, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(ORDER_NO, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PATNER_NAME, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PAYMENT_NO, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TKT_NM, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CN, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(REFUND_RATE, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(REFUND_FARE, 14 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(RFND_ACTUAL_AMOUNT, 15 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(REFUNDINFO, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ISSUE_DATE, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PNR_NM, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(AIRPORT_ORI, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(AIRPORT_DST1, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TKT_COUPON, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CABIN_CODE, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DN, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AGENT_FEE, 24 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SP_FEE, 25 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(BOOKING_OFFICE_INFO, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CRE_DATE, 27 + __off, 93, __dbStmt);
    return 27;
  }
  public void readFields(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.PAY_TIME = null;
    } else {
    this.PAY_TIME = new Timestamp(__dataIn.readLong());
    this.PAY_TIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FLIGHT_NM = null;
    } else {
    this.FLIGHT_NM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MARKET_FARE = null;
    } else {
    this.MARKET_FARE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NET_FARE = null;
    } else {
    this.NET_FARE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AIRPORT_TAX = null;
    } else {
    this.AIRPORT_TAX = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FUEL_TAX = null;
    } else {
    this.FUEL_TAX = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FARES = null;
    } else {
    this.FARES = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ORDER_NO = null;
    } else {
    this.ORDER_NO = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PATNER_NAME = null;
    } else {
    this.PATNER_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PAYMENT_NO = null;
    } else {
    this.PAYMENT_NO = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TKT_NM = null;
    } else {
    this.TKT_NM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CN = null;
    } else {
    this.CN = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.REFUND_RATE = null;
    } else {
    this.REFUND_RATE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.REFUND_FARE = null;
    } else {
    this.REFUND_FARE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.RFND_ACTUAL_AMOUNT = null;
    } else {
    this.RFND_ACTUAL_AMOUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.REFUNDINFO = null;
    } else {
    this.REFUNDINFO = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ISSUE_DATE = null;
    } else {
    this.ISSUE_DATE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PNR_NM = null;
    } else {
    this.PNR_NM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AIRPORT_ORI = null;
    } else {
    this.AIRPORT_ORI = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AIRPORT_DST1 = null;
    } else {
    this.AIRPORT_DST1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TKT_COUPON = null;
    } else {
    this.TKT_COUPON = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CABIN_CODE = null;
    } else {
    this.CABIN_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DN = null;
    } else {
    this.DN = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AGENT_FEE = null;
    } else {
    this.AGENT_FEE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SP_FEE = null;
    } else {
    this.SP_FEE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BOOKING_OFFICE_INFO = null;
    } else {
    this.BOOKING_OFFICE_INFO = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CRE_DATE = null;
    } else {
    this.CRE_DATE = new Timestamp(__dataIn.readLong());
    this.CRE_DATE.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.PAY_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.PAY_TIME.getTime());
    __dataOut.writeInt(this.PAY_TIME.getNanos());
    }
    if (null == this.FLIGHT_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FLIGHT_NM);
    }
    if (null == this.MARKET_FARE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MARKET_FARE, __dataOut);
    }
    if (null == this.NET_FARE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NET_FARE, __dataOut);
    }
    if (null == this.AIRPORT_TAX) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AIRPORT_TAX, __dataOut);
    }
    if (null == this.FUEL_TAX) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.FUEL_TAX, __dataOut);
    }
    if (null == this.FARES) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.FARES, __dataOut);
    }
    if (null == this.ORDER_NO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ORDER_NO);
    }
    if (null == this.PATNER_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PATNER_NAME);
    }
    if (null == this.PAYMENT_NO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PAYMENT_NO);
    }
    if (null == this.TKT_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TKT_NM);
    }
    if (null == this.CN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CN);
    }
    if (null == this.REFUND_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.REFUND_RATE, __dataOut);
    }
    if (null == this.REFUND_FARE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.REFUND_FARE, __dataOut);
    }
    if (null == this.RFND_ACTUAL_AMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.RFND_ACTUAL_AMOUNT, __dataOut);
    }
    if (null == this.REFUNDINFO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REFUNDINFO);
    }
    if (null == this.ISSUE_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ISSUE_DATE);
    }
    if (null == this.PNR_NM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PNR_NM);
    }
    if (null == this.AIRPORT_ORI) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, AIRPORT_ORI);
    }
    if (null == this.AIRPORT_DST1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, AIRPORT_DST1);
    }
    if (null == this.TKT_COUPON) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TKT_COUPON);
    }
    if (null == this.CABIN_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CABIN_CODE);
    }
    if (null == this.DN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DN);
    }
    if (null == this.AGENT_FEE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AGENT_FEE, __dataOut);
    }
    if (null == this.SP_FEE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SP_FEE, __dataOut);
    }
    if (null == this.BOOKING_OFFICE_INFO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BOOKING_OFFICE_INFO);
    }
    if (null == this.CRE_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CRE_DATE.getTime());
    __dataOut.writeInt(this.CRE_DATE.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(PAY_TIME==null?"null":"" + PAY_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLIGHT_NM==null?"null":FLIGHT_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MARKET_FARE==null?"null":"" + MARKET_FARE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NET_FARE==null?"null":"" + NET_FARE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AIRPORT_TAX==null?"null":"" + AIRPORT_TAX, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FUEL_TAX==null?"null":"" + FUEL_TAX, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FARES==null?"null":"" + FARES, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ORDER_NO==null?"null":ORDER_NO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PATNER_NAME==null?"null":PATNER_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PAYMENT_NO==null?"null":PAYMENT_NO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TKT_NM==null?"null":TKT_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CN==null?"null":CN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REFUND_RATE==null?"null":"" + REFUND_RATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REFUND_FARE==null?"null":"" + REFUND_FARE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RFND_ACTUAL_AMOUNT==null?"null":"" + RFND_ACTUAL_AMOUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REFUNDINFO==null?"null":REFUNDINFO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ISSUE_DATE==null?"null":ISSUE_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PNR_NM==null?"null":PNR_NM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AIRPORT_ORI==null?"null":AIRPORT_ORI, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AIRPORT_DST1==null?"null":AIRPORT_DST1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TKT_COUPON==null?"null":TKT_COUPON, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CABIN_CODE==null?"null":CABIN_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DN==null?"null":DN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AGENT_FEE==null?"null":"" + AGENT_FEE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SP_FEE==null?"null":"" + SP_FEE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BOOKING_OFFICE_INFO==null?"null":BOOKING_OFFICE_INFO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CRE_DATE==null?"null":"" + CRE_DATE, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PAY_TIME = null; } else {
      this.PAY_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FLIGHT_NM = null; } else {
      this.FLIGHT_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.MARKET_FARE = null; } else {
      this.MARKET_FARE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.NET_FARE = null; } else {
      this.NET_FARE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.AIRPORT_TAX = null; } else {
      this.AIRPORT_TAX = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FUEL_TAX = null; } else {
      this.FUEL_TAX = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FARES = null; } else {
      this.FARES = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ORDER_NO = null; } else {
      this.ORDER_NO = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PATNER_NAME = null; } else {
      this.PATNER_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PAYMENT_NO = null; } else {
      this.PAYMENT_NO = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TKT_NM = null; } else {
      this.TKT_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CN = null; } else {
      this.CN = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.REFUND_RATE = null; } else {
      this.REFUND_RATE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.REFUND_FARE = null; } else {
      this.REFUND_FARE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.RFND_ACTUAL_AMOUNT = null; } else {
      this.RFND_ACTUAL_AMOUNT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.REFUNDINFO = null; } else {
      this.REFUNDINFO = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ISSUE_DATE = null; } else {
      this.ISSUE_DATE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PNR_NM = null; } else {
      this.PNR_NM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.AIRPORT_ORI = null; } else {
      this.AIRPORT_ORI = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.AIRPORT_DST1 = null; } else {
      this.AIRPORT_DST1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TKT_COUPON = null; } else {
      this.TKT_COUPON = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CABIN_CODE = null; } else {
      this.CABIN_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DN = null; } else {
      this.DN = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.AGENT_FEE = null; } else {
      this.AGENT_FEE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SP_FEE = null; } else {
      this.SP_FEE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BOOKING_OFFICE_INFO = null; } else {
      this.BOOKING_OFFICE_INFO = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CRE_DATE = null; } else {
      this.CRE_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

  }

  public Object clone() throws CloneNotSupportedException {
    ET_RT_ET_SALES_REFUND_REPORT_VIEW o = (ET_RT_ET_SALES_REFUND_REPORT_VIEW) super.clone();
    o.PAY_TIME = (o.PAY_TIME != null) ? (java.sql.Timestamp) o.PAY_TIME.clone() : null;
    o.CRE_DATE = (o.CRE_DATE != null) ? (java.sql.Timestamp) o.CRE_DATE.clone() : null;
    return o;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("PAY_TIME", this.PAY_TIME);
    __sqoop$field_map.put("FLIGHT_NM", this.FLIGHT_NM);
    __sqoop$field_map.put("MARKET_FARE", this.MARKET_FARE);
    __sqoop$field_map.put("NET_FARE", this.NET_FARE);
    __sqoop$field_map.put("AIRPORT_TAX", this.AIRPORT_TAX);
    __sqoop$field_map.put("FUEL_TAX", this.FUEL_TAX);
    __sqoop$field_map.put("FARES", this.FARES);
    __sqoop$field_map.put("ORDER_NO", this.ORDER_NO);
    __sqoop$field_map.put("PATNER_NAME", this.PATNER_NAME);
    __sqoop$field_map.put("PAYMENT_NO", this.PAYMENT_NO);
    __sqoop$field_map.put("TKT_NM", this.TKT_NM);
    __sqoop$field_map.put("CN", this.CN);
    __sqoop$field_map.put("REFUND_RATE", this.REFUND_RATE);
    __sqoop$field_map.put("REFUND_FARE", this.REFUND_FARE);
    __sqoop$field_map.put("RFND_ACTUAL_AMOUNT", this.RFND_ACTUAL_AMOUNT);
    __sqoop$field_map.put("REFUNDINFO", this.REFUNDINFO);
    __sqoop$field_map.put("ISSUE_DATE", this.ISSUE_DATE);
    __sqoop$field_map.put("PNR_NM", this.PNR_NM);
    __sqoop$field_map.put("AIRPORT_ORI", this.AIRPORT_ORI);
    __sqoop$field_map.put("AIRPORT_DST1", this.AIRPORT_DST1);
    __sqoop$field_map.put("TKT_COUPON", this.TKT_COUPON);
    __sqoop$field_map.put("CABIN_CODE", this.CABIN_CODE);
    __sqoop$field_map.put("DN", this.DN);
    __sqoop$field_map.put("AGENT_FEE", this.AGENT_FEE);
    __sqoop$field_map.put("SP_FEE", this.SP_FEE);
    __sqoop$field_map.put("BOOKING_OFFICE_INFO", this.BOOKING_OFFICE_INFO);
    __sqoop$field_map.put("CRE_DATE", this.CRE_DATE);
    return __sqoop$field_map;
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("PAY_TIME".equals(__fieldName)) {
      this.PAY_TIME = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("FLIGHT_NM".equals(__fieldName)) {
      this.FLIGHT_NM = (String) __fieldVal;
    }
    else    if ("MARKET_FARE".equals(__fieldName)) {
      this.MARKET_FARE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("NET_FARE".equals(__fieldName)) {
      this.NET_FARE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("AIRPORT_TAX".equals(__fieldName)) {
      this.AIRPORT_TAX = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("FUEL_TAX".equals(__fieldName)) {
      this.FUEL_TAX = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("FARES".equals(__fieldName)) {
      this.FARES = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("ORDER_NO".equals(__fieldName)) {
      this.ORDER_NO = (String) __fieldVal;
    }
    else    if ("PATNER_NAME".equals(__fieldName)) {
      this.PATNER_NAME = (String) __fieldVal;
    }
    else    if ("PAYMENT_NO".equals(__fieldName)) {
      this.PAYMENT_NO = (String) __fieldVal;
    }
    else    if ("TKT_NM".equals(__fieldName)) {
      this.TKT_NM = (String) __fieldVal;
    }
    else    if ("CN".equals(__fieldName)) {
      this.CN = (String) __fieldVal;
    }
    else    if ("REFUND_RATE".equals(__fieldName)) {
      this.REFUND_RATE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("REFUND_FARE".equals(__fieldName)) {
      this.REFUND_FARE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("RFND_ACTUAL_AMOUNT".equals(__fieldName)) {
      this.RFND_ACTUAL_AMOUNT = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("REFUNDINFO".equals(__fieldName)) {
      this.REFUNDINFO = (String) __fieldVal;
    }
    else    if ("ISSUE_DATE".equals(__fieldName)) {
      this.ISSUE_DATE = (String) __fieldVal;
    }
    else    if ("PNR_NM".equals(__fieldName)) {
      this.PNR_NM = (String) __fieldVal;
    }
    else    if ("AIRPORT_ORI".equals(__fieldName)) {
      this.AIRPORT_ORI = (String) __fieldVal;
    }
    else    if ("AIRPORT_DST1".equals(__fieldName)) {
      this.AIRPORT_DST1 = (String) __fieldVal;
    }
    else    if ("TKT_COUPON".equals(__fieldName)) {
      this.TKT_COUPON = (String) __fieldVal;
    }
    else    if ("CABIN_CODE".equals(__fieldName)) {
      this.CABIN_CODE = (String) __fieldVal;
    }
    else    if ("DN".equals(__fieldName)) {
      this.DN = (String) __fieldVal;
    }
    else    if ("AGENT_FEE".equals(__fieldName)) {
      this.AGENT_FEE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("SP_FEE".equals(__fieldName)) {
      this.SP_FEE = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("BOOKING_OFFICE_INFO".equals(__fieldName)) {
      this.BOOKING_OFFICE_INFO = (String) __fieldVal;
    }
    else    if ("CRE_DATE".equals(__fieldName)) {
      this.CRE_DATE = (java.sql.Timestamp) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
}
