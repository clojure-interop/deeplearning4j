(ns org.datavec.api.transform.quality.columns.LongQuality
  "Quality of a Long column"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.quality.columns LongQuality]))

(defn ->long-quality
  "Constructor.

  count-valid - `long`
  count-invalid - `long`
  count-missing - `long`
  count-total - `long`
  count-non-long - `long`"
  (^LongQuality [^Long count-valid ^Long count-invalid ^Long count-missing ^Long count-total ^Long count-non-long]
    (new LongQuality count-valid count-invalid count-missing count-total count-non-long))
  (^LongQuality []
    (new LongQuality )))

(defn add
  "other - `org.datavec.api.transform.quality.columns.LongQuality`

  returns: `org.datavec.api.transform.quality.columns.LongQuality`"
  (^org.datavec.api.transform.quality.columns.LongQuality [^LongQuality this ^org.datavec.api.transform.quality.columns.LongQuality other]
    (-> this (.add other))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LongQuality this]
    (-> this (.toString))))

