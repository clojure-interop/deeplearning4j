(ns org.datavec.spark.functions.pairdata.BytesPairWritable
  "A Hadoop writable class for a pair of byte arrays, plus the original URIs (as Strings) of the files they came from"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.functions.pairdata BytesPairWritable]))

(defn ->bytes-pair-writable
  "Constructor.

  first - `byte[]`
  second - `byte[]`
  uri-first - `java.lang.String`
  uri-second - `java.lang.String`"
  (^BytesPairWritable [first second ^java.lang.String uri-first ^java.lang.String uri-second]
    (new BytesPairWritable first second uri-first uri-second))
  (^BytesPairWritable []
    (new BytesPairWritable )))

(defn get-first
  "returns: `byte[]`"
  ([^BytesPairWritable this]
    (-> this (.getFirst))))

(defn set-second
  "second - `byte[]`"
  ([^BytesPairWritable this second]
    (-> this (.setSecond second))))

(defn read-fields
  "data-input - `java.io.DataInput`

  throws: java.io.IOException"
  ([^BytesPairWritable this ^java.io.DataInput data-input]
    (-> this (.readFields data-input))))

(defn get-second
  "returns: `byte[]`"
  ([^BytesPairWritable this]
    (-> this (.getSecond))))

(defn get-uri-second
  "returns: `java.lang.String`"
  (^java.lang.String [^BytesPairWritable this]
    (-> this (.getUriSecond))))

(defn set-uri-first
  "uri-first - `java.lang.String`"
  ([^BytesPairWritable this ^java.lang.String uri-first]
    (-> this (.setUriFirst uri-first))))

(defn set-uri-second
  "uri-second - `java.lang.String`"
  ([^BytesPairWritable this ^java.lang.String uri-second]
    (-> this (.setUriSecond uri-second))))

(defn get-uri-first
  "returns: `java.lang.String`"
  (^java.lang.String [^BytesPairWritable this]
    (-> this (.getUriFirst))))

(defn set-first
  "first - `byte[]`"
  ([^BytesPairWritable this first]
    (-> this (.setFirst first))))

(defn write
  "data-output - `java.io.DataOutput`

  throws: java.io.IOException"
  ([^BytesPairWritable this ^java.io.DataOutput data-output]
    (-> this (.write data-output))))

