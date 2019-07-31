(ns org.datavec.nlp.reader.TfidfRecordReader
  "TFIDF record reader (wraps a tfidf vectorizer
 for delivering labels and conforming to the record reader interface)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.nlp.reader TfidfRecordReader]))

(defn ->tfidf-record-reader
  "Constructor."
  (^TfidfRecordReader []
    (new TfidfRecordReader )))

(defn next
  "Description copied from interface: RecordReader

  returns: `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^TfidfRecordReader this]
    (-> this (.next))))

(defn set-conf
  "Description copied from interface: Configurable

  conf - `org.datavec.api.conf.Configuration`"
  ([^TfidfRecordReader this ^org.datavec.api.conf.Configuration conf]
    (-> this (.setConf conf))))

(defn set-tfidf-vectorizer
  "tfidf-vectorizer - `org.datavec.nlp.vectorizer.TfidfVectorizer`"
  ([^TfidfRecordReader this ^org.datavec.nlp.vectorizer.TfidfVectorizer tfidf-vectorizer]
    (-> this (.setTfidfVectorizer tfidf-vectorizer))))

(defn get-conf
  "Description copied from interface: Configurable

  returns: `org.datavec.api.conf.Configuration`"
  (^org.datavec.api.conf.Configuration [^TfidfRecordReader this]
    (-> this (.getConf))))

(defn shuffle
  "random - `java.util.Random`"
  ([^TfidfRecordReader this ^java.util.Random random]
    (-> this (.shuffle random)))
  ([^TfidfRecordReader this]
    (-> this (.shuffle))))

(defn reset
  "Description copied from interface: RecordReader"
  ([^TfidfRecordReader this]
    (-> this (.reset))))

(defn get-tfidf-vectorizer
  "returns: `org.datavec.nlp.vectorizer.TfidfVectorizer`"
  (^org.datavec.nlp.vectorizer.TfidfVectorizer [^TfidfRecordReader this]
    (-> this (.getTfidfVectorizer))))

(defn next-record
  "Description copied from interface: RecordReader

  returns: next record - `org.datavec.api.records.Record`"
  (^org.datavec.api.records.Record [^TfidfRecordReader this]
    (-> this (.nextRecord))))

(defn has-next?
  "Description copied from interface: RecordReader

  returns: `boolean`"
  (^Boolean [^TfidfRecordReader this]
    (-> this (.hasNext))))

(defn load-from-meta-data
  "Description copied from interface: RecordReader

  record-meta-data - Metadata for the record that we want to load from - `org.datavec.api.records.metadata.RecordMetaData`

  returns: Single record for the given RecordMetaData instance - `org.datavec.api.records.Record`

  throws: java.io.IOException - If I/O error occurs during loading"
  (^org.datavec.api.records.Record [^TfidfRecordReader this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadFromMetaData record-meta-data))))

(defn close
  "throws: java.io.IOException"
  ([^TfidfRecordReader this]
    (-> this (.close))))

(defn initialize
  "Description copied from interface: RecordReader

  conf - a configuration for initialization - `org.datavec.api.conf.Configuration`
  split - the split that defines the range of records to read - `org.datavec.api.split.InputSplit`

  throws: java.io.IOException"
  ([^TfidfRecordReader this ^org.datavec.api.conf.Configuration conf ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize conf split)))
  ([^TfidfRecordReader this ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize split))))

(defn get-num-features
  "returns: `int`"
  (^Integer [^TfidfRecordReader this]
    (-> this (.getNumFeatures))))

