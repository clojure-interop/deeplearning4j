(ns org.datavec.api.transform.transform.longtransform.LongMathOpTransform
  "Long mathematical operation.
 This is an in-place operation of the long column value and an long scalar."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.longtransform LongMathOpTransform]))

(defn ->long-math-op-transform
  "Constructor.

  column-name - `java.lang.String`
  math-op - `org.datavec.api.transform.MathOp`
  scalar - `long`"
  (^LongMathOpTransform [^java.lang.String column-name ^org.datavec.api.transform.MathOp math-op ^Long scalar]
    (new LongMathOpTransform column-name math-op scalar)))

(defn get-new-column-meta-data
  "new-name - `java.lang.String`
  old-column-type - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: `org.datavec.api.transform.metadata.ColumnMetaData`"
  (^org.datavec.api.transform.metadata.ColumnMetaData [^LongMathOpTransform this ^java.lang.String new-name ^org.datavec.api.transform.metadata.ColumnMetaData old-column-type]
    (-> this (.getNewColumnMetaData new-name old-column-type))))

(defn map
  "Transform an object
  in to another object

  input - the record to transform - `java.lang.Object`

  returns: the transformed writable - `java.lang.Object`"
  (^java.lang.Object [^LongMathOpTransform this ^java.lang.Object input]
    (-> this (.map input))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LongMathOpTransform this]
    (-> this (.toString))))

