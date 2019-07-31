(ns org.datavec.api.transform.stringreduce.IStringReducer
  "A reducer aggregates or combines
 a set of examples into
 a single List"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.stringreduce IStringReducer]))

(defn set-input-schema
  "schema - `org.datavec.api.transform.schema.Schema`"
  ([^IStringReducer this ^org.datavec.api.transform.schema.Schema schema]
    (-> this (.setInputSchema schema))))

(defn get-input-schema
  "returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^IStringReducer this]
    (-> this (.getInputSchema))))

(defn transform
  "schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^IStringReducer this ^org.datavec.api.transform.schema.Schema schema]
    (-> this (.transform schema))))

(defn reduce
  "examples-list - `java.util.List`

  returns: `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^IStringReducer this ^java.util.List examples-list]
    (-> this (.reduce examples-list))))

(defn get-input-columns
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^IStringReducer this]
    (-> this (.getInputColumns))))

