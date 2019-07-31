(ns org.datavec.api.transform.transform.longtransform.LongColumnsMathOpTransform
  "Add a new long column, calculated from one or more other columns. A new column (with the specified name) is added
 as the final column of the output. No other columns are modified.
 For example, if newColumnName==\"newCol\", mathOp==MathOp.Add, and columns=={\"col1\",\"col2\"}, then the output column
 with name \"newCol\" has value col1+col2.
 NOTE: Division here is using long division (long output). Use DoubleColumnsMathOpTransform
 if a decimal output value is required."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.longtransform LongColumnsMathOpTransform]))

(defn ->long-columns-math-op-transform
  "Constructor.

  new-column-name - `java.lang.String`
  math-op - `org.datavec.api.transform.MathOp`
  columns - `java.lang.String`"
  (^LongColumnsMathOpTransform [^java.lang.String new-column-name ^org.datavec.api.transform.MathOp math-op ^java.lang.String columns]
    (new LongColumnsMathOpTransform new-column-name math-op columns)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LongColumnsMathOpTransform this]
    (-> this (.toString))))

(defn map
  "Transform an object
  in to another object

  input - the record to transform - `java.lang.Object`

  returns: the transformed writable - `java.lang.Object`"
  (^java.lang.Object [^LongColumnsMathOpTransform this ^java.lang.Object input]
    (-> this (.map input))))

(defn map-sequence
  "Transform a sequence

  sequence - `java.lang.Object`

  returns: `java.lang.Object`"
  (^java.lang.Object [^LongColumnsMathOpTransform this ^java.lang.Object sequence]
    (-> this (.mapSequence sequence))))

