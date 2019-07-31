(ns org.datavec.api.transform.transform.integer.IntegerColumnsMathOpTransform
  "Add a new integer column, calculated from one or more other columns.
 A new column (with the specified name) is added
 as the final column of the output. No other columns are modified.
 For example, if newColumnName==\"newCol\", mathOp==MathOp.Add, and columns=={\"col1\",\"col2\"},
 then the output column
 with name \"newCol\" has value col1+col2.
 NOTE: Division here is using
 integer division (integer output). Use DoubleColumnsMathOpTransform
 if a decimal output value is required."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.integer IntegerColumnsMathOpTransform]))

(defn ->integer-columns-math-op-transform
  "Constructor.

  new-column-name - Name of the new column (output column) - `java.lang.String`
  math-op - Mathematical operation. Only Add/Subtract/Multiply/Divide/Modulus is allowed here - `org.datavec.api.transform.MathOp`
  columns - Columns to use in the mathematical operation - `java.lang.String`"
  (^IntegerColumnsMathOpTransform [^java.lang.String new-column-name ^org.datavec.api.transform.MathOp math-op ^java.lang.String columns]
    (new IntegerColumnsMathOpTransform new-column-name math-op columns)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^IntegerColumnsMathOpTransform this]
    (-> this (.toString))))

(defn map
  "Transform an object
  in to another object

  input - the record to transform - `java.lang.Object`

  returns: the transformed writable - `java.lang.Object`"
  (^java.lang.Object [^IntegerColumnsMathOpTransform this ^java.lang.Object input]
    (-> this (.map input))))

(defn map-sequence
  "Transform a sequence

  sequence - `java.lang.Object`

  returns: `java.lang.Object`"
  (^java.lang.Object [^IntegerColumnsMathOpTransform this ^java.lang.Object sequence]
    (-> this (.mapSequence sequence))))

