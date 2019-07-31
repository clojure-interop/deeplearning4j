(ns org.datavec.api.transform.filter.BaseColumnFilter
  "Abstract class for filtering examples
 based on the values in a
 single column"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.filter BaseColumnFilter]))

(defn remove-example
  "Should the example or sequence be removed, based on the values from the specified column?

  writable - `org.datavec.api.writable.Writable`

  returns: `boolean`"
  (^Boolean [^BaseColumnFilter this ^org.datavec.api.writable.Writable writable]
    (-> this (.removeExample writable))))

(defn remove-sequence
  "sequence - sequence example - `java.util.List`

  returns: true if example should be removed, false to keep - `boolean`"
  (^Boolean [^BaseColumnFilter this ^java.util.List sequence]
    (-> this (.removeSequence sequence))))

(defn set-input-schema
  "Description copied from interface: ColumnOp

  schema - `org.datavec.api.transform.schema.Schema`"
  ([^BaseColumnFilter this ^org.datavec.api.transform.schema.Schema schema]
    (-> this (.setInputSchema schema))))

