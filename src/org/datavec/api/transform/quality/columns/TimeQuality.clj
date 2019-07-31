(ns org.datavec.api.transform.quality.columns.TimeQuality
  "TimeQuality: quality of a time column"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.quality.columns TimeQuality]))

(defn ->time-quality
  "Constructor.

  count-valid - `long`
  count-invalid - `long`
  count-missing - `long`
  count-total - `long`"
  (^TimeQuality [^Long count-valid ^Long count-invalid ^Long count-missing ^Long count-total]
    (new TimeQuality count-valid count-invalid count-missing count-total))
  (^TimeQuality []
    (new TimeQuality )))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TimeQuality this]
    (-> this (.toString))))

(defn add
  "other - `org.datavec.api.transform.quality.columns.TimeQuality`

  returns: `org.datavec.api.transform.quality.columns.TimeQuality`"
  (^org.datavec.api.transform.quality.columns.TimeQuality [^TimeQuality this ^org.datavec.api.transform.quality.columns.TimeQuality other]
    (-> this (.add other))))

