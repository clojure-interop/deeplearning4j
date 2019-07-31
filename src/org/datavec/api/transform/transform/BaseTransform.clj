(ns org.datavec.api.transform.transform.BaseTransform
  "BaseTransform: an
 abstract transform class, that handles transforming
 sequences by transforming
 each example individually"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform BaseTransform]))

(defn ->base-transform
  "Constructor."
  (^BaseTransform []
    (new BaseTransform )))

(defn set-input-schema
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`"
  ([^BaseTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.setInputSchema input-schema))))

(defn get-input-schema
  "Description copied from interface: ColumnOp

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^BaseTransform this]
    (-> this (.getInputSchema))))

(defn map-sequence
  "Description copied from interface: Transform

  sequence - `java.util.List`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^BaseTransform this ^java.util.List sequence]
    (-> this (.mapSequence sequence))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BaseTransform this]
    (-> this (.toString))))

