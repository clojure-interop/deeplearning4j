(ns org.datavec.api.transform.transform.integer.IntegerMathOpTransform
  "Integer mathematical operation.
 This is an in-place operation of the integer column value and an integer scalar."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.integer IntegerMathOpTransform]))

(defn ->integer-math-op-transform
  "Constructor.

  column-name - `java.lang.String`
  math-op - `org.datavec.api.transform.MathOp`
  scalar - `int`"
  (^IntegerMathOpTransform [^java.lang.String column-name ^org.datavec.api.transform.MathOp math-op ^Integer scalar]
    (new IntegerMathOpTransform column-name math-op scalar)))

(defn get-new-column-meta-data
  "new-column-name - `java.lang.String`
  old-column-type - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: `org.datavec.api.transform.metadata.ColumnMetaData`"
  (^org.datavec.api.transform.metadata.ColumnMetaData [^IntegerMathOpTransform this ^java.lang.String new-column-name ^org.datavec.api.transform.metadata.ColumnMetaData old-column-type]
    (-> this (.getNewColumnMetaData new-column-name old-column-type))))

(defn map
  "Transform an object
  in to another object

  input - the record to transform - `java.lang.Object`

  returns: the transformed writable - `java.lang.Object`"
  (^java.lang.Object [^IntegerMathOpTransform this ^java.lang.Object input]
    (-> this (.map input))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^IntegerMathOpTransform this]
    (-> this (.toString))))

