(ns org.datavec.api.transform.transform.categorical.IntegerToCategoricalTransform
  "Convert an integer column to a categorical column, using a provided Map<Integer,String>"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.categorical IntegerToCategoricalTransform]))

(defn ->integer-to-categorical-transform
  "Constructor.

  column-name - `java.lang.String`
  map - `java.util.Map`"
  (^IntegerToCategoricalTransform [^java.lang.String column-name ^java.util.Map map]
    (new IntegerToCategoricalTransform column-name map)))

(defn get-new-column-meta-data
  "new-column-name - `java.lang.String`
  old-column-type - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: `org.datavec.api.transform.metadata.ColumnMetaData`"
  (^org.datavec.api.transform.metadata.ColumnMetaData [^IntegerToCategoricalTransform this ^java.lang.String new-column-name ^org.datavec.api.transform.metadata.ColumnMetaData old-column-type]
    (-> this (.getNewColumnMetaData new-column-name old-column-type))))

(defn map
  "Transform an object
  in to another object

  input - the record to transform - `java.lang.Object`

  returns: the transformed writable - `java.lang.Object`"
  (^java.lang.Object [^IntegerToCategoricalTransform this ^java.lang.Object input]
    (-> this (.map input))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^IntegerToCategoricalTransform this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^IntegerToCategoricalTransform this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^IntegerToCategoricalTransform this]
    (-> this (.hashCode))))

(defn map-sequence
  "Transform a sequence

  sequence - `java.lang.Object`

  returns: `java.lang.Object`"
  (^java.lang.Object [^IntegerToCategoricalTransform this ^java.lang.Object sequence]
    (-> this (.mapSequence sequence))))

