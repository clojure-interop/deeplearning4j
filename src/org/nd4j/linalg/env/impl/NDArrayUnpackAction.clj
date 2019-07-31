(ns org.nd4j.linalg.env.impl.NDArrayUnpackAction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.env.impl NDArrayUnpackAction]))

(defn ->nd-array-unpack-action
  "Constructor."
  (^NDArrayUnpackAction []
    (new NDArrayUnpackAction )))

(defn target-variable
  "Description copied from interface: EnvironmentalAction

  returns: `java.lang.String`"
  (^java.lang.String [^NDArrayUnpackAction this]
    (-> this (.targetVariable))))

(defn process
  "Description copied from interface: EnvironmentalAction

  value - `java.lang.String`"
  ([^NDArrayUnpackAction this ^java.lang.String value]
    (-> this (.process value))))

