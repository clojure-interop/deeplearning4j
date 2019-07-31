(ns org.datavec.api.transform.schema.conversion.TypeConversion
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.schema.conversion TypeConversion]))

(defn *get-instance
  "returns: `org.datavec.api.transform.schema.conversion.TypeConversion`"
  (^org.datavec.api.transform.schema.conversion.TypeConversion []
    (TypeConversion/getInstance )))

(defn convert-int
  "o - `java.lang.Object`

  returns: `int`"
  (^Integer [^TypeConversion this ^java.lang.Object o]
    (-> this (.convertInt o))))

(defn convert-double
  "writable - `org.datavec.api.writable.Writable`

  returns: `double`"
  (^Double [^TypeConversion this ^org.datavec.api.writable.Writable writable]
    (-> this (.convertDouble writable))))

(defn convert-float
  "writable - `org.datavec.api.writable.Writable`

  returns: `float`"
  (^Float [^TypeConversion this ^org.datavec.api.writable.Writable writable]
    (-> this (.convertFloat writable))))

(defn convert-long
  "writable - `org.datavec.api.writable.Writable`

  returns: `long`"
  (^Long [^TypeConversion this ^org.datavec.api.writable.Writable writable]
    (-> this (.convertLong writable))))

(defn convert-string
  "writable - `org.datavec.api.writable.Writable`

  returns: `java.lang.String`"
  (^java.lang.String [^TypeConversion this ^org.datavec.api.writable.Writable writable]
    (-> this (.convertString writable))))

