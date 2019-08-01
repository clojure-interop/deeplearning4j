(ns org.datavec.api.vector.Vectorizer
  "Vectorizer of a particular type.
 Meant for converting individual records to vectors"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.vector Vectorizer]))

(defn create-vector
  "Create a vector based on the given arguments

  args - the arguments to create a vector with - `java.lang.Object[]`

  returns: the created vector - `VECTOR_TYPE`"
  ([^Vectorizer this args]
    (-> this (.createVector args))))

(defn initialize
  "Initialize based on a configuration

  conf - the configuration to use - `org.datavec.api.conf.Configuration`"
  ([^Vectorizer this ^org.datavec.api.conf.Configuration conf]
    (-> this (.initialize conf))))

(defn fit
  "Fit based on a record reader

  reader - `org.datavec.api.records.reader.RecordReader`
  call-back - `org.datavec.api.vector.Vectorizer$RecordCallBack`"
  ([^Vectorizer this ^org.datavec.api.records.reader.RecordReader reader ^org.datavec.api.vector.Vectorizer$RecordCallBack call-back]
    (-> this (.fit reader call-back)))
  ([^Vectorizer this ^org.datavec.api.records.reader.RecordReader reader]
    (-> this (.fit reader))))

(defn fit-transform
  "Fit based on a record reader

  reader - `org.datavec.api.records.reader.RecordReader`
  call-back - `org.datavec.api.vector.Vectorizer$RecordCallBack`

  returns: `VECTOR_TYPE`"
  ([^Vectorizer this ^org.datavec.api.records.reader.RecordReader reader ^org.datavec.api.vector.Vectorizer$RecordCallBack call-back]
    (-> this (.fitTransform reader call-back)))
  ([^Vectorizer this ^org.datavec.api.records.reader.RecordReader reader]
    (-> this (.fitTransform reader))))

(defn transform
  "Transform a record in to a vector

  record - the record to write - `org.datavec.api.records.Record`

  returns: `VECTOR_TYPE`"
  ([^Vectorizer this ^org.datavec.api.records.Record record]
    (-> this (.transform record))))

