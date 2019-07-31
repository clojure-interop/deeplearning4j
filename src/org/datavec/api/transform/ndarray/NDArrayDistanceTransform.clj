(ns org.datavec.api.transform.ndarray.NDArrayDistanceTransform
  "Calculate the distance (cosine similarity, EUCLIDEAN, MANHATTAN) between two INDArrays"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ndarray NDArrayDistanceTransform]))

(defn ->nd-array-distance-transform
  "Constructor.

  new-column-name - `java.lang.String`
  distance - `org.datavec.api.transform.Distance`
  first-col - `java.lang.String`
  second-col - `java.lang.String`"
  (^NDArrayDistanceTransform [^java.lang.String new-column-name ^org.datavec.api.transform.Distance distance ^java.lang.String first-col ^java.lang.String second-col]
    (new NDArrayDistanceTransform new-column-name distance first-col second-col)))

(defn map
  "Description copied from interface: Transform

  writables - the record to transform - `java.util.List`

  returns: the transformed writable - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^NDArrayDistanceTransform this ^java.util.List writables]
    (-> this (.map writables))))

(defn output-column-name
  "Description copied from interface: ColumnOp

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^NDArrayDistanceTransform this]
    (-> this (.outputColumnName))))

(defn transform
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^NDArrayDistanceTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NDArrayDistanceTransform this]
    (-> this (.toString))))

(defn set-input-schema
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`"
  ([^NDArrayDistanceTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.setInputSchema input-schema))))

(defn map-sequence
  "Description copied from interface: Transform

  sequence - `java.util.List`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^NDArrayDistanceTransform this ^java.util.List sequence]
    (-> this (.mapSequence sequence))))

(defn column-names
  "Description copied from interface: ColumnOp

  returns: `java.lang.String[]`"
  ([^NDArrayDistanceTransform this]
    (-> this (.columnNames))))

(defn output-column-names
  "Description copied from interface: ColumnOp

  returns: the output column names - `java.lang.String[]`"
  ([^NDArrayDistanceTransform this]
    (-> this (.outputColumnNames))))

(defn column-name
  "Description copied from interface: ColumnOp

  returns: `java.lang.String`"
  (^java.lang.String [^NDArrayDistanceTransform this]
    (-> this (.columnName))))

