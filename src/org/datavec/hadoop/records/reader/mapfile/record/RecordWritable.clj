(ns org.datavec.hadoop.records.reader.mapfile.record.RecordWritable
  "Created by Alex on 29/05/2017."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.hadoop.records.reader.mapfile.record RecordWritable]))

(defn ->record-writable
  "Constructor."
  (^RecordWritable []
    (new RecordWritable )))

(defn write
  "out - `java.io.DataOutput`

  throws: java.io.IOException"
  ([^RecordWritable this ^java.io.DataOutput out]
    (-> this (.write out))))

(defn read-fields
  "in - `java.io.DataInput`

  throws: java.io.IOException"
  ([^RecordWritable this ^java.io.DataInput in]
    (-> this (.readFields in))))

