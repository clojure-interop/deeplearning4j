(ns org.nd4j.linalg.primitives.Optional
  "Simple Optional class, based loosely on Java 8's optional class"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.primitives Optional]))

(defn *empty
  "Returns an empty Optional instance. No value is present for this Optional.

  returns: `<T> org.nd4j.linalg.primitives.Optional<T>`"
  ([]
    (Optional/empty )))

(defn *of
  "Returns an Optional with the specified present non-null value.

  value - the value to be present, which must be non-null - `T`

  returns: an Optional with the value present - `<T> org.nd4j.linalg.primitives.Optional<T>`"
  ([value]
    (Optional/of value)))

(defn *of-nullable
  "Returns an Optional describing the specified value, if non-null, otherwise returns an empty Optional.

  value - the possibly-null value to describe - `T`

  returns: an Optional with a present value if the specified value is non-null, otherwise an empty Optional - `<T> org.nd4j.linalg.primitives.Optional<T>`"
  ([value]
    (Optional/ofNullable value)))

(defn get
  "If a value is present in this Optional, returns the value, otherwise throws NoSuchElementException.

  returns: the non-null value held by this Optional - `T`

  throws: java.util.NoSuchElementException - - if there is no value present"
  ([^Optional this]
    (-> this (.get))))

(defn present?
  "Return true if there is a value present, otherwise false.

  returns: true if there is a value present, otherwise false - `boolean`"
  (^Boolean [^Optional this]
    (-> this (.isPresent))))

(defn or-else
  "Return the value if present, otherwise return other.

  other - the value to be returned if there is no value present, may be null - `T`

  returns: `T`"
  ([^Optional this other]
    (-> this (.orElse other))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Optional this]
    (-> this (.toString))))

