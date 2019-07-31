(ns org.datavec.api.transform.ndarray.NDArrayScalarOpTransform
  "Perform an NDArray/scalar element wise operation, such as X.addi(scalar).
 Element wise operations are performed in place on each value of the underlying INDArray"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ndarray NDArrayScalarOpTransform]))

(defn ->nd-array-scalar-op-transform
  "Constructor.

  column-name - Name of the column to perform the operation on - `java.lang.String`
  math-op - Operation to perform - `org.datavec.api.transform.MathOp`
  scalar - Scalar value for the operation - `double`"
  (^NDArrayScalarOpTransform [^java.lang.String column-name ^org.datavec.api.transform.MathOp math-op ^Double scalar]
    (new NDArrayScalarOpTransform column-name math-op scalar)))

(defn get-new-column-meta-data
  "new-name - `java.lang.String`
  old-column-type - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: `org.datavec.api.transform.metadata.ColumnMetaData`"
  (^org.datavec.api.transform.metadata.ColumnMetaData [^NDArrayScalarOpTransform this ^java.lang.String new-name ^org.datavec.api.transform.metadata.ColumnMetaData old-column-type]
    (-> this (.getNewColumnMetaData new-name old-column-type))))

(defn map
  "Description copied from interface: Transform

  input - the record to transform - `java.lang.Object`

  returns: the transformed writable - `java.lang.Object`"
  (^java.lang.Object [^NDArrayScalarOpTransform this ^java.lang.Object input]
    (-> this (.map input))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NDArrayScalarOpTransform this]
    (-> this (.toString))))

