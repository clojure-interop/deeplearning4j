(ns org.datavec.api.transform.transform.floattransform.FloatColumnsMathOpTransform
  "Add a new float column, calculated from one or more other columns. A new column (with the specified name) is added
 as the final column of the output. No other columns are modified.
 For example, if newColumnName==\"newCol\", mathOp==Add, and columns=={\"col1\",\"col2\"}, then the output column
 with name \"newCol\" has value col1+col2."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.floattransform FloatColumnsMathOpTransform]))

(defn ->float-columns-math-op-transform
  "Constructor.

  new-column-name - `java.lang.String`
  math-op - `org.datavec.api.transform.MathOp`
  columns - `java.util.List`"
  (^FloatColumnsMathOpTransform [^java.lang.String new-column-name ^org.datavec.api.transform.MathOp math-op ^java.util.List columns]
    (new FloatColumnsMathOpTransform new-column-name math-op columns)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^FloatColumnsMathOpTransform this]
    (-> this (.toString))))

(defn map
  "Transform an object
  in to another object

  input - the record to transform - `java.lang.Object`

  returns: the transformed writable - `java.lang.Object`"
  (^java.lang.Object [^FloatColumnsMathOpTransform this ^java.lang.Object input]
    (-> this (.map input))))

(defn map-sequence
  "Transform a sequence

  sequence - `java.lang.Object`

  returns: `java.lang.Object`"
  (^java.lang.Object [^FloatColumnsMathOpTransform this ^java.lang.Object sequence]
    (-> this (.mapSequence sequence))))

