(ns org.datavec.api.transform.transform.time.TimeMathOpTransform
  "Transform math op on a time column

 Note: only the following MathOps are supported: Add, Subtract, ScalarMin, ScalarMax
 For ScalarMin/Max, the TimeUnit must be milliseconds - i.e., value must be in epoch millisecond format"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.time TimeMathOpTransform]))

(defn ->time-math-op-transform
  "Constructor.

  column-name - `java.lang.String`
  math-op - `org.datavec.api.transform.MathOp`
  time-quantity - `long`
  time-unit - `java.util.concurrent.TimeUnit`"
  (^TimeMathOpTransform [^java.lang.String column-name ^org.datavec.api.transform.MathOp math-op ^Long time-quantity ^java.util.concurrent.TimeUnit time-unit]
    (new TimeMathOpTransform column-name math-op time-quantity time-unit)))

(defn get-new-column-meta-data
  "new-name - `java.lang.String`
  old-column-type - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: `org.datavec.api.transform.metadata.ColumnMetaData`"
  (^org.datavec.api.transform.metadata.ColumnMetaData [^TimeMathOpTransform this ^java.lang.String new-name ^org.datavec.api.transform.metadata.ColumnMetaData old-column-type]
    (-> this (.getNewColumnMetaData new-name old-column-type))))

(defn map
  "Transform an object
  in to another object

  input - the record to transform - `java.lang.Object`

  returns: the transformed writable - `java.lang.Object`"
  (^java.lang.Object [^TimeMathOpTransform this ^java.lang.Object input]
    (-> this (.map input))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TimeMathOpTransform this]
    (-> this (.toString))))

