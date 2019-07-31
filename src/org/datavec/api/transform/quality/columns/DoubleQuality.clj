(ns org.datavec.api.transform.quality.columns.DoubleQuality
  "Created by Alex on 5/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.quality.columns DoubleQuality]))

(defn ->double-quality
  "Constructor.

  count-valid - `long`
  count-invalid - `long`
  count-missing - `long`
  count-total - `long`
  count-non-real - `long`
  count-na-n - `long`
  count-infinite - `long`"
  (^DoubleQuality [^Long count-valid ^Long count-invalid ^Long count-missing ^Long count-total ^Long count-non-real ^Long count-na-n ^Long count-infinite]
    (new DoubleQuality count-valid count-invalid count-missing count-total count-non-real count-na-n count-infinite))
  (^DoubleQuality []
    (new DoubleQuality )))

(defn add
  "other - `org.datavec.api.transform.quality.columns.DoubleQuality`

  returns: `org.datavec.api.transform.quality.columns.DoubleQuality`"
  (^org.datavec.api.transform.quality.columns.DoubleQuality [^DoubleQuality this ^org.datavec.api.transform.quality.columns.DoubleQuality other]
    (-> this (.add other))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DoubleQuality this]
    (-> this (.toString))))

