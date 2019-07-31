(ns org.datavec.api.transform.transform.floattransform.FloatMathOpTransform
  "Float mathematical operation.
 This is an in-place operation of the float column value and a float scalar."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.floattransform FloatMathOpTransform]))

(defn ->float-math-op-transform
  "Constructor.

  column-name - `java.lang.String`
  math-op - `org.datavec.api.transform.MathOp`
  scalar - `float`"
  (^FloatMathOpTransform [^java.lang.String column-name ^org.datavec.api.transform.MathOp math-op ^Float scalar]
    (new FloatMathOpTransform column-name math-op scalar)))

(defn get-new-column-meta-data
  "new-column-name - `java.lang.String`
  old-column-type - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: `org.datavec.api.transform.metadata.ColumnMetaData`"
  (^org.datavec.api.transform.metadata.ColumnMetaData [^FloatMathOpTransform this ^java.lang.String new-column-name ^org.datavec.api.transform.metadata.ColumnMetaData old-column-type]
    (-> this (.getNewColumnMetaData new-column-name old-column-type))))

(defn map
  "Transform an object
  in to another object

  input - the record to transform - `java.lang.Object`

  returns: the transformed writable - `java.lang.Object`"
  (^java.lang.Object [^FloatMathOpTransform this ^java.lang.Object input]
    (-> this (.map input))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^FloatMathOpTransform this]
    (-> this (.toString))))

(defn map-sequence
  "Transform a sequence

  sequence - `java.lang.Object`

  returns: `java.lang.Object`"
  (^java.lang.Object [^FloatMathOpTransform this ^java.lang.Object sequence]
    (-> this (.mapSequence sequence))))

