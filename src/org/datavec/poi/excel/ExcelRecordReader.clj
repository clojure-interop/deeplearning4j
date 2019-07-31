(ns org.datavec.poi.excel.ExcelRecordReader
  "Excel record reader for loading rows of an excel spreadsheet
 from multiple spreadsheets very similar to the
 CSVRecordReader
 Of note when you have multiple sheets, you must have the same number of
 lines skipped at the top. For example, if you have a header as follows:
 Header1 Header2 Header3
 1 2 3
 4 5 6
 Any other sheet you are trying to parse must also contain the
 same number of header lines."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.poi.excel ExcelRecordReader]))

(defn ->excel-record-reader
  "Constructor.

  Skip skipNumLines number of lines

  skip-num-lines - the number of lines to skip - `int`"
  (^ExcelRecordReader [^Integer skip-num-lines]
    (new ExcelRecordReader skip-num-lines))
  (^ExcelRecordReader []
    (new ExcelRecordReader )))

(def *-skip-num-lines
  "Static Constant.

  type: java.lang.String"
  ExcelRecordReader/SKIP_NUM_LINES)

(defn has-next?
  "Description copied from interface: RecordReader

  returns: `boolean`"
  (^Boolean [^ExcelRecordReader this]
    (-> this (.hasNext))))

(defn next
  "Description copied from interface: RecordReader

  returns: `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^ExcelRecordReader this]
    (-> this (.next))))

(defn next-record
  "Description copied from interface: RecordReader

  returns: next record - `org.datavec.api.records.Record`"
  (^org.datavec.api.records.Record [^ExcelRecordReader this]
    (-> this (.nextRecord))))

(defn initialize
  "Description copied from interface: RecordReader

  conf - a configuration for initialization - `org.datavec.api.conf.Configuration`
  split - the split that defines the range of records to read - `org.datavec.api.split.InputSplit`

  throws: java.io.IOException"
  ([^ExcelRecordReader this ^org.datavec.api.conf.Configuration conf ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize conf split))))

(defn reset
  "Description copied from interface: RecordReader"
  ([^ExcelRecordReader this]
    (-> this (.reset))))

