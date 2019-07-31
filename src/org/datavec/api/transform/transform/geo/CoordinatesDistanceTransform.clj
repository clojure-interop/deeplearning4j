(ns org.datavec.api.transform.transform.geo.CoordinatesDistanceTransform
  "Computes the Euclidean distance between coordinates found in two columns, divided by an optional third for normalization purposes.
 A new column (with the specified name) is added as the final column of the output. No other columns are modified."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.geo CoordinatesDistanceTransform]))

(defn ->coordinates-distance-transform
  "Constructor.

  new-column-name - `java.lang.String`
  first-column - `java.lang.String`
  second-column - `java.lang.String`
  stdev-column - `java.lang.String`
  delimiter - `java.lang.String`"
  (^CoordinatesDistanceTransform [^java.lang.String new-column-name ^java.lang.String first-column ^java.lang.String second-column ^java.lang.String stdev-column ^java.lang.String delimiter]
    (new CoordinatesDistanceTransform new-column-name first-column second-column stdev-column delimiter))
  (^CoordinatesDistanceTransform [^java.lang.String new-column-name ^java.lang.String first-column ^java.lang.String second-column ^java.lang.String stdev-column]
    (new CoordinatesDistanceTransform new-column-name first-column second-column stdev-column)))

(def *-default-delimiter
  "Static Constant.

  type: java.lang.String"
  CoordinatesDistanceTransform/DEFAULT_DELIMITER)

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^CoordinatesDistanceTransform this]
    (-> this (.toString))))

(defn map
  "Transform an object
  in to another object

  input - the record to transform - `java.lang.Object`

  returns: the transformed writable - `java.lang.Object`"
  (^java.lang.Object [^CoordinatesDistanceTransform this ^java.lang.Object input]
    (-> this (.map input))))

(defn map-sequence
  "Transform a sequence

  sequence - `java.lang.Object`

  returns: `java.lang.Object`"
  (^java.lang.Object [^CoordinatesDistanceTransform this ^java.lang.Object sequence]
    (-> this (.mapSequence sequence))))

