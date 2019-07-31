(ns org.datavec.api.transform.filter.Filter
  "Filter: a method of removing examples
 (or sequences) according to some condition"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.filter Filter]))

(defn remove-example
  "example - Example - `java.lang.Object`

  returns: true if example should be removed, false to keep - `boolean`"
  (^Boolean [^Filter this ^java.lang.Object example]
    (-> this (.removeExample example))))

(defn remove-sequence
  "sequence - sequence example - `java.lang.Object`

  returns: true if example should be removed, false to keep - `boolean`"
  (^Boolean [^Filter this ^java.lang.Object sequence]
    (-> this (.removeSequence sequence))))

(defn set-input-schema
  "Description copied from interface: ColumnOp

  schema - `org.datavec.api.transform.schema.Schema`"
  ([^Filter this ^org.datavec.api.transform.schema.Schema schema]
    (-> this (.setInputSchema schema))))

(defn get-input-schema
  "Description copied from interface: ColumnOp

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^Filter this]
    (-> this (.getInputSchema))))

