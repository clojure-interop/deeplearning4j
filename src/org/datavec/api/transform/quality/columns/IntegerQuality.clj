(ns org.datavec.api.transform.quality.columns.IntegerQuality
  "Quality of an Integer column"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.quality.columns IntegerQuality]))

(defn ->integer-quality
  "Constructor.

  count-valid - `long`
  count-invalid - `long`
  count-missing - `long`
  count-total - `long`
  count-non-integer - `long`"
  (^IntegerQuality [^Long count-valid ^Long count-invalid ^Long count-missing ^Long count-total ^Long count-non-integer]
    (new IntegerQuality count-valid count-invalid count-missing count-total count-non-integer)))

(defn add
  "other - `org.datavec.api.transform.quality.columns.IntegerQuality`

  returns: `org.datavec.api.transform.quality.columns.IntegerQuality`"
  (^org.datavec.api.transform.quality.columns.IntegerQuality [^IntegerQuality this ^org.datavec.api.transform.quality.columns.IntegerQuality other]
    (-> this (.add other))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^IntegerQuality this]
    (-> this (.toString))))

