(ns org.datavec.api.transform.ndarray.NDArrayColumnsMathOpTransform
  "Perform an element wise mathematical operation on 2 or more NDArray columns"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ndarray NDArrayColumnsMathOpTransform]))

(defn ->nd-array-columns-math-op-transform
  "Constructor.

  new-column-name - `java.lang.String`
  math-op - `org.datavec.api.transform.MathOp`
  columns - `java.lang.String`"
  (^NDArrayColumnsMathOpTransform [^java.lang.String new-column-name ^org.datavec.api.transform.MathOp math-op ^java.lang.String columns]
    (new NDArrayColumnsMathOpTransform new-column-name math-op columns)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NDArrayColumnsMathOpTransform this]
    (-> this (.toString))))

(defn map
  "Description copied from interface: Transform

  input - the record to transform - `java.lang.Object`

  returns: the transformed writable - `java.lang.Object`"
  (^java.lang.Object [^NDArrayColumnsMathOpTransform this ^java.lang.Object input]
    (-> this (.map input))))

(defn map-sequence
  "Description copied from interface: Transform

  sequence - `java.lang.Object`

  returns: `java.lang.Object`"
  (^java.lang.Object [^NDArrayColumnsMathOpTransform this ^java.lang.Object sequence]
    (-> this (.mapSequence sequence))))

